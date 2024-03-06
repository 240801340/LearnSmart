package com.lucifer.learnsmart.mapper;

import com.lucifer.learnsmart.pojo.Dept;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface DeptMapper {

    @Select("SELECT * from dept")
    List<Dept> list();
}
