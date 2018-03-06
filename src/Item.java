import java.util.Comparator;

public class Item {
    private String name;
    private double price;

//    public Item(String name, double price){
//        this.setName(name);
//        this.setPrice(price);
//    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price =(price==0) ? 1 : price;
    }

    @Override
    public String toString() {
        return name;
    }
}
class SortByName implements Comparator<Item>{

    public int compare(Item a, Item b){
        return (a.getName()).toLowerCase().compareTo(b.getName().toLowerCase());
    }
}