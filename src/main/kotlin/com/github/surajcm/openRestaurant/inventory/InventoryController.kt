package com.github.surajcm.openRestaurant.inventory

import com.github.surajcm.openRestaurant.inventory.dao.entity.Inventory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping

@Controller
class InventoryController {

    @Autowired
    lateinit var inventoryService: InventoryService

    @GetMapping("/inventories")
    fun getInventories(model: Model): String {
        model.addAttribute("inventories", inventoryService.getAllInventories())
        return "inventories"
    }

    @GetMapping("/inventory/{inventoryId}")
    fun getInventoryById(@PathVariable("inventoryId") inventoryId:Int, model: Model): String {
        model.addAttribute("inventory", inventoryService.getInventoryById(inventoryId))
        return "inventory"
    }

    @GetMapping("/inventory")
    fun addInventory(model: Model): String {
        model.addAttribute("inventory", Inventory(0, "", 0, 0.0))
        return "new-inventory"
    }

    @PostMapping("/inventory")
    fun addToInventory(inventory: Inventory, model: Model): String {
        inventoryService.addToInventory(inventory)
        return "redirect:/inventory/" + inventory.inventoryId
    }



}