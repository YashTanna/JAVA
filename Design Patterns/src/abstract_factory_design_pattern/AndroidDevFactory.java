package abstract_factory_design_pattern;

public class AndroidDevFactory extends EmployeeAbstractFactory {

    @Override
    public Employee creatEmployee() {
        return new AndroidDevloper();
    }

}
