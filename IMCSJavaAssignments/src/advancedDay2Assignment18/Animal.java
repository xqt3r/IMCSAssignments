package advancedDay2Assignment18;

public class Animal {
    private int legs;
    private int height;
    private int weight;
    private int age;

    public Animal(int legs, int height, int weight, int age) {
        this.legs = legs;
        this.height = height;
        this.weight = weight;
        this.age = age;
    }

    public int getLegs() {
        return legs;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }

    public int getAge() {
        return age;
    }
}
