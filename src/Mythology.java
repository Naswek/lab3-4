import creature.enumeration.FriendlinessStatus;
import creature.enumeration.LifeStatus;
import exception.PlaceIsToHighExeption;
import creature.animal.Eeyore;
import creature.animal.Piglet;
import creature.animal.Tigger;
import creature.animal.WinnieThePooh;
import creature.enumeration.GodType;
import creature.god.Freyja;
import creature.god.GojoSatoru;
import creature.god.Thor;
import creature.human.ChristopherRobin;
import place.enumeration.World;
import place.sanctuary.ElvenSanctuary;
import place.shop.GnomesShop;

public class Mythology {

    public static void main(String[] args) throws PlaceIsToHighExeption {

        //animals
        Eeyore eeyore = new Eeyore(
                "Иа-иа",
                98, LifeStatus.ALIVE,
                26.4,
                "Осел",
                "Серый",
                48.9,
                FriendlinessStatus.FRIENDLY);

        Piglet piglet = new Piglet(
                "Пятачок",
                98, LifeStatus.ALIVE,
                12.8,
                "Поросенок",
                "Розовый",
                27.1,
                FriendlinessStatus.FRIENDLY);

        WinnieThePooh winnieThePooh = new WinnieThePooh(
                "Винни Пух",
                98, LifeStatus.ALIVE,
                69.2,
                "Медведь",
                "Желтый",
                58.4,
                FriendlinessStatus.FRIENDLY);

        Tigger tigger = new Tigger(
                "Тигра",
                96, LifeStatus.ALIVE,
                47.6,
                "Тигр",
                "Оранжево-черный",
                34.5,
                FriendlinessStatus.FRIENDLY
        );

        //people
        ChristopherRobin christopherRobin = new ChristopherRobin(
                "Кристофер Робин",
                98,
                "Мальчик",
                147.5,
                42.4,
                24.7,
                LifeStatus.ALIVE
    );

                //gods
        GojoSatoru gojoSatoru = new GojoSatoru(
                "Сатору Годжо",
                28,
                LifeStatus.ALIVE,
                0,
                "Не в браке",
                "Маг",
                GodType.OTHER,
                "Шесть глаз",
                10000,
                "Особый ранг",
                25879
        );
        Thor thor = new Thor(
                "Тор",
                100000,
                LifeStatus.ALIVE,
                3,
                "В браке с Сиф",
                "Гром и молния",
                GodType.ASGARDS
        );
        Freyja freyja = new Freyja(
                "Фрея",
                100000,
                LifeStatus.ALIVE,
                2,
                "В браке с Одом",
                "Любовь и Урожай",
                GodType.VANS
        );

        //shop
        GnomesShop gnomesShop = new GnomesShop(
                "Лавка Брока",
                World.SVARTALHEIM,
                0,
                8,
                18,
                "Оружие"
        );

        //sanctuary
        ElvenSanctuary elvenSanctuary = new ElvenSanctuary(
                "Святилище светлых эльфов",
                World.ALFHEIM,
                0,
                "Молитва к Свету",
                "Не молиться Тьме"
        );


        if (christopherRobin.getChristopherStrength() < winnieThePooh.getWinnieWeight()) {
            christopherRobin.riseSomeoneUp(winnieThePooh.getWinniesName(), 56);
        } else {
            System.out.println(winnieThePooh.getWinniesName() + " поднимается сам, так как " + christopherRobin.getChristopherRobinName() + " не может поднять " + winnieThePooh.getWinniesName());
        }

        //winnie or robin rise up piglet
        if (christopherRobin.getChristopherStrength() < piglet.getPigletWeight()) {
            christopherRobin.riseSomeoneUp(winnieThePooh.getWinniesName(), 56);
        } else if (winnieThePooh.getWinnieStrength() < piglet.getPigletWeight()) {
            winnieThePooh.riseSomeoneUp(piglet.getPigletName(), 56);
        } else {
            System.out.println(winnieThePooh.getWinniesName() + " поднимается сам, так как никто не может его поднять ");
        }
    }
}