package facade_design_pattern;

public class Main {
    public static void main(String[] args) {
        SmartPhone sp = new SmartPhone("Realme 9 5g","Working");
        SmartWatch sw = new SmartWatch("Apple Watch","Working");

        RepairShop rs = new RepairShop();

        rs.repairSmartPhone(sp);
        rs.repairSmartWatch(sw);

    }
}
