package org.erumyantsev.stropers;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Yauheni_Rumiantsau on 7/8/2017.
 */
public class DigitSum {

    public static void main(String[] args){

        Integer checker;
        Integer sum = 0;
        String str = "a 1, b 24, fg.! fer 2 8 -= 6 kkl ## $% *;  : jjj; ''' 7,90, 81";

        String result = str.replaceAll("\\p{Punct}"," ");

        List<String> listChar = Arrays.asList(result.split(" "));

        for (String st : listChar){
            try{
                checker = Integer.parseInt(st);
            }catch (NumberFormatException e){
                checker = 0;
            }
            sum += checker;
        }

        System.out.printf("The SUM of all digits from the text is: %d", sum);
    }
}
