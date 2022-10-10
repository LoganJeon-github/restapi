package com.restapi.controller;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.restapi.service.firstService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class firstController {
    private final firstService firstService;

    @GetMapping(value="/first")
    public Map<String,Object> firstControll() {

        return firstService.getFirstData();
    }
}
