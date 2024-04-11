package blackBox;

import java.util.Random;

public class _11_Package {
    public static void main(String[] args) {
        // 패키지 : Java 클래스들을 비슷한 것들끼리 정리해주는 하나의 폴더

        // 랜덤 클래스
        Random random = new Random();
        System.out.println("랜덤 정수 : "+random.nextInt()); // int 범위 내에서 정수형 값 변환
        System.out.println("랜덤 점수 (범위) : "+random.nextInt(10)); // 0이상 10 미만의 정수
        System.out.println("랜덤 실수 : "+random.nextDouble()); // 0.0 이상 1.0 미만의 실수값
        System.out.println("랜덤 실수 : "+random.nextDouble(10.0));

        System.out.println("랜덤 실수 : "+random.nextDouble(5.0,10.0));

        // 정리
        System.out.println("");
        System.out.println("------------------------------------");
        System.out.println("");

        // 로또 번호 뽑기

        System.out.println("로또 번호 : "+random.nextInt(1,46));

        // Math, Scanner, StringButter, String Builder, ...
        // BigInteger, BigDecimal
        // LocalDate, LocalTime, LocalDateTime, ...
    }
}
