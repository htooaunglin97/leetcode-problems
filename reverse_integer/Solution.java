package reverse_integer;

public class Solution {
   
    public int reverse(int x) {
        int reversed = 0;
        while (x != 0) {
            int digit = x % 10;
            x /= 10;

            // Check for overflow/underflow before multiplying by 10
            if (reversed > Integer.MAX_VALUE / 10 || (reversed == Integer.MAX_VALUE / 10 && digit > 7)) {
                return 0; // Overflow
            }
            if (reversed < Integer.MIN_VALUE / 10 || (reversed == Integer.MIN_VALUE / 10 && digit < -8)) {
                return 0; // Underflow
            }

            reversed = reversed * 10 + digit;
        }
        return reversed;
    }

    void main() {
        IO.println(reverse(123));
        IO.println(reverse(-123));
        IO.println(reverse(120));
        IO.println(reverse(0));
    }


}
