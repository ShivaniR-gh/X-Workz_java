class BankAccount{
	static double balance;
	static String ifscCode;
	public static void credit(double amount){
		 boolean hi = amount > 0.00;
		if (hi){
		balance=balance+amount;
		
		}
		else
		{
			System.out.println("you can't credit the money,the amount should not be  0!!!!!" );
		}
			return	;
	}
	public static void debit(double amount){
		boolean hello = amount < balance;
		if( hello ){
		balance=balance-amount;
		
		//System.out.println("The balence amount is " + balance);
		}
		else
		{
			System.out.println("you can't debit this money,minimum balance!!!!!" );
		}
	}
	
}