package com.lucifer.learnsmart.mapper;

import com.lucifer.learnsmart.pojo.Dept;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.web.bind.annotation.DeleteMapping;

import java.util.List;

@Mapper
public interface DeptMapper {

    @Select("SELECT * from dept")
    List<Dept> list();

    @Delete("Delete from dept where id = #{id}")
    void delete(Integer id);
}
