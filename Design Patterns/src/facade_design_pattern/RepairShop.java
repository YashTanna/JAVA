package facade_design_pattern;

public class RepairShop {

    private RepairGadget smartPhoneRepairer;
    private RepairGadget smartWatchRepairer;

    public RepairShop() {
        this.smartPhoneRepairer = new SmartPhoneRepairer();
        this.smartWatchRepairer = new SmartWatchRepairer();
    }

    public void repairSmartPhone(SmartPhone phone){
        smartPhoneRepairer.repair(phone);
    }

    public void repairSmartWatch(SmartWatch watch){
        smartWatchRepairer.repair(watch);
    }
}
