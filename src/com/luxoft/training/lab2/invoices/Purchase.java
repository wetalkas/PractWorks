package com.luxoft.training.lab2.invoices;


import com.luxoft.training.utils.Date;

public class Purchase extends Invoice {

    public Purchase(String productDescription, String sellerContacts, String buyerContacts, Date invoiceDate, double invoicePrice, Date shippingDate, Date deliveryDate) {
        super(productDescription, sellerContacts, buyerContacts, invoiceDate, invoicePrice);
        setShippingDate(shippingDate);
        setDeliveryDate(deliveryDate);
        invoicePriceCalc();
    }

    @Override
    public double invoicePriceCalc() {
        setInvoicePrice(getInvoicePrice());
        return getInvoicePrice();
    }

    @Override
    public void printInvoiceInfo() {
        System.out.println("Product description: " + getProductDescription());
        System.out.println("Seller contacts: " + getSellerContacts());
        System.out.println("Buyer contacts: " + getBuyerContacts());
        System.out.println("Invoice date: " + getInvoiceDate().printDate());
        System.out.println("Invoice price: " + getInvoicePrice());
        System.out.println("Shipping date: " + getShippingDate().printDate());
        System.out.println("Delivery date: " + getDeliveryDate().printDate());
        System.out.println();

    }


}
