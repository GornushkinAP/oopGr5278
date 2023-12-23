package Domain;

public class Product {
    private int price;
    private int place;
    private String name;
    private long id;

    public Product(int price, int place, String name, long id) {
        this.price = price;
        this.place = place;
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString(){
        return "Price = " + this.price + "\n" +
                "Place = " + this.place + "\n" +
                "Name = " + this.name + "\n" +
                "Id = " + this.id + "\n";
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        if (price < 0){
            this.price = 10;
        }
        else {
            this.price = price;
        }
    }

    public int getPlace() {
        return place;
    }

    public void setPlace(int place) {
        this.place = place;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

}
