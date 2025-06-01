// Given n friends, each one can remain single or can be paired up with some other friend. Each friend can be paired only once. Find out the total number of ways in which friends can remain single or can be paired up.
public class FriendsPairingProblem {
    public static int noOfWays(int n) {
        if (n <= 2) {
            return n;
        }

        // *****Using this recursive function we are going to each person calculating according to the choices they have!!
        int single = noOfWays(n - 1); // noOfWays when remained single.
        int pairs = noOfWays(n - 2) * (n - 1); // noOfWays when pairing.. is multiplied because for pairing, for a person , there will be n - 1 choices from the rest of the group.
        
        return single + pairs;
    }

    public static void main(String[] args) {
        System.out.println(noOfWays(5));
    }
}