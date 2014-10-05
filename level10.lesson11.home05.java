
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/* Количество букв
Ввести с клавиатуры 10 строчек и подсчитать в них количество различных букв (для 33 букв алфавита).  Вывести результат на экран.
Пример вывода:
а 5
б 8
в 3
г 7
…
я 9
*/

public class Solution
{
    public static void main(String[] args)  throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //алфавит
        ArrayList<Character> alphabet = new ArrayList<Character>();
        for(int i=0;i<32;i++)
        {
            alphabet.add( (char) ('а'+i));
        }
        alphabet.add(6,'ё');

        //ввод строк
        ArrayList<String> list = new ArrayList<String>();
        for(int i=0;i<1;i++)
        {
            String s = reader.readLine();
            list.add( s.toLowerCase());
        }


        //Напишите тут ваш код
        ArrayList<Integer> score = new ArrayList<Integer>();
        for(int i = 0; i<alphabet.size(); i++){
        	score.add(0);
        }
        
        for(String string : list){
        	char [] charArray = string.toCharArray();
        	for(int j = 0; j < charArray.length; j++){
        		for(int n = 0; n < alphabet.size(); n++){
        			if(charArray[j] == alphabet.get(n)){
        				score.set(n, score.get(n)+1);
        			}
        		}
        	}
        }
        
        for(int n = 0; n < alphabet.size(); n++){
        	System.out.println(alphabet.get(n) + " " + score.get(n));
        }
        	
    }

}



import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/* Количество букв
Ввести с клавиатуры 10 строчек и подсчитать в них количество различных букв (для 33 букв алфавита).  Вывести результат на экран.
Пример вывода:
а 5
б 8
в 3
г 7
…
я 9
*/

public class Solution
{
    public static void main(String[] args)  throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //алфавит
        ArrayList<Character> alphabet = new ArrayList<Character>();
        for(int i=0;i<32;i++)
        {
            alphabet.add( (char) ('а'+i));
        }
        alphabet.add(6,'ё');

        //ввод строк
        ArrayList<String> list = new ArrayList<String>();
        for(int i=0;i<10;i++)
        {
            String s = reader.readLine();
            list.add( s.toLowerCase());
        }


        //Напишите тут ваш код
        HashMap<Character, Integer> alph = new HashMap<Character, Integer>();
        for(char a : alphabet){
            alph.put(a, 0);
        }

        for(String l1 : list){
            char [] charStr = l1.toCharArray();
            for(int i = 0; i < charStr.length; i++){
                for (Map.Entry<Character, Integer> alphP: alph.entrySet()) {
                    if(alphP.getKey().equals(charStr[i])){
                        alph.put(charStr[i], alphP.getValue()+1);
                    }
                }

            }
        }
        Map<Character, Integer> sortedMap = new TreeMap(alph);

        for(Map.Entry<Character, Integer> vvd : sortedMap.entrySet()){
            System.out.println(vvd.getKey() + " " + vvd.getValue());
        }

    }

}

