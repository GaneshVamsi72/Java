// Doubting whether it is to be followed or the simple one (Ask ChatGPT if you forget the simple one)
// Have to understand about Space Complexity
// Have to understand better 
// Approach :
// First look forward in the array and then check with self 
// If not found in forward look then return self vaali index
public class LastOccurrence {
    public static int LastOcc(int[] arr, int key, int i) {
        if (i == arr.length) {
            return -1;
        }
        int isFound = LastOcc(arr, key, i + 1);
        if (isFound == -1 && arr[i] == key) {
            return i;
        }
        return isFound;
    }

    public static void main(String[] args) {
        int[] arr = { 8, 3, 6, 9, 5, 2, 5, 3 };
        System.out.println(LastOcc(arr, 5, 0));
    }
}