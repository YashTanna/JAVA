package adaptor_design_pattern;

public class Main {
    public static void main(String[] args) {

        IphoneCharger charger = new ChargerAdapter(new AndroidChargerMakingCompany());

        Iphone13 iphone13 = new Iphone13(charger);

        iphone13.charging();

    }
}
