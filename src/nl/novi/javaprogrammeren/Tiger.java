package nl.novi.javaprogrammeren;

import nl.novi.javaprogrammeren.overerving.Animal;

public class Tiger extends Animal {
    public String cageName;
    public String lastFedDay;
    public String countryOfOrigin;
    public int stripes;

    public Tiger(String name, boolean isFemale, String cageName, String lastFedDay, String countryOfOrigin, int stripes) {

        super(name, isFemale);
        this.name = name;
        this.cageName = cageName;
        this.lastFedDay = lastFedDay;
        this.stripes = stripes;
//        this.meat = meat;
    }

    @Override
    public void sound() {

        System.out.println("Tiger" + super.name + " is roaring");
    }


    @Override
    public void eat(String food) {
        System.out.println("Tiger " + super.name + food +" and thinks it is rather delicious.");
    }

    public String getCageName() {
        return cageName;
    }

    public void setCageName(String cageName) {
        this.cageName = cageName;
    }

    public String getLastFedDay() {
        return lastFedDay;
    }

    public void setLastFedDay(String lastFedDay) {
        this.lastFedDay = lastFedDay;
    }

    public String getCountryOfOrigin() {
        return countryOfOrigin;
    }

    public void setCountryOfOrigin(String countryOfOrigin) {
        this.countryOfOrigin = countryOfOrigin;
    }

    public int getStripes() {
        return stripes;
    }

    public void setStripes(int stripes) {
        this.stripes = stripes;
    }

    public void eat() {
        System.out.println(super.name + " Ate leftovers ");
    }
}

