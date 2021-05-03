package com.grevi.msx.tokakoshop.service

import com.grevi.msx.tokakoshop.entity.Customer

interface CustomerService {
    fun createCustomer(customer: Customer) : Customer
    fun getCustomerById(customerId : String) : Customer
    fun getAllCustomer() : List<Customer>
    fun updateCustomer(customer: Customer) : Customer
    fun deleteCustomerById(customerId: String)
}