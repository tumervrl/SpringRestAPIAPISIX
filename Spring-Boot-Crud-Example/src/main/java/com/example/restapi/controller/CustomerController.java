package com.example.restapi.controller;
import com.example.restapi.entity.Customer;
import com.example.restapi.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @PostMapping("/save")
    public ResponseEntity<Customer> saveEmployee(@RequestBody Customer customer){
        Customer savedCustomer = customerService.saveEmployee(customer);
        return new ResponseEntity<Customer>(savedCustomer, HttpStatus.CREATED);
    }

    @GetMapping("/all")
    public ResponseEntity<List<Customer>> getAllEmployee(){
        List<Customer> allCustomer = customerService.getAllEmployee();
        return new ResponseEntity<List<Customer>>(allCustomer, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Customer> getEmployeeById(@PathVariable(name = "id") Long employeeId){
        Customer customer = customerService.getEmployeeById(employeeId);
        return new ResponseEntity<Customer>(customer, HttpStatus.OK);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Customer> updateEmployeeById(@RequestBody Customer customer){
        Customer updatedCustomer = customerService.updateEmployee(customer);
        return new ResponseEntity<Customer>(updatedCustomer, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteEmployeeById(@PathVariable(name = "id") Long employeeId){
        customerService.deleteEmployeeById(employeeId);
        return new ResponseEntity<Void>(HttpStatus.ACCEPTED);
    }
}
