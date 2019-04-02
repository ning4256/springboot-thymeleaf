package com.ning4256.springboot.controller;


import com.github.pagehelper.PageInfo;
import com.ning4256.springboot.pojo.Dept;
import com.ning4256.springboot.pojo.Emp;
import com.ning4256.springboot.service.DeptService;
import com.ning4256.springboot.service.EmpService;
import com.ning4256.springboot.vo.EmpVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * @program: springboot-fenye
 * @description: ${description}
 * @author: ning4256
 * @create: 2019-04-02 19:29
 **/
@Controller
public class EmpController {
    @Autowired
    private EmpService empService;
    @Autowired
    private DeptService deptService;

    @RequestMapping("/list")
    public ModelAndView list(@RequestParam(value = "currentPage", defaultValue = "1", required = false) Integer currentPage,
                             @RequestParam(value = "pageSize", defaultValue = "5", required = false) Integer pageSize,
                             EmpVO vo){
        List<Emp> list = empService.findEmpsByCondition(currentPage,pageSize,vo);
        PageInfo pageInfo = new PageInfo(list);

        ModelAndView mav = new ModelAndView("list");
        mav.addObject("pageInfo",pageInfo);
        List<Dept> deptList = deptService.queryDepts();
        mav.addObject("deptList",deptList);
        mav.addObject("vo",vo);
        return  mav;
    }

    @RequestMapping("/edit/{empno}")
    public ModelAndView edit(@PathVariable(value = "empno") Integer empno){
        Emp emp = empService.queryEmpByEmpno(empno);
        ModelAndView mav = new ModelAndView("edit");
        mav.addObject("emp",emp);
        List<Dept> depts = deptService.queryDepts();
        mav.addObject("depts",depts);
        return mav;
    }

    @RequestMapping("/update")
    public String update(Emp emp){
        int i = empService.updateByPrimaryKeySelective(emp);
        if(i>0){
            return "redirect:/list";
        }else {
            return "forward:/edit/" + emp.getEmpno();
        }
    }
}
