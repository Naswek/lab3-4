package mythology.creature.animal;

import mythology.creature.CreatureAbstract;
import mythology.creature.LifeStatus;

import java.util.Random;

public abstract class Animal extends CreatureAbstract {

    protected double strength;
    protected String species;
    protected String color;
    public double weight;
    protected FriendlinessStatus friendliness;

    public Animal(String creatureName, int age, LifeStatus lifeStatus, double strength, String species, String color, double weight, FriendlinessStatus friendliness) {
        super(creatureName, age, lifeStatus);
        this.strength = strength;
        this.species = species;
        this.color = color;
        this.weight = weight;
        this.friendliness = friendliness;
    }

    public boolean hunt() {
        if (this.friendliness == FriendlinessStatus.FRIENDLY) {
            System.out.println(this.getCreatureName() + " безобидное существо");
            return true;
        } else {
            System.out.println("Охота началась!");
            return false;
        }
    }

    public void run() {
        System.out.println(this.getCreatureName() + "сбежало");
    }

    public void survive() {
        if (hunt()) {
            run();
        }
    }

    protected int getRandomChance(){
        Random random = new Random();
        int chance = random.nextInt(11);
        return chance;
    }

    public void protect() {
        if (hunt()) {
            fight();
            if (getRandomChance() >= 7) {
                kill();
            } else {
                run();
            }
        }
    }
}