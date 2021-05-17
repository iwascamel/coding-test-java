package back_gi_sun_al_lecture.structures;

// string 은 불변객체
public class StringBuilder_practice {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" java");
        sb.reverse();
        // 3~4 삭제
        sb.delete(3,4);
        sb.deleteCharAt(3);
        System.out.println(sb);
        System.out.println(sb.capacity());
    }
}
