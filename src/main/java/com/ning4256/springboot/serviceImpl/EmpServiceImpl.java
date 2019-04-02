package com.ning4256.springboot.serviceImpl;

import com.ning4256.springboot.dao.EmpDAO;
import com.ning4256.springboot.pojo.Emp;
import com.ning4256.springboot.service.EmpService;
import com.ning4256.springboot.vo.EmpVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: springboot-fenye
 * @description: ${description}
 * @author: ning4256
 * @create: 2019-04-02 19:34
 **/
@Service
public class EmpServiceImpl implements EmpService {
    @Autowired
    private EmpDAO empDAO;

    @Override
    public List<Emp> findEmpsByCondition(Integer currentPage, Integer pageSize, EmpVO vo) {
        return empDAO.queryEmpsByPage(currentPage, pageSize, vo);
    }

    @Override
    public Emp queryEmpByEmpno(Integer empno) {
        return empDAO.selectByPrimaryKey(empno);
    }

    @Override
    public int updateByPrimaryKeySelective(Emp emp) {
        return empDAO.updateByPrimaryKeySelective(emp);
    }
}
