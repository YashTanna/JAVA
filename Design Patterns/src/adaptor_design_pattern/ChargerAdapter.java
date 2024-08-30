package adaptor_design_pattern;

public class ChargerAdapter implements IphoneCharger{

    AndroidCharger charger;

    ChargerAdapter(AndroidCharger charger){
        this.charger = charger;
    }

    @Override
    public void chargeIphone() {
        charger.chargeAndroid();
        System.out.println("Charging your Iphone through Android charger using adapter");
    }
}
