package com.restapi.service;

import java.util.List;

import com.restapi.domain.column.column;

public interface tableService {
    
    void createTable(String tableName, List<column> columns, String comment);
}
