package com.github.surajcm.openRestaurant.invoice.dao.entity

class Invoice(val invoiceId: Int, val invoiceNumber: String, val totalAmount: Double) {
    override fun toString(): String {
        return "Invoice(invoiceId=$invoiceId, invoiceNumber='$invoiceNumber', totalAmount=$totalAmount)"
    }
}