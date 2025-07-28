public class Weapon {
    int weaponId;
    String name;
    String type;
    String material;
    boolean isLicensed;

    public Weapon(int weaponId, String name, String type, String material, boolean isLicensed) {
        this.weaponId = weaponId;
        this.name = name;
        this.type = type;
        this.material = material;
        this.isLicensed = isLicensed;
    }

    public void getWeaponInfo() {
        System.out.println("Weapon ID: " + weaponId);
        System.out.println("Name: " + name);
        System.out.println("Type: " + type);
        System.out.println("Material: " + material);
        System.out.println("Licensed: " + isLicensed);
        System.out.println("-----------------------------------");
    }
}
