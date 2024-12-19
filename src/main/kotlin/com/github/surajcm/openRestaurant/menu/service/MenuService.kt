package com.github.surajcm.openRestaurant.menu.service

import com.github.surajcm.openRestaurant.menu.dao.entity.Dish
import org.springframework.stereotype.Service

@Service
class MenuService {
    val menu:List<Dish> = mutableListOf(
        Dish(1, "Burger", "Burger", 10.0),
        Dish(2, "Pizza", "Pizza", 20.0),
        Dish(3, "Pasta","Pasta", 15.0),
        Dish(4, "Sandwich","Sandwich", 5.0),
        Dish(5, "Noodles", "Noodles", 10.0),
        Dish(6, "Fried Rice", "Fried Rice", 10.0),
        Dish(7, "Salad","Salad", 5.0),
        Dish(8, "Soup","Soup", 5.0),
        Dish(9, "Biryani","Biryani", 15.0),
        Dish(10, "Pulao","Pulao", 10.0)
    )

    fun generateMenu(): List<Dish> {
        return menu
    }

    fun findDishById(dishId: Int): Dish? {
        return menu.find { it.dishId == dishId }
    }

    fun addDish(dish: Dish) {
        (menu as MutableList).add(dish)
    }
}