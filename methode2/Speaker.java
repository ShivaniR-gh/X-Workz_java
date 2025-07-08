class Speaker{
static boolean isConnected=false;
static int  maxValume=7;
static int  minValume;

static int currentVolume;
public static void onOrOff(){
	if(isConnected == false){
		isConnected=true;
		System.out.println("On aythu ");
	}
	else{
		isConnected=false;
		System.out.println("Off");
	}
}

public static void increaseVolume(){
	if(isConnected==true ){
		if(currentVolume < maxValume){
		currentVolume=currentVolume+ 1;
		System.out.println("The currentVolume is "+currentVolume);
	}else{
		System.out.println("max volume reached");
	}
	}else{
		System.out.println("speaker on maduu...........");
	}
		
}


public static void decreaseVolume(){
	if(isConnected==true ){
		if( currentVolume > minValume){
		currentVolume=currentVolume- 1;
		System.out.println("The currentVolume is "+currentVolume);
	}else{
		System.out.println("min valume reached");
	}
	}else{
		System.out.println("The speaker is off");
	}

}
	
}