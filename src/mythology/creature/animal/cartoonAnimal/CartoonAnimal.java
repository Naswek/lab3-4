package mythology.creature.animal.cartoonAnimal;

public interface CartoonAnimal {
    default void talkLikePeople() {
        System.out.println("Это животное может говорить как человек");
    }
}
