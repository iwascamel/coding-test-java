package inflearnLecture.string_array;

import java.util.ArrayList;
import java.util.List;

/*
{
{1,2,3},
{4,5,6},
{7,8,9}
}

output : 123698745 나선 모양으로 출력

 대부분의 문제는 규칙찾기
 case 를 나누어서, 행 증가 / 열 증가 / 행 감소 / 열 감소 이런식으로 따져보기
 2차원 배열의 문제는 예시를 크게 잡고 하면 덜 헷갈린다
 그리고 예시를 하나하나 따라가면서 하면 좋다
 */

public class SpiralMatrix {
    public static void main(String[] args) {

        int[][] matrix = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        solve(matrix);
    }

    private static List<Integer> solve(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        if(matrix==null||matrix.length==0){
            return result;
        }

        int rowStart = 0;
        int rowEnd = matrix.length-1;
        int colStart = 0;
        int colEnd = matrix[0].length-1;

        return result;
    }
}
