package com.zanoApps.orderapp.LocalDB

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Query

@Dao
interface UserInteractionDAO {

/*if user wants to sort product by price(low-high)*/
    @Query("SELECT * FROM products_table ORDER BY product_price ASC")
    fun getProductsFromCheaperToExpensive(): LiveData<List<ProductEntity>>

/*if user wants to sort products by price(high-low)*/
    @Query("SELECT * FROM products_table ORDER BY product_price DESC")
    fun getProductsFromExpensiveToCheap(): LiveData<List<ProductEntity>>

/*if user want to search for a product by its name */
    @Query("SELECT product_type FROM products_table WHERE product_type LIKE :userInput")
    fun getProductsByUserInputToSearch(userInput: String): LiveData<ProductEntity>



}