class Hospital{
	public static void  checkup(String name,int age,long phoneNumber, String email, String disease){
		
		System.out.println("checkup started");
		
		Doctor.treatement(name,age,disease);
		
		System.out.println("checkup ended");
	}
}
		
