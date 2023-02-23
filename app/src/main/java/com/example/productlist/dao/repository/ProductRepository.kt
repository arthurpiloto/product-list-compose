package com.example.productlist.dao.repository

import android.content.Context
import com.example.productlist.dao.ProductListDb
import com.example.productlist.model.Product

class ProductRepository(context: Context) {
    private val db = ProductListDb.getDatabase(context)

    fun getProductsList(): List<Product> {
        return db.productDao().getProducts()
    }

    fun insertProduct(product: Product): Long {
        return db.productDao().insertProduct(product)
    }
}