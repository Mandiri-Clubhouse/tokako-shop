package com.grevi.msx.tokakoshop.repositories

import com.grevi.msx.tokakoshop.entity.Customer
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface CustomerRepository : JpaRepository<Customer, String> {
}