package com.luxoft.training.lab2.invoices;


import com.luxoft.training.utils.Date;

public abstract class Invoice {

    private String sellerContacts;
    private String buyerContacts;

    private String productDescription;

    private Date invoiceDate;
    private Date shippingDate;
    private Date deliveryDate;

    private double invoicePrice;

    public Invoice(String productDescription, String sellerContacts, String buyerContacts, Date invoiceDate, double invoicePrice) {
        this.sellerContacts = sellerContacts;
        this.buyerContacts = buyerContacts;
        this.productDescription = productDescription;
        this.invoiceDate = invoiceDate;
        this.invoicePrice = invoicePrice;
    }

    public abstract double invoicePriceCalc();

    public abstract void printInvoiceInfo();



    public String getSellerContacts() {
        return sellerContacts;
    }

    public void setSellerContacts(String sellerContacts) {
        this.sellerContacts = sellerContacts;
    }

    public String getBuyerContacts() {
        return buyerContacts;
    }

    public void setBuyerContacts(String buyerContacts) {
        this.buyerContacts = buyerContacts;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public Date getInvoiceDate() {
        return invoiceDate;
    }

    public void setInvoiceDate(Date invoiceDate) {
        this.invoiceDate = invoiceDate;
    }

    public Date getShippingDate() {
        return shippingDate;
    }

    public void setShippingDate(Date shippingDate) {
        this.shippingDate = shippingDate;
    }

    public Date getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(Date deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public double getInvoicePrice() {
        return invoicePrice;
    }

    public void setInvoicePrice(double invoicePrice) {
        this.invoicePrice = invoicePrice;
    }
}
