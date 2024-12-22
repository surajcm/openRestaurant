package com.github.surajcm.openRestaurant.invoice

import com.github.surajcm.openRestaurant.invoice.service.InvoiceService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping

@Controller
class InvoiceController {
    @Autowired
    lateinit var invoiceService: InvoiceService

    @GetMapping("/invoices")
    fun getInvoices(model: Model): String {
        model.addAttribute("invoices", invoiceService.getAllInvoices())
        return "invoices"
    }

    @GetMapping("/invoice")
    fun generateInvoice(model: Model): String {
        model.addAttribute("invoice", "Invoice")
        return "invoice"
    }
}