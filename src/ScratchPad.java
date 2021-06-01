import java.util.Objects;

public class ScratchPad {
    public static void main(String[] args) {
        Member m1 = new Member(25,"양");
        Member m2 = new Member(24,"얼");

        System.out.println(m1.equals(m2));
    }
}

class Member{
    int age;
    String name;
    Member(int age,String name){
        this.age=age;
        this.name=name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Member member = (Member) o;
        return age == member.age && Objects.equals(name, member.name);
    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(age, name);
//    }
}

