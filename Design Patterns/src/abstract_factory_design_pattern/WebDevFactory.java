package abstract_factory_design_pattern;

public class WebDevFactory extends EmployeeAbstractFactory {

    @Override
    public Employee creatEmployee() {
        return new WebDevloper();
    }

}
