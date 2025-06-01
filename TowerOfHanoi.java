// Code is written with the help of (n = 3) case
// S - Source , H - Helper , D - Destination
public class TowerOfHanoi {
    public static void towerOfHanoi(int n, char S, char H, char D) {
        if (n == 1) {
            System.out.println(S + "-->" + D);
            return;
        }

        // transfer top n-1 disks from src to helper using dest as 'helper'
        towerOfHanoi(n - 1, S, D, H);
        // transfer nth disk from src to dest
        System.out.println(S + "-->" + D);
        // transfer n-1 disks from helper to dest using src as 'helper'
        towerOfHanoi(n - 1, H, S, D);
    }

    public static void main(String[] args) {
        int n = 4;

        towerOfHanoi(n, 'A', 'B', 'C');
    }
}