package com.luxoft.training.home1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Random;

public class ValuesSearch
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

        System.out.println("Введите искомое значение");
        int requiredValue = Integer.parseInt(reader.readLine());

        System.out.println("Исходный массив:");
        System.out.println(Arrays.toString(array));

        System.out.println("Отсортированный массив:");
        bubbleSort(array);

        System.out.println("Искомое значение под номером " + binarySearchRecursive(array, requiredValue, 0, count));

        System.out.println("Искомое значение под номером " + linearSearch(array, requiredValue));




    }

    public static int binarySearchRecursive(int[] array, int key, int left, int right)
    {
        int mid = left + (right - left) / 2;

        if (left >= right)
            return -(1 + left);

        if (array[mid] == key)
            return mid;

        else if (array[mid] > key)
            return binarySearchRecursive(array, key, left, mid);
        else
            return binarySearchRecursive(array, key, mid + 1, right);
    }

    public static int linearSearch(int[] array, int key)
    {
        for (int i = 0; i < array.length; i++)
        {
            if (array[i] == key)
                return i;

        }

        return -1;

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

    public static void swap(int[] array, int i, int j)
    {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
