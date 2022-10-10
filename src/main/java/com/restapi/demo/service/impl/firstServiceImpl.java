package com.restapi.demo.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.restapi.demo.domain.column.column;
import com.restapi.demo.mapper.TableMapper;
import com.restapi.demo.service.firstService;

@Service
public class firstServiceImpl implements firstService {
    @Autowired
    private TableMapper tableMapper;

    @Override
    public Map<String, Object> getFirstData() {
        Map<String, Object> firstData = new HashMap<>();
        firstData.put("label1", "check1");
        firstData.put("label2", "check2");
        firstData.put("label3", "check3");
        return firstData;
    }

    @Override
    public void createTable(String tableName, 
                            List<column> columns, 
                            String comment) {
        // TODO Auto-generated method stub
        tableMapper.createTable(tableName, columns, comment);
    }
}
