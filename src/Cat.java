import nl.novi.javaprogrammeren.overerving.Animal;

public class Cat extends Animal {
    public String catOwnerName;
    public String favoriteFoodBrand;
    public String species;
    public String indoorOrOutDoorCat;
    //public boolean indoorCat?


    public Cat(String name, boolean isFemale, String catOwnerName, String favoriteFoodBrand, String species, String indoorOrOutDoorCat) {
        super(name, isFemale);
        this.catOwnerName = catOwnerName;
        this.favoriteFoodBrand = favoriteFoodBrand;
        this.species = species;
        this.indoorOrOutDoorCat = indoorOrOutDoorCat;
    }

    public String getCatOwnerName() {
        return catOwnerName;
    }

    public void setCatOwnerName(String catOwnerName) {
        this.catOwnerName = catOwnerName;
    }

    public String getFavoriteFoodBrand() {
        return favoriteFoodBrand;
    }

    public void setFavoriteFoodBrand(String favoriteFoodBrand) {
        this.favoriteFoodBrand = favoriteFoodBrand;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getIndoorOrOutDoorCat() {
        return indoorOrOutDoorCat;
    }

    public void setIndoorOrOutDoorCat(String indoorOrOutDoorCat) {
        this.indoorOrOutDoorCat = indoorOrOutDoorCat;
    }
}
