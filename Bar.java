class Bar {
     static String Beer = "Beer";
     static String Whiskey = "Whiskey";
     static String Vodka = "Vodka";
     static String Rum = "Rum";
     static String Gin = "Gin";
     static String Brandy = "Brandy";
     static String Wine = "Wine";
     static String Tequila = "Tequila";
     static String Cider = "Cider";
    static String Champagne = "Champagne";

    public static void main(String[] args) {
       /* String Beer = "Beer";
        String Whiskey = "Whiskey";
        String Vodka = "Vodka";
        String Rum = "Rum";
        String Gin = "Gin";
        String Brandy = "Brandy";
        String Wine = "Wine";
        String Tequila = "Tequila";
        String Cider = "Cider";
        String Champagne = "Champagne";*/

        String[] drinks = {Beer, Whiskey, Vodka, Rum, Gin, Brandy, Wine, Tequila, Cider, Champagne};
        for (String drink : drinks) {
            System.out.println(drink);
        }
    }
}
