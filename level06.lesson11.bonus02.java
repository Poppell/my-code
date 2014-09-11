package com.javarush.test.level06.lesson11.bonus02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* Нужно добавить в программу новую функциональность
Задача: У каждой кошки есть имя и кошка-мама. Создать класс, который бы описывал данную ситуацию. Создать два объекта: кошку-дочь и кошку-маму. Вывести их на экран.
Новая задача: У каждой кошки есть имя, кошка-папа и кошка-мама. Изменить класс Cat так, чтобы он мог описать данную ситуацию.
Создать 6 объектов: маму, папу, сына, дочь, бабушку(мамина мама) и дедушку(папин папа).
Вывести их всех на экран в порядке: дедушка, бабушка, папа, мама, сын, дочь.

Пример ввода:
дедушка Вася
бабушка Мурка
папа Котофей
мама Василиса
сын Мурчик
дочь Пушинка

Пример вывода:
Cat name is дедушка Вася, no mother, no father
Cat name is бабушка Мурка, no mother, no father
Cat name is папа Котофей, no mother, father is дедушка Вася
Cat name is мама Василиса, mother is бабушка Мурка, no father
Cat name is сын Мурчик, mother is мама Василиса, father is папа Котофей
Cat name is дочь Пушинка, mother is мама Василиса, father is папа Котофей
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String GFname = reader.readLine();
        String GMname = reader.readLine();
        String Fname = reader.readLine();
        String Mname = reader.readLine();
        String Sname = reader.readLine();
        String Dname= reader.readLine();


       Cat GF = new Cat(GFname, null, null);
        Cat GM = new Cat(GMname, null, null);
        Cat F = new Cat(Fname, GFname, null);
        Cat M = new Cat(Mname, null, GMname);
        Cat S = new Cat(Sname, Fname, Mname);
        Cat D = new Cat(Dname, Fname, Mname);

        System.out.println(GF);
        System.out.println(GM);
        System.out.println(F);
        System.out.println(M);
        System.out.println(S);
        System.out.println(D);
    }

    public static class Cat
    {
        private String name;
        private Cat F;
        private Cat M;

        Cat(String name)
        {
            this.name = name;
        }

        Cat(String name, Cat F, Cat M)
        {
            this.name = name;
            this.F = F;
            this.M = M;
        }


        @Override
        public String toString()
        {
            if ((M == null) && (F == null))
                return "Cat name is " + name + ", no mother, no father ";
            else if((M == null) && (F != null))
                return "Cat name is " + name + ", no mother, father is " + F.name;
            else if((M != null) && (F == null))
                return "Cat name is " + name + ", mother is " + M.name + ", no father";
            else
                return "Cat name is " + name + ", morher is " + M.name + ", father is " + F.name;
        }
    }
}
