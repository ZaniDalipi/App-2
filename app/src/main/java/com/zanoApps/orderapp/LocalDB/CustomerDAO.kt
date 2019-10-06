package com.zanoApps.orderapp.LocalDB

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Update

@Dao
interface CustomerDAO {

/*update customer data in db*/
    @Update
    suspend fun updateCustomer(customerEntity: CustomerEntity): LiveData<CustomerEntity>

/*insert a new customer in the db*/
    @Insert
    suspend fun insertCustomer(customerEntity: CustomerEntity)

/*delete a customer from the db*/
    @Delete
    suspend fun deleteCustomer(customerEntity: CustomerEntity)
}