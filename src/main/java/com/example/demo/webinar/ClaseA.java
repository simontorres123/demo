package com.example.demo.webinar;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


@Service
public class ClaseA implements IServiceA{


    @Override
    public String getService(){
        return "soy servcicio A";
    }
}
