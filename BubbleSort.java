import java.util.*;
public class Bubblesort{
  public static void main(String []args){
        int temp; 
        int a[] = {20,15,9,12,7,1};
        for(int i=0;i<a.length-1;i++)
        {
            for(int j=0;j<a.length-1-i;j++)
            {
                if(a[j]>a[j+1])
                {
                  temp=a[j+1];
                  a[j+1]=a[j];
                  a[j]=temp;  
                }  
            }
        }
        for(int i=0;i<a.length;i++)
        {
         System.out.println(""+a[i]);
        }
    }
}

