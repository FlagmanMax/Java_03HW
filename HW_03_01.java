// Пусть дан произвольный список целых чисел, удалить из него четные числа

import java.util.Random;
import java.util.ArrayList;

public class HW_03_01 
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

        for (int i=0;i<list.size();i++)
        {
            if (list.get(i) % 2 == 0)
            {
                list.remove(i);
                i--;
            }
        }
        System.out.println("Массив нечетных чисел:");
        System.out.println(list);
       
    }
}