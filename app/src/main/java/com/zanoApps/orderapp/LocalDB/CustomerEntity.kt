package com.zanoApps.orderapp.LocalDB

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Customer_table")
data class CustomerEntity (

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "customer_id")
    private val customerId: String,
    @ColumnInfo(name = "customer_name") private val customerName: String?,
    @ColumnInfo(name = "customer_number") private val customerNumber: String?,
    @ColumnInfo(name = "customer_address") private val customerAddress: String?
)