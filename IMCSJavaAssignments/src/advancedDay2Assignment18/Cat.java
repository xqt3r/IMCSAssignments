package advancedDay2Assignment18;

public class Cat extends Animal implements PetAnimal {
    private String color;
    private String breed;

    public Cat(int legs, int height, int weight, int age, String color, String breed) {
        super(legs, height, weight, age);
        this.color = color;
        this.breed = breed;
    }

    public String getColor() {
        return color;
    }

    public String getBreed() {
        return breed;
    }
}
