/*
Given a 32-bit signed integer, reverse digits of an integer.

Example 1:

Input: 123
Output: 321
Example 2:

Input: -123
Output: -321
Example 3:

Input: 120
Output: 21
Note:
Assume we are dealing with an environment which could only store integers within the 32-bit signed integer range: [−2^(31),  2^(31) − 1]. For the purpose of this problem, assume that your function returns 0 when the reversed integer overflows.

    ex1. x = -75
    0
    x = -75
    pop = -5
    x = -7
    rev = -5
    
    1
    x = -7
    pop = -7
    x = 0
    rev = -57
    
    ex1. x = 57
    0
    x = 57
    pop = 7
    x = 5
    rev = 7
    
    1
    x = 5
    pop = 5
    x = 0
    rev = 75
*/

class Playground {
  public static void main(String[] args) {
      // System.out.println(reverse(2147483647));
      System.out.println(reverse(7463847412));
      // System.out.println(reverse(2147483647));
  }

  public static int reverse(int x) {
      int rev = 0;

      while (x != 0) {
          int pop = x % 10; // To get the number in ones place (furthest right number)
          x = x / 10; // Delete farthest right number (in ones place)

          if (rev < Integer.MIN_VALUE / 10 || (rev == Integer.MIN_VALUE / 10 && pop < -8)) {
              // Delete last digit of Integer.Min_Value. So -2147483648 >> -214748364. This is
              // because rev is not all built yet. Also, if rev == min_value/10 (if rev ==
              // -214748364) and the next digit to add (pop) is less than -8, return 0.
              return 0;
          }

          if (rev > Integer.MAX_VALUE / 10 || (rev == Integer.MAX_VALUE / 10 && pop > 7)) {
              // Delete last digit of Integer.Max_Value. So 2147483647 >> 214748364. This is
              // because rev is not all built yet. Also, if rev == max_value/10 (if rev ==
              // 214748364) and the next digit to add (pop) is more than 7, return 0.
              return 0;
          }

          rev = rev * 10 + pop;
          // Add digit (0) in ones place, then add pop. If rev = 7, then 7*10 = 70 (to
          // shift 1 digit to right), then add pop to the ones digit. So if pop = 7, then
          // temp = 70 + 7 = 77
      }

      return rev;
  }
}