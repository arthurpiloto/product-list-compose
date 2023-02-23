package com.example.productlist.model

data class Product(
    var id: Long = 0,
    var productName: String = "Product's name",
    var productDescription: String = "Description's product",
    var productPrice: Double = 0.0,
)