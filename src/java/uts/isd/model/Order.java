/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts.isd.model;

import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author rhys
 */
public class Order {
    
    int id;
    int customerId;
    int userId;
    int billingAddressId;
    int shippingAddressId;
    int paymentMethodId;
    double totalCost;
    int status;
    
    List<OrderLine> orderLines;

    public Order() {
        this.id = 0;
        this.customerId = 0;
        this.userId = 0;
        this.billingAddressId = 0;
        this.shippingAddressId = 0;
        this.paymentMethodId = 0;
        this.totalCost = 0;
        this.status = 0;
        
        this.orderLines = new ArrayList<>();
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

    public int getBillingAddressId() {
        return billingAddressId;
    }

    public void setBillingAddressId(int billingAddressId) {
        this.billingAddressId = billingAddressId;
    }

    public int getShippingAddressId() {
        return shippingAddressId;
    }

    public void setShippingAddressId(int shippingAddressId) {
        this.shippingAddressId = shippingAddressId;
    }

    public int getPaymentMethodId() {
        return paymentMethodId;
    }

    public void setPaymentMethodId(int paymentMethodId) {
        this.paymentMethodId = paymentMethodId;
    }

    public double getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(double totalCost) {
        this.totalCost = totalCost;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public List<OrderLine> getOrderLines() {
        return orderLines;
    }
    
    public int getLineCount() {
        return this.orderLines.size();
    }

    public void setOrderLines(List<OrderLine> orderLines) {
        this.orderLines = orderLines;
    }
    
    public void addOrderLine(OrderLine line)
    {
        this.orderLines.add(line);
        this.totalCost += (line.getUnitPrice() * line.getQuantity());
    }
    
    public void removeOrderLine(OrderLine line)
    {
        this.orderLines.remove(line);
        this.totalCost -= (line.getUnitPrice() * line.getQuantity());
    }
    
    public int getTotalQuantity()
    {
        int quantity = 0;
        for (int i = 0; i < this.orderLines.size(); i++)
            quantity += this.orderLines.get(i).getQuantity();
        
        return quantity;
    }
}
