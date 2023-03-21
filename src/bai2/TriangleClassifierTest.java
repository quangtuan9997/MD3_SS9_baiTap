package bai2;

public class TriangleClassifierTest {
    public static String refactor(int a,int b,int c){
        if (a+b>c&&b+c>a&&c+a>b){
            if (a==b&&b==c){
                return "tam giác đều";
            } else if (a==b||b==c||c==a) {
                return "tam giác cân";
            }else
                return "tam giác thường";
        }
        return "không phải là tam giác";
    }
}
