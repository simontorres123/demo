package com.example.demo.webinar;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class ClaseASecundary implements IServiceA{

    public ClaseASecundary() {
    }

    @Override
    public String getService() {
        return "implementación secundaria";
    }
}
