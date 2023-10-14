package by.stolybko;

import static by.stolybko.StringUtils.isPositiveNumber;

public class Utils {
    public static boolean isAllPositiveNumbers(String... str) {
        for(String s : str) {
            if(!isPositiveNumber(s)){
                return false;
            }
        }
        return true;
    }

}
