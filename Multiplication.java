# Multiplication
import java.io.*;
import java.util.*;
public class Multiplication
{
public static void main(String args[])
{
int i,k;
Scanner sc=new Scanner(System.in);
i=Integer.parseInt(args[0]);
System.out.println("Table of "+i);
for(int j=1;j<10;j++)
{
k=i*j;
}
System.out.println("i+ * "+j+" = "+k);
}
}



