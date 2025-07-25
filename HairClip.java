class HairClip {
    int hairClipId;
    String brand;
    String color;
    String material;
    double price;
    boolean isReusable;
    String type;
	
	public void getHairClipInfo(){
		System.out.println("The HairClip ID is " +  hairClipId);
        System.out.println("The brand is " + brand);
        System.out.println("The color is " +  color);
        System.out.println("The material is " +  material);
        System.out.println("The price is " +  price);
        System.out.println("Is Reusable: " +  isReusable);
        System.out.println("The type is " +  type);
        System.out.println("------------------------------------------");
	}
}
