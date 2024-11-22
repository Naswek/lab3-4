package mythology.creature.animal.cartoonAnimal;

import mythology.creature.LifeStatus;
import mythology.creature.PlaceIsToHighExeption;
import mythology.creature.animal.Animal;
import mythology.creature.animal.FriendlinessStatus;

public class Tigger extends Animal implements CartoonAnimal {

    public Tigger(String creatureName, int age, LifeStatus lifeStatus, double strength, String species, String color, double weight, FriendlinessStatus friendliness) {
        super(creatureName, age, lifeStatus, strength, species, color, weight, friendliness);
    }

    public void makeTigerSounds(){
        System.out.println("*звуки тигра*");
    }

    public void riseSomeoneUp(String name, double distance) throws PlaceIsToHighExeption {
        if (distance > 100) {
            System.out.println(this.getCreatureName() + " поднял " + name);
        } else {
            throw new PlaceIsToHighExeption("Здесь слишком высоко, " + this.getCreatureName() + " не сможет забраться наверх!");
        }
    }

    public double getTiggerWeight() {
        return this.weight;
    }

    public double getTiggerStrength() {
        return this.strength;
    }

    public String getTiggerName() {
        return this.getCreatureName();
    }

    @Override
    public boolean equals(Object object) {
        if (object instanceof Tigger) {
            Tigger t = (Tigger) object;
            return (creatureName == t.creatureName && age == t.age);
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
        return ("This Tiger: "
                + "Name: " + this.creatureName
                + "Age: " + this.age
                + "LifeStatus: " + this.lifeStatus);
    }
}
