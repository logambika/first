import java.util.Scanner;
class a
{
public static void  main(String a[])
{
int n,i,j;
Scanner s=new Scanner(System.in)
System.out.println("enter the no of value");
n=s.nextInt();
System.out.println("enter the values");
for(i=0;i<n;i++)
a[i]=s.nextInt();
for(i=0;i<n-1;i++)
{
for(j=0;j<n;j++)
{
if(a[i]==a[j])
{
System.out.println(a[i]);
break;
}
}
}
}
}
