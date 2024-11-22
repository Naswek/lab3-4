package mythology.creature.god.gojoSatoru;

import mythology.creature.LifeStatus;
import mythology.creature.god.GodType;
import mythology.creature.god.God;
import mythology.place.World;

public class GojoSatoru extends God {

    protected String technique;
    protected int cursedEnergy;
    protected String Grade;
    protected int charm;

    public GojoSatoru(String creatureName, int age, LifeStatus lifeStatus, int childsCount, String marriage, String specialization, GodType godType, String technique, int cursedEnergy, String Grade, int charm) {
        super(creatureName, age, lifeStatus, childsCount, marriage, specialization, godType);
        this.technique = technique;
        this.cursedEnergy = cursedEnergy;
        this.Grade = Grade;
        this.charm = charm;
    }

    public String usePurple() {
        this.technique = "Purple";
        kill();
        return "*враг унижен* Между небом и землей лишь я достоин";


    }
    public String useBlue() {
        this.technique = "Blue";
        kill();
        return "*враг унижен* Как же скучно быть лучшим во всем, что я делаю.";


    }
    public String useRed() {
        this.technique = "Red";
        kill();
        return "*враг унижен* Не бойся быть слабым. Просто запомни, что ты никогда не будешь сильнее меня";

    }

    public void eatSweets() {
        System.out.println("+ 10 баллов к счастью");
         this.cursedEnergy += 10;
    }

    public int useCharm(){
        return (this.charm*10);
    }

    public void temptGirlsAndMans() {
        useCharm();
        System.out.println("Не хочу хвастаться, но я чертовски красивый.");
    }
}
