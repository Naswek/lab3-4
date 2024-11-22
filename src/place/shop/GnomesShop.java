package place.shop;

import place.enumeration.World;

public class GnomesShop extends ShopAbstract {

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
