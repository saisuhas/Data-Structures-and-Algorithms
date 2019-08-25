import java.util.*;

public class BubbleSort{

     public static void main(String []args){
        int i,j,temp;
        int arr[] = {12,8,6,4,1};
        int size = arr.length;
        for(i=0;i<size-1;i++)
        {
            for(j=0;j<size-i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        for(i=0;i<size;i++)
        {
        System.out.println("Bubble sort is " +arr[i]);
        }
     }
}
