import java.util.Arrays;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        //task1();
        //task2();
        //task3();
        //task4();
        //task5();
        //task6();
        //task7();
        //task8();
        //task9();
        //task10();
        //task11();
        //task12();
        //task13();
        //task14();
        //task15();
        //task16();
        //task17();
        //task18();
        //task19();
        //task20();
    }

    // Задача 1: Четное или нечетное число
    public static void task1()
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите целое число: ");
        int num = in.nextInt();

        if(num % 2 != 0)
        {
            System.out.println("Число нечетное.");
        }
        else
        {
            System.out.println("Число четное.");
        }

        in.close();
    }

    // Задача 2: Минимальное из трех чисел
    public static void task2()
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        int num1 = in.nextInt();

        System.out.print("Введите второе число: ");
        int num2 = in.nextInt();

        System.out.print("Введите третье число: ");
        int num3 = in.nextInt();

        if(num1<num2 && num1<num3)
        {
            System.out.println("Минимальное число: " + num1);
        }
        else if (num2<num1 && num2<num3)
        {
            System.out.println("Минимальное число: " + num2);
        }
        else
        {
            System.out.println("Минимальное число: " + num3);
        }

        in.close();
    }

    // Задача 3: Таблица умножения на 5
    public static void task3()
    {
        int num = 5;

        for(int i = 1; i <= 10; i++)
        {
            int res = i * num;
            System.out.println(num + "*" + i + "=" + res);
        }
    }

    // Задача 4: Сумма чисел от 1 до N
    public static void task4()
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите целое число: ");
        int num = in.nextInt();

        int sum = 0;

        for(int i = 1; i <= num; i++)
        {
            sum += i;
        }
        System.out.println("Сумма всех чисел от 1 до N: " + sum);

        in.close();
    }

    // Задача 5: Число Фибоначчи
    public static void task5()
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите целое число: ");
        int N = in.nextInt();

        int[] nums = new int[N];
        nums[0] = 0;
        nums[1] = 1;

        for (int i = 2; i < N; i++)
        {
            nums[i] = nums[i-1] + nums[i-2];
        }

        for (int i = 0; i < N; i++)
        {
            System.out.println(nums[i]);
        }

        in.close();
    }

    // Задача 6: Проверка простого числа
    public static void task6()
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите целое число: ");
        int num = in.nextInt();

        boolean flag = true;
        if(num < 2)
        {
            System.out.println("Число " + num + " не является простым");
            return;
        }

        for(int i = 2; i < num; i++)
        {
            if(num % i == 0)
            {
                flag = false;
                break;
            }
        }
        if(flag == true)
        {
            System.out.println("Число " + num + " является простым");
        }
        else
        {
            System.out.println("Число " + num + " не является простым");
        }

        in.close();
    }

    // Задача 7: Обратный порядок чисел
    public static void task7()
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите целое число: ");
        int num = in.nextInt();

        for (int i = num; i > 0; i--)
        {
            System.out.println(i);
        }

        in.close();
    }

    // Задача 8: Сумма четных чисел
    public static void task8()
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите целое число A: ");
        int num1 = in.nextInt();

        System.out.print("Введите целое число B: ");
        int num2 = in.nextInt();

        int sum = 0;

        for (int i = num1; i <= num2; i++)
        {
            if(i % 2 == 0)
            {
                sum += i;
            }
        }
        System.out.println("Сумма четных чисел в диапазоне от " + num1 + " до " + num2 + ": " + sum);

        in.close();
    }

    // Задача 9: Реверс строки
    public static void task9()
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String text = in.nextLine();

        for(int i = text.length()-1; i >= 0; i--)
        {
            char l = text.charAt(i);
            System.out.print(l);
        }

        in.close();
    }

    // Задача 10: Количество цифр в числе
    public static void task10()
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите целое число: ");
        int num = in.nextInt();

        int count = 0;

        while(num > 0)
        {
            num /= 10;
            count++;
        }
        System.out.println(count);

        in.close();
    }

    // Задача 11: Факториал числа
    public static void task11()
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите целое число: ");
        int num = in.nextInt();

        int fact = 1;

        for(int i = 1; i <= num; i++)
        {
            fact *= i;
        }

        System.out.println(fact);

        in.close();
    }

    // Задача 12: Сумма цифр числа
    public static void task12()
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите целое число: ");
        int num = in.nextInt();

        int sum = 0;

        while(num > 0)
        {
            sum += num % 10;
            num /= 10;
        }
        System.out.println(sum);

        in.close();
    }

    // Задача 13: Палиндром
    public static void task13()
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String text1 = in.nextLine();

        String text2 = "";

        for(int i = text1.length()-1; i >= 0; i--)
        {
            char l = text1.charAt(i);
            text2 += l;
        }

        if(text1.equalsIgnoreCase(text2) == true)
        {
            System.out.println("Строка является палиндромом");
        }
        else
        {
            System.out.println("Строка не является палиндромом");
        }

        in.close();
    }

    // Задача 14: Найти максимальное число в массиве
    public static void task14()
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int num = in.nextInt();
        System.out.println("Введите " + num + " чисел: ");
        int[] nums = new int[num];

        for (int i = 0; i < num; i++)
        {
            nums[i] = in.nextInt();
        }

        System.out.println("Максимальное число в массиве: " + Arrays.stream(nums).max().getAsInt());

        in.close();
    }

    // Задача 15: Сумма всех элементов массива
    public static  void task15()
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int num = in.nextInt();
        System.out.println("Введите " + num + " чисел: ");
        int[] nums = new int[num];

        for (int i = 0; i < num; i++)
        {
            nums[i] = in.nextInt();
        }

        System.out.println("Сумма всех элементов массива: " + Arrays.stream(nums).sum());

        in.close();
    }

    // Задача 16: Количество положительных и отрицательных чисел
    public static void task16()
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int num = in.nextInt();
        System.out.println("Введите " + num + " чисел: ");
        int[] nums = new int[num];

        for (int i = 0; i < num; i++)
        {
            nums[i] = in.nextInt();
        }

        int pol = 0;
        int otr = 0;
        int zero = 0;

        for (int i = 0; i < num; i++)
        {
            if(nums[i] > 0)
            {
                pol++;
            } else if (nums[i] < 0)
            {
                otr++;
            }
            else
            {
                zero++;
            }
        }

        System.out.println("Количество положительных чисел в массиве: " + pol);
        System.out.println("Количество отрицательных чисел в массиве: " + otr);
        System.out.println("Количество нулей в массиве: " + zero);

        in.close();
    }

    // Задача 17: Простые числа в диапазоне
    public static void task17()
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите целое число A: ");
        int num1 = in.nextInt();

        System.out.print("Введите целое число B: ");
        int num2 = in.nextInt();

        for(int i = num1; i <= num2; i++)
        {
            boolean flag = true;

            if(i < 2)
            {
                continue;
            }

            for(int j = 2; j < i; j++)
            {
                if(i % j == 0)
                {
                    flag = false;
                    break;
                }
            }
            if(flag == true)
            {
                System.out.println("Число " + i + " является простым");
            }
            else
            {
                continue;
            }
        }

        in.close();
    }

    // Задача 18: Подсчет гласных и согласных в строке
    public static void task18()
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите строку: ");
        String str = in.nextLine();

        str = str.toLowerCase();

        int countVow = 0;
        int countСonson  = 0;

        for (int i = 0; i < str.length(); i++)
        {
            if("аеёиоуыэюя".indexOf(str.charAt(i)) != -1)
            {
                countVow++;
            }
            else if ("бвгджзйклмнпрстфхцчшщ".indexOf(str.charAt(i)) != -1)
            {
                countСonson++;
            }
        }

        System.out.printf("В строке %d гласных и %d согласных", countVow, countСonson);

        in.close();
    }

    // Задача 19: Перестановка слов в строке
    public static void task19()
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите строку: ");
        String str = in.nextLine();

        String[] mass = str.split(" ");

        for (int i = 0; i < mass.length / 2; i++)
        {
            String tmp = mass[i];

            mass[i] = mass[mass.length - 1 - i];
            mass[mass.length - 1 - i] = tmp;
        }

        String newStr = "";
        for (String s : mass)
        {
            newStr += s + ' ';
        }
        newStr = newStr.trim();

        System.out.println(newStr);

        in.close();
    }

    // Задача 20: Число Армстронга
    public static void task20()
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите целое число: ");
        int num = in.nextInt();
        int testNum = num;

        int count = 0;

        while (testNum > 0)
        {
            testNum /= 10;
            count++;
        }

        testNum = num;
        int sum = 0;

        while (testNum > 0)
        {
            sum += Math.pow((testNum % 10), count);
            testNum /= 10;
        }

        if (sum == num)
        {
            System.out.println("Число " + num + " является числом Армстронга.");
        }
        else
        {
            System.out.println("Число " + num + " не является числом Армстронга.");
        }

        in.close();
    }
}