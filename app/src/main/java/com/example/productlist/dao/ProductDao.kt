package com.example.productlist.dao

import androidx.room.Dao
import androidx.room.*
import com.example.productlist.model.Product

@Dao
interface ProductDao {
    @Insert fun insertProduct(product: Product): Long
    @Delete fun deleteProduct(product: Product): Int
    @Query("SELECT * FROM tbl_product ORDER BY product_name ASC")
    fun getProducts(): List<Product>
}