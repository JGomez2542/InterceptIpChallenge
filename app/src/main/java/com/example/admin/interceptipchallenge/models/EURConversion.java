package com.example.admin.interceptipchallenge.models;

public class EURConversion {

    private String from;
    private String to;
    private Double exchangeRate;

    public EURConversion() {
        this.from = "EUR";
        this.to = "GBP";
        this.exchangeRate = 0.74;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public Double getExchangeRate() {
        return exchangeRate;
    }

    public void setExchangeRate(Double exchangeRate) {
        this.exchangeRate = exchangeRate;
    }
}
