package sparsearrays;

import java.util.*;
public class sparsearrays {

	public static void main(String[] args)
	   {
	      Scanner K=new Scanner(System.in);
	      int n=K.nextInt();
	      String a[]=new String[n];
	      for(int i=0;i<n;i++)
	      {
	          a[i]=K.next();
	      }
	      int n1=K.nextInt();
	      for(int j=0;j<n1;j++)
	      {
	          String b=K.next();
	          int cnt=0;
	          for(String l:a)
	          {
	              if(l.equals(b))
	              cnt++;
	          }
	          System.out.println(cnt);
	      }
	   }
	}
	   



