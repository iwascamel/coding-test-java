package coding_test_collections.nexon_coding_test;

public class RegexTest {
    public static void main(String[] args) {
        String ab = "\"^1*[02468]$\"";
        String input = "1010101";

        System.out.println(input.matches(ab));
    }
}
