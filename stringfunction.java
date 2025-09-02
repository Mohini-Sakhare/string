
// String function- compare
public class stringfunction 
{
   public static void main(String args[])
   {
     String s1="mohini";
     String s2="mohini";
     String s3=new String("mohini");

     if(s1==s2)
     {
        System.out.println("String are equal");
     }
     else
     {
        System.out.println("Strings are not equal");
     }


     if(s1==s3)
     {
        System.out.println("String are equal");
     }
     else
     {
        System.out.println("Strings are not equal");
     }


     if(s1.equals(s3))
     {
        System.out.println("String are equal");
     }
     else
     {
        System.out.println("Strings are not equal");
     }
   }    
}
