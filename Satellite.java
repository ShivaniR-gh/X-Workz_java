public class Satellite {
    public static void main(String args[]) {
        int satelliteId = 1201;
        String name = "INSAT-4B";
        String country = "India";
        String purpose = "Communication";
        int launchYear = 2007;
        String launchVehicle = "Ariane-5";
        String orbitType = "Geostationary";
        double weightKg = 3025.0;
        boolean solarPowered = true;
        double powerOutputKW = 6.5;
        boolean active = true;
        String manufacturer = "ISRO";
        boolean hasTransponders = true;
        int transponderCount = 24;
        boolean remoteSensing = false;
        boolean militaryUse = false;
        String controlCenter = "ISRO Telemetry";
        boolean temperatureControl = true;
        boolean gyroscopeAvailable = true;
        boolean autoStabilization = true;
        String fuelType = "Hydrazine";
		

        System.out.println("Satellite Name: " + name);
        System.out.println("Country: " + country);
        System.out.println("Purpose: " + purpose);
        System.out.println("Launch Year: " + launchYear);
        System.out.println("Launch Vehicle: " + launchVehicle);
        System.out.println("Orbit Type: " + orbitType);
        System.out.println("Weight: " + weightKg + " kg");
        System.out.println("Solar Powered: " + solarPowered);
        System.out.println("Power Output: " + powerOutputKW + " KW");
        System.out.println("Active: " + active);
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Has Transponders: " + hasTransponders);
        System.out.println("Transponder Count: " + transponderCount);
        System.out.println("Remote Sensing: " + remoteSensing);
        System.out.println("Military Use: " + militaryUse);
        System.out.println("Control Center: " + controlCenter);
        System.out.println("Temperature Control: " + temperatureControl);
        System.out.println("Gyroscope: " + gyroscopeAvailable);
        System.out.println("Auto Stabilization: " + autoStabilization);
        System.out.println("Fuel Type: " + fuelType);
        System.out.println("Satellite ID: " + satelliteId);
    }
}

