public class SelectionSortEx {
    public static void SelectionSort(int[] arr)
    {
       
        for(int j=i+1; j<arr.length; j++)
        {
            if(arr[j]<arr[index])
            {
                index=j;
            }
        }
        int smallerNumber = arr[index];
        arr[index] = arr[i];
        arr[i] = smallerNumber;
    }
    
}
public static void main(String args[])
{
    int[] arr1={9,14,3,2,43,11,58,22,};
    System.out.println("Before SelectionSort");
    for(int i:arr1)
    {
        System.out.println(i+" ");
    }
    System.out.println();

    SelectionSort(arr1);

    System.out.println("After Selection Sort");
    for(int i:arr1)
    {
        System.out.println(i+" ");
    }
}
