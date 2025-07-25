public class BlazzerRunner {
    public static void main(String[] args) {

        Blazzer b1 = new Blazzer();
        b1.brand = "Raymond";
        b1.color = "Black";
        b1.size = 40;
        b1.price = 3500;
        b1.isFormal = true;
        b1.fabric = "Wool";
        b1.getBlazerInfo();
        
        Blazzer b2 = new Blazzer();
        b2.brand = "Peter England";
        b2.color = "Blue";
        b2.size = 38;
        b2.price = 2999;
        b2.isFormal = true;
        b2.fabric = "Cotton";
        b2.getBlazerInfo();

        Blazzer b3 = new Blazzer();
        b3.brand = "Van Heusen";
        b3.color = "Grey";
        b3.size = 42;
        b3.price = 4200;
        b3.isFormal = false;
        b3.fabric = "Polyester";
		b3.getBlazerInfo();

        Blazzer b4 = new Blazzer();
        b4.brand = "Allen Solly";
        b4.color = "Brown";
        b4.size = 44;
        b4.price = 3900;
        b4.isFormal = true;
        b4.fabric = "Linen";

        b4.getBlazerInfo();

        Blazzer b5 = new Blazzer();
        b5.brand = "Zara";
        b5.color = "Navy Blue";
        b5.size = 39;
        b5.price = 4999;
        b5.isFormal = false;
        b5.fabric = "Silk Blend";

        b5.getBlazerInfo();

        Blazzer b6 = new Blazzer();
        b6.brand = "Louis Philippe";
        b6.color = "Beige";
        b6.size = 41;
        b6.price = 3800;
        b6.isFormal = true;
        b6.fabric = "Tweed";

        b6.getBlazerInfo();

        Blazzer b7 = new Blazzer();
        b7.brand = "Blackberrys";
        b7.color = "Olive";
        b7.size = 40;
        b7.price = 3200;
        b7.isFormal = false;
        b7.fabric = "Velvet";

        b7.getBlazerInfo();
		
        Blazzer b8 = new Blazzer();
        b8.brand = "Arrow";
        b8.color = "White";
        b8.size = 37;
        b8.price = 2800;
        b8.isFormal = true;
        b8.fabric = "Cotton Blend";

        b8.getBlazerInfo();

        Blazzer b9 = new Blazzer();
        b9.brand = "FabIndia";
        b9.color = "Maroon";
        b9.size = 43;
        b9.price = 3100;
        b9.isFormal = false;
        b9.fabric = "Khadi";

        b9.getBlazerInfo();

        Blazzer b10 = new Blazzer();
        b10.brand = "H&M";
        b10.color = "Charcoal";
        b10.size = 36;
        b10.price = 2700;
        b10.isFormal = false;
        b10.fabric = "Synthetic";

        b10.getBlazerInfo();
    }
}
