package bai3;

public class FizzBuzzTranslat {
    public static String translat(int n){
        String s=String.valueOf(n);
        String p="";
        for (int i=0;i<s.length();i++){
            if (s.charAt(i)=='3'){
                 return   p="Fizz";
            } else if (s.charAt(i)=='5') {
                return    p="Buzz";
            }else {
                switch (s.charAt(i)){
                    case '0' :
                        p+="không ";
                    break;
                    case '1' :
                        p+="một ";
                    break;
                    case '2' :
                        p+="hai ";
                        break;
                    case '4' :
                        p+="bốn ";
                        break;
                    case '6' :
                        p+="sáu ";
                        break;
                    case '7' :
                        p+="bảy ";
                        break;
                    case '8' :
                        p+="tám ";
                        break;
                    case '9' :
                        p+="chín ";
                        break;
                }
            }
        }
        return p;
    }
}
