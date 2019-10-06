package com.zanoApps.orderapp.LocalDB

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Query

@Dao
interface ProductsDAO {

/*get all drinks in list(identifying em by the category)*/
    @Query("SELECT * FROM products_table WHERE product_category = 'drink'")
    suspend fun getAllDrinksDataFromDb(): LiveData<List<ProductEntity>>

/*get all salads in list(identifying em by the category)*/
    @Query("SELECT * FROM products_table WHERE product_category = 'salad'")
    suspend fun getAllSaladsDataFromDb(): LiveData<List<ProductEntity>>

/*get all chicken in list(identifying em by the category)*/
    @Query("SELECT * FROM products_table WHERE product_category = 'chicken' ")
    suspend fun getAllChickenDataFromDb(): LiveData<List<ProductEntity>>

/*get all meat in list(identifying em by the category)*/
    @Query("SELECT * FROM products_table WHERE product_category = 'meat'")
    suspend fun getAllMeatDataFromDb(): LiveData<List<ProductEntity>>


}