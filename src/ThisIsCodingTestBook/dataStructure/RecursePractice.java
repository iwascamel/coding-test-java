package ThisIsCodingTestBook.dataStructure;

public class RecursePractice {
    public static void main(String[] args) {
        recurse(10);
    }

    static void recurse(int i){

        if(i<0) return ;

        System.out.println(i + "번째");
        recurse(i-1);
    }
}
