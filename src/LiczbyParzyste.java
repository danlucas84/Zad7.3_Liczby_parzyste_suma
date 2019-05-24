public class LiczbyParzyste
{

    public static void main(String[] args)
    {
        int i;
        int sum = 0;


        System.out.println("Program wyświetla liczby parzyste od 0 do 100");

        for (i = 0;  i< 101; i++)


        {

            if ( i< 101 && i%2==0)
                System.out.println(i +" ");

            if (i%2==0)
            sum = sum + i;
        }
        System.out.println("Wyswietlono sumę liczb parzystych od 0 do 100 - suma wynosi:" + sum);
    }
}



