package com.java.exception.service;

import org.springframework.stereotype.Service;

@Service
public class RiskyServiceImpl implements RiskyService {

    @Override
    public void takeRisk() {
        throw new CustomException("Something went wrong");
    }
}
