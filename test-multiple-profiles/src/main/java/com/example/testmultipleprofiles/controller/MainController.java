package com.example.testmultipleprofiles.controller;

import com.example.testmultipleprofiles.model.EmployeeDev;
import com.example.testmultipleprofiles.model.EmployeeTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class MainController {

    @Autowired
    EmployeeDev employeeDev;

    @Autowired
    EmployeeTest employeeTest;

    @GetMapping
    public String getParam(@RequestParam("env") String env) {
        System.out.println("inside controller");
        if(env.equals("e1")) {
            System.out.println(employeeDev.getParam());
        }
        if(env.equals("e2")) {
            System.out.println(employeeTest.getParam());
        }
        return "inside controller";
    }
}
