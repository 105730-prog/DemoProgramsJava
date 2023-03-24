import java.util.Scanner;

public class Instructions
{
    public static void main(String[] args)
    {
        int c = 31;
        if(c>=-100) // Instrukcja Warunkowa IF (if , else if ,else)
        {
            if(c==8)
                System.out.println("c jest rowne 8");
            else if(c==30)
                System.out.println("c jest rowne 30");
            else if(c<0)
                System.out.println("c jest ujemne !");
            else
                System.out.println("wynik jest wyzszy niz 30");
        }
    
        int l = 4;

        switch (l) // Instrukcja switch(var.) case 
        {
            case 1:
                System.out.println("wynik jest równy 1");
                break;
            case 2:
                System.out.println("wynik jest równy 2");
                break;
            case 3:
                System.out.println("wynik jest równy 3");
                break;
            case 4:
                System.out.println("wynik jest równy 4");
                break;
            case 5:
                System.out.println("wynik jest równy 5");
                break;
            case 6:
                System.out.println("wynik jest równy 6");
                break;
            default:
                System.out.println("działanie jest nieprawidlowe #");
        }

        int f = 30 ;
        int g;
        g = f<10 ? -1 : 1; // Jeżeli f jest mniejsze do 10 przypisz jemu wartość -1 , przeciwnym wypadku wartość 1
        System.out.println(g);

        System.out.println(" ");

        for(int i = 0; i<12 ; i++)
        {
            System.out.println(i + " ");
            if(i==5) // jeżeli i jest równ. 5 to przerwij petle
                break;
        }

        System.out.println(" ");

        for(int i = 0; i<12 ; i++)
        {
            if (i%2==0) continue; // Jeżeli reszta z dzielenia przez 2 wynosi zero to it. zost. wydrk.
            System.out.println(i + " ");
        }

        System.out.println(" ");

        try (Scanner scanner = new Scanner(System.in)) {  //Wprowadzanie ciagu znaków do wiersza poleceń
            String name;

            name = scanner.next();

            System.out.println(name);
        }

    }
}