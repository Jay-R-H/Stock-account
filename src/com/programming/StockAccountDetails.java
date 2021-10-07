package com.programming;

import java.util.ArrayList;

public class StockAccountDetails {
    private String stockName;
    private int numberOfShares;
    private int sharePrice;
    private ArrayList stockList = new ArrayList();


    public String getStockName() {
        return stockName;
    }

    public void setStockName(String stockName) {
        this.stockName = stockName;
    }

    public int getNumberOfShares() {
        return numberOfShares;
    }

    public void setNumberOfShares(int numberOfShares) {
        this.numberOfShares = numberOfShares;
    }

    public int getSharePrice() {
        return sharePrice;
    }

    public void setSharePrice(int sharePrice) {
        this.sharePrice = sharePrice;
    }

//    public int getStockList() {
//        return stockList;
//    }
//
//    public void setStockList(int stockList) {
//        this.stockList = stockList;
//    }
}
