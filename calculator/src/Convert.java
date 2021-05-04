import java.util.Arrays;

public class Convert {

    static int[] units = {9, 5, 4, 1};
    static String[][] letters = {{"IX", "V", "IV", "I"},{"XC", "L", "XL", "X"}};
    static int[] numbers = new int[2];

    static Sentense convert(Sentense rv){
        if(rv.isRoman){
            rv.x = fromRomanToArabic(rv.x);
            rv.y = fromRomanToArabic(rv.y);
        }
        return rv;
    }

    static String convert(boolean isRoman, String result){
        if(isRoman)
        {
            result = fromArabicToRoman(result);
        }
        return result;
    }

    static String fromArabicToRoman(String str){
        int x = Integer.parseInt(str);
        String result = "";

        if(x==100){
            result = "C";
        }
        else{
            int i = 0;
            while(x>0) {
                numbers[i] = x%10;
                x=x/10;
                i++;
            }

            int dec=0;
            for (int j=0; j<numbers.length; j++){
                if(numbers[j]!=0){
                    for (int k = 0; k < units.length; k++) {
                        String result1="";
                        if (numbers[j] >= units[k]) {
                            result1 +=letters[dec][k];
                            for (int l = 0; l < numbers[j] - units[k]; l++) {
                                result1 +=  letters[dec][3];
                            }
                            result=result1+result;
                            break;
                        }
                    }
                }
                dec++;
            }
        }
        return result;
    }

    static String fromRomanToArabic(String s){
        int result = 0;
        for(int i=letters.length-1; i>-1; i--){
            for(int j=0; j<letters[i].length; j++) {
                String s2 = String.valueOf(letters[i][j]);
                if(s.startsWith(s2)) {
                    result+=units[j]*Math.pow(10, i);
                    int index = s.indexOf(s2)+s2.length();
                    if(j==3){
                        j--;
                    }
                    s = s.substring(index);
                }
            }
        }
        return String.valueOf(result);
    }


}
