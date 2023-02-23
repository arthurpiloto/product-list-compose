package com.example.productlist.dao

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.productlist.model.Product

@Database(entities = [Product::class], version = 1)
abstract class ProductListDb: RoomDatabase() {
    abstract fun productDao(): ProductDao

    companion object {
        private lateinit var instance: ProductListDb

        fun getDatabase(context: Context): ProductListDb {
            if (!::instance.isInitialized) {
                instance = Room
                    .databaseBuilder(
                        context,
                        ProductListDb::class.java,
                        "db_product_list"
                    )
                    .allowMainThreadQueries()
                    .fallbackToDestructiveMigration()
                    .build()
            }

            return instance
        }
    }
}