package com.zanoApps.orderapp.LocalDB

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.ForeignKey.CASCADE
import androidx.room.PrimaryKey

@Entity(foreignKeys = [ForeignKey(entity = CustomerEntity::class, parentColumns = ["order_id"], childColumns = ["customer_id"],onDelete = CASCADE),
    ForeignKey(entity = MenuEntity::class , parentColumns = ["order_id"], childColumns = ["product_id"], onDelete = CASCADE)])


data class OrderEntity(
    @PrimaryKey(autoGenerate = true)@ColumnInfo(name = "order_id") private val orderId: String?,
    @ColumnInfo(name = "product_type") private val productType: String,
    @ColumnInfo(name = "customer_number") private val customerNumber: String,
    @ColumnInfo(name = "customer_Address") private val customerAddress: String,
    @ColumnInfo(name = "total_price") private val totalPrice: String,
    @ColumnInfo(name = "product_additions") private val productAdditions: String,
    @ColumnInfo(name = "shipping_total") private val shippingTotal: Double

)