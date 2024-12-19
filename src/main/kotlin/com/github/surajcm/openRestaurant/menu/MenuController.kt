package com.github.surajcm.openRestaurant.menu

import com.github.surajcm.openRestaurant.menu.dao.entity.Dish
import com.github.surajcm.openRestaurant.menu.service.MenuService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping

@Controller
class MenuController {
    @Autowired
    lateinit var menuService: MenuService

    @GetMapping("/menu")
    fun getMenu(model: Model): String {
        model.addAttribute("menu", menuService.generateMenu())
        return "menu"
    }

    @GetMapping("/menu/{dishId}")
    fun findDish(@PathVariable("dishId") dishId:Int, model: Model): String {
        model.addAttribute("dish", menuService.findDishById(dishId))
        return "dish"
    }

    @PostMapping("/dish")
    fun addDish(dish: Dish, model: Model): String {
        menuService.addDish(dish)
        return "redirect:/menu/" + dish.dishId
    }

    @GetMapping("/dish")
    fun createDish(model: Model): String {
        model.addAttribute("dish", Dish(0, "", "", 0.0))
        return "new-dish"
    }
}