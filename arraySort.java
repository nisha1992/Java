class arraySort
{
public void arraySort(int a[],int b[],int m,int n)
{
int j=0;
for(int i=0;i<m;i++)
{
if(a[i] > b[j])
{
int temp=a[i];
a[i]=b[j];
while(true)
{
if(b[j] <= temp)
{
j++;
if(j==n)
break;
b[j-1]=b[j];
}
else
break;
}
b[j-1]=temp;
j=0;
}
}
for(int i=0;i<m;i++)
System.out.println("array a"+" "+a[i]);

for(int i=0;i<n;i++)
System.out.println("array b"+" "+b[i]);  
}

public static void main(String arg[])
{
arraySort obj=new arraySort();
int ar[]={23,43,145,189};
int br[]={412,415,1147};
obj.arraySort(ar,br,4,3);
}
}
