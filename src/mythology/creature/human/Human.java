package mythology.creature.human;

import mythology.creature.Creature;
import mythology.creature.CreatureAbstract;
import mythology.creature.LifeStatus;
import mythology.place.World;

public abstract class Human extends CreatureAbstract {

    protected String gender;
    protected float height;
    protected float weight;
    protected float strength;

    public Human(String creatureName, int age, LifeStatus lifeStatus, String gender, float height, float weight, float strength) {
        super(creatureName, age, lifeStatus);
        this.gender = gender;
        this.height = height;
        this.weight = weight;
        this.strength = strength;
    }

    public void prayToGods() {
        System.out.println(this.getCreatureName() + " помолился и отчистил свои грехи");
    }

    public void play(){

    }

    public void grow() {}

    public void hardWork() {}

    public void talkTo() {}
}
