import java.util.ArrayList ;

class NthPrime {
  static int grade=10001 ;
  public static void main(String[] args) {
    ArrayList<Long> list = new ArrayList<Long>() ;
    long candidate = 2 ;
    while (list.size() < grade) {
      boolean notPrime = false ;
      for (Long i : list) {
        if (candidate % i == 0) {
          notPrime = true ;
          break ;
        }
      }
      if (!notPrime) {
        list.add(candidate) ;
        System.out.println("> " + list.get(list.size() -1)) ;
      }
      candidate++ ;
    }
    System.out.println(">>> " + list.get(list.size() -1)) ;
  }
}
