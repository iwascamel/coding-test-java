package design_pattern;

import design_pattern.template_method.DefaultGameConnectionHelper;
import design_pattern.template_method.GameConnectHelper;

public class Main {
    public static void main(String[] args) {
        GameConnectHelper gameConnectHelper = new DefaultGameConnectionHelper();
        gameConnectHelper.requestConnection("안녕");

    }
}
