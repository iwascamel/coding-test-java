package this_is_coding_test_book.realize;

/*
21-03-27
 */

public class Snake {

    static class LinkedList{
        Node header;
        static class Node{
            Node next;
            int x;
            int y;
            Node(int x,int y){
                this.x=x;
                this.y=y;
            }
        }
        LinkedList(){
            header = new Node(0,0);
        }
        void getApple(int x,int y){
            Node n = new Node(x,y);
            n.next=header;
            header=n;
        }
        void move(char c,LinkedList ll){
            if (c == 'L') {
                Node n = ll.header;
                while (n.next != null) {
                    n.x = dirs[0][0];
                    n.y = dirs[0][1];
                    n = n.next;
                }
            }else if(c=='R'){
                Node n = ll.header;
                while (n.next != null) {
                    n.x = dirs[1][0];
                    n.y = dirs[1][1];
                    n = n.next;
                }
            }else if(c=='U'){
                Node n = ll.header;
                while (n.next != null) {
                    n.x = dirs[2][0];
                    n.y = dirs[2][1];
                    n = n.next;
                }
            }
            else if(c=='D'){
                Node n = ll.header;
                while (n.next != null) {
                    n.x = dirs[3][0];
                    n.y = dirs[3][1];
                    n = n.next;
                }
            }
        }
        // 몸이 닿으면 true
        boolean detect(LinkedList ll,int x,int y){
            Node n = header;
            while(n.next!=null){
                if(n.x==x && n.y==y) return true;
                n=n.next;
            }
            return false;
        }
    }

    private static int[][] arr = new int[10][10];
    // L R U D
    private static int[][] dirs={
            {-1,0},{1,0},{0,1},{0,-1}
    };


    public static void main(String[] args) {
        int N = 10;

        arr[1][2]=1;
        arr[1][3]=1;
        arr[1][4]=1;
        arr[1][5]=1;

        int[] time = {8,10,11,13};
        char[] dir = {'D','D','D','L'};

        int solution = solution(time, dir);
        System.out.println(solution);
    }

    private static int solution(int[] time, char[] dir) {
        int count=0;

        while(true){
            char currentDir = 'R';
            for(int i=0;i<time.length;i++){
                if(count==time[i]){
                    currentDir=dir[i];
                }
            }
            LinkedList ll = new LinkedList();
            ll.move(currentDir,ll);
            int x = ll.header.x;
            int y = ll.header.y;

            if(arr[x][y]==1){
                ll.getApple(x,y);
            }
            if(x<1 || x>10 || y<1 || y>10|| ll.detect(ll,x,y)){
                break;
            }
            count++;
        }
        return count;
    }
}
