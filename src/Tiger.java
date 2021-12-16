import nl.novi.javaprogrammeren.overerving.Animal;

public class Tiger extends Animal {
    public String cageName;
    public String lastFedDay;
    public String countryOfOrigin;
    public int stripes;
//    public String meat;

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
        System.out.println("Roar");

      //  waarom kan ik niet overschrijven
      // mag ik meerderen @Override gebruiken in een klasse?
//    @Override
//    public void eat() {
//            System.out.println("I eat " + meat  );
//        }

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
}

