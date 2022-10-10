package com.restapi.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.restapi.demo.domain.column.column;

@Mapper
public interface TableMapper {
    public void createTable(@Param("tableName") String tableName,
                            @Param("columns") List<column> columns, 
                            @Param("comment") String comment) ;
}
