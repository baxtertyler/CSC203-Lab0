/* this part is as comment similar to comments in Python
CPE/CSC 203 Lab00
Name: Tyler Baxter
Section: 03

*/
public class Lab00 {

   public static void main(String[] arguments) {

      // declaring and initializing some variables
      int x = 5;
      String y = "hello";
      double z = 9.8f;

      // printing the variables
      System.out.println("x: " + x + " y: " + y + " z: " + z);

      // a list (make an array in java)
      int[] ListToArray = {3, 6, -1, 2};
      for (int i : ListToArray) {
         System.out.println(i);
      }

      // call a function
      int numFound = char_count(y, 'l');
      System.out.println("Found: " + numFound);

      // a counting for loop
      for (int j = 1; j < 11; j++) {
         System.out.print(j + " ");
      }
   }

   // function counts the given character in the given string
   // str -> int
   public static int char_count(String s, char c) {
      int count = 0;
      for (char x : s.toCharArray()) {
         if (x == c) count++;
      }
      return count;
   }
}