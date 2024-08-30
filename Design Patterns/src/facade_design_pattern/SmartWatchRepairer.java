package facade_design_pattern;

public class SmartWatchRepairer implements RepairGadget{
    @Override
    public void repair(Gadget gadget) {
        SmartWatch watch = (SmartWatch)gadget;
        System.out.println("Repairing Your "+watch.getName());
        watch.setStatus("Working");
        System.out.println("Your "+watch.getName()+" is now working");
    }
}
