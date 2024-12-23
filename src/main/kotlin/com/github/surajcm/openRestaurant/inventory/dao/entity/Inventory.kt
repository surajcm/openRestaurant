package com.github.surajcm.openRestaurant.inventory.dao.entity

class Inventory(
    var inventoryId: Int,
    val itemName: String,
    val quantity: Int,
    val price: Double
)