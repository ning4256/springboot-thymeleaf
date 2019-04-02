package com.ning4256.springboot.dao;

import com.ning4256.springboot.pojo.Emp;
import com.ning4256.springboot.vo.EmpVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface EmpDAO {
    int deleteByPrimaryKey(Integer empno);

    int insert(Emp record);

    int insertSelective(Emp record);

    Emp selectByPrimaryKey(Integer empno);

    int updateByPrimaryKeySelective(Emp record);

    int updateByPrimaryKey(Emp record);

    List<Emp> queryEmpsByPage(@Param("currentPage")Integer currentPage, @Param("pageSize")Integer pageSize, @Param("vo") EmpVO vo);

}