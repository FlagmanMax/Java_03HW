// 2) Задан целочисленный список ArrayList.
// Найти минимальное, максимальное и среднее ариф. из этого списка

import java.util.Random;
import java.util.ArrayList;

public class HW_03_02 
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

        if (len > 0)
        {
            int min = list.get(0);
            int max = list.get(0);
            int sum = 0;
            int current = 0;

            for (int i=0; i<len;i++)
            {
                current = list.get(i);
                if (current < min)
                {
                    min = current;
                }
                
                if (current > max)
                {
                    max = current;
                }

                sum += current;
            }
            float ave = (float)sum/len;

            System.out.printf("min = %d, max = %d, ave = %.3f",min,max,ave);
        }
        else
        {
            System.out.println("Длина массива = 0");
        }
    }
}
