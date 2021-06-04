package net.guides.springboot2.springboot2jpacrudemployee.controller;

// import java.util.HashMap;
// import java.util.List;
// import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
// import org.springframework.web.bind.annotation.DeleteMapping;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.PathVariable;
// import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.PutMapping;
// import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.ResponseBody;
// import org.springframework.web.bind.annotation.RestController;

// import net.guides.springboot2.springboot2jpacrudemployee.exception.ResourceNotFoundException;
// import net.guides.springboot2.springboot2jpacrudemployee.model.Employee;
// import net.guides.springboot2.springboot2jpacrudemployee.repository.EmployeeRepository;

@Controller
@RequestMapping("")
public class EmployeeViewController {
    @Autowired
    // private EmployeeRepository employeeRepository;

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    // @ResponseBody
    public String index() {
        return "index";
    }

    // @RequestMapping(value = "/viewEmployees", method = RequestMethod.GET)
    // public String viewEmployee() {
    //     return "index";
    // }
}
