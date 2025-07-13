class BankAccount{
	static int balence;
	
	public static void credit(int amount){
		balence=balence+amount;
		//System.out.println("The balence amount is " + balence);
	}
	public static void debit(int amount){
		balence=balence-amount;
		//System.out.println("The balence amount is " + balence);
	}
	
}