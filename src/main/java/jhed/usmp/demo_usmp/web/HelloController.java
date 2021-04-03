package jhed.usmp.demo_usmp.web;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.*;
import jhed.usmp.demo_usmp.domain.*;

@RestController
public class HelloController{

    @RequestMapping("/")
    public String index(){
        return "Saludos";
    }

    @RequestMapping("/employees")
    public List<Employee> employees(){
        List<Employee> employees = new ArrayList<Employee>();
        employees.add(new Employee("EDWARD","SALAS"));
        return employees;
    }
}