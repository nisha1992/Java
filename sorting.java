import java.util.*;
class sorting
{
  public void bubbleSort(int a[],int size)   //bubblesort
  {
   for(int j=size-1;j>=0;j--)
   {
    for(int i=0;i<j;i++)
    {
     if(a[i]>a[i+1])
     {
     int temp=a[i];
     a[i]=a[i+1];
     a[i+1]=temp;
     }
    }
   }
   System.out.println("Sorted array using bubblesort:");
   for(int i=0;i<size;i++)
   System.out.println(" "+a[i]);
  }

   public void selectionSort(int a[],int size)
   {
   int temp,min;
    for(int i=0;i<size-1;i++)
    {
    min=i;
     for(int j=i+1;j<size;j++)
     {
      if(a[min] > a[j])
      {
      min=j;
      }
     }
    temp=a[min];
    a[min]=a[i];
    a[i]=temp;
    } 
   System.out.println("Sorted array using selectionsort:");    //selectionsort
   for(int i=0;i<size;i++)
   System.out.println(" "+a[i]);
   }

   public char[] insertionSort(char a[],int size)     //insertionsort
  {
  char v;
   int j;
   for(int i=1;i<=size-1;i++)
   {
   v=a[i];
   j=i;
   while(j>=1 && a[j-1] > v)
   {
   a[j]=a[j-1];
   j--;
   }
   a[j]=v;
   }
   return a;
  /*System.out.println("Sorted array using insertionsort:");    
   for(int i=0;i<size;i++)
   System.out.println(" "+a[i]);*/
  }
  
  
 public void quickSort(ArrayList<String> a,int p,int r)   //sorting using quicksort
 {
 quick(a,p,r);
  //System.out.println("Sorted array using quicksort:");
   for(int i=0;i<a.size();i++)
   {
   String n=(String)a.get(i);
   System.out.println(" "+n);
 }
}

  public void quick(ArrayList<String> a,int p,int r)  
  {
  int q;
  if(p<r)
  q=partition(a,p,r);
  else
  return;
  quick(a,p,q-1);
  quick(a,q+1,r);
  }

  public int partition(ArrayList<String> a,int p,int r)
  {
  int i,j;
 String x="",temp="";
  x=(String)a.get(r);
  i=p-1;
  for(j=p;j<r;j++)
  {
  String n=(String)a.get(j);
  if(n.compareTo(x) < 0)
  {
  i++;
 
  temp=(String)a.get(j);
  a.set(j,(String)a.get(i));
  a.set(i,temp); 
  
  }
  }
   
  temp=(String)a.get(r);
  a.set(r,(String)a.get(i+1));
  a.set(i+1,temp);
  
  return i+1;
  } 
}
