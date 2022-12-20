package com.example.restapi.service;

import com.example.restapi.entity.Customer;
import com.example.restapi.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CustomerService {

    @Autowired
    CustomerRepository customerRepository;

    public Customer saveEmployee(Customer customer){
        return customerRepository.save(customer);
    }

    public List<Customer> getAllEmployee(){
        return customerRepository.findAll();
    }

    public Customer getEmployeeById(Long employeeId){
        return customerRepository.findById(employeeId).get();
    }

    public Customer updateEmployee(Customer customer){
        return customerRepository.save(customer);
    }

    public void deleteEmployeeById(Long employeeId){
        customerRepository.deleteById(employeeId);
    }
}
