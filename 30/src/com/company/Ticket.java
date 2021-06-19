package com.company;

public class Ticket {
    private int cost;
    private String isVip;

    public Ticket(int cost, String isVip) {
        this.cost = cost;
        this.isVip = isVip;
    }
    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getIsVip() {
        return isVip;
    }

    public void setIsVip(String isVip) {
        this.isVip = isVip;
    }

    @Override
    public String toString() {
        return "Стоимость билета: " + cost +
                ", Название фильма: " + isVip;
    }
}
