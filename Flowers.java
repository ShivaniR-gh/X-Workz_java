public class Flowers {
    int flowerId;
    String name;
    String color;
    boolean hasFragrance;
    double pricePerPiece;
	
	public void getFlowersInfo(){
	System.out.println("Flower ID: " + flowerId);
        System.out.println("Name: " +  name);
        System.out.println("Color: " +  color);
        System.out.println("Has Fragrance: " +  hasFragrance);
        System.out.println("Price: " +  pricePerPiece);
        System.out.println("------------------------------------------");
}
}
