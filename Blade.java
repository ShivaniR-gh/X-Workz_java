class Blade {
    int bladeId;
    String brand;
    String type;
    double price;
    boolean isStainlessSteel;
    String color;
    String usageType;
	public void getBladeInfo(){
		System.out.println("------------------------------------------");
        System.out.println("ReInitialized");
        System.out.println("------------------------------------------");
        System.out.println("The blade ID is " + bladeId);
        System.out.println("The brand is " +  brand);
        System.out.println("The type is " + type);
        System.out.println("The price is " +  price);
        System.out.println("Is Stainless Steel: " +  isStainlessSteel);
        System.out.println("The color is " +  color);
        System.out.println("The usage type is " + usageType);
		
	}
}
