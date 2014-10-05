package com.luxoft.training.lab1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Random;
import java.lang.System;


public class ArraySorting
{

    public static void main(String[] args) throws IOException
    {

        System.out.println("Введите количество элементов массива");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(reader.readLine());
        int[] array = new int[count];
        Random random = new Random();
        for (int i = 0; i < count; i++)
        {
            array[i] = random.nextInt(100);
        }

        System.out.println("Исходный массив:");
        System.out.println(Arrays.toString(array));

        double sortTime;

        System.out.println("Результат пузырьковой сортировки:");
        sortTime = System.nanoTime();
        bubbleSort(array);
        sortTime = System.nanoTime() - sortTime;
        System.out.println("Время сортировки: " + sortTime);

        System.out.println("Результат быстрой сортировки:");
        sortTime = System.nanoTime();
        fastSort(array);
        sortTime = System.nanoTime() - sortTime;
        System.out.println("Время сортировки: " + sortTime);




    }

    public static void bubbleSort(int[] array)
    {
        boolean earlyShutdown = true;
        while (earlyShutdown)
        {
            earlyShutdown = false;
            for (int i = 0; i < array.length-1; i++)
            {
                if (array[i] > array[i+1])
                {
                    swap(array, i, i+1);
                    earlyShutdown = true;
                }
            }
        }

        System.out.println(Arrays.toString(array));
    }


    public static void fastSort(int[] array)
    {
        int start = 0;
        int end = array.length-1;
        int mid = (start+end)/2;

        int i = start;
        int j = end;

        while (i < j)
        {
            while ((i < mid) && (array[i] <= array[mid])) i++;
            while ((j > mid) && (array[j] >= array[mid])) j--;
            if (i < j)
            {
                swap(array, i, j);
                if (i == mid)
                {
                    mid = j;
                }
                else if (j == mid)
                {
                    mid = i;
                }
            }
        }

        System.out.println(Arrays.toString(array));
    }

    public static void swap(int[] array, int i, int j)
    {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
