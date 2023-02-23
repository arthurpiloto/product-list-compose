package com.example.productlist.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "tbl_product")
data class Product(
    @PrimaryKey(autoGenerate = true) var id: Long = 0,
    @ColumnInfo(name = "product_name") var productName: String = "Product's name",
    @ColumnInfo(name = "product_description") var productDescription: String = "Description's product",
    @ColumnInfo(name = "product_price") var productPrice: Double = 0.0,
)