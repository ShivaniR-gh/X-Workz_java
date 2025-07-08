class BankAccountRunner{
	
	public static void main(String[] args){
		System.out.println("---------Bank account Details---------    ");
		BankAccount.ifscCode="S68jb3";
		System.out.println("ifsc code: " +BankAccount.ifscCode);
		
		BankAccount.credit(10.00);
		System.out.println("Total balance: " +BankAccount.balance);
		
		BankAccount.debit(100.00);
		System.out.println("Total balance : "+BankAccount.balance);
	}
}