import nl.novi.javaprogrammeren.overerving.Animal;

public class Dog extends Animal {
    public String dogOwnerName;
    public String favoriteFoodBrand;
    public String specie;

    public Dog(String name, boolean isFemale, String dogOwnerName, String favoriteFoodBrand, String specie) {
        super(name, isFemale);
        this.dogOwnerName = dogOwnerName;
        this.favoriteFoodBrand = favoriteFoodBrand;
        this.specie = specie;
    }

    public String getDogOwnerName() {
        return dogOwnerName;
    }

    public void setDogOwnerName(String dogOwnerName) {
        this.dogOwnerName = dogOwnerName;
    }

    public String getFavoriteFoodBrand() {
        return favoriteFoodBrand;
    }

    public void setFavoriteFoodBrand(String favoriteFoodBrand) {
        this.favoriteFoodBrand = favoriteFoodBrand;
    }

    public String getSpecie() {
        return specie;
    }

    public void setSpecie(String specie) {
        this.specie = specie;
    }
}
