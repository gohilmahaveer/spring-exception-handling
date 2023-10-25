package com.java.exception.controller;

import com.java.exception.service.RiskyService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/risk")
public class RiskyController {

    private final RiskyService riskyService;

    public RiskyController(RiskyService riskyService) {
        this.riskyService = riskyService;
    }

    @GetMapping("/get-risk")
    public ResponseEntity getRisk() {
        riskyService.takeRisk();
        return new ResponseEntity<>(HttpStatus.OK);
    }
}