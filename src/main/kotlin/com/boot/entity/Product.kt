package com.boot.entity

import jakarta.persistence.*


@Entity
@Table(name = "product")
data class Product (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) val id: Long? = null,

    @Column(nullable = false) val name: String? = null,

    @Column(nullable = false) val price: Double = 0.0,

    @Column(nullable = false) val quantity: Int = 0 // Constructors, getters and setters, and other methods...
)