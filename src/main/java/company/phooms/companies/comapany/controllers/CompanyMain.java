package company.phooms.companies.comapany.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CompanyMain {
    @GetMapping(value = "/employee")
    @ResponseBody
    public String employee() {
        return "Employee";
    }

    @GetMapping(value = "/employee/{id}")
    @ResponseBody
    public String employee(@PathVariable int id) {
        return "Employee ID. " + id;
    }

    @GetMapping(value = "/employee/name/{name}")
    @ResponseBody
    public String employeeName(@PathVariable String name) {
        return "Employee Name: " + name;
    }

    @GetMapping(value = "/employee/department/{department}")
    @ResponseBody
    public String emDepartment(@PathVariable String department) {
        return "Employee in: " + department;
    }

    @PostMapping(value = "/employee")
    @ResponseBody
    public String cretaeEmployee(@RequestBody String name) {
        return "Created Employee: " + name;
    }
}
