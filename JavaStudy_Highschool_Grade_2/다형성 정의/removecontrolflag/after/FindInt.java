package removecontrolflag.after;

public class FindInt {

    public static boolean find(int[] data, int number){
//        boolean is_find = false;

        for (int i = 0; i< data.length; i++){
            if (data[i] == number){
                return true;
//                is_find = true;
//                break;

            }
        }
        return false;
//        return is_find;
    }
}
