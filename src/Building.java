public class Building extends Item implements Asset {
    private double area;

    public Building(String name, double price, double area){
        this.setName(name);
        this.setPrice(price);
        this.area=area;
    }

    @Override
    public double computeProfit() {
        return (double)area/getPrice();
    }
    @Override
    public String toString() {
        return getName()+":"+computeProfit();
    }
}
