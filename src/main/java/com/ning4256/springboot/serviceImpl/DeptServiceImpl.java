package com.ning4256.springboot.serviceImpl;

import com.ning4256.springboot.dao.DeptDAO;
import com.ning4256.springboot.pojo.Dept;
import com.ning4256.springboot.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: springboot-fenye
 * @description: ${description}
 * @author: ning4256
 * @create: 2019-04-02 20:32
 **/
@Service
public class DeptServiceImpl implements DeptService {
    @Autowired
    private DeptDAO deptDAO;

    @Override
    public List<Dept> queryDepts() {
        return deptDAO.queryDepts();
    }
}
