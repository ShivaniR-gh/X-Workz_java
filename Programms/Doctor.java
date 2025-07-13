class Doctor{
	public static void treatement(String name,int age,String disease){
		System.out.println("treatement started ");
		Nurse.assist(name);
		System.out.println("treatement ended ");
	}
}