# 2번

문제: List의 전에 값보다 현재의 값이 크면 차이를 구해라. 그 차이 값의 max는?
- 만약 현재의 값들이 전의 값들보다 전부 작으면 -1을 return 하라

자료구조 : stack

맨 위에거 뺀다 stack.pop()

그 다음에 전부 빼면서 값 비교함

1~(n-1) 값 다시 집어넣어줌

그 다음엔

1~(n-2) 값 다시 집어 넣어줌

# 3번

join 해서 가져오는데, buyer_id가 2개 이상일 경우만 가져와서
거기서 100 이상인 거 

SELECT buyer_id,sum(price) as total FROM house JOIN price ON house.house_id=price.house_id group by buyer_id having count(*)>=2 AND total>=100 ;

>>https://stackoverflow.com/questions/4242990/mysql-select-rows-with-more-than-one-occurrence

>>https://dba.stackexchange.com/questions/54187/select-rows-where-column-contains-same-data-in-more-than-one-record

>>https://link2me.tistory.com/728

>>https://extbrain.tistory.com/56

# 4번

5, 3 이면

11111
11112
122
113
23

k보다 적은 숫자가 남아있다면

>더해질 수 있는 경우의 수 java
>>https://m.blog.naver.com/PostView.nhn?blogId=ndb796&logNo=220912159147&proxyReferer=https:%2F%2Fwww.google.com%2F


