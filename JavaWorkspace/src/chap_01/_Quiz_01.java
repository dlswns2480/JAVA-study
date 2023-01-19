package chap_01;
/*
(실행 결과)
상암08번 버스
약 3분 후 도착
남은 거리 1.2km
 */
public class _Quiz_01 {
    public static void main(String[] args) {
        // 버스 번호 (1234, 상암08)
        String busNo = "상암08";

        // 남은 시간 (3분, 5분)
        int minute = 3;

        // 남은 거리 (1.5km, 0.8km)
        double distance = 1.2;

        // 결과 출력
        System.out.println(busNo + "번 버스");
        System.out.println("약 " + minute + "분 후 도착");
        System.out.println("남은 거리 " + distance + "km");
    }
}
