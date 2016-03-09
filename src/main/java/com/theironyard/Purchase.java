package com.theironyard;

import javax.persistence.*;
import javax.validation.constraints.NotNull;


/**
 * Created by PiratePowWow on 3/9/16.
 */
@Entity
public class Purchase {
    @Id
    @GeneratedValue
    private int id;
    @NotNull
    @ManyToOne
    private Customer customer;
    @NotNull
    private String date;
    @NotNull
    private String creditCard;
    @NotNull
    private String cvv;
    @NotNull
    private String category;

    public Purchase(Customer customer, int id, String date, String creditCard, String cvv, String category) {
        this.id = id;
        this.date = date;
        this.creditCard = creditCard;
        this.cvv = cvv;
        this.category = category;
        this.customer = customer;
    }

    public Purchase(Customer customer, String date, String creditCard, String cvv, String category) {
        this.customer = customer;
        this.date = date;
        this.creditCard = creditCard;
        this.cvv = cvv;
        this.category = category;
    }

    public Purchase(){

    }

    public int getId() {
        return id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getCreditCard() {
        return creditCard;
    }

    public void setCreditCard(String creditCard) {
        this.creditCard = creditCard;
    }

    public String getCvv() {
        return cvv;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
