class Projector{

static boolean startOrEnd= false;
static int currentZoom;
static int currentBrightness;
static int maxZoom=10;
static int minZoom ;
static int maxBrightness = 10;
static int minBrightness;
 
 public static void turnOnOrTurnOff (){
	 if ( startOrEnd ==false){
		 startOrEnd =true;
		 System.out.println("Its on now");
	 }else{
		 startOrEnd =false;
		 System.out.println("Its off");
	 }
 }
public static void zoomIn (){
	 if ( startOrEnd = true){
		 if (currentZoom < maxZoom){
			 currentZoom=currentZoom+1;
		 System.out.println("Zoomed In");
	 }else{
		 startOrEnd =true;
		 System.out.println("Max Zoom");
	 }
     }
	 else{
		System.out.println("On the projector ");
	}
 }
public static void zoomOut (){
	 if ( startOrEnd == true){
		 if (currentZoom > minZoom){
			 currentZoom=currentZoom-1;
		 System.out.println("Zoomed Out");
	 }else{
		 System.out.println("Minimum Zoom");
	 }
	 }
	 else{
		System.out.println("On the projector ");
	}
 }
 
public static void increaseBrightness (){
	 if ( startOrEnd == true){
		 if (currentBrightness < maxBrightness){
			 currentBrightness=currentBrightness+1;
		 System.out.println("brightness increased");
	     }else{
		 System.out.println("maximum brightness");
	     }
	 }
	else{
		System.out.println("On the projector ");
	}
 }

public static void decreaseBrightness (){
	 if ( startOrEnd == true){
		 if (currentBrightness > minBrightness){
			 currentBrightness=currentBrightness-1;
			 System.out.println("brightness decreased");
	 }else{
		 System.out.println("maximum brightness");
	 }
	 }
	 else{
		System.out.println("On the projector ");
	}
  
 }
}