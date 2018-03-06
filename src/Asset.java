import java.util.Comparator;

public interface Asset {
   public double computeProfit();
   default public double computeRisk(){
       return Math.random();
   }
}
class SortByProfit implements Comparator<Asset> {

    public int compare(Asset a, Asset b){
        double a_prof=a.computeProfit();
        double b_prof=b.computeProfit();
        if(a_prof==b_prof)
            return 0;
        else if(a_prof<b_prof)
            return -1;
        else return 1;

    }
}