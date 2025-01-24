package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Security {
    @Id
    @GeneratedValue()
    private long security_id;

    @ManyToOne
    @JoinColumn(name = "portfolio_id",referencedColumnName = "portfolio_id")
    private Portfolio portfolio;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String category;

    @Column(nullable = false)
    private Double purchase_price;

    @Column(nullable = false)
    private Date purchase_date;

    @Column(nullable = false)
    private Integer quantity;

    public Security(long security_id, Portfolio portfolio, String name, String category, Double purchase_price, Date purchase_date, Integer quantity) {
        this.security_id = security_id;
        this.portfolio = portfolio;
        this.name = name;
        this.category = category;
        this.purchase_price = purchase_price;
        this.purchase_date = purchase_date;
        this.quantity = quantity;
    }

    public long getSecurity_id() {
        return security_id;
    }

    public void setSecurity_id(long security_id) {
        this.security_id = security_id;
    }

    public Portfolio getPortfolio() {
        return portfolio;
    }

    public void setPortfolio(Portfolio portfolio) {
        this.portfolio = portfolio;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Double getPurchase_price() {
        return purchase_price;
    }

    public void setPurchase_price(Double purchase_price) {
        this.purchase_price = purchase_price;
    }

    public Date getPurchase_date() {
        return purchase_date;
    }

    public void setPurchase_date(Date purchase_date) {
        this.purchase_date = purchase_date;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}
