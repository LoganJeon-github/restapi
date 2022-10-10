package com.restapi.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.restapi.domain.column.column;
import com.restapi.mapper.TableMapper;
import com.restapi.service.tableService;

@Service
public class tableServiceImpl implements tableService {
    @Autowired
    private TableMapper tableMapper;

    @Override
    public void createTable(String tableName, 
                            List<column> columns, 
                            String comment) {
        // TODO Auto-generated method stub
        tableMapper.createTable(tableName, columns, comment);
    }
}
