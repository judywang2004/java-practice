package general;

//here are n stairs, a person standing at the bottom wants to reach the top.
// The person can climb either 1 stair or 2 stairs at a time. Count the number of ways, the person can reach the top.
/**
more Examples:

Input: n = 1
Output: 1
There is only one way to climb 1 stair

Input: n = 2
Output: 2
There are two ways: (1, 1) and (2)

Input: n = 4
Output: 5
(1, 1, 1, 1), (1, 1, 2), (2, 1, 1), (1, 2, 1), (2, 2)

We can easily find recursive nature in above problem. 
The person can reach n��th stair from either (n-1)��th stair 
or from (n-2)��th stair. 
Let the total number of ways to reach n��t stair be ��ways(n)��. The value of ��ways(n)�� can be written as following.

    ways(n) = ways(n-1) + ways(n-2)

The above expression is actually the expression for Fibonacci numbers, but there is one thing to notice, the value of ways(n) is equal to fibonacci(n+1).

ways(1) = fib(2) = 1
ways(2) = fib(3) = 2
ways(3) = fib(4) = 3

Generalization of the above problem
How to count number of ways if the person can climb up to m stairs for a given value m? For example if m is 4, the person can climb 1 stair or 2 stairs or 3 stairs or 4 stairs at a time.

We can write the recurrence as following.

   ways(n, m) = ways(n-1, m) + ways(n-2, m) + ... ways(n-m, m) 

*/

public class ClimbingSteps {

	
	 // A simple recursive program to find n'th fibonacci number
    static int fib(int n)
    {
       if (n <= 1)
          return n;
       return fib(n-1) + fib(n-2);
    }
     
    // Returns number of ways to reach s'th stair
    static int countWays(int s)
    {
        return fib(s + 1);
    }
 
 
    /* Driver program to test above function */
    public static void main (String args[])
    {
          int s = 4;
          System.out.println("Number of ways1 = "+ countWays(s));
    }

}

class stairs2
{
    // A recursive function used by countWays
    static int countWaysUtil(int n, int m)
    {
        if (n <= 1)
            return n;
        int res = 0;
        for (int i = 1; i<=m && i<=n; i++)
            res += countWaysUtil(n-i, m);
        return res;
    }
  
    // Returns number of ways to reach s'th stair
    static int countWays(int s, int m)
    {
        return countWaysUtil(s+1, m);
    }
 
 
    /* Driver program to test above function */
    public static void main (String args[])
    {
          int s = 4,m = 2;
          System.out.println("Number of ways2 = "+ countWays(s,m));
    }
}
