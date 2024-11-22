package mythology.creature.god.thor;

import mythology.creature.LifeStatus;
import mythology.creature.god.GodType;
import mythology.creature.god.God;
import mythology.place.World;

public class Thor extends God implements Hammer {

    public Thor(String creatureName, int age, LifeStatus lifeStatus, int childsCount, String marriage, String specialization, GodType godType) {
        super(creatureName, age, LifeStatus.ALIVE, childsCount, marriage, specialization, GodType.ASGARDS);
    }

    public void protectAsgard() {
        System.out.println(this.getCreatureName() + ", бог " + this.specialization + "готов защитить свой дом");
    }

    public void drinkBeer() {
        sleep();
    }
}
