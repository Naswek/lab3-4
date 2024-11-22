package mythology.place.sanctuary;

import mythology.place.PlaceAbstract;
import mythology.place.World;

public abstract class Sanctuary extends PlaceAbstract {

    protected String prayer;
    protected String rules;

    protected Sanctuary(String namePlace, World world, int dangerous, String prayer, String rules) {
        super(namePlace, world, dangerous);
        this.prayer = prayer;
        this.rules = rules;
    }

    protected void readPrayer(String prayer) {
        System.out.println(prayer);
    }
    protected void cleanseSins() {
        System.out.println("Ваши грехи, так уж и быть, прощены");
    }
}
