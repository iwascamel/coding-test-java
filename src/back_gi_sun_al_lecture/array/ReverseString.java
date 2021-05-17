package back_gi_sun_al_lecture.array;

// char 배열이 주어졌을 때, 뒤집어라
public class ReverseString {
    public static void main(String[] args) {
        System.out.println(usingBrute("hello".toCharArray()));
        System.out.println(swap("hello".toCharArray()));
        System.out.println(usingSB("hello".toCharArray()));
    }
    // char array 출력하면 그냥 string 으로 출력된다 ( 몰랐네 )
    // 시간 o(n) 공간 o(n)
    public static char[] usingBrute(char[] arr){

        char[] result = new char[arr.length];

        for(int i=0;i<arr.length;i++){
            result[i] = arr[arr.length-1-i];
        }
        return result;
    }

    // 절반까지만 가면 됨
    // 배열 내에서 바꾼 것이므로, 시간복잡도는 여전히 o(n)이지만, 공간복잡도는 o(1)로 줄일 수 있음
    public static char[] swap(char[] arr){
        for(int i=0;i<arr.length/2;i++){
            char temp = arr[i];
            arr[i] = arr[arr.length-1-i];
            arr[arr.length-1-i]=temp;
        }
        return arr;
    }

    public static String usingSB(char[] arr){
        StringBuilder sb = new StringBuilder();
        sb.append(arr).reverse();
        return sb.toString();
    }
}
