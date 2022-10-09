package com.company;

public class Main {

    public static void main(String[] args) {
	String s = "Hello";
	//получение символа по его индексу
        System.out.println(s.charAt(2));
        // полученик массива символов из строки
        for(char c: s.toCharArray()){
            System.out.println(c);
        }
        //длина строки
        System.out.println(s.length());

        //строки в java-все иммутабельны(изменяемый)
        String s2 = s.toLowerCase();//приводит строку к нижнему регистру
        //абсолютно все модеоты в отношеннии строки не изменяют оргининальную строку
        System.out.println(s2);
        System.out.println(s);
        System.out.println(s.toUpperCase());
        //определение подстроки
        System.out.println(s.substring(3));
        System.out.println(s.substring(0,3));
        //замена одной подстроки на другую
        System.out.println(s.replace('l', '1'));
        System.out.println(s.replace("ll","LL"));
        System.out.println(s.replaceAll("o","0 "));
        // разбиение строки по указанным разделителям
        s = "java is evesome (no)";
        String[] words = s.split(" ");
        for(String  word : words){
            System.out.println(word);
        }
        //фоматирование строк
        String name = "Vasya";
        int age = 20;
        // флаги фоматирования
        // %s - подстановка строки
        // %d - подстановка целого числа
        // %f - подстановка веществкенного числа
        // %с - подстановка одного символа и т.д.
        // 1$ - повторение подстановки
        // %% - символ %
        String msg = String.format("45%% %2$s My name is %s. I'm %d years old. %1$s is a good boy", name, age);
        System.out.println(msg);
        System.out.printf("Age: %d\n",120);
        System.out.printf("%.10s \n", "hello");
        System.out.printf("%010d \n", 123);//для целых чисел точка не работает
        System.out.printf("%10.2f",3.1415);
        //таблица умножения
        System.out.println();
        for(int i = 1; i <=9; i++){
            for(int j = 1;j <=9;j++) {
                System.out.printf("%d x %d = %2d   ", j, i, i * j);
            }
            System.out.println();
        }
        // символы управления кареткой
        // \n - переход на новую строку
        // \t - символ табуляции
        // \b - backspase (удаляет предыдущий символ)

        System.out.print("\\Hello\nJava\t!!\b");

        String sss = "asdasd" + "asd";

        StringBuffer b = new StringBuffer(1024)//число это сколько количество символов я хучу выделить,если закончилось, то автоматом умножается на 2
        b.append("asdasd");
        b.append("asadasda");
        b.append("121212");
        // StringBuffer - потокобезопасный
        // StringBгilder - непотокобезопасный, в остальном они идентичны

    }
}
