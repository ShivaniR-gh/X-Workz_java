class Insta{

static String userName ;
static String password;

public static boolean userExist(String uName, String pWord){

boolean isUserExist=false;
boolean isUserNameValid = false;
boolean ispasswordValid = false;

  if (uName != null){
  userName=uName;

  isUserNameValid=true;
  }
  if (pWord != null){
 password=pWord;
  ispasswordValid=true;
  }
  
  if (isUserNameValid ==true && ispasswordValid){
  isUserExist=true;
  }
  return isUserExist;
  }
  
  public static void getUserInfo(){
  System.out.println("The given Name is "+ userName);
System.out.println ("The password is "+ password);
  }
  }
  
  
  