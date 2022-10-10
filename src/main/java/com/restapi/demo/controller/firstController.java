package com.restapi.demo.controller;

import java.util.Map;

import org.springframework.dao.DuplicateKeyException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.restapi.demo.domain.table.createTable;
import com.restapi.demo.service.firstService;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequiredArgsConstructor
public class firstController {
    private final firstService firstService;

    @GetMapping(value="/first")
    public Map<String,Object> firstControll() {

        return firstService.getFirstData();
    }


    @PostMapping(value="/{tableName}")
    public ResponseEntity<HttpStatus> createTable(@PathVariable(name = "tableName") String tableName,
        @RequestBody createTable param) {
        //TODO: process POST request

        try {
            for (int i = 0 ; i < param.getColumns().size(); ++i){
                if(param.getColumns().get(i).getType() == null){
                    param.getColumns().get(i).setType("varchar");
                }
                else if (param.getColumns().get(i).getType().equals("string") ){
                    param.getColumns().get(i).setType("varchar");
                }
            }
            firstService.createTable(tableName, param.getColumns(), param.getComment());
        } catch (DuplicateKeyException e) {
            // TODO: handle exception
            throw new ResponseStatusException(HttpStatus.CONFLICT,"Duplicate Table Name");
        }
        
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
    
    
}
