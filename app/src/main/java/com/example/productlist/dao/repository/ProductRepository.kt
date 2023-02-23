package com.example.productlist.dao.repository

import com.example.productlist.model.Product

class ProductRepository {
    companion object {
        fun getProductsList(): List<Product> {
            return listOf(
                Product(),
                Product(
                    id = 1,
                    productName = "Margarina",
                    productDescription = "Margarina com sal",
                    productPrice = 9.99
                ),
                Product(
                    id = 2,
                    productName = "Calabresa",
                    productDescription = "Linguiça Calabresa",
                    productPrice = 12.99
                ),
                Product(),
                Product(),
                Product(),
                Product(),
                Product(),
                Product(),
                Product(),
                Product(),
            )
        }
    }
}