class YouTubeRunner{
public static void main(String[] args){
	String userName="Shivani R";
	String email="shivani@gmail.com";
	long userPhonenumber=8867582038l;
    boolean userInfo=YouTube.registerUser(userName,email);

    if(userInfo ){
       System.out.println("The user name is "+  userName +" and emial is " + email);
    }

    boolean UserInfoWithdifferentParameter=YouTube.registerUser(userName,userPhonenumber);
    
	if(UserInfoWithdifferentParameter){
       System.out.println("The user name is "+ userName +" and phone number is " + userPhonenumber);       
    }
  }
}