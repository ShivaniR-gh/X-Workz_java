class FaceBook{
	public static boolean registerUser(String userName,String email){
		
		boolean isUserValidated=false;
		boolean isUserNameValidated=false;
		boolean isUserEmailValidated=false;
		boolean isUserPhoneNumberValidated=false;
		if(userName != null){
			System.out.println("The user name is " + userName);
			isUserNameValidated=true;
			}
		if (email != null){
			System.out.println("The email is " + email);
			isUserEmailValidated=true;
			}
		if (isUserNameValidated && isUserEmailValidated){
		    System.out.println("The user exist");
		}else{
		    System.out.println("The user exist");
		}
		return isUserValidated;
	}
	
	public static boolean registerUser(String userName,long phoneNumber){
		//String userName
		boolean isUserValidated=false;
		boolean isUserNameValidated=false;
		boolean isUserEmailValidated=false;
		boolean isUserPhoneNumberValidated=false;
		if(userName != null){
			System.out.println("The user name is " + userName);
			}
	    if(phoneNumber!= 0){
		System.out.println("The phoneNumber is " + phoneNumber);
			}
		if (isUserNameValidated &&  isUserPhoneNumberValidated ){
		    System.out.println("The user exist");
		}else{
		    System.out.println("The user exist");
		}
		return isUserValidated;
	}
}

