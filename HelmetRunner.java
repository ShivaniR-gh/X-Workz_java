public class HelmetRunner {
    public static void main(String[] args) {

        Helmet helmet1 = new Helmet();
        helmet1.brand = "Vega";
        helmet1.color = "Black";
        helmet1.type = "Full Face";
        helmet1.price = 1200.0;
        helmet1.isISIApproved = true;
         helmet1.getHelmetInfo();
        
        Helmet helmet2 = new Helmet();
        helmet2.brand = "Studds";
        helmet2.color = "Red";
        helmet2.type = "Open Face";
        helmet2.price = 950.0;
        helmet2.isISIApproved = true;
		helmet2.getHelmetInfo();
        

        

        Helmet helmet3 = new Helmet();
        helmet3.brand = "Steelbird";
        helmet3.color = "Blue";
        helmet3.type = "Modular";
        helmet3.price = 1350.0;
        helmet3.isISIApproved = true;

        helmet3.getHelmetInfo();
        

        Helmet helmet4 = new Helmet();
        helmet4.brand = "Royal Enfield";
        helmet4.color = "Matt Black";
        helmet4.type = "Full Face";
        helmet4.price = 2000.0;
        helmet4.isISIApproved = true;

        helmet4.getHelmetInfo();
        

        Helmet helmet5 = new Helmet();
        helmet5.brand = "Axor";
        helmet5.color = "Grey";
        helmet5.type = "Dual Visor";
        helmet5.price = 2600.0;
        helmet5.isISIApproved = true;

        helmet5.getHelmetInfo();
        

        Helmet helmet6 = new Helmet();
        helmet6.brand = "LS2";
        helmet6.color = "White";
        helmet6.type = "Full Face";
        helmet6.price = 3200.0;
        helmet6.isISIApproved = true;

       helmet6.getHelmetInfo();
        
        System.out.println("------------------------------------------");

        Helmet helmet7 = new Helmet();
        helmet7.brand = "SMK";
        helmet7.color = "Orange";
        helmet7.type = "Modular";
        helmet7.price = 2800.0;
        helmet7.isISIApproved = true;

        helmet7.getHelmetInfo();
        

        Helmet helmet8 = new Helmet();
        helmet8.brand = "THH";
        helmet8.color = "Green";
        helmet8.type = "Half Face";
        helmet8.price = 1100.0;
        helmet8.isISIApproved = false;

        helmet8.getHelmetInfo();
        
        Helmet helmet9 = new Helmet();
        helmet9.brand = "Gliders";
        helmet9.color = "Silver";
        helmet9.type = "Full Face";
        helmet9.price = 1500.0;
        helmet9.isISIApproved = true;

        helmet9.getHelmetInfo();
        
       
        Helmet helmet10 = new Helmet();
        helmet10.brand = "Aerostar";
        helmet10.color = "Brown";
        helmet10.type = "Full Face";
        helmet10.price = 1000.0;
        helmet10.isISIApproved = false;

        helmet10.getHelmetInfo();
        
    }
}
