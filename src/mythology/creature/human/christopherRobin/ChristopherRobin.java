package mythology.creature.human.christopherRobin;

import mythology.creature.LifeStatus;
import mythology.creature.PlaceIsToHighExeption;
import mythology.creature.animal.cartoonAnimal.Eeyore;
import mythology.creature.human.Human;
import mythology.place.World;

public class ChristopherRobin extends Human {

    public ChristopherRobin(String creatureName, int age, LifeStatus lifeStatus, String gender, float height, float weight, float strength) {
        super(creatureName, age, lifeStatus, gender, height, weight, strength);
    }

    public void helpFriends() {}

    public void riseSomeoneUp(String name, double distance) throws PlaceIsToHighExeption {
        if (distance > 100) {
            System.out.println(this.getCreatureName() + " поднял " + name);
        } else {
            throw new PlaceIsToHighExeption("Здесь слишком высоко, " + this.getCreatureName() + " не сможет забраться наверх!");
        }
    }

    public String getChristopherRobinName() {
        return this.getCreatureName();
    }

    public double getChristopherWeight() {
        return this.weight;
    }

    public double getChristopherStrength() {
        return this.strength;
    }

    @Override
    public boolean equals(Object object) {
        if (object instanceof ChristopherRobin) {
            ChristopherRobin c = (ChristopherRobin) object;
            return (creatureName == c.creatureName && age == c.age);
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
        return ("This ChristopherRobin: "
                + "Name: " + this.creatureName
                + "Age: " + this.age
                + "LifeStatus: " + this.lifeStatus);
    }
}
