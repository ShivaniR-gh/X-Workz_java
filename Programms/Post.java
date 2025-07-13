class Post{
public static void postOffice(String name,String fromAddress , String toAddress, long contact , String date){
   System.out.println(" letter was given to the post office");
PostMan.deliversLetter(name, fromAddress , toAddress);
System.out.println ("-------------Person Details----------");
        System.out.println("Name of the reciever            :"+ name);
		System.out.println("From address of the letter     :"+fromAddress );
		System.out.println("To address of the letter        :"+toAddress);
		System.out.println("Contact details of the Sender   :"+ contact);
		System.out.println("The letter was sent on the date :" + date);
}
}
