class SumSquareDifference {
  static int grade=100 ;
  public static void main(String[] args) {
    long squareSum = (long) Math.pow(grade * (grade + 1) / 2, 2) ;
    long sumSquare = 0 ;
    for (int i=1; i<=grade; i++) {
      sumSquare += Math.pow(i, 2) ;
    }
    System.out.println(">> " + squareSum + " " + sumSquare+ " " + (squareSum - sumSquare)) ;
  }
}
