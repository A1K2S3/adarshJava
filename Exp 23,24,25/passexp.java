class passexp{
     
     public static void main( String args[] ) {
          try {
               NumberFormatException ex = new NumberFormatException();
               ex.initCause(new NullPointerException("This is the Actual Cause of the exception"));
               throw ex;
          } catch (NumberFormatException ex) {
              System.out.println(ex);
              System.out.println(ex.getCause());
          }
     }

}