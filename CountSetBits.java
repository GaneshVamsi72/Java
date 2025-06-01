// Time Complexity : O(log n) (base is 2) 
// A number can be represented in binary system by using (log n + 2) bits
public class CountSetBits {

    public static int countSetBits(int n) {
        int count = 0;

        while (n != 0) {
            if ((n & 1) == 1) { // Checking the LSB
                count++;
            }

            n = (n >> 1); // Updating n by removing the checked LSB
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.print("Number of set bits in binary representation of a number : " + countSetBits(15));
    }
}