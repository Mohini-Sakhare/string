

//String function- substrings
public class substring 
{
   public static String substrings(String str, int si, int ei)
   {
     String substr="";
     for(int i=si; i<ei; i++)
     {
        substr+=str.charAt(i);
     }
     return substr;
   }
   
   public static void main(String args[])
   {
    //substring

    String str="mohinisakhare";
    System.out.println(substrings(str,0,6));

    //OR System.out.println(str.substrings(0,5))
   }   
}
