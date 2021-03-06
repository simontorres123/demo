package com.example.demo.webinar;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class ClaseB implements IServiceB{

    public ClaseB() {
    }

    @Override
    public String getService(){
        return "soy servcicio B";
    }
}
