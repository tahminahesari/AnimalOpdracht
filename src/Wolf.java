import nl.novi.javaprogrammeren.overerving.Animal;

public class Wolf extends Animal {
    public String cageName;
    public String lastFedDay;
    public String countryOfOrigin;
    public String packName;

    public Wolf(String name, boolean isFemale, String cageName, String lastFedDay, String countryOfOrigin, String packName) {
        super(name, isFemale);
        this.cageName = cageName;
        this.lastFedDay = lastFedDay;
        this.countryOfOrigin = countryOfOrigin;
        this.packName = packName;
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

    public String getPackName() {
        return packName;
    }

    public void setPackName(String packName) {
        this.packName = packName;
    }
}