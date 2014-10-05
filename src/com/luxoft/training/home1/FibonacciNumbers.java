package com.luxoft.training.home1;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class FibonacciNumbers
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите порядок вычисления");
        int count = Integer.parseInt(reader.readLine());

        int[] fibNumbers = new int[count];

        System.out.println("Рекурсивный метод:");
        for (int i = 0; i < count; i++)
        {
            fibNumbers[i] = recursiveFib(i);
        }
        System.out.println(Arrays.toString(fibNumbers));

        System.out.println("Итерационный метод:");
        for (int i = 0; i < count; i++)
        {
            fibNumbers[i] = iterativeFib(i);
        }
        System.out.println(Arrays.toString(fibNumbers));


    }

    public static int recursiveFib(int item)
    {
        if (item == 0)
        {
            return 0;
        }
        else
        {
            if ((item == -1) || (item == 1))
            {
                return 1;
            }
            else
            {
                if (item > 0)
                {
                    return recursiveFib(item - 1) + recursiveFib(item - 2);
                }
                else
                {
                    return recursiveFib(item + 2) - recursiveFib(item + 1);
                }
            }
        }
    }

    public static int iterativeFib(int item)
    {
        if (item == 0)
        {
            return 0;
        }
        else
        {
            if ((item == -1) || (item == 1))
            {
                return 1;
            }
            else
            {
                int x = 0;
                int y = 1;
                int result = 0 ;

                for (int i = 2; i <= item; i++)
                {
                    result = x + y;
                    x = y;
                    y = result;
                }
                return result;
            }

        }
    }
}
