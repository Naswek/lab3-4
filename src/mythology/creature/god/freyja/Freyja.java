package mythology.creature.god.freyja;

import mythology.creature.LifeStatus;
import mythology.creature.god.GodType;
import mythology.creature.god.God;
import mythology.place.World;

public class Freyja extends God implements Kindness {

    public Freyja(String creatureName, int age, LifeStatus lifeStatus, int childsCount, String marriage, String specialization, GodType godType) {
        super(creatureName, age, LifeStatus.ALIVE, childsCount, marriage, specialization, GodType.VANS);
    }

    public void feelKind() {
        System.out.println(this.getCreatureName() + ", бог " + this.specialization + "проявила сочувствие к людям");
    }

    public void givePeopleLove() {
        System.out.println("Богиня" + this.creatureName + "раздала людям свою любовь");
    }
    public void givePeopleHarvest() {
        System.out.println("Сегодня богиня" + this.getCreatureName() +  "проявила к нам благосклонность");
    }
}
