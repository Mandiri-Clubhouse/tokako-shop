package com.grevi.msx.tokakoshop.controller

import com.grevi.msx.tokakoshop.entity.Customer
import com.grevi.msx.tokakoshop.service.CustomerService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/v1/")
class CustomerController @Autowired constructor(val customerService: CustomerService) {

    @GetMapping("/customers")
    fun getAllCustomer() : List<Customer> = customerService.getAllCustomer()

    @GetMapping("/customer/{id}")
    fun getCustomerById(@PathVariable(name = "id") id : String) : Customer = customerService.getCustomerById(id)

    @PostMapping("/customer")
    fun postCustomer(@RequestBody customer: Customer) : Customer = customerService.createCustomer(customer)

    @PutMapping("/customer")
    fun putCustomer(@RequestBody customer: Customer) : Customer = customerService.updateCustomer(customer)

    @DeleteMapping("/customer/{id}")
    fun deleteCustomerById(@PathVariable(name = "id") id : String) = customerService.deleteCustomerById(id)
}