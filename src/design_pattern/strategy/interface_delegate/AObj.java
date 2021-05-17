package design_pattern.strategy.interface_delegate;

public class AObj {

    AInterface aInterface;

    public AObj() {
        this.aInterface = new AInterfaceImpl();
    }

    public void funcAA(){
        // AAA 호출하는 기능을 위임한다
        aInterface.funcA();
    }
}
