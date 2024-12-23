package com.github.surajcm.openRestaurant.invoice

import com.github.surajcm.openRestaurant.invoice.dao.entity.Invoice
import com.github.surajcm.openRestaurant.invoice.service.InvoiceService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping

@Controller
class InvoiceController {
    @Autowired
    lateinit var invoiceService: InvoiceService

    @GetMapping("/invoices")
    fun getInvoices(model: Model): String {
        model.addAttribute("invoices", invoiceService.getAllInvoices())
        return "invoices"
    }

    @GetMapping("/invoice/{invoiceId}")
    fun getInvoiceById(@PathVariable("invoiceId") invoiceId: Int, model: Model): String {
        model.addAttribute("invoice", invoiceService.getInvoiceById(invoiceId))
        return "invoice"
    }

    @GetMapping("/invoice")
    fun generateInvoice(model: Model): String {
        model.addAttribute("invoice", Invoice(0, "", 0.0))
        return "new-invoice"
    }

    @PostMapping("/invoice")
    fun addInvoice(invoice: Invoice, model: Model): String {
        invoiceService.addInvoice(invoice)
        return "redirect:/invoice/" + invoice.invoiceId
    }
}