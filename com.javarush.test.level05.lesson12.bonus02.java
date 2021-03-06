package com.javarush.test.level05.lesson12.bonus02;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Нужно добавить в программу новую функциональность
Задача: Программа вводит два числа с клавиатуры и выводит минимальное из них на экран.
Новая задача: Программа вводит пять чисел с клавиатуры и выводит минимальное из них на экран.
*/

public class Solution
{

    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] a = {
                Integer.parseInt(reader.readLine())
                        ,Integer.parseInt(reader.readLine())
                        ,Integer.parseInt(reader.readLine())
                        ,Integer.parseInt(reader.readLine())
                        ,Integer.parseInt(reader.readLine())
        };

        int minimum = Min(a);

        System.out.println("Minimum = " + minimum);
    }


    public static int min(int a, int b)
    {
        return a < b ? a : b;
    }

    public static int Min(int[] arr) {
        if (arr.length>0) {
            int min = arr[0];
            for(int el:arr) {
                if (el<min) min=el;
            }
            return min;
        }
        else
            throw new IllegalArgumentException();
    }
}
