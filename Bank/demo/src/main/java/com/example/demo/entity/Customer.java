package com.example.demo.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
public class Customer {

   @Id
   private  Long id;
   @Column(nullable = false)
    private  String name ;
    @Column(nullable = false)
    private  String address;
    @Column(nullable = false)
    private  String  city;
    @Column(nullable = false)
    private  Long aadharNumber;
    @Column(nullable = false)
    private  Long phone;
    @Column(nullable = false)
    private  String email;
    @Column(nullable = false)
    private  String password;

    @JsonIgnore
    @OneToOne
    private  Account account;

    public Customer() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Long getAadharNumber() {
        return aadharNumber;
    }

    public void setAadharNumber(Long aadharNumber) {
        this.aadharNumber = aadharNumber;
    }

    public Long getPhone() {
        return phone;
    }

    public void setPhone(Long phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public  Account getAccount(){
        return  account;
 }

     public  void  setAccount(Account account){
        this.account = account;
 }

    public Customer(Long customerId, String name, String address, String city, Long aadharNumber, Long phone, String email, String password) {
        this.id = customerId;
        this.name = name;
        this.address = address;
        this.city = city;
        this.aadharNumber = aadharNumber;
        this.phone = phone;
        this.email = email;
        this.password = password;
    }


}
