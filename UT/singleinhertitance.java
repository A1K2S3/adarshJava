class person{

     void details(String name, int age){

          String n = name;
          int a = age;
          System.out.println("Name = " + this.name);
          System.out.println("Age of "+ this.name + " is " + this.age);
          
     }
     
}
class employee extends person{

     void emp(String designation, int sal){

          String d = designation;
          int s = sal;
          System.out.println("Designation of "+ this.name +" is "+ this.d);
          System.out.println("Salary of "+ this.name + " is " + this.sal);
          
     }
     
}

class singleinhertitance extends employee{

     public static void main( String args[] ) {
          
          singleinheritance Adarsh = new singleinheritance();
          Adarsh.details("Adarsh",18);
          Adarsh.emp("Manager",30000);
          
     }
     
}