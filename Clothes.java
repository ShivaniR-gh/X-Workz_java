class Clothes {
    static String brand;
    static String color;
    static int price;
    static String type;
    static String size;
    static boolean isReturnable;

    public static String getBrand() {
        brand = "Zara";
        return brand;
    }

    public static String getColor() {
        color = "Blue";
        return color;
    }

    public static int getPrice() {
        price = 2999;
        return price;
    }

    public static String getType() {
        type = "T-Shirt";
        return type;
    }

    public static String getSize() {
        size = "M";
        return size;
    }

    public static boolean isReturnable() {
        isReturnable = true;
        return isReturnable;
    }

    public static void getInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Color: " + color);
        System.out.println("Price: " + price);
        System.out.println("Type: " + type);
        System.out.println("Size: " + size);
        System.out.println("Returnable: " + isReturnable);
    }
}

