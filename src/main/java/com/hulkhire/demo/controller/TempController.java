package com.hulkhire.demo.controller;

import com.hulkhire.demo.service.TempService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class TempController {

    private final TempService tempService;

    public TempController(TempService tempService) {
        this.tempService = tempService;
    }

    @GetMapping("/temp")
    public String getTemp() {
        return tempService.getMessage();
    }
}