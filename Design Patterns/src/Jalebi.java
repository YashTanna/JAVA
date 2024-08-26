//Singlton Design Pattern


public class Jalebi {

    private Jalebi(){}
    private static Jalebi jalebi = new Jalebi();

    public static Jalebi getJalebi(){
        return jalebi;
    }

}
