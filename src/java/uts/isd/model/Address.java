/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts.isd.model;

/**
 *
 * @author rhys
 */
public class Address {
    
    int id;
    int customerId;
    int userId;
    int defaultShippingAddress; //Is this address the customer's default shipping address?
    int defaultBillingAddress; //Is this address the customer's default billing address?    
    String addressPrefix1;
    int streetNumber;
    String streetName;
    String streetType;
    String suburb;
    String state;
    String postcode;
    String country;

    public Address() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getDefaultShippingAddress() {
        return defaultShippingAddress;
    }

    public void setDefaultShippingAddress(int defaultShippingAddress) {
        this.defaultShippingAddress = defaultShippingAddress;
    }

    public int getDefaultBillingAddress() {
        return defaultBillingAddress;
    }

    public void setDefaultBillingAddress(int defaultBillingAddress) {
        this.defaultBillingAddress = defaultBillingAddress;
    }

    public String getAddressPrefix1() {
        return addressPrefix1;
    }

    public void setAddressPrefix1(String addressPrefix1) {
        this.addressPrefix1 = addressPrefix1;
    }

    public int getStreetNumber() {
        return streetNumber;
    }

    public void setStreetNumber(int streetNumber) {
        this.streetNumber = streetNumber;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getStreetType() {
        return streetType;
    }

    public void setStreetType(String streetType) {
        this.streetType = streetType;
    }

    public String getSuburb() {
        return suburb;
    }

    public void setSuburb(String suburb) {
        this.suburb = suburb;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
    
    
}
