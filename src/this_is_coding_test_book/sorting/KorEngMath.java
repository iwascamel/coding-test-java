package this_is_coding_test_book.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class KorEngMath {

    static class Student implements Comparable<Student>{
        String name;
        int kor;
        int eng;
        int math;

        Student(String name,int kor,int eng,int math){
            this.name = name;
            this.kor = kor;
            this.eng = eng;
            this.math = math;
        }

        @Override
        public int compareTo(Student o) {
            if(this.math == o.math && this.eng == o.eng && this.kor == o.kor){
                return this.name.compareTo(o.name);
            }else if(this.kor == o.kor && this.eng == o.eng){
                return Integer.compare(o.math,this.math);
            }else if(this.kor == o.kor){
                return Integer.compare(this.eng,o.eng);
            }else{
                return Integer.compare(o.kor,this.kor);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        List<Student> list = new ArrayList<>();

        for(int i=0;i<N;i++){
            String s = sc.next();
            int kor = sc.nextInt();
            int eng = sc.nextInt();
            int math = sc.nextInt();
            list.add(new Student(s,kor,eng,math));
        }
        Collections.sort(list);

        for (Student student : list) {
            System.out.println(student.name);
        }
    }
}
