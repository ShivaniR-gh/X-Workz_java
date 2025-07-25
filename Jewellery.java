public class Jewellery {
    String type;
    String material;
    double weightInGrams;
    double price;
    boolean isTraditional;
    String designName;
	
	public void getJewelleryInfo(){
		System.out.println("Type: " + type);
        System.out.println("Material: " +  material);
        System.out.println("Weight (g): " + weightInGrams);
        System.out.println("Price: " +  price);
        System.out.println("Traditional: " +  isTraditional);
        System.out.println("Design: " +  designName);
        System.out.println("------------------------------------------");
}
