public class Staticvariable
{  
   int rollno;  
   String name;  
   static String college ="ITS";  
     
   Staticvariable(int r,String n)
   {  
   rollno = r;  
   name = n;  
   }  
 void display (){System.out.println(rollno+" "+name+" "+college);}  
  
 public static void main(String args[])
 {  
	 Staticvariable s1 = new Staticvariable(111,"Karan");  
	 Staticvariable s2 = new Staticvariable(222,"Aryan");  
   
 s1.display();  
 s2.display();  
 }  
}  