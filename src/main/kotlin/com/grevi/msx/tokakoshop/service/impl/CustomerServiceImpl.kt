package com.grevi.msx.tokakoshop.service.impl

import com.grevi.msx.tokakoshop.entity.Customer
import com.grevi.msx.tokakoshop.repositories.CustomerRepository
import com.grevi.msx.tokakoshop.service.CustomerService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class CustomerServiceImpl @Autowired constructor(private val customerRepository: CustomerRepository) : CustomerService {
    override fun createCustomer(customer: Customer): Customer = customerRepository.save(customer)
    override fun getCustomerById(customerId: String): Customer = customerRepository.findById(customerId).get()
    override fun getAllCustomer(): List<Customer> = customerRepository.findAll()
    override fun updateCustomer(customer: Customer): Customer = customerRepository.save(customer)
    override fun deleteCustomerById(customerId: String) = customerRepository.deleteById(customerId)
}