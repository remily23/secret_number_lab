import java.util.Scanner;

public class WhatToWear {

    public static void main(String[] args) {
        System.out.println("What is the weather like today?");
        Scanner reader = new Scanner(System.in);
        String weatherConditions = reader.nextLine();

        System.out.println("What is the forecast average temperature today?");
        int temperature = reader.nextInt();

        if (weatherConditions.equals("rainy") && temperature <= 10){
            System.out.println("🥶 Wear a waterproof winter coat");
        } else if (weatherConditions.equals("snowy") || temperature <= 5){
            System.out.println("Wear gloves 🧤");
        } else if (weatherConditions.equals("sunny") || temperature > 18){
            System.out.println("Wear sunscreen and sunglasses 😎");
        }

    }

}