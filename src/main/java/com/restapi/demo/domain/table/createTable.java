package com.restapi.demo.domain.table;

import java.util.List;

import com.restapi.demo.domain.column.column;

import lombok.Data;

@Data
public class createTable {
    private String comment;
    private List<column> columns;
}
