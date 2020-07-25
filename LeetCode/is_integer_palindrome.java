/*
 * Determine whether an integer is a palindrome. An integer is a palindrome when
 * it reads the same backward as forward.
 * 
 * Example 1: Input: 121 Output: true
 * 
 * Example 2: Input: -121 Output: false Explanation: From left to right, it
 * reads -121. From right to left, it becomes 121-. Therefore it is not a
 * palindrome.
 * 
 * Example 3: Input: 10 Output: false Explanation: Reads 01 from right to left.
 * Therefore it is not a palindrome. Follow up:
 * 
 * Could you solve it without converting the integer to a string?
 */


 /***************************** JAVA *************************************/
class Playground {
    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
    }

    public static boolean isPalindrome(int x) { // x = 1221
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int reverse = 0;
        int iteration = 0;
        while (x > reverse) {
            System.out.println("Iteration: " + iteration);
            System.out.println("X : " + x);
            int lastDigit = x % 10; // Get the last digit // 1
            System.out.println("Pop : " + lastDigit);
            reverse = reverse * 10 + lastDigit; // add decimal plase to right, then add lastDigit
            x /= 10; // Remove last digit
            System.out.println("Reverse: " + reverse);
            System.out.println("X At End : " + x);
            System.out.println();
            ++iteration;
        }

        System.out.println(x);
        // When the length is an odd number, we can get rid of the middle digit by
        // revertedNumber/10
        // For example when the input is 12321, at the end of the while loop we get x =
        // 12, revertedNumber = 123,
        // since the middle digit doesn't matter in palidrome(it will always equal to
        // itself), we can simply get rid of it.
        return ((x == reverse) || (x == reverse / 10));
    }
}

 /***************************** SWIFT *************************************/
func isPalindrome(_ x: Int) -> Bool {
    if (x < 0 || (x % 10 == 0 && x != 0)) {
        return false
    }

    var original = x
    var reverse = 0
    
    while original > reverse {
        let last = original % 10  // take last digit from original
        reverse = reverse * 10 + last  // move decimal one place right && add last digit
        original = original / 10  // remove last digit from original
    }

    return (original == reverse || (original == reverse / 10))
}

print(isPalindrome(1001))

 /***************************** JAVASCRIPT *************************************/
 function isPalindrome(x) {
    if (x < 0 || ((x % 10 == 0) && x != 0)) {
      return false
    }
  
    var reverse = 0
    while (x > reverse) {
      console.log(`x = ${x}`)
      var last = x % 10
      console.log(`last = ${last}`)
      reverse = reverse * 10 + last
      x = Math.floor(x / 10)
      console.log(`reverse = ${reverse}`);
      console.log(`x At End = ${x}`);
      console.log();
    }
  
    return ((x == reverse) || (x == Math.floor(reverse / 10)))
  }
  
  isPalindrome(00100)
