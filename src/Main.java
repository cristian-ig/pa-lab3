public class Main {

    public static void main(String[] args) {
        AssetManager manager = new AssetManager();
        Vehicle v1 = new Vehicle("Audi",22d,2.5d);
        Vehicle v2= new Vehicle("Mertz",1d,3.5d);
        Building b1= new Building("b3",1000d,100d);
        Building b2= new Building("b4",2000d,50d);
        Jewel j1 = new Jewel("j1",500d);
        manager.Add(v1,v2,b1,b2,j1);
        System.out.println("Items sorted by name: "+manager.getItems().toString());
        System.out.println("Assets sorted by profit: "+manager.getAssets().toString());
    }
}
