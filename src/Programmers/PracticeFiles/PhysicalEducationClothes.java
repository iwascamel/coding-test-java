package Programmers.PracticeFiles;

public class PhysicalEducationClothes {
    public static void main(String[] args) {

        //체육복 -> 배열을 뺸다 => 그냥 -1을 집어넣어도 된다
        //section 별로 주석달기
        // https://rimkongs.tistory.com/141
        // https://programmers.co.kr/learn/courses/30/lessons/42862/solution_groups?language=java

        int n =3;
        int[] lost = {3};
        int[] reserve = {1};
        int count=0;

    }
}

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {

        int count=0;

        for(int i=0;i<lost.length;i++){
            for(int j=0;j< reserve.length;j++){
                if(lost[i]==reserve[j]){
                    lost[i]=-1;
                    reserve[j]=-1;
                    count++;
                    break;
                }
            }
        }

        for(int i=0;i< lost.length;i++){
            for(int j=0;j<reserve.length;j++){
                if(lost[i]+1==reserve[j] || lost[i]-1==reserve[j]){
                    lost[i]=-1;
                    reserve[j]=-1;
                    count++;
                    break;
                }
            }
        }

        return n-lost.length+count;
    }
}

/*

메모장 풀이

    여벌 체육복도난 -> IF

        n명


        1. lost에 있는 숫자가 reserve에도 있다면
        lost, reserve 동시에 뺌

        2. lost에 있는 숫자에 인접한 reserve 있는지 확인

        있다면 lost와 reserve 숫자 둘다 빼줌

        n-lost.length = 답


        체육복 -> 배열을 뺸다 => 그냥 -1을 집어넣어도 된다

        section 별로 주석달기

 */

