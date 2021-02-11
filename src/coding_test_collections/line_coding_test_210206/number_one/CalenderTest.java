package coding_test_collections.line_coding_test_210206.number_one;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;

public class CalenderTest {

    public static void main(String[] args) {
        calculateHoliday();
    }

    public static void calculateHoliday() {
        int workDt = 0;
        String startDate = "21-01-01".replaceAll("-", "");
        String endDate = "21-12-31".replaceAll("-", "");

        //실제 공휴일을 구한다.
        List<HashMap<String, Object>> holidayList = new ArrayList<HashMap<String, Object>>();
        HashMap<String, Object> holidayMap = new HashMap<String, Object>();

        holidayMap.put("holidayDt", "210114");    //신정
        holidayList.add(holidayMap);

        holidayMap = new HashMap<String, Object>();
        holidayMap.put("holidayDt", "210124");    //설날연휴
        holidayList.add(holidayMap);

        holidayMap = new HashMap<String, Object>();
        holidayMap.put("holidayDt", "210125");    //설날
        holidayList.add(holidayMap);

        holidayMap = new HashMap<String, Object>();
        holidayMap.put("holidayDt", "210126");    //설날연휴
        holidayList.add(holidayMap);

        holidayMap = new HashMap<String, Object>();
        holidayMap.put("holidayDt", "210127");    //대체휴일
        holidayList.add(holidayMap);

        holidayMap = new HashMap<String, Object>();
        holidayMap.put("holidayDt", "210301");    //삼일절
        holidayList.add(holidayMap);

        SimpleDateFormat sdf = new SimpleDateFormat("yyMMdd");
        try {
            Calendar start = Calendar.getInstance();
            start.setTime(sdf.parse(startDate)); //시작일 날짜 설정

            Calendar end = Calendar.getInstance();
            end.setTime(sdf.parse(endDate)); //종료일 날짜 설정

            Calendar hol = Calendar.getInstance();

            int holDays = 0; // 평일인 공휴일 수
            while (!start.after(end)) {
                int holday = 0;

                //시작일과 공휴일이 같을때 공휴일이 주말인지 체크한다.
                //공휴일이 주말이 아니면 +1
                if (!holidayList.isEmpty()) {
                    for (int i = 0; i < holidayList.size(); i++) {
                        hol.setTime(sdf.parse((String) holidayList.get(i).get("holidayDt").toString()));    //실제 공휴일 날짜 설정
                        holday = hol.get(Calendar.DAY_OF_WEEK); //주말인지 구한다. 1이면 일요일 7이면 토요일

                        if (!start.equals(hol) || (holday == Calendar.SATURDAY) || (holday == Calendar.SUNDAY)) {
                            holDays++;
                        }
                    }
                }
                start.add(Calendar.DATE, 1);
            }

            System.out.println(holDays); // 평일인 공휴일수

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

