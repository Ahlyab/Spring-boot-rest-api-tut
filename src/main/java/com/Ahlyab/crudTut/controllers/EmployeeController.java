package com.Ahlyab.crudTut.controllers;
import com.Ahlyab.crudTut.dto.EmployeeDTO;
import com.Ahlyab.crudTut.services.EmployeeService;
import jakarta.websocket.server.PathParam;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;


@RestController
@RequestMapping(path = "/employees")
public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping(path = "/")
    public List<EmployeeDTO> getAllEmployees() {
        return employeeService.getAllEmployeeService();
    }

    @GetMapping(path = "/{id}")
    public EmployeeDTO getEmployees(@PathVariable("id") Long employeeId) {
        System.out.println("controller being called");
        return employeeService.getEmployeeById(employeeId);
    }

    @PostMapping
    public EmployeeDTO createNewEmployee(@RequestBody EmployeeDTO employeeDTO) {
        System.out.println("req coming");
        return employeeService.createNewEmployee(employeeDTO);
    }

    @DeleteMapping(path = "/{id}")
    public boolean deleteEmployee(@PathVariable Long id) {
        return employeeService.deleteEmployee(id);
    }


}
