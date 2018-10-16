package com.example.admin.interceptipchallenge.models;

public class AUDConversion {

    private String from;
    private String to;
    private Double exchangeRate;

    public AUDConversion() {
        this.from = "AUD";
        this.to = "GBP";
        this.exchangeRate = 0.52;
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
