package Java;

public class q5 {
    public static void main(String[] args) {
        int w = 3, x = 4, y = 3, z = 5;
        if((w == 2 | w == y) & !(y > z) & (1 == x ^ y != z)) { // true & true & true
            /*
                1 == x : false
                y != z : true
                비트연산자 ^는 비교하는 값이 다를경우 1, 같을 경우 0을 반환한다
                false ^ true는 서로 다르므로 1을 반환하니까 true임
            */
            w = x + y; // w = 7
            if(7 == x ^ y != w) { // false ^ true = true
                System.out.println(w); // 7
            } else {
                System.out.println(x);
            } // if
        } else {
            w = y + z;
            if(7 == y ^ z != w) {
                System.out.println(w);
            } else {
                System.out.println(z);
            }
        }
    }
}