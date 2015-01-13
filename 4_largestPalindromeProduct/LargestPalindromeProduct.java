class LargestPalindromeProduct {
  public static void main(String[] args) {
    int number ;
    try { number = Integer.parseInt(args[0]) ; } 
    catch (Exception e) {
      usage() ; return ;
    }
    if (number < 1 || number > 3) {
      usage() ; return ;
    }
    int upper = (int) Math.pow(10, number) - 1 ;
    int lower = (int) Math.pow(10, number - 1) ;
    int largest = 0 ; int x = upper; int y = upper ; int candidate = x * y ;
    while (x >= lower && candidate > largest) {
      while (y >= lower && candidate > largest) {
        if (isPalindrome(candidate)) {
          largest = candidate ;
          System.out.println( ">> " + largest + " " + x + " " + y) ;
        }
        --y ; candidate = x * y ;
      }
      --x ; y = upper ; candidate = x * y ;
    }
    System.out.println(largest) ;
  }

  static void usage() {
    System.out.println("Usage: LargestPalindromeProduct <1, 2 or 3>") ;
  }

  static boolean isPalindrome(int number) {
    if (number % 10 == 0) return false ;
    int reverse = 0 ;
    int n = number ;
    int digit ;
    while (n>0) {
      digit = n % 10 ;
      reverse = 10 * reverse + digit ;
      n = (n - digit) / 10 ;
    }
    if (number == reverse) return true ;
    else return false ;
  }
}
