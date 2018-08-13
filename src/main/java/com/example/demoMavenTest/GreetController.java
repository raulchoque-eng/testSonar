/**
 * @autor: Raúl Choque
 **/
package com.example.demoMavenTest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetController
{
    @RequestMapping("/hello")
    private String hellow()
    {
        return "Hello!!! How are you?";
    }
    /*@Autowired
    private Environment environment;
    //@GetMapping("/environment")
    @RequestMapping("/environment")
    public String env() {
        return "Estoy en el ambiente: "+environment.getActiveProfiles()[0];
    }*/
}
