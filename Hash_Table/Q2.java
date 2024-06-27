package Hash_Table;
import java.util.HashMap;


/*

2. You have 10^9 hats numbered from 1,2,...,10^9. At first each hat is empty. Create class hatsAndBalls with following methods:
- AddBall(int x) //adds ball to hat x
- function howManyHasAtleastOne() // returns how many hats has at least one ball
- function greatestAmount() // returns count of balls for hat that has the most of balls

Use Javas HashMap here.

 */

public class Q2 {
    public static class HatsAndBalls {
        private HashMap<Integer, Integer> BallCount;
        public HatsAndBalls() {
            BallCount = new HashMap<>();
        }
        public void addBall(int x) {
            BallCount.put(x, BallCount.getOrDefault(x, 0) + 1); // We can Add a ball to the specified hat
        }

        public int AtLeastOne() {
            return BallCount.size(); // It will return count of hats that have at least one ball
        }
        public int greatestAmount() {
            int maxBalls = 0;
            for (int count : BallCount.values()) {
                maxBalls = Math.max(maxBalls, count);
            }
            return maxBalls; // It will return count of balls for the hat that has the most balls
        }
    }

    public static void main(String[] args) {
        HatsAndBalls HatsAndBalls = new HatsAndBalls();

        HatsAndBalls.addBall(5);   // Here I use addBall() method to add balls to different hats.
        HatsAndBalls.addBall(8);
        HatsAndBalls.addBall(2);
        HatsAndBalls.addBall(5);
        HatsAndBalls.addBall(3);

        System.out.println("Hats with at least one ball: " + HatsAndBalls.AtLeastOne());
        System.out.println("Most balls in a hat: " + HatsAndBalls.greatestAmount());
    }
}



// Got the idea from following website
// https://www.programiz.com/java-programming/hashmap