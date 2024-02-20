package com.boot.service

import com.boot.entity.Product
import com.boot.repository.rep.ProductRepository
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Service


@Service
class ProductService(private val productRepository: ProductRepository){

    fun saveProduct(product: Product): ResponseEntity<Product> {
        val newProduct: Product = productRepository.save(product)
        return ResponseEntity.ok(newProduct)
    }

    fun fetchAllProducts(): ResponseEntity<List<Product>> {
        return ResponseEntity.ok(productRepository.findAll())
    }

}