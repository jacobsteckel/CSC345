//Jacob Steckel
//Homework 0 - References: JAVA

public class STO 
{
   //integer class
   static class Int 
   {
      int value;
      
      //value declaration
      public Int(int value) 
      {
         this.value = value;
      }
   
      //set integer value
      public void setInt(int value) 
      {
         this.value = value;
      }
      
      //get the integer value
      public int getInt() 
      {
         return value;
      }
   }
    
   //square the integer value
   private static int square(Int i) 
   {
      i.setInt(i.getInt() * i.getInt());

      return i.getInt();
   }
   
   //double the integer value
   private static int twice(Int i) 
   {
      i.setInt(2 * i.getInt());

      return i.getInt();
   }
   
   //integer value
   private static int once(Int i) 
   {
      return i.getInt();
   }
   
   //main
   public static void main(String[] args) 
   {
      Int x = new Int(3);
      int y = square(x) + twice(x) + once(x);
      System.out.println(y);
   }
}