package facade_design_pattern;

public class SmartPhoneRepairer implements RepairGadget{
    @Override
    public void repair(Gadget gadget) {
        SmartPhone phone = (SmartPhone)gadget;
        System.out.println("Repairing your "+phone.getName());
        phone.setStatus("working");
        System.out.println("Your "+phone.getName()+" is now working");
    }
}
