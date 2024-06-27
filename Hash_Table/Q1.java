package Hash_Table;

/*

1. Count the polynomial hash value for "specifications"  with A=17 and N=931663099

 */


public class Q1 {
    /*h = 0
      for i = 0 to k-1
         h = (h*A+c[i])%N;

         Count the polynomial hash value for "specifications"  with A=17 and N=931663099
    */

        public static int ownHash(String word){
            int h = 0;
            int A = 17;
            int N = 931663099;
            for (int i = 0; i < word.length(); i++){
                h = (h * A + Character.hashCode(word.charAt(i))) % N;
            }
            return h;
        }

        public static void main(String[] args) {
            String word = "specifications";
            System.out.println(ownHash(word));
            System.out.println(word.hashCode()); // compare to Javas own hash code

        }
}





/*


Question: What is the hash value with Java hashCode()? Why is it different?

Answer: The hashCode() method determines the hash code for objects, pivotal
for collections like HashMap and HashSet. The method exists in two variants:
the general hashCode() for objects and hashCode(int value) specifically for integers.
Proper implementation ensures efficient hashing for optimized collection performance.

we can say shortly In short, hashCode() in Java returns a unique (ideally) integer for
an object, used for efficient storage in data structures like hash tables. It can differ because:

    1. It's not guaranteed unique, collisions can happen.
    2. The default implementation uses memory address, which can change.
    3. Custom implementations can be based on the object's data.


Question: Find two different strings with same hash value.
Answer:

public class HashCollision {
public static void main(String[] args) {
        HashMap<Integer, String> seenHashes = new HashMap<>();
        Random random = new Random();

        while (true) {
            StringBuilder randomString = new StringBuilder();
            for (int i = 0; i < 10; i++) {
                randomString.append((char) ('a' + random.nextInt(26))); // Generate random lowercase letter
            }

            int hashValue = randomString.toString().hashCode();
            if (seenHashes.containsKey(hashValue)) {
                System.out.println("Collision found: " + randomString + " and " + seenHashes.get(hashValue) + " have the same hash code (" + hashValue + ")");
                break;
            } else {
                seenHashes.put(hashValue, randomString.toString());
            }
        }
    }
}


 */

