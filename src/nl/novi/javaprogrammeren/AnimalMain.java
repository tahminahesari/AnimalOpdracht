package nl.novi.javaprogrammeren;

public class AnimalMain {
    public static void main(String[] args) {
        // "Lion" is de klasse en "Jhope" is naam van het object en met "new" word een object geinstantieerd.
        Lion Jhope = new Lion("J-hope",false, "J-hope House","Today", "South Korea",0);
        Jhope.sound();
        Jhope.move();
        Jhope.eat(" zebra");
        Tiger Suga = new Tiger("Suga",false,"Juga's House","Yesterday", "South Korea",200);
        Suga.sound();


        //"cow" is een argument een argument is een waarde dat je kan meegeven wanneer je functie aanroept
        Suga.eat(" cow");
        // of kan verwijzen naar een waarde zoals een variable
        String someFood = "Antilope";
        Suga.eat(someFood);
        //Wat () staat als een methode aanroept is altijd een argument.

        //Als je niet juiste aantal argumenten meegeeft wanneer je een methode aanroept krijg een foutmelding.
        //Jhope.eat(); 'eat(java.lang.String)' in 'nl.novi.javaprogrammeren.Lion' cannot be applied to '()

        //Jhope.sound("music"); 'sound()' in 'nl.novi.javaprogrammeren.Lion' cannot be applied to '(java.lang.String)'


    }
}