package com.restapi.service.impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.restapi.service.firstService;

@Service
public class firstServiceImpl implements firstService {
    @Autowired

    @Override
    public Map<String, Object> getFirstData() {
        Map<String, Object> firstData = new HashMap<>();
        firstData.put("label1", "check1");
        firstData.put("label2", "check2");
        firstData.put("label3", "check3");
        return firstData;
    }

}
