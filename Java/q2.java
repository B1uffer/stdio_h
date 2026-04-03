package Java;

public class q2 {
    public static void main(String[] args) {
        int r = 0;
        for(int i = 1; i < 999; i++) { // 998까지
            if(i % 3 == 0 && i % 2 == 0) {
                r = i;
            }
        }
        System.out.println(r); // 996
    }
}
