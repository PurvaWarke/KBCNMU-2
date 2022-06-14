import java.util.*;
class StringDemo
{
   public static void main(String args[])
   {
    String s1=new String("Hello");
    //string s1="Hello";
    System.out.println(s1);
   System.out.println(s1.trim());
   System.out.println(s1.length());
    System.out.println(s1.toUpperCase());
    System.out.println(s1.toLowerCase());
    System.out.println(s1.charAt(4));
    System.out.println(s1.indexOf('e'));
   System.out.println(s1.concat("world"));
    }

 }