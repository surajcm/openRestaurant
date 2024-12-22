package com.github.surajcm.openRestaurant.invoice.service

import com.github.surajcm.openRestaurant.invoice.dao.entity.Invoice
import org.springframework.stereotype.Service

@Service
class InvoiceService {
    val invoices: MutableList<Invoice> = mutableListOf(
        Invoice(1, "INV-001", 100.0),
        Invoice(2, "INV-002", 200.0),
        Invoice(3, "INV-003", 300.0),
        Invoice(4, "INV-004", 400.0),
        Invoice(5, "INV-005", 500.0),
        Invoice(6, "INV-006", 600.0),
        Invoice(7, "INV-007", 700.0),
        Invoice(8, "INV-008", 800.0),
        Invoice(9, "INV-009", 900.0),
        Invoice(10, "INV-010", 1000.0)
    )

    fun getAllInvoices(): List<Invoice> {
        return invoices
    }

}