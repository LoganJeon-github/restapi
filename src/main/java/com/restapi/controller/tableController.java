package com.restapi.controller;

import org.springframework.dao.DuplicateKeyException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.restapi.domain.table.createTable;
import com.restapi.service.tableService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class tableController {

    private final tableService tableService;

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
            tableService.createTable(tableName, param.getColumns(), param.getComment());
        } catch (DuplicateKeyException e) {
            // TODO: handle exception
            throw new ResponseStatusException(HttpStatus.CONFLICT,"Duplicate Table Name");
        }
        
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}
