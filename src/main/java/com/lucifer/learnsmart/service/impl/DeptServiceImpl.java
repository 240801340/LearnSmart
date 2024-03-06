package com.lucifer.learnsmart.service.impl;

import com.lucifer.learnsmart.mapper.DeptMapper;
import com.lucifer.learnsmart.pojo.Dept;
import com.lucifer.learnsmart.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class DeptServiceImpl implements DeptService {
    @Autowired
    private DeptMapper deptMapper;
    @Override
    public List<Dept> list() {
        return deptMapper.list();
    }
}
