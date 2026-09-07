public class SelectionSortTutorial
{
    public static void main(String ARR[])
    {
        int arr[] = {5,4,1,3,2};
        for(int i = 0; i<arr.length-1;i++)
        {
            int minPosi = i; 
            for(int j = i+1; j<arr.length;j++)
            {
                if(arr[minPosi]>arr[j])
                {
                    minPosi = j; 
                }
            }
            int temp = arr[minPosi];
            arr[minPosi] = arr[i];
            arr[i] = temp;
        }
        for(int i = 0; i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
            System.out.println();

    }
}