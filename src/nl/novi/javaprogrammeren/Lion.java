package nl.novi.javaprogrammeren;

import nl.novi.javaprogrammeren.overerving.Animal;

public class Lion extends Animal {
    public String cageName;
    public String lastFedDay;
    public String countryOfOrigin;
    public int amountOfLionCubs;

    @Override
    public void sound() {
        System.out.println("de leeuw genaamd " + super.name + " gromt");
    }

  @Override
  //food dat is een parameter (je kan een naam geven die je zelf maar wil)
  //je weet niet wat de waarde is, je weet het alleen dat een String is. Het kan zebra zijn of cow of iets anders.
  //Wat () staat bij defineren van een methode zijn altijd parameters
    public void eat(String food) {

        System.out.println("Lion" + super.name + " is eating " + food );
    }

    //super() methoden aangeroepen met "String name en boolean isFemale"
    public Lion(String name, boolean isFemale, String cageName, String lastFedDay, String countryOfOrigin, int amountOfLionCubs) {
        //super()
        super(name, isFemale);

        this.cageName = cageName;
        this.lastFedDay = lastFedDay;
        this.countryOfOrigin = countryOfOrigin;
        this.amountOfLionCubs = amountOfLionCubs;
    }

    public String getCageName() {
        return cageName;
    }

    public void setCageName(String cageName) {
        this.cageName = cageName;
    }


    public String getWeekDay() {
        return lastFedDay;
    }

    public void setWeekDay(String weekDay) {
        this.lastFedDay = weekDay;
    }

    public String getCountryOfOrigin() {
        return countryOfOrigin;
    }

    public void setCountryOfOrigin(String countryOfOrigin) {
        this.countryOfOrigin = countryOfOrigin;
    }

    public int getAmountOfLionCubs() {
        return amountOfLionCubs;
    }

    public void setAmountOfLionCubs(int amountOfLionCubs) {
        this.amountOfLionCubs = amountOfLionCubs;
    }
}