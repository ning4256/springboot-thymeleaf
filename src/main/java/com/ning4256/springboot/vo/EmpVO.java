package com.ning4256.springboot.vo;

import java.util.Date;

/**
 * @program: springboot-fenye
 * @description: ${description}
 * @author: ning4256
 * @create: 2019-04-02 19:32
 **/
public class EmpVO {
    private String ename;
    private Integer deptno;
    private Date begin;
    private Date end;

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public Integer getDeptno() {
        return deptno;
    }

    public void setDeptno(Integer deptno) {
        this.deptno = deptno;
    }

    public Date getBegin() {
        return begin;
    }

    public void setBegin(Date begin) {
        this.begin = begin;
    }

    public Date getEnd() {
        return end;
    }

    public void setEnd(Date end) {
        this.end = end;
    }
}
