package mythology.creature.animal.cartoonAnimal;

import mythology.creature.LifeStatus;
import mythology.creature.PlaceIsToHighExeption;
import mythology.creature.animal.Animal;
import mythology.creature.animal.FriendlinessStatus;

public class Eeyore extends Animal implements CartoonAnimal {

    public Eeyore(String creatureName, int age, LifeStatus lifeStatus, double strength, String species, String color, double weight, FriendlinessStatus friendliness) {
        super(creatureName, age, lifeStatus, strength, species, color, weight, friendliness);
    }

    public void makeDonkeySounds() {
        System.out.println("*звуки осла*");
    }

    public void riseSomeoneUp(double distance) throws PlaceIsToHighExeption {
        if (distance > 100) {
            System.out.println(this.getCreatureName() + " никого не поднимает :(");
        } else {
            throw new PlaceIsToHighExeption("Здесь слишком высоко, " + this.getCreatureName() + " не сможет забраться наверх!");
        }
    }

    public double getEeyoreStrength() {
        return this.strength;
    }

    public double getEeyoreWeight() {
        return this.weight;
    }

    public String getEeyoreName() {
        return this.getCreatureName();
    }

    @Override
    public boolean equals(Object object) {
        if (object instanceof Eeyore) {
            Eeyore e = (Eeyore) object;
            return (creatureName == e.creatureName && age == e.age);
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
        return ("This Eeyore: "
                + "Name: " + this.creatureName
                + "Age: " + this.age
                + "LifeStatus: " + this.lifeStatus);
    }
}
