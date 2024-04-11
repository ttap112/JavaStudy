package exam;

public class GreatestDifferenceFinder {

    int greatestDifference(int[] intArray) {
        if(intArray.length < 2) {
            return 0;
        }

        int Max = intArray[0];
        int Min = intArray[0];

        for (int i = 0; i<intArray.length; i++) {
            if ( Max < intArray[i]){
                 Max = intArray[i];
            }
            if (Min > intArray[i]) {
                Min = intArray[i];
            }
        }

        return Max - Min ;

    }
}
