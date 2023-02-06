public class Main
{
    public static void main(String[] args)
    {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
        task9();
        task10();
    }
    public static void task1()
    {
        System.out.println("Task 1");
        for (int i=0; i<=10; i++)
        {
            System.out.println("Counting " +i);
        }
    }
    public static void task2()
    {
        System.out.println("Task 2");
        for (int i=10; i>0; i--)
        {
            System.out.println("Counting down " +i);
        }
    }
    public static void task3()
    {
        System.out.println("Task 3");
        for (int i=0; i<=17; i+=2)
        {
                System.out.println("Counting all even numbers " +i);
        }
    }
    public static void task4()
    {
        System.out.println("Task 4");
        for (int i=10; i>=-10; i--)
        {
            System.out.println("Counting down " +i);
        }
    }
    public static void task5()
    {
        System.out.println("Task 5");
        for (int i=1904; i<=2096; i++)
        {
            if (i % 4 == 0 && i % 100 != 0 || i % 400 == 0)
            {
                System.out.println(i + " is a leap year");
            }
        }
    }
    public static void task6()
    {
        System.out.println("Task 6");
        for (int i=7; i<=98; i+=7)
        {
            System.out.print(i+" ");
        }
        System.out.println();
    }
    public static void task7()
    {
        System.out.println("Task 7");
        for (int i=1; i<=512; i*=2)
        {
            System.out.print(i+" ");
        }
        System.out.println();
    }
    public static void task8()
    {
        System.out.println("Task 8");
        int savingsTotal=0;
        int savingsPerMonth=29000;
        for(int i=0; i<12; i++)
        {
            savingsTotal+= savingsPerMonth;
            System.out.println("Month number "+(i+1)+", savings amount = "+savingsTotal+" rubles.");
        }
    }
    public static void task9()
    {
        System.out.println("Task 9");
        float rate=(float)(0.12/12);
        float savingsTotal=0f;
        float savingsPerMonth=29000f;

        for(int i=0; i<12; i++)
        {
          savingsTotal+=savingsPerMonth;
          savingsTotal+= (savingsTotal*rate);
          System.out.println("Month number "+(i+1)+", savings amount with interest = "+savingsTotal+" rubles.");
        }
    }
    public static void task10()
    {
        System.out.println("Task 10");
        for (int i=1; i<=10; i++)
        {
            System.out.println("2 x "+ i+" = "+(i*2));
        }
    }
}