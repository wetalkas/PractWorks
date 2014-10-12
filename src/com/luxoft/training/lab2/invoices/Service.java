package com.luxoft.training.lab2.invoices;


import com.luxoft.training.utils.Date;

public class Service extends Invoice {

    public Service(String productDescription, String sellerContacts, String buyerContacts, Date invoiceDate, double invoicePrice) {
        super(productDescription, sellerContacts, buyerContacts, invoiceDate, invoicePrice);
        invoicePriceCalc();
    }

    @Override
    public double invoicePriceCalc() {
        setInvoicePrice(getInvoicePrice());
        return getInvoicePrice();
    }

    @Override
    public void printInvoiceInfo() {
        System.out.println("Service description: " + getProductDescription());
        System.out.println("Seller contacts: " + getSellerContacts());
        System.out.println("Buyer contacts: " + getBuyerContacts());
        System.out.println("Invoice date: " + getInvoiceDate().printDate());
        System.out.println("Invoice price: " + getInvoicePrice());
        System.out.println();
    }
}
