package poly.sort;

public class BubbleSort implements Sort{
    private String name = "BubbleSort";
    @Override
    public void ascending(int[] arr) {
        System.out.println(name+" ascending");
    }

    @Override
    public void descending(int[] arr) {
        System.out.println(name+" descending");
    }

    @Override
    public void description() {
        System.out.println("숫자를 정렬하는 알고리즘 입니다.");
        System.out.println(name+" 입니다.");
    }


}
