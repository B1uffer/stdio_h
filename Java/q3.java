package Java;

public class q3 {
    public static void main(String[] args) {
        int i = 3, k = 1;
        switch(i) {
            case 1: k++;
            case 2: k -= 3;
            case 3: k = 0; // this
            case 4: k += 3; // 3
            case 5: k -= 10; // -7
            default: k--; // -8
        }
        System.out.println(k); // 0, 틀렸음 switch에 break가 없음
    }
}
