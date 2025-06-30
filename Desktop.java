public class Desktop {
    public static void main(String args[]) {
        int desktopId = 501;
        String brand = "Dell";
        String model = "OptiPlex 7090";
        String processor = "Intel Core i7";
        int ramGB = 16;
        int storageGB = 512;
        String storageType = "SSD";
        String gpu = "Intel UHD Graphics";
        String os = "Windows 11 Pro";
        boolean hasWiFi = true;
        boolean hasBluetooth = true;
        int usbPorts = 6;
        boolean hasHDMI = true;
        double weightKg = 7.5;
        boolean hasDVDDrive = false;
        String keyboardType = "Mechanical";
        String mouseType = "Optical";
        boolean touchScreen = false;
        String powerSupply = "500W";
        boolean antivirusInstalled = true;

        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Processor: " + processor);
        System.out.println("RAM: " + ramGB + "GB");
        System.out.println("Storage: " + storageGB + "GB " + storageType);
        System.out.println("GPU: " + gpu);
        System.out.println("OS: " + os);
        System.out.println("WiFi: " + hasWiFi);
        System.out.println("Bluetooth: " + hasBluetooth);
        System.out.println("USB Ports: " + usbPorts);
        System.out.println("HDMI Support: " + hasHDMI);
        System.out.println("Weight: " + weightKg + "kg");
        System.out.println("DVD Drive: " + hasDVDDrive);
        System.out.println("Keyboard: " + keyboardType);
        System.out.println("Mouse: " + mouseType);
        System.out.println("Touch Screen: " + touchScreen);
        System.out.println("Power Supply: " + powerSupply);
        System.out.println("Antivirus Installed: " + antivirusInstalled);
        System.out.println("Desktop ID: " + desktopId);
    }
}
