package design_pattern.template_method;

public abstract class GameConnectHelper {
    protected abstract String doSecurity(String String);
    protected abstract boolean authentication(String id,String password);
    protected abstract int authorization(String userName);
    protected abstract String connection(String info);

    public String requestConnection(String str){
        String s = doSecurity(str);

        String id = s.substring(0, 1);
        String password = s.substring(1,s.length()-1);

        if( !authentication(id,password)){
            throw new Error("인증 에러");
        }

        int authorization = authorization(id);

        switch (authorization) {
            case 1 -> System.out.println("매니저");
            case 2 -> System.out.println("회원");
        }
        String result = "최종 회원정보";
        return connection(result);
    }
}
