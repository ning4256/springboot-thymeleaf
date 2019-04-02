package com.ning4256.springboot.service;

import com.ning4256.springboot.pojo.Emp;
import com.ning4256.springboot.vo.EmpVO;

import java.util.List;

/**
 * @program: springboot-fenye
 * @description: ${description}
 * @author: ning4256
 * @create: 2019-04-02 19:35
 **/
public interface EmpService {
    List<Emp> findEmpsByCondition(Integer currentPage, Integer pageSize, EmpVO vo);

    Emp queryEmpByEmpno(Integer empno);

    int updateByPrimaryKeySelective(Emp emp);
}
