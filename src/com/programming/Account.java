package com.programming;

import java.util.ArrayList;
import java.util.Scanner;

public class Account {
    private static Scanner scanner = new Scanner(System.in);
    static ArrayList<StockAccountDetails> stockDetails = new ArrayList<>();
    StockAccountDetails stockAccountDetails = new StockAccountDetails();

//    static ArrayList<StockAccountDetails> accountDetails = new ArrayList();

    public void stockAccountManagement() {
        System.out.println("Choose action : .\n1. Add Stock .\n2. Display the stock.\n3. Buy share" +
                ".\n4. Sell share.\n5.Display stock values.\n6.Stock report.\n7.Exit");

        int choose = scanner.nextInt();
        switch (choose) {
            case 1:
                addStock();
                break;
            case 2:
                displayStocks();
                break;
            case 3:
                buyShare();
                break;
            case 4:
                sellShare();
                break;
            case 5:
                calculateValueOfShares();
                break;
            case 6:
                stockReport();
                break;
            case 7:
                System.out.println("Exited");
                break;
            default:
                System.out.println("Choose a valid option");
        }
    }


    public void addStock() {
        StockAccountDetails stockAccountDetails = new StockAccountDetails();
        System.out.println("Enter the stock name: ");
        String nameOfStock = scanner.next();
        stockAccountDetails.setStockName(nameOfStock);

        System.out.println("Enter number of shares: ");
        int quantityOfShares = scanner.nextInt();
        stockAccountDetails.setNumberOfShares(quantityOfShares);

        System.out.println("Enter the value of share: ");
        int priceOfShare = scanner.nextInt();
        stockAccountDetails.setSharePrice(priceOfShare);

        stockDetails.add(stockAccountDetails);
        System.out.println(stockDetails);

    }

    public void displayStocks() {
        System.out.println("Enter the stock name to get details of the stock:");
        String stockNameCheck = scanner.next();
        if (stockDetails.get(1).getStockName().equals(stockNameCheck)) {
            System.out.println(stockAccountDetails.getNumberOfShares());
        }
    }

    public void buyShare() {
        addStock();
    }

    public void sellShare() {

    }

    public void calculateValueOfShares() {
        System.out.println("Enter the stock name to get the stock value:");
        String stockNameCheck = scanner.next();
        if (stockDetails.get(1).getStockName().equals(stockNameCheck)) {
            int shareQuantity = stockAccountDetails.getNumberOfShares();
            int shareValue = stockAccountDetails.getSharePrice();
            int value = shareQuantity * shareValue;
            System.out.println("The total value for the stock " + stockNameCheck + " is " + value + ".rupees");
        }
    }

    public void stockReport() {
        System.out.println("Stock report: ");
        System.out.println("The stock name: " + stockDetails.get(1).getStockName());
        System.out.println("The " + stockDetails.get(1).getStockName() + " has total shares of " + stockDetails.get(1).getNumberOfShares());
        System.out.print(" " + " of each having value of " + stockDetails.get(1).getSharePrice());
        System.out.print(" " + " adding to total value of " + stockDetails.get(1).getSharePrice() * stockDetails.get(1).getNumberOfShares());

    }

    public static void main(String[] args) {
        Account account = new Account();
        account.stockAccountManagement();
    }
}
