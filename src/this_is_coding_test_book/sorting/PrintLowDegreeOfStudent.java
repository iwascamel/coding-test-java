package this_is_coding_test_book.sorting;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/*
180 page
 */
public class PrintLowDegreeOfStudent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Integer N = Integer.valueOf(sc.nextLine());


        List<Student> list = new ArrayList<>();
        for(int i=0;i<N;i++){
            int i1 = sc.nextInt();
            String s = sc.next();
            Student student = new Student(s,i1);
            list.add(student);
        }

        Comparator<Student> comp = new Comparator<>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.score-o2.score;
            }
        };

        list.sort(comp);

        for (Student student : list) {
            System.out.println(student.name);
        }
    }
    static class Student{
        String name;
        int score;

        Student(String name,int score){
            this.name=name;
            this.score=score;
        }
    }
}
