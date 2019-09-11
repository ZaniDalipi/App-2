package com.zanoApps.orderapp.LocalDB

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class MenuEntity(
    @PrimaryKey()
    @ColumnInfo(name = "product_id") private val productId: String?,
    @ColumnInfo(name = "product_type") private val productType: String?,
    @ColumnInfo(name = "product_category")private val productCategory: String?,
    @ColumnInfo(name = "product_price")private val productPrice: Double?,
    @ColumnInfo(name = "product_additions")private val productAdditions: String,
    @ColumnInfo(name = "product_weight")private val productWeight: Int
)
