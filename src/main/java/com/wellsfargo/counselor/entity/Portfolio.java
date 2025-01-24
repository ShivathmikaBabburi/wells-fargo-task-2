package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Portfolio {
    @Id
    @GeneratedValue()
    private long portfolio_id;

    @ManyToOne
    @JoinColumn(name = "client_id",referencedColumnName = "client_id")
    private Client client;

    @Column(nullable = false)
    private Date creation_date;

    public Portfolio(long portfolio_id, Client client, Date creation_date) {
        this.portfolio_id = portfolio_id;
        this.client = client;
        this.creation_date = creation_date;
    }

    public long getPortfolio_id() {
        return portfolio_id;
    }

    public void setPortfolio_id(long portfolio_id) {
        this.portfolio_id = portfolio_id;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Date getCreation_date() {
        return creation_date;
    }

    public void setCreation_date(Date creation_date) {
        this.creation_date = creation_date;
    }
}
