package com.wipro.et.controller;

import com.wipro.et.bean.Employee;
import com.wipro.et.bean.EmployeeContactNumbers;
import com.wipro.et.service.impl.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

@RestController("/employee")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @RequestMapping("/addEmployee")
    public ModelAndView AddEmployee(Employee employee,
                                    ModelMap modelMap) {
        ModelAndView model = new ModelAndView();
        model.addObject("employee", new Employee());
        model.setViewName("EmployeeprofileForm");
        return model;
    }

    @RequestMapping(value="/save", method = RequestMethod.POST)
    public ModelAndView showWelcomePage(ModelMap model, @RequestParam int id, @RequestParam String  name, @RequestParam String  empContactNumbers){
        model.put("id",id);
        model.put("name", name);
        model.put("empContactNumbers", empContactNumbers);
        Employee emp = new Employee();
        emp.setId(id);
        emp.setName(name);
      String result = employeeService.doSaveEmployee(emp);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject(model);
        modelAndView.addObject("result", result);
        modelAndView.setViewName("welcome");
        return modelAndView;
    }

    @RequestMapping("/all")
    public ModelAndView getAllEmployees() {
        ModelAndView model = new ModelAndView();
        List<Employee> result = employeeService.doGetAllEmployees();
        model.addObject("title", "Spring Boot Example");
        model.addObject("employees", result);
        model.setViewName("DisplayEmployees");
        return model;
    }

    @RequestMapping(value = "/id", method = RequestMethod.GET)
    public ModelAndView getEmployeeById(@RequestParam("id") int id) {
        ModelAndView model = new ModelAndView();
        Employee employee = employeeService.doGetEmployeeById(id);
        model.addObject("title", "Spring Boot Example");
        model.addObject("employee", employee);
        model.setViewName("searchEmployees");
        return model;
    }

    @RequestMapping(value = "/name", method = RequestMethod.GET)
    public ModelAndView getEmployeeByName(@RequestParam("name") String name) {
        ModelAndView model = new ModelAndView();
        Employee employee = employeeService.doGetEmployeeByName(name);
        model.addObject("title", "Spring Boot Example");
        model.addObject("employee", employee);
        model.setViewName("searchEmployees");
        return model;
    }
}
