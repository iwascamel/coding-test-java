package coding_test_collections.baemin_coding_test;

public class number1real {
    public static void main(String[] args) {
        Solution a = new Solution();
    }

    static class Solution {
        public int solution(String[] grades, int[] weights, int threshold) {

            int gradeToInt[] = new int[grades.length];

            for(int i=0;i< grades.length;i++){
                switch (grades[i]){
                    case "A+": gradeToInt[i]=10;
                        break;
                    case "A0": gradeToInt[i]=9;
                        break;
                    case "B+": gradeToInt[i]=8;
                        break;
                    case "B0": gradeToInt[i]=7;
                        break;
                    case "C+": gradeToInt[i]=6;
                        break;
                    case "C0": gradeToInt[i]=5;
                        break;
                    case "D+": gradeToInt[i]=4;
                        break;
                    case "D0": gradeToInt[i]=3;
                        break;
                    case "F": gradeToInt[i]=0;
                        break;
                }
            }

            int multipleInt[] = new int[grades.length];

            for(int i=0;i< grades.length;i++){
                multipleInt[i] = gradeToInt[i]*weights[i];
            }

            int result = 0;

            for(int i : multipleInt){
                result += i;
            }

            result = result-threshold;
            return result;
        }
    }
}
