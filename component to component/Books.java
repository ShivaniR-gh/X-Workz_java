class Books{


static String[] bookName;
public static void getBooks(String book1,String book2,String book3,String book4,String book5){
String[] bookName = {book1,book2,book3,book4,book5};
for (String books : bookName){
	System.out.println(books);
}
}
}