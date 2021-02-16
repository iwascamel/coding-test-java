package programmers.greedy;

/*
옷 빌리기
1,2,3,4,5 학생
lost 2,4
reserve 1,3,5 이면
2,4가 양쪽 중 한명한테 옷을 빌릴 수 있으므로 모두 구제 가능
output : 5

🔥 학생을 만들어서 학생을 구제! 라고 생각했는데, student 가 중심이 아니라 lost 를 중심으로 생각하면 쉽게 풀린다.
 */

public class PhysicalCloth {
    public static void main(String[] args) {

        int n=5;
        int[] lost = {2,4};
        int [] reserve = {1,3,5};

        int solution = solution(n, lost, reserve);
        System.out.println(solution);
    }

    private static int solution(int n, int[] lost, int[] reserve) {
        int result = 0;
        int count=0;

        // lost = reserve 인 경우
        for(int i=0;i<lost.length;i++){
            for(int j=i;j<reserve.length;j++){
                if(reserve[j]==lost[i]){
                    lost[i]=-1;
                    reserve[j]=-1;
                    count++;
                }
            }
        }

        for(int i=0;i<lost.length;i++){
            for(int j=0;j< reserve.length;j++){
                if(lost[i]+1==reserve[j] || lost[i]-1 == reserve[j]){
                    lost[i]=-1;
                    reserve[j]=-1;
                    count++;
                }
            }
        }
        return n-lost.length+count;
    }
}
