public class LoopsTables
{

    public static void main(String[] args)
    {
        int[] tab = new int[5]; // tablica jednowymiarowa
        tab[0] = 8;
        tab[1] = 40;
        tab[2] = 2;
        tab[3] = 1;
        tab[4] = 38;
        
        for (int i = 0; i<tab.length; i++) //pętla for (zmienna iterująca ; warunek końca pętli ; zwiększamy o jeden )
        {
             System.out.println("Element tablicy = " + tab[i]);
        }

        for (int i : tab) // pętla foreach (element iter. ; typ zmiennej)
        {
            System.out.println("Element Tablicy = " + i);
        }

        int n = 10;
        while (n>=0) // pętla while (warunek wykonania petli)
        {
            System.out.println("placki" + n);
            n--; // warunek zakończenia petli
        }

        do {
            System.out.println("tekst"); // petla do-while
            n++;                            // inkrementacja o 1
        } while (n<5); // warunek zakończenia pętli
        {
            System.out.println("finito");
        };

        int table[] [] = {{2,3,4}, {1,2,3}}; // tablica dwuwymiarowa

       for(int i = 0; i<table.length; i++) //pętla złożona
       {
            for (int j = 0; j<table[i].length; j++)
            {
                System.out.println(table[i][j]);
            }
       }

       for(int a = 5; a>0; a--) 
       {
            for (int b = 5; b<10; b++)
            {
                System.out.println("Zmienna a = " + a + " Zmienna b = " + b);
            }
       }

    }
}
