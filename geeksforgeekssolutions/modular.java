package geeksforgeekssolutions;

public class modular {

    public int powMod(int x, int n, int M) {
        int res = 1;

        // Loop until exponent becomes 0
        while (n >= 1) {
            
            // n is odd, multiply result by current x and take modulo
            if ((n & 1) == 1) {
                res = (res * x) % M;
                
                // Decrease n to make it even
                n--; 
            } else {
            
                // n is even, square the base and halve the exponent
                x = (x * x) % M;
                n /= 2;
            }
        }

        return res;
    }

    public static void main(String[] args) {
        int x = 3, n = 2, M = 4;
        modular obj = new modular();
        System.out.println(obj.powMod(x, n, M));
    }
}


