import java.io.*;
class strCombination
{
sorting s=new sorting();
public void printCombination(char arr[], int n, int r)
{
    
   char data[]=new char[r];
   s.insertionSort(arr,n);
   combinationUtil(arr, data, 0, n-1, 0, r);
}

public void combinationUtil(char arr[], char data[], int start, int end, int index, int r)
{

    if (index == r)
    {
        for (int j=0; j<r; j++)
           System.out.print(data[j]);
        System.out.println();
        return;
    }
 
    for (int i=start; i<=end ;i++)
    {
       while(arr[i]==arr[i+1])
    i++;
        data[index] = arr[i];
        combinationUtil(arr, data, i+1, end, index+1, r);
        
    
    }
}

public static void main(String arg[])
{
    combination obj=new combination();
    char arr[] = {'1', '2', '3','4', '5'};
    int r = 3;
    int n = arr.length;
    obj.printCombination(arr, n-1, r);
}
}
