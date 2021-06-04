package net.guides.springboot2.springboot2jpacrudemployee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("")
public class EmployeeViewController {
    @Autowired
    // RequestMethod.GET no need to change to POST/PUT/DELETE
    // because we only retrieve html files for view
    // CRUD functions is calling the REST API created by the REST Controller
    // (EmployeeController)

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String index() {
        return "index";
    }

    @RequestMapping(value = "/viewEmployees", method = RequestMethod.GET)
    public String viewEmployee() {
        return "view_employee_ID";
    }

    @RequestMapping(value = "/createEmployee", method = RequestMethod.GET)
    public String createEmployee() {
        return "create_employee";
    }
}
