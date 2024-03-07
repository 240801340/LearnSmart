package com.lucifer.learnsmart.controller;
import com.lucifer.learnsmart.pojo.Dept;
import com.lucifer.learnsmart.pojo.Result;
import com.lucifer.learnsmart.service.DeptService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//此注解可以方便使用log日志功能
@Slf4j
@RestController
public class DeptController {

    @Autowired
    private DeptService deptService;

    @GetMapping("/depts")
    public Result list(){
        log.info("查询到全部部门数据");
        List<Dept> deptList = deptService.list();
        return Result.success(deptList);
    }
}
