package com.restapi.demo.service;

import java.util.List;
import java.util.Map;

import com.restapi.demo.domain.column.column;

public interface firstService {
    
    Map<String, Object> getFirstData();

    void createTable(String tableName, List<column> columns, String comment);
}
