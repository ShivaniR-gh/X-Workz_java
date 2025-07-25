public class Helmet {
    String brand;
    String color;
    String type;
    double price;
    boolean isISIApproved;
	
	public void getHelmetInfo(){
		System.out.println("Brand: " +  brand);
        System.out.println("Color: " + color);
        System.out.println("Type: " +  type);
        System.out.println("Price: " +  price);
        System.out.println("ISI Approved: " +  isISIApproved);
        System.out.println("------------------------------------------");
	}
}
