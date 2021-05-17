package design_pattern.template_method;

public class DefaultGameConnectionHelper extends GameConnectHelper{
    @Override
    protected String doSecurity(String string) {
        System.out.println("암호화");
        return string;
    }

    @Override
    protected boolean authentication(String id, String password) {
        System.out.println("인증");
        return true;
    }

    @Override
    protected int authorization(String userName) {
        System.out.println("권한 확인");
        return 0;
    }

    @Override
    protected String connection(String info) {
        System.out.println("접속");
        return info;
    }
}
