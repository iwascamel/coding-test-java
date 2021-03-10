package engineer_korea_lecture.structures;

public class Recursive_test {
    public static void main(String[] args) {
        A a = new A();
        int sum = a.sum(100);
        System.out.println(sum);
    }
    static class A{
        int sum(int var){
            if(var == 1){
                return 1;
            }else{
                return var + sum(var-1);
            }
        }
    }
}
