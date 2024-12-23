package com.github.surajcm.openRestaurant.inventory

import com.github.surajcm.openRestaurant.inventory.dao.entity.Inventory
import org.springframework.stereotype.Service

@Service
class InventoryService {
    val inventories = mutableListOf(
        Inventory(1, "Tomato", 10, 100.0),
        Inventory(2, "Onion", 20, 200.0),
        Inventory(3, "Potato", 30, 300.0),
        Inventory(4, "Carrot", 40, 400.0),
        Inventory(5, "Cabbage", 50, 500.0),
        Inventory(6, "Capsicum", 60, 600.0),
        Inventory(7, "Broccoli", 70, 700.0),
        Inventory(8, "Cauliflower", 80, 800.0),
        Inventory(9, "Spinach", 90, 900.0),
        Inventory(10, "Lettuce", 100, 1000.0)
    )

    fun getAllInventories(): List<Inventory> {
        return inventories
    }

    fun getInventoryById(inventoryId: Int): Inventory? {
        return inventories.find { it.inventoryId == inventoryId }
    }

    fun addToInventory(inventory: Inventory) {
        val maxInventoryId = inventories.maxBy { it.inventoryId }?.inventoryId ?: 0
        inventory.inventoryId = maxInventoryId + 1
        inventories.add(inventory)
    }

}