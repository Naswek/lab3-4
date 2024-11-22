package mythology.place.shop.gnomesShop;

public record Prices(String productName, int price, Gnome dealer) {

    public String getProductName() {
        return this.productName;
    }

    public int getPrice() {
        return this.price;
    }
}
