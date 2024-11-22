import mythology.creature.LifeStatus;
import mythology.creature.PlaceIsToHighExeption;
import mythology.creature.animal.FriendlinessStatus;
import mythology.creature.animal.cartoonAnimal.Eeyore;
import mythology.creature.animal.cartoonAnimal.Piglet;
import mythology.creature.animal.cartoonAnimal.Tigger;
import mythology.creature.animal.cartoonAnimal.WinnieThePooh;
import mythology.creature.god.GodType;
import mythology.creature.god.freyja.Freyja;
import mythology.creature.god.gojoSatoru.GojoSatoru;
import mythology.creature.god.thor.Thor;
import mythology.creature.human.christopherRobin.ChristopherRobin;
import mythology.place.World;
import mythology.place.sanctuary.elvenSanctuary.ElvenSanctuary;
import mythology.place.shop.gnomesShop.GnomesShop;

public class Main {
    public static void main(String[] args) throws PlaceIsToHighExeption {

        //animals
        Eeyore eeyore = new Eeyore("Иа-иа", 98, LifeStatus.ALIVE, 26.4, "Осел", "Серый", 48.9, FriendlinessStatus.FRIENDLY);
        Piglet piglet = new Piglet("Пятачок", 98, LifeStatus.ALIVE, 12.8, "Поросенок", "Розовый", 27.1, FriendlinessStatus.FRIENDLY);
        WinnieThePooh winnieThePooh = new WinnieThePooh("Винни Пух", 98, LifeStatus.ALIVE, 69.2,"Медведь", "Желтый", 58.4, FriendlinessStatus.FRIENDLY);
        Tigger tigger = new Tigger("Тигра", 96, LifeStatus.ALIVE, 47,"Тигр", "Оранжево-черный", 34.5, FriendlinessStatus.FRIENDLY);

        //people
        ChristopherRobin christopherRobin = new ChristopherRobin("Кристофер Робин", 98, LifeStatus.ALIVE, "Мальчик", 147, 42, 24);

        //gods
        GojoSatoru gojoSatoru = new GojoSatoru("Сатору Годжо", 28, LifeStatus.ALIVE, 0, "Не в браке", "Маг", GodType.OTHER, "Шесть глаз", 10000, "Особый ранг", 25879);
        Thor thor = new Thor("Тор", 100000, LifeStatus.ALIVE, 3, "В браке с Сиф", "Гром и молния", GodType.ASGARDS);
        Freyja freyja = new Freyja("Фрея", 100000, LifeStatus.ALIVE, 2, "В браке с Одом", "Любовь и Урожай", GodType.VANS);

        //shop
        GnomesShop gnomesShop = new GnomesShop("Лавка Брока", World.SVARTALHEIM, 0,8,18, "Оружие");

        //sanctuary
        ElvenSanctuary elvenSanctuary = new ElvenSanctuary("Святилище светлых эльфов", World.ALFHEIM, 0,"Молитва к Свету", "Не молиться Тьме");


        if (christopherRobin.getChristopherStrength() < winnieThePooh.getWinnieWeight()) {
            christopherRobin.riseSomeoneUp(winnieThePooh.getWinniesName(), 56);
        } else {
            System.out.println(winnieThePooh.getWinniesName() + " поднимается сам, так как " + christopherRobin.getChristopherRobinName() + " не может поднять " + winnieThePooh.getWinniesName());
        }

        //винни или робин поднимют пятачка
        if (christopherRobin.getChristopherStrength() < piglet.getPigletWeight()) {
            christopherRobin.riseSomeoneUp(winnieThePooh.getWinniesName(), 56);
        } else if (winnieThePooh.getWinnieStrength() < piglet.getPigletWeight()) {
            winnieThePooh.riseSomeoneUp(piglet.getPigletName(), 56);
        } else {
            System.out.println(winnieThePooh.getWinniesName() + " поднимается сам, так как никто не может его поднять ");
        }
    }
}