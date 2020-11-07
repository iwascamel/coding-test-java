package ThisIsCodingTestBook.baeminTest;

import java.util.ArrayList;

public class Number6 {
    public static void main(String[] args) {
        String[] logs = {"0001 3 95", "0001 5 90", "0001 5 100", "0002 3 95", "0001 7 80", "0001 8 80", "0001 10 90", "0002 10 90", "0002 7 80", "0002 8 80", "0002 5 100", "0003 99 90"};
        String[] splitArray;

        ArrayList<Student> studentArrayList = new ArrayList<>();

        for(int i=0;i<logs.length;i++){
            splitArray=logs[i].split(" ");

            int n1 = Integer.parseInt(splitArray[0]);
            int n2 = Integer.parseInt(splitArray[1]);
            int n3 = Integer.parseInt(splitArray[2]);

            Student newStudent = new Student(n1,n2,n3);

            studentArrayList.add(newStudent);
        }



    }
    static class Student{
        int studentNum;
        int problemNum;
        int count;
        public Student(int studentNum,int problemNum,int count){
            this.studentNum = studentNum;
            this.problemNum = problemNum;
            this.count = count;
        }
    }
}
