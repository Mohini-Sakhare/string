
//For a given set of string, print the largest string 
// using compareTo() and compareToIgnoreCase() function
//find string in lexicographic order means m>b>a
//compsrision between letters

public class largeststring 
{
   public static void main(String args[])
   {
    String fruits[]={"apple","Mango","banana"};
    String largest=fruits[0];

    for(int i=0; i<fruits.length; i++)
    {
        if(largest.compareToIgnoreCase(fruits[i])<0)
        {
            largest=fruits[i];
        }
    }
    System.out.println(largest);
   } 
}
