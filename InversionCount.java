// Given an array of integers. Find the Inversion Count in the array. 
// Inversion Count: For an array, inversion count indicates how far (or close) the array is from being sorted. If the array is already sorted then the inversion count is 0. If an array is sorted in the reverse order then the inversion count is the maximum. Formally, two elements a[i] and a[j] form an inversion if a[i] > a[j] and i < j.
// Sample Input 1: N = 5, arr[ ] = {2, 4, 1, 3, 5}
// Sample Output 1: 3, because it has 3 inversions -(2, 1), (4, 1), (4, 3).
// Sample Input 2: N = 5, arr[ ] = {2, 3, 4, 5, 6}
// Sample Output 2: 0, because the array is already sorted
// Sample Input 3: N = 3, arr[] = {5, 5, 5}
// Sample Output 3: 0, because all the elements of the array are the same & already in a sorted manner. 
// (Hint: A sorting algorithm will be used to solve this question.)
// Note-This question is important. Even if you are not able to come up with the approach, please understand the solution.
public class InversionCount {
    public static int merge(int[] arr, int s, int m, int e) {
        int[] temp = new int[e - s + 1];
        int k = 0;

        int i = s;
        int j = m + 1;

        int invCount = 0;

        while (i <= m && j <= e) {
            if (arr[i] <= arr[j]) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                invCount += (m - i + 1); // Important thing ! To recall watch Apna College C++ video on this problem
                j++;
            }
            k++;
        }

        while (i <= m) {
            temp[k++] = arr[i++];
        }

        while (j <= e) {
            temp[k++] = arr[j++];
        }

        int x = s;
        for (int l = 0; l < temp.length; l++) {
            arr[x++] = temp[l];
        }

        return invCount;
    }

    public static int Sort(int[] arr, int s, int e) {
        int invCount = 0;

        if (s < e) {
            int m = (s + e) / 2;

            invCount += Sort(arr, s, m);
            invCount += Sort(arr, m + 1, e);
            invCount += merge(arr, s, m, e);
        }

        return invCount;
    }

    public static int getInversionCount(int[] arr) {
        int n = arr.length;
        return Sort(arr, 0, n - 1);
    }

    public static void main(String[] args) {
        int arr[] = { 2, 4, 1, 3, 5 };
        System.out.println("Inversion Count = " + getInversionCount(arr));
    }
}