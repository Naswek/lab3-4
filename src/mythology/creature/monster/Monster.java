package mythology.creature.monster;

import mythology.creature.CreatureAbstract;
import mythology.creature.LifeStatus;
import mythology.place.World;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public abstract class Monster extends CreatureAbstract {

    protected int killsCount;
    protected World world;
    protected ArrayList<String> Weapon  = new ArrayList<>(Arrays.asList("Stick", "Sword", "Bow", "Claws", "Fangs"));

    public Monster(String creatureName, int age, World world, int killsCount, LifeStatus lifeStatus) {
        super(creatureName, age, lifeStatus);
        this.killsCount = killsCount;
    }

    public void destroyEverything(){
        System.out.println("КРУШИТЬ ЛОМАТЬ УНИЧТОЖАТЬ");
    }

    public void killEveryone(){
        System.out.println("*геноцид*");
    }

    protected int getRandomWeapon(){
        Random random = new Random();
        int index = random.nextInt(6);
        return index-1;
    }

    public String getWeapon(){
        return Weapon.get(getRandomWeapon());
    }
}
