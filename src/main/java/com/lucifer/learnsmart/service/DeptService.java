package com.lucifer.learnsmart.service;

import com.lucifer.learnsmart.pojo.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DeptService {
    //查询全部部门数据
    List<Dept> list();
}
