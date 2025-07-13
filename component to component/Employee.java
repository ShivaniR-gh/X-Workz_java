public class Employee {
    public static void requestLaptop(String name, String designation) {
        System.out.println("Employee is requesting a laptop...");
        AdminDesk.forwardRequest(name, designation);

        System.out.println("-------- Laptop Request Summary --------");
        System.out.println("Employee Name     : " + name);
        System.out.println("Designation       : " + designation);
    }
}
