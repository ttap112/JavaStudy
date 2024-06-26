public class ClassPart2 {
    public static void main(String[] args) {
        String[] StNames = {"홍길동","장발장","임꺽정"};
        int[] StAges = {15,16,17};
        int[] Grades = {90,80,99};
        for (int i =0; i<StNames.length; i++) {
            System.out.printf("이름 : "+StNames[i]+" 나이 : "+StAges[i]+"세"+" 점수 : "+Grades[i]+"점");
            System.out.println("");
        }

        // 배열을 사용하여 코드를 다시 작성하였을 때
        // 1. 학생이 추가되어도 배열에 데이터만 추가하면 됨, 변수추가X
        // 2. 출력을 반복문을 통해 배열을 순차적으로 탐색하므로, 학생이 추가되어도 출력 코드를 추가할 필요가 없다

        // 코드 변경은 최소화 되었으나 한 학생의 데이터가 3개의 배열로 나눠서 관리가 됨
        // 데이터를 변경, 삭제할 때 매우 조심히 작업을 해야함 따라서 위와 같은 코드는
        // 컴퓨터가 볼 때는 전혀 문제가 없지만, 사람이 관리하기에는 좋은 코드가 아니다

        // 그래서 클래스를 도입
        // 클래스를 사용해 학생이라는 개념을 만들고
        // 각각의 학생별로 본인의 이름, 나이, 성적을 관리
    }
}
