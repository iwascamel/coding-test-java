
// 21.06.08
// 런타임에러뜸

package backjoon.realization;

import java.util.*;

//aAazzAZazccca

public class StudyWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String next = sc.next();
        next = next.toUpperCase();
        Map<Character,Integer> map = new HashMap<>();

        for(int i=0;i<next.length();i++){
            Character c = next.charAt(i);
            if(map.containsKey(c)){
                map.put(c,map.get(c)+1);
            }else{
                map.put(c,1);
            }
        }
        Collection<Integer> values = map.values();

        List<Integer> li = new ArrayList<>(values);

        Comparator<Integer> comp = (o1, o2) -> o2-o1;
        li.sort(comp);

        if(li.size()==1){
            System.out.println(next);
        }else if(li.size()>=2){
            if(li.get(0).equals(li.get(1))){
                System.out.println("?");
            }else{
                Set<Character> characters = map.keySet();
                for(Character c : characters){
                    if(map.get(c).equals(li.get(0))){
                        System.out.println(c);
                    }
                }
            }
        }
    }
}
