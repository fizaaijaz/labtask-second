 class series {
 
       public static void main (String[] args){
       int n = 100, firstTerm = 0, secondTerm = 1;
     
       System.out.println("Fibonacci series Upto " + n + ":");

         while (firstTerm <= n) {
       System.out.print(firstTerm + ",");
 
       int nextTerm = firstTerm + secondTerm;
       firstTerm = secondTerm;
       secondTerm = nextTerm;
       }
    } 
  }
       