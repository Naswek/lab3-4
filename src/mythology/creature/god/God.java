package mythology.creature.god;

import mythology.creature.CreatureAbstract;
import mythology.creature.LifeStatus;
import mythology.place.World;

public abstract class God extends CreatureAbstract {

    protected int childsCount;
    protected String marriage;
    protected String specialization;
    protected GodType godType;

    public God(String creatureName, int age, LifeStatus lifeStatus, int childsCount, String marriage, String specialization, GodType godType) {
        super(creatureName, age, lifeStatus);
        this.childsCount = childsCount;
        this.marriage = marriage;
        this.specialization = specialization;
    }

    protected void getMarriage() {
        if ((this.marriage != null) && (this.age > 18)){
            System.out.println(this.getCreatureName() + "теперь состоит в браке!");
        }
    }

    protected void makeMoreChildren() {
        if (this.marriage != null) {
            System.out.println("*дети делаются...*");
        } else {
            System.out.println("а с кем детей делать??");
        }
    }

    protected void helpPeople() {
        System.out.println("Готовьте подношения, я явился!");
    }

    protected void killMonster() {
        System.out.println("Ваш Бог явился!");
    }
}
