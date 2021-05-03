package com.grevi.msx.tokakoshop.entity

import org.hibernate.annotations.GenericGenerator
import java.time.LocalDateTime
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "m_customer")
data class Customer(
        @Id
        @GeneratedValue(generator = "system-uuid")
        @GenericGenerator(name = "system-uuid", strategy = "uuid")
        val id : String,
        val name : String,
        val phone : String,
        val email : String,
        val cratedAt : LocalDateTime = LocalDateTime.now(),
        val updatedAt : LocalDateTime = LocalDateTime.now()
)