package mythology.creature.monster.pudge;

import mythology.creature.LifeStatus;
import mythology.creature.monster.Monster;
import mythology.place.World;

public class Pudge extends Monster {

    protected double weight;
    protected int hungerLevel;

    public Pudge(String creatureName, int age, LifeStatus lifeStatus, World world, int killsCount,  double weight, int hungerLevel) {
        super(creatureName, age, world, killsCount, lifeStatus);
        this.weight = weight;
        this.hungerLevel = hungerLevel;
    }

    public void PudgeIsEating(){
        System.out.println("Мммм.... свежее мясо");
        weight = weight + 0.5;
        hungerLevel = hungerLevel - 1;
    }

    public void PudgeIsHungry(){
        System.out.println("Тушку мне!");
        hungerLevel = hungerLevel + 1;
    }

    public void hungerLevelTooHigh(){
        if (hungerLevel > 10){

            destroyEverything();
            killEveryone();
            PudgeIsEating();
        }
    }

    public String getWeapon(){
        return "Хук";
    }

    public void weightIsTooHigh(){
        System.out.println("Пуговичка оторвалась :(");
    }
}
