package String;

public class StringSplitJoinMain {
    public static void main(String[] args) {

        String str = "Apple,Banana,Orange";

        // split()
        String[] strlist = str.split(",");

        for (String s : strlist) {
            System.out.println(s);
        }
        String joinedStr = String.join("-","A","B","C");
        System.out.println("연결된 문자 : "+joinedStr);

        String result = String.join("0-",strlist);
        System.out.println("result = "+result);
    }
}
