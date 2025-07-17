class FaceBookRunner{
public static void main(String[] args){
boolean info=FaceBook.registerUser("Shivani","shivani@gmail.com");
if(info ){
System.out.println("The name and email of the user is ");
}
boolean infoWith=FaceBook.registerUser("Shivani",8867582038l);
if(info){
System.out.println("The name and email of the user is ");
}
}
}