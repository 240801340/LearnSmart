package com.lucifer.learnsmart.controller;
import com.lucifer.learnsmart.pojo.Dept;
import com.lucifer.learnsmart.pojo.Result;
import com.lucifer.learnsmart.service.DeptService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//此注解可以方便使用log日志功能
@Slf4j
@RestController
public class DeptController {

    @Autowired
    private DeptService deptService;

    /*
     *   查询所有的部门数据
     */
    @GetMapping("/depts")
    public Result list(){
        log.info("查询到全部部门数据");
        List<Dept> deptList = deptService.list();
        return Result.success(deptList);
    }

    /*
    *   根据id删除数据
    */
    @DeleteMapping("/depts/{id}")
    public Result delete(@PathVariable Integer id){
        log.info("删除数据{}",id);
        deptService.delete(id);
        return Result.success();
    }
}
