package com.ning4256.springboot.service;


import com.ning4256.springboot.pojo.Dept;

import java.util.List;

/**
 * @program: springboot-fenye
 * @description: ${description}
 * @author: ning4256
 * @create: 2019-04-02 20:31
 **/
public interface DeptService {
    List<Dept> queryDepts();
}
