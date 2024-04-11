package blackBox;

import java.util.concurrent.BlockingDeque;

public class BlackBox {

    // 클래스 구성 요소 : 필드, 메소드, 생성자

    String modelName; // 모델명

    String resolution; // 해상도

    int price; // 가격

    String color; // 색상

    // 클래스 변수
    static boolean canAutoReport = false; //자동 신고 기능

    // 메서드
    void autoReport() {
        if (canAutoReport) {
            System.out.println("충돌이 감지되어 자동으로 신고합니다.");
        } else {
            System.out.println("자동 신고 기능이 지원되지 않습니다.");
        }
    }

    void insertMemoryCard(int capacity) {
        System.out.println("메모리 카드가 삽입되었습니다.");
        System.out.println("용량은 " + capacity + "GB 입니다.");
    }

    int getVideoFileCount(int type) {
        if (type==1) { // type : 일빈 영상
            return 9;
        } else if (type==2) { //이번트 영상 [충돌 감지]
            return 2;
        }
        return 11;
    }

    // showDateTime : 날짜정보 표시여부
    // showSpeed : 속도정보 표시여부
    // min : 영삳기록 단위

    void record(boolean showDateTime, boolean showSpeed, int min) {
        System.out.println("녹화를 시작합니다.");
        if (showDateTime) {
            System.out.println("영상에 날짜정보가 표시됩니다.");
        }
        if (showSpeed) {
            System.out.println("영상에 속도 정보가 표시됩니다.");
        }
        System.out.println("영상은 "+min+"분 단위로 기록됩니다.");
    }
    void record()  {
        record(true,true,5);
    }

    static void callServiceCenter() {
        System.out.println("서비스센터(1588-0000)으로 연결합니다.");
        // modelName = "분홍이";
        canAutoReport = true;

    }
}
