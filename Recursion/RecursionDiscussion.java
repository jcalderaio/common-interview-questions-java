//package Recursion;
//
//public static int factorial(int n) {
//    if (n == 0 || n == 1) { //base case
//        return 1;
//    }
//    else if (n > 1) { //recursive case
//        return n * factorial(n - 1); //recusrive step
//    }
//    return 0;
//}
//
///*
// * base case- stopping point, when do we want to stop using recistion? 
// * recursive case - the case in which we want to contuinue using recursion
// * recusrive step - actual act of doing/performing recursion
// */
//
//n = 7
//
//7*6*5*4*3*2*1
//
//
//(jonathan board)
//(1) factorial(4)
//    n=4
//    4*factorial(3)
//    
//    (2) factorial(3)
//        n=3
//        3*factorial(2)
//        
//        (3) factorial(2)
//            n=2
//            2*factorial(1)
//            
//            (4) factorial(1)
//                base case, so return 1  ^
//                
//                
//                
//                
//                
//                
//              
//public static int Fibonacci(int n) {
//    if (n == 0 || n == 1) {
//        return n;
//    }
//    else {
//        return Fibonacci(n - 1) + Fibonacci(n - 2); 
//    }  
//  }
//  
//  
//  
//  
//  
//  
//public static int recursiveMethod2(int n) {
//    int result;
//
//    if(n <= 1) { //base case
//      result = 0;
//    }
//    else if((n % 2) == 0) { //recursive case
//      result = n * n + recursiveMethod2(n - 1); //recursive step
//    }
//    else { //recursive case
//      result = recursiveMethod2(n - 1); //recursive step
//    }
//    return result;
//  }
//  
//  
//  
// public static int recursiveMethod1(int a[]) {
//     return recursiveMethod1(a, 1, a[0]);
//  }
//  public static int recursiveMethod1(int a[], int index, int data) {
//    if (index < a.length) {  //recursive case
//      if (data < a[index]) {
//        data = a[index];
//      }
//      data = recursiveMethod1(a, (index + 1), data);
//    }
//    return data;
//  }
//  
//  index >= a.length
//  
//  
//  
// 
// 
//            
//            
//
