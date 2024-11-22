package mythology.place.sanctuary.elvenSanctuary;

import mythology.place.World;
import mythology.place.sanctuary.Sanctuary;

public class ElvenSanctuary extends Sanctuary {

    public ElvenSanctuary(String namePlace, World world, int dangerous, String prayer, String rules){
        super(namePlace, World.ALFHEIM, dangerous, prayer, rules);
    }

    protected void prayToLight(){
        System.out.println(this.prayer + "Аминь!");
    }

    protected void bePunished(){
        System.out.println("Ты наказан и выгнан с " + this.getNamePlace() + ". Читай правила: " + this.rules);
    }

    protected void prayToDark(){
        bePunished();
    }
}
