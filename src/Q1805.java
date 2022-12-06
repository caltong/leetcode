import java.math.BigInteger;
import java.util.HashSet;
import java.util.Set;

public class Q1805 {
    public int numDifferentIntegers(String word) {
        Set<String> integers = new HashSet<>();
        StringBuilder previousInt = new StringBuilder();
        for (int i = 0; i < word.length(); i++) {
            char currentChar = word.charAt(i);
            //if numeric
            if (currentChar >= '0' && currentChar <= '9') {
                previousInt.append(currentChar);
                //if alphabetic
            } else {
                if (previousInt.length() > 0) {
                    integers.add(dropStartZero(previousInt.toString()));
                    previousInt.setLength(0);
                }
            }
        }
        if (previousInt.length() > 0) {
            integers.add(dropStartZero(previousInt.toString()));
        }
        return integers.size();
    }

    private String dropStartZero(String originString){
        int actuallyStart = 0;
        for (int j = 0; j < originString.length(); j++) {
            if (originString.charAt(j) == '0') {
                actuallyStart += 1;
            } else {
                break;
            }
        }
        return originString.substring(actuallyStart);
    }

    public static void main(String[] args) {
        Q1805 q1805 = new Q1805();
        int res = q1805.numDifferentIntegers("a1b01c001");
        System.out.println(res);
    }
}
