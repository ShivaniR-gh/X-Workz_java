class Banner{
static String name;
static String bannerPurpose ;
static int bannerSize;
static String bannerPlacemen;
static String bannerColor;
static int numberOfBanners;
 
 public static int getName(String fname){
	 name=fname;
	 return fname;
 }
 public static int getPurpose(String purpose){
	 bannerPurpose=purpose;
	 return bannerPurpose;
 }
 public static int getSize(int size){
	 bannerSize=size;
	 return bannerSize;
 }
 public static int getPlacement(String placement){
	 bannerPlacement=placement;
	 return bannerPlacement;
 }
 public static int getColor(String color){
	 bannerColor=color;
	 return bannerColor;
 }
 public static int getNumber(String number){
	numberOfBanners=color;
	 return numberOfBanners;
 }
 return getBanner;
 }
 public staticvoid getBannerInfo(){
	    System.out.println("Banner Name: " + name);
        System.out.println("Purpose: " + bannerPurpose);
        System.out.println("Size: " + bannerSize);
        System.out.println("Placement: " + bannerPlacement);
        System.out.println("Color: " + bannerColor);
        System.out.println("Number of Banners: " + numberOfBanners);
}}