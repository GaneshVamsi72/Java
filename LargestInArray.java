public class LargestInArray {
    public static int LargestNum(int[] numbers) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] numbers = { 1, 2, 6, 3, 5 };
        int largest_num = LargestNum(numbers);
        System.out.print("Largest number in the array is " + largest_num);
    }
}
