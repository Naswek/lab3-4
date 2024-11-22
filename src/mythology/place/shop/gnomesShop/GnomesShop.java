package mythology.place.shop.gnomesShop;

import mythology.place.World;
import mythology.place.shop.Shop;

public class GnomesShop extends Shop {

    public GnomesShop(String namePlace, World world, int dangerous, int timeOpen, int timeClose, String shopSpeciality) {

        super(namePlace, World.SVARTALHEIM, dangerous, timeOpen, timeClose, shopSpeciality);
    }

    protected void sellWeapon(){
        System.out.println(this.getNamePlace() + "продает оружие");
    }

    protected void sellSomethingElse(){
        System.out.println(this.getNamePlace() + "продает" + this.shopSpeciality);
    }
}
