public class Hat {
    int hatId;
    String brand;
    String color;
    String material;
    boolean isAdjustable;
	public void getHatInfo(){
		System.out.println("Hat ID: " +  hatId);
        System.out.println("Brand: " +  brand);
        System.out.println("Color: " +  color);
        System.out.println("Material: " +  material);
        System.out.println("Adjustable: " +  isAdjustable);
        System.out.println("-----------------------------------");
	}
}
