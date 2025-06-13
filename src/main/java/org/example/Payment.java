package org.example;

public class Payment {
    public double discountByCategory(String passengerCategory, double price) {
        if (price <= 0) {
            throw new IllegalArgumentException("Error! Price must be > 0!");
        }
        double discount = switch (passengerCategory.toLowerCase()) {
            case "schoolkid" -> 25;
            case "student" -> 30;
            case "pensioner" -> 50;
            default -> 0;
        };
        double discountedPrice = price * (100 - discount) / 100;
        double bonusPoints = Math.floor(discountedPrice / 50);
        System.out.printf("Price with discount %.2f rubles | Points awarded: %.0f%n", discountedPrice, bonusPoints);
        return discountedPrice;
    }
}
