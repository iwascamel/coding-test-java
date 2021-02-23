public class ScratchPad {
    public static void main(String[] args) {

        String s = "123444a";

        int[] anagram = new int[256];


        for(int i=0;i<s.length();i++){

            anagram[s.charAt(i)]++;
        }

        for (int i : anagram) {
            System.out.print(i + " ");
        }

        System.out.println();
    }
}


