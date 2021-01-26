package coding_test_collections.line_coding_test;

public class LineNumberOne {
    public static void main(String args[]) {

        int[][] testArray = {{1, 2}, {3, 4}, {5, 6}};

//        for (int i = 0; i < testArray.length; i++) {
//            System.out.println(Solution.solution(testArray)[i][0]);
//            System.out.println(Solution.solution(testArray)[i][1]);
//        }

    }
}

class Solution1 {
    public static int solution(int[][] boxes) {

        int temp;

        for (int i = 0; i < boxes.length; i++) {
            if (boxes[i][0] != -1) {
                for (int j = i+1; j < boxes.length; j++) {
                    if (boxes[i][0] != -1) {
                        if (boxes[i][0] == boxes[j][0]) {
                            temp = boxes[i][1];
                            boxes[i][1] = boxes[j][0];
                            boxes[j][0] = temp;
                            if(boxes[i][0]==boxes[i][1]){
                                boxes[i][0] = -1;
                                boxes[i][1] = -1;
                            }
                        }
                        if (boxes[i][0] == boxes[j][1]) {
                            temp = boxes[i][1];
                            boxes[i][1] = boxes[j][1];
                            boxes[j][1] = temp;
                            if(boxes[i][0]==boxes[i][1]){
                                boxes[i][0] = -1;
                                boxes[i][1] = -1;
                            }
                        }
                    }
                }
                if (boxes[i][0] != -1) {
                    for (int j = i+1; j < boxes.length; j++) {
                        if (boxes[i][1] == boxes[j][1]) {
                            temp = boxes[i][0];
                            boxes[i][0] = boxes[j][1];
                            boxes[j][1] = temp;
                            if(boxes[i][0]==boxes[i][1]){
                                boxes[i][0] = -1;
                                boxes[i][1] = -1;
                            }
                        }
                        if (boxes[i][1] == boxes[j][0]) {
                            temp = boxes[i][0];
                            boxes[i][0] = boxes[j][0];
                            boxes[j][0] = temp;
                            if(boxes[i][0]==boxes[i][1]){
                                boxes[i][0] = -1;
                                boxes[i][1] = -1;
                            }
                        }
                    }
                }
            }
            if(boxes[i][0]==boxes[i][1]){
                boxes[i][0] = -1;
                boxes[i][1] = -1;
            }
        }

        int result = 0;

        for(int i=0;i<boxes.length;i++){
            if(boxes[i][0]>0){
                result++;
            }
        }

        return result;
    }
}
