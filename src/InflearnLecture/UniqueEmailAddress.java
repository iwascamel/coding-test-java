package InflearnLecture;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*
id를 추출하는데, .은 없애기
+부터 @까지 삭제
@뒤의 String 은 추출
 */

public class UniqueEmailAddress {
    public static void main(String[] args) {
        String emails[] = {"test.qdqwasda+abcde@gmail.com",
                "ims.qada+sfsdsfsssssssssssss@daum.net",
                "adasasdasd.qwdqw+adasdasdasda@naver.com"
        };
        UniqueEmailAddress a = new UniqueEmailAddress();
        List<Set<String>> result = a.solution(emails);
        for (Set<String> strings : result) {
            System.out.println(strings);
        }

    }
    public List<Set<String>> solution(String[] data){
           Set<String> idSet = new HashSet<>();
           Set<String> domainSet = new HashSet<>();

        for (String email : data) {
            String id = getIdFromEmail(email);
            String domain = getDomainFromEmail(email);
            idSet.add(id);
            domainSet.add(domain);
        }
        List<Set<String>> result = new ArrayList<>();
        result.add(idSet);
        result.add(domainSet);
        return result;
    }
    public String getDomainFromEmail(String email) {
        return email.substring(email.indexOf('@')+1);
    }

    public String getIdFromEmail(String email) {
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<email.length();i++){
            if(email.charAt(i)=='.')
                continue;
            if(email.charAt(i)=='@' || email.charAt(i)=='+')
                break;

            sb.append(email.charAt(i));
        }
        return String.valueOf(sb);
    }
}
