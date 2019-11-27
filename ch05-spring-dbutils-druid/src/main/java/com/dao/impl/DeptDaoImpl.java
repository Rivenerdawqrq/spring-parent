package com.dao.impl;

import com.dao.DeptDao;
import com.entity.Dept;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import javax.management.RuntimeErrorException;
import java.sql.SQLException;
import java.util.List;

public class DeptDaoImpl implements DeptDao {
    private QueryRunner queryRunner;

    public void setQueryRunner(QueryRunner queryRunner) {
        this.queryRunner = queryRunner;
    }

    public <T> T getAll() {
        String sql = "select id,deptname from dept";
        BeanListHandler<Dept> deptBeanListHandler = new BeanListHandler<Dept>(Dept.class);
        List<Dept> query = null;
        try {
            query = queryRunner.query(sql, deptBeanListHandler);
        } catch (SQLException e) {
            e.printStackTrace();
            throw  new RuntimeException("select failed",e);
        }
        return (T) query;
    }
}
