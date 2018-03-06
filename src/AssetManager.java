import java.util.ArrayList;
import java.util.Collections;

public class AssetManager {
    int maxItems;
    ArrayList<Item> itemList;

    public AssetManager(){
        itemList=new ArrayList<>();
    }

    public void Add(Item ... item){

        for(Item i:item){
            itemList.add(i);
        }
    }
    public ArrayList<Item> getItems(){
        Collections.sort(itemList,new SortByName());

        return this.itemList;
    }
    public ArrayList<Asset> getAssets(){
        ArrayList<Asset> assets = new ArrayList<>();

        for(Item i:itemList){
            if(i instanceof Asset){
                assets.add((Asset)i);
            }
        }
        Collections.sort(assets,new SortByProfit());
        return assets;
    }

}
