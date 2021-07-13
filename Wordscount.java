import java.util.*;
public class Wordscount
{
static void wordcount(String s)
{
int count=0,i;
char a[]=s.toCharArray();
for(i=0;i<a.length;i++)
{
if((s.charAt(i)==' ')&&(s.charAt(i+1)!=' '))
{
count++;
}
}
System.out.println(count+1);
}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter String : ");
String s=sc.nextLine();
System.out.print("Number of words in String are : ");
wordcount(s);
}
}

output:

Enter String : 
this is coding class
Number of words in String are : 4