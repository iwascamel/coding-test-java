import java.lang.reflect.Array;
import java.util.*;

import static java.util.stream.Collectors.toList;

class User{
    public String name="hello";

    public String status="hi";

    public Integer[] idx = new Integer[5];

    public User(){
        for(int i=0;i<5;i++){
            idx[i]=i;
        }
    }

    public String getName() {
        return name;
    }
}

public class AlgorithmTest {
    public static void main(String args[]) {
        List<User> userList = new ArrayList<>();

        User user1 = new User();

        userList.add(user1);

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4);
        List result = numbers.stream()
                .filter(e -> (e % 2) == 0)
                .map(e -> e * 2)
                .collect(toList());

        System.out.println(result);
    }
}