class GamingPc {
    static String brand;
    static String processor;
    static int ramGB;
    static int storageGB;
    static String gpuModel;
    static int price;

    public static String getBrand() {
        brand = "Alienware";
        return brand;
    }

    public static String getProcessor() {
        processor = "Intel i9";
        return processor;
    }

    public static int getRam() {
        ramGB = 32;
        return ramGB;
    }

    public static int getStorage() {
        storageGB = 2000;
        return storageGB;
    }

    public static String getGpuModel() {
        gpuModel = "NVIDIA RTX 4090";
        return gpuModel;
    }

    public static int getPrice() {
        price = 250000;
        return price;
    }

    public static void getInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Processor: " + processor);
        System.out.println("RAM: " + ramGB + " GB");
        System.out.println("Storage: " + storageGB + " GB");
        System.out.println("GPU Model: " + gpuModel);
        System.out.println("Price: ₹" + price);
    }
}


