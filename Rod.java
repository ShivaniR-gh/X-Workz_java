public class Rod {
    int lengthInInches;
    String material;
    double weightInKg;
    boolean isFlexible;
    String color;
    double price;
	
	public void getRod(){
		System.out.println("Length: " +  lengthInInches + " inches");
        System.out.println("Material: " +  material);
        System.out.println("Weight: " + weightInKg + " kg");
        System.out.println("Flexible: " +  isFlexible);
        System.out.println("Color: " +  color);
        System.out.println("Price: " + price);
        System.out.println("------------------------------------------");
}
