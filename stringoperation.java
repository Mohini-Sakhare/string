public class stringoperation
{
    public static void printstr(String str)
    {
        for(int i=0; i<str.length(); i++)
        {
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println();
    }
    public static void main(String args[])
    {
        //creation of string 
        String fullname="mohini sakhare";

         //find out a length in given string
         System.out.println("Full length of string: " +fullname.length());

        //find out a single character in given string
        System.out.println("Single character of string in given index is: " +fullname.charAt(7));
       
        //how to print all letters in strings
        printstr(fullname);

    }
}