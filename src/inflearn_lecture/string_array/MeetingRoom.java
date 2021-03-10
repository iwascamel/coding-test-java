package inflearn_lecture.string_array;

import java.util.Arrays;
import java.util.Comparator;

class Interval {
    int start;
    int end;

    Interval() {
        this.start = 0;
        this.end = 0;
    }

    Interval(int s, int e) {
        this.start = s;
        this.end = e;
    }
}

/*
문제의 포인트
1. 객체 정렬
2. logic 세우기 -> 시작 시간 = 끝 시간 겹치는 지?를 코드로 옮길 수 있느냐
*/

// 1번 강좌
public class MeetingRoom {
    public static void main(String[] args) {
        MeetingRoom a = new MeetingRoom();

        Interval in1 = new Interval(15, 20);
        Interval in2 = new Interval(5, 10);
        Interval in3 = new Interval(0, 30);

        Interval in4 = new Interval(7,10);
        Interval in5 = new Interval(2,3);

        Interval[] intervals = {in1,in2,in3};
        System.out.println(a.solve(intervals));

        Interval[] intervals2 = {in4,in5};
        System.out.println(a.solve(intervals2));
    }

    private boolean solve(Interval[] intervals) {
        if(intervals==null) return false;
        Arrays.sort(intervals,Comp);
        print(intervals);

        for(int i=1;i<intervals.length;i++){
            if(intervals[i-1].end > intervals[i].end){ // i=0 ; [i] > [i+1]
                return false;
            }
        }
        return true;
    }

    Comparator<Interval> Comp = new Comparator<Interval>() {
        @Override
        public int compare(Interval o1, Interval o2) {
            return o1.start-o2.start;
        }
    };

    public void print(Interval[] intervals){
        for(int i=0;i<intervals.length;i++){
            Interval in = intervals[i];
            System.out.println(in.start+ " " + in.end);
        }
    }

}
