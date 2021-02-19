public class ScratchPad {
    public static void main(String[] args) {

        String str = "8F3Z-2e-9-wadwqdas";
        int k=5;
        String solution = solution(str, k);
        System.out.println(solution);

    }

    private static String solution(String str, int k) {
        StringBuilder sb = new StringBuilder();

        String replace = str.replace("-", "");
        String s = replace.toUpperCase();
        int length = s.length();

        for(int i=0;i<length;i++){
            sb.append(s.charAt(i));
        }

        for(int i=k;i<length;i=i+k){
            sb.insert(length-i,"-");
        }
        String s1 = String.valueOf(sb);
        return s1;
    }
}


