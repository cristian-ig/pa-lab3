public class Vehicle extends Item implements Asset {
    private double performance;

    public Vehicle(String name,double price, double performance){
        this.setName(name);
        this.setPrice(price);
        this.performance=performance;
    }
    @Override
    public double computeProfit() {
        return (double)performance/(double)getPrice();
    }

    @Override
    public String toString() {
        return getName()+":"+computeProfit();
    }
}
