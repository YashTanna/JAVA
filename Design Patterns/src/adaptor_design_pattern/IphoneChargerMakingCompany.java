package adaptor_design_pattern;

public class IphoneChargerMakingCompany implements IphoneCharger{

    @Override
    public void chargeIphone(){
        System.out.println("You are charging your Iphone");
    }

}
