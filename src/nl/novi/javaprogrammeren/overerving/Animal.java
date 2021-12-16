package nl.novi.javaprogrammeren.overerving;

public class Animal {

    public static String name;
    public static boolean isFemale;

    public void sound() {
        System.out.println("...A DEAFENING SILENCE!!");
    }

    //super() methode
    public Animal(String name, boolean isFemale) {
        this.name = name;
        this.isFemale = isFemale;
    }

    public void move() {
        System.out.println("Moved 0.25 meter ");
    }

    public void sleep() {

        System.out.println("Let's sleep for 8 hours");
    }

    public void eat(String food) {

        System.out.println("I eat " + food);
    }

}

