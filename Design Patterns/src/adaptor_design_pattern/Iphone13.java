package adaptor_design_pattern;

public class Iphone13 {

    private IphoneCharger charger;

    Iphone13(IphoneCharger charger){
        this.charger = charger;
    }

    public void charging(){
        charger.chargeIphone();
    }

}
