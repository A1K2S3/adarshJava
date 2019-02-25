class practise{
     public static void main( String args[] ) {

          try {
               double a=10,b=0 ;
               // a = Double.parseDouble(args[0]);
               // b = Double.parseDouble(args[1]);
               a /= b;
               System.out.println(a);
          } catch (ArithmeticException e) {
               System.out.println("Cannot divide by zero!");
          }
          
     }
}