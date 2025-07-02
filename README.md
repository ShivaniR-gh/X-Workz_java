When we declare the array variables out side the variable using static keyword we can invoke the values inside the main methode  
class Birds {
    static String Peacock="a";
	static String Parrot="b";
	static String Eagle="c";
	static String Sparrow="d";
	static 	String Owl="e";
     static  String[] birds = {Peacock, Parrot, Eagle, Sparrow, Owl};
    public static void main(String[] args) {
        String[] birds = {Peacock, Parrot, Eagle, Sparrow, Owl};
        for (String bird : birds) {
            System.out.println(bird);
        }
    }
}
