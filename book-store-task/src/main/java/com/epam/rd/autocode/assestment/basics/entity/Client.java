package com.epam.rd.autocode.assestment.basics.entity;

import java.math.BigDecimal;
import java.util.Objects;

class Client extends User {
    private BigDecimal balance;

    // Default constructor
    public Client() {
        super();
    }

    // Parameterized constructor
    public Client(long id, String email, String password, String name, BigDecimal balance) {
        super(id, email, password, name);
        this.balance = balance;
    }

    // Getters and setters
    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    // equals and hashCode
    @Override
    public boolean equals(Object o) {
        if (!super.equals(o)) return false;
        Client client = (Client) o;
        return Objects.equals(balance, client.balance);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), balance);
    }

    // toString
    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", name='" + name + '\'' +
                ", balance=" + balance +
                '}';
    }
}
