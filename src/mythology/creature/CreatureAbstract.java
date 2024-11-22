package mythology.creature;

public class CreatureAbstract implements Creature {
    protected String creatureName;
    protected int age;
    protected LifeStatus lifeStatus;

    public CreatureAbstract(String creatureName, int age, LifeStatus lifeStatus) {
        this.creatureName = creatureName;
        this.age = age;
        this.lifeStatus = lifeStatus;
    }

    protected String getCreatureName() {
        return creatureName;
    }

    protected int getAge() {
        return age;
    }
}
