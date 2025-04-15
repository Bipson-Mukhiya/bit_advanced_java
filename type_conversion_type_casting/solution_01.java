package type_conversion_type_casting;

public class solution_01 {
    public static void main(String[] args) {
        byte b = 127;
        int a = 12;
        byte k = (byte) a; // this will work 

        float f = 5.7f;
        int t = (int) f;

        System.out.println(k);
        System.out.println(t);
    
    }
}
