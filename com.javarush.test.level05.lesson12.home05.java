package com.javarush.test.level05.lesson12.home05;

/* Вводить с клавиатуры числа и считать их сумму
Вводить с клавиатуры числа и считать их сумму, пока пользователь не введёт слово «сумма». Вывести на экран полученную сумму.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //Напишите тут ваш код
        int suma;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //int i = Integer.parseInt(reader.readLine());
        while(true){
            if(checkString(reader.readLine())){
                break;
                System.out.println(suma);
            } else {
                int i = Integer.parseInt(reader.readLine());
                suma += i;
            }
        }
    }

    public static boolean checkString(String string) {
        try {
            Integer.parseInt(string);
        } catch (Exception e) {
            return false;
        }
        return true;
    }
}
