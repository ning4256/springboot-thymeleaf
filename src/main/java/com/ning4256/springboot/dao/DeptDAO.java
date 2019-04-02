package com.ning4256.springboot.dao;

import com.ning4256.springboot.pojo.Dept;

import java.util.List;

public interface DeptDAO {
    int deleteByPrimaryKey(Integer deptno);

    int insert(Dept record);

    int insertSelective(Dept record);

    Dept selectByPrimaryKey(Integer deptno);

    int updateByPrimaryKeySelective(Dept record);

    int updateByPrimaryKey(Dept record);

    List<Dept> queryDepts();

}