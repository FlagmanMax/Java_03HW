// 3)(Дополнительное) Реализовать алгоритм сортировки слиянием (Дополнительное)

import java.util.Random;
import java.util.ArrayList;

public class HW_03_03 
{
    public static void main(String[] args) 
    {
        Random rnd = new Random();

        int len = rnd.nextInt(31);
        System.out.printf("Длина массива = %d\n", len);
        System.out.println("Массив случайных чисел:");

        ArrayList<Integer> list = new ArrayList<Integer>();

        for (int i=0;i<len;i++)
        {
            list.add(rnd.nextInt(101));
        }
        System.out.println(list);

        Integer[] arrInt = new Integer[len];
        arrInt = list.toArray(arrInt);

        mergeSort(arrInt,len);
        
        System.out.println("Отсортированный массив:");
        System.out.printf("[");
        for (int i=0;i<len;i++)
        {
            System.out.printf("%d",arrInt[i]);
            if (i != len-1)
            {
                System.out.printf(", ");
            }
        }
        System.out.printf("]");

    }
    public static void mergeSort(Integer[] arr, int n)
    {
        if (n<2)
        {
            return;
        }
        Integer mid = n/2;
        Integer[] left = new Integer[mid];
        Integer[] right = new Integer[n - mid];

        for (int i=0;i<mid;i++)
        {
            left[i] = arr[i];
        }

        for (int i=mid;i<n;i++)
        {
            right[i-mid] = arr[i];
        }
        mergeSort(left, mid);
        mergeSort(right, n - mid);

        merge(arr, left, right);
    }
    public static void merge(Integer[] arr, Integer[] left, Integer[] right)
    {
        int leftLen = left.length; 
        int rightLen = right.length; 
        int i = 0, j = 0, k = 0;

        while(i<leftLen && j<rightLen)
        {
            if (left[i] <= right[j])
            {
                arr[k++] = left[i++];
            }
            else
            {
                arr[k++] = right[j++];
            }
        }

        while (i < leftLen)
        {
            arr[k++] = left[i++];
        }

        while (j < rightLen)
        {
            arr[k++] = right[j++];
        }

    }
}
