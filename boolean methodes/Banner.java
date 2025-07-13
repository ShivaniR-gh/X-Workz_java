class Banner{
static String name;
static String bannerPurpose ;
static int bannerSize;
static String bannerPlacement;
static String bannerColor;
static int numberOfBanners;
 
 public static String getName(String fname){
	 name=fname;
	 return fname;
 }
 public static String getPurpose(String purpose){
	 bannerPurpose=purpose;
	 return bannerPurpose;
 }
 public static int getSize(int size){
	 bannerSize=size;
	 return bannerSize;
 }
 public static String getPlacement(String placement){
	 bannerPlacement=placement;
	 return bannerPlacement;
 }
 public static String getColor(String color){
	 bannerColor=color;
	 return bannerColor;
 }
 public static int getNumber(int number){
	numberOfBanners=number;
	 return numberOfBanners;
 
 }
 public static void getBannerInfo(){
	    System.out.println("Banner Name: " + name);
        System.out.println("Purpose: " + bannerPurpose);
        System.out.println("Size: " + bannerSize);
        System.out.println("Placement: " + bannerPlacement);
        System.out.println("Color: " + bannerColor);
        System.out.println("Number of Banners: " + numberOfBanners);
}
}