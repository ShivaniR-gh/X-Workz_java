class WhatsApp{
	public static boolean registerUser(String userName,String email){
		
		boolean isUserValidated=false;
		boolean isUserNameValidated=false;
		boolean isUserEmailValidated=false;
		
		if(userName != null){
			isUserNameValidated=true;
			}
		if (email != null){
			isUserEmailValidated=true;
			}
			
		if (isUserNameValidated && isUserEmailValidated){
			System.out.println("The user  exist");
		    isUserValidated=true;
		}else{
		    System.out.println("The user doesnot exist");
		}
		return isUserValidated;
	}
	
	public static boolean registerUser(String userName,long phoneNumber){
		
		boolean isUserValidated=false;
		boolean isUserNameValidated=false;
		boolean isUserPhoneNumberValidated=false;
		
		if(userName != null){
			isUserNameValidated=true;
			}
	    if(phoneNumber!= 0){
		    isUserPhoneNumberValidated=true;
			}
		if (isUserNameValidated &&  isUserPhoneNumberValidated ){
			System.out.println("The user exist");
		    isUserValidated=true;
		}else{
		   System.out.println("The user does not  exist");
		}
		return isUserValidated;
	}
}

