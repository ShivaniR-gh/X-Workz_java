class BankAccountRunner{
	
	public static void main(String[] args){
		System.out.println("Bank account Details");
		BankAccount.credit(1000);
		System.out.println("Total amount : " +BankAccount.balence);
		BankAccount.debit(1000);
		System.out.println("Total amount : "+BankAccount.balence);
	}
}