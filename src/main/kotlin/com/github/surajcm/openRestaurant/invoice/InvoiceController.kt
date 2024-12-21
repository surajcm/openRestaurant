package com.github.surajcm.openRestaurant.invoice

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping

@Controller
class InvoiceController {

    @GetMapping("/invoices")
    fun getInvoices(model: Model): String {
        model.addAttribute("invoices", "Invoices")
        return "invoices"
    }

    @GetMapping("/invoice")
    fun generateInvoice(model: Model): String {
        model.addAttribute("invoice", "Invoice")
        return "invoice"
    }
}