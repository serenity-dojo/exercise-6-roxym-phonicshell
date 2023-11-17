package com.serenitydojo.model;

public class Feeder {
    public String feeds(String animal, boolean isPremium) {
        // Ternary expression
        if (animal.equals("Cat")) {
//            if(isPremium){
//                return "Salmon";
//            } else {
//                return "Tuna";
//            }
            return(isPremium) ? "Salmon" : "Tuna";
        } else if (animal.equals("Dog")) {
            return (isPremium) ? "Deluxe Dog Food" : "Dog Food";
        } else if (animal.equals("Hamster")){
            return (isPremium) ? "Deluxe Lettuce" : "Lettuce";
        }
            return "Cabbage";
    }
}
