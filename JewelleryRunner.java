public class JewelleryRunner {
    public static void main(String[] args) {

        Jewellery j1 = new Jewellery();
        j1.type = "Necklace";
        j1.material = "Gold";
        j1.weightInGrams = 25.5;
        j1.price = 150000;
        j1.isTraditional = true;
        j1.designName = "Temple Design";

       j1.getJewelleryInfo();

        Jewellery j2 = new Jewellery();
        j2.type = "Ring";
        j2.material = "Platinum";
        j2.weightInGrams = 5.2;
        j2.price = 48000;
        j2.isTraditional = false;
        j2.designName = "Eternity Band";

        j2.getJewelleryInfo();

        Jewellery j3 = new Jewellery();
        j3.type = "Bracelet";
        j3.material = "Silver";
        j3.weightInGrams = 12.3;
        j3.price = 7500;
        j3.isTraditional = false;
        j3.designName = "Celtic Knot";

        j3.getJewelleryInfo();

        Jewellery j4 = new Jewellery();
        j4.type = "Earrings";
        j4.material = "Gold";
        j4.weightInGrams = 8.4;
        j4.price = 28000;
        j4.isTraditional = true;
        j4.designName = "Jhumka";

        j4.getJewelleryInfo();

        Jewellery j5 = new Jewellery();
        j5.type = "Bangle";
        j5.material = "Gold";
        j5.weightInGrams = 20.0;
        j5.price = 112000;
        j5.isTraditional = true;
        j5.designName = "Floral Engraved";

        j5.getJewelleryInfo();

        Jewellery j6 = new Jewellery();
        j6.type = "Anklet";
        j6.material = "Silver";
        j6.weightInGrams = 10.5;
        j6.price = 3500;
        j6.isTraditional = true;
        j6.designName = "Payal";

        j6.getJewelleryInfo();

        Jewellery j7 = new Jewellery();
        j7.type = "Pendant";
        j7.material = "Diamond";
        j7.weightInGrams = 3.0;
        j7.price = 64000;
        j7.isTraditional = false;
        j7.designName = "Infinity";

       j7.getJewelleryInfo();

        Jewellery j8 = new Jewellery();
        j8.type = "Brooch";
        j8.material = "Gold-Plated";
        j8.weightInGrams = 4.2;
        j8.price = 2000;
        j8.isTraditional = false;
        j8.designName = "Royal Crest";

        j8.getJewelleryInfo();

        Jewellery j9 = new Jewellery();
        j9.type = "Nose Ring";
        j9.material = "Gold";
        j9.weightInGrams = 2.1;
        j9.price = 7000;
        j9.isTraditional = true;
        j9.designName = "Nath";

       j9.getJewelleryInfo();

        Jewellery j10 = new Jewellery();
        j10.type = "Hairpin";
        j10.material = "Silver";
        j10.weightInGrams = 1.5;
        j10.price = 1200;
        j10.isTraditional = false;
        j10.designName = "Peacock";

        j10.getJewelleryInfo();
    }
}
