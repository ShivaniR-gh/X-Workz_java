class PassportSevaRunner {

     public static void main(String seva[]){
	    
		boolean userIsRegistered =   PassportSeva.registerUser(null,"Das","abcd","abcd");
	     System.out.println("Is USer Registered "+ userIsRegistered);
		 
		 
		    if(userIsRegistered)PassportSeva.getUserInfo();
	}


}