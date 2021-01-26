package test_files;

import java.util.Arrays;
import java.util.function.BinaryOperator;

public class StreamTest {
    public static void main(String args[]){

//        int [] arr = {1,2,3,4,5};
//
//        int sum = Arrays.stream(arr).sum();
//        int count = (int) Arrays.stream(arr).count();
//
//        System.out.println(Arrays.stream(arr).reduce(0,(a,b)->a+b));

//        System.out.println(sum);
//        System.out.println(count);
//
//        List<String> sList = new ArrayList<>();
//
//        sList.add("1번");
//        sList.add("2번2번");
//        sList.add("3번3번3번");
//
//        Stream<String> stream = sList.stream();
//        stream.forEach(item-> System.out.println(item));
//
//        sList.stream().forEach(item-> System.out.println(item));
//        sList.stream().map(item-> item.length()).forEach(item-> System.out.println(item));

        String[] stringTest = {"길이가 짧은","길이가 매우우우우우 긴","중간","하하하하하하하"};

        System.out.println(Arrays.stream(stringTest).reduce("",new CompareString()));
    }

}
class CompareString implements BinaryOperator<String>{

    @Override
    public String apply(String s, String s2) {
        if(s.length()>s2.length()){
            return s;
        }else{
            return s2;
        }
    }
}
