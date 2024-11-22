package mythology.place.shop;

import mythology.place.PlaceAbstract;
import mythology.place.World;

public abstract class Shop extends PlaceAbstract {

    protected int timeOpen;
    protected int timeClose;
    protected String shopSpeciality;

    protected Shop(String namePlace, World world, int dangerous, int timeOpen, int timeClose, String shopSpeciality) {
        super(namePlace, world, dangerous);
        this.timeOpen = timeOpen;
        this.timeClose = timeClose;
        this.shopSpeciality = shopSpeciality;
    }

    protected void opened() {
        System.out.println("Магазин открыт");
    }
    protected void closed() {
        System.out.println("Магазин закрыт");
    }
}
