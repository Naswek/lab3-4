package mythology.creature.animal.cartoonAnimal;

import mythology.creature.LifeStatus;
import mythology.creature.PlaceIsToHighExeption;
import mythology.creature.animal.Animal;
import mythology.creature.animal.FriendlinessStatus;

public class Piglet extends Animal implements CartoonAnimal {

    public Piglet(String creatureName, int age, LifeStatus lifeStatus, double strength, String species, String color, double weight, FriendlinessStatus friendliness) {
        super(creatureName, age, lifeStatus, strength, species, color, weight, friendliness);
    }

    public void makePiggySounds(){
        System.out.println("*звуки поросенка*");
    }

    public void riseSomeoneUp(String name, double distance) throws PlaceIsToHighExeption {
        if (distance > 100) {
            System.out.println(this.getCreatureName() + " поднял " + name);
        } else {
            throw new PlaceIsToHighExeption("Здесь слишком высоко, " + this.getCreatureName() + " не сможет забраться наверх!");
        }
    }

    public double getPigletWeight() {
        return this.weight;
    }

    public double getPigletStrength() {
        return this.strength;
    }

    public String getPigletName() {
        return this.getCreatureName();
    }

    @Override
    public boolean equals(Object object) {
        if (object instanceof Piglet) {
            Piglet p = (Piglet) object;
            return (creatureName == p.creatureName && age == p.age);
        }
        if (object == this) {
            return true;
        }
        if (object == null) {
            return false;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.creatureName.hashCode() + this.age + 2024;
    }

    @Override
    public String toString() {
        return ("This Piglet: "
                + "Name: " + this.creatureName
                + "Age: " + this.age
                + "LifeStatus: " + this.lifeStatus);
    }
}
