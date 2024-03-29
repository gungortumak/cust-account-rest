package com.codd.rest.customerservice.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@Table(name="CUSTOMER")
@Entity
public class Customer implements Serializable{
    private static final long serialVersionUID = -2737771665630306273L;

    @Id
    @GeneratedValue
    @Column(name="CUSTOMERID",updatable = false)
    private Integer customerId;

    @Column(name="NAME")
    private String customerName;

    @Column(name="DATEOFBIRTH" ,nullable=true)
    private LocalDate dateofBirth;

    @Column(name="PHONENUMBER")
    private String phoneNumber;

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public LocalDate getDateofBirth() {
        return dateofBirth;
    }

    public void setDateofBirth(LocalDate dateofBirth) {
        this.dateofBirth = dateofBirth;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

}