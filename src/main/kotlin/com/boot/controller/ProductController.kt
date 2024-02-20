package com.boot.controller

import com.boot.entity.Product
import com.boot.service.ProductService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*


@RestController
@RequestMapping("/api/v1")
class ProductController(private val productService: ProductService){


    // Create a new product
    @PostMapping("/product")
    fun saveProduct(@RequestBody product: Product): ResponseEntity<ResponseEntity<Product>> {
        val newProduct: ResponseEntity<Product> = productService.saveProduct(product)
        return ResponseEntity.ok(newProduct)
    }


    // Get all products
    @GetMapping("/product")
    fun getAllProducts(): ResponseEntity<List<Product>> {
        return productService.fetchAllProducts()
    }


}