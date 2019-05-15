import java.util.*;
public class SelectionSort
{
    public static void main(String args[])
    {
        int temp,j;
        int a[]={12,5,7,6,1,2};
        for(int i=0;i<a.length-1;i++)
        {
            int min_index = i;
            {
                for(j=i+1;j<a.length;j++)
                {
                    if(a[j]<a[min_index])
                    {
                        temp=a[j];
                        a[j]=a[min_index];
                        a[min_index]=temp;
                    }
                }
            }
        }
        for(int i=0;i<a.length;i++)
        {
            System.out.println("Sorted array is "+a[i]);
        }
    }
}
