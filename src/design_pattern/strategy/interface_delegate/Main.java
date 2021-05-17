package design_pattern.strategy.interface_delegate;

public class Main {
    public static void main(String[] args) {
        AInterface aInterface = new AInterfaceImpl();

        aInterface.funcA();

        AObj aObj = new AObj();

        aObj.funcAA();
    }
}
