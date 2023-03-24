public class VariablesFunctions  // Klasa
{
    // Reprezentacja Liczb
    byte b = 127 ; // -127 to 128
    short s = 32767 ; // -32768 to 32767
    int i = - 2147483648 ; // -2147483648 to 2147483647
    long l = -2^63l ; // -2^63 to (2^63)-1
    float f = -3.4444f ; // -3.4*10^38 to 3.4*10^38
    double d = 45.582058830002784 ; // -1.8*10^108 to -1.8*10^108
    // Reprezentacja Znaków
    char c = 'f' ; // Pojedynczy znak
    String string = "Szklana Pogoda" ; // Dowolny Ciag Znaków 


    //public static void main(String[] args) 
    //{
        //int wynik = 5;
        //float czas = 2.4686f ;
        //System.out.println( "zmienna = " + czas);
        //System.out.println( "wynik = " + wynik + wynik);
    //}

    public static void main(String[] args) // Metoda
    {//byte b1 = 127 ;
        //b1++;
        //b1++;
        //System.out.println(b1);

        int wynik1, wynik2 , wynik3 , wynik4 , wynik5;
        int a = 120 ;
        int b = 54 ; 
        
        wynik1 = a - b ;
        wynik2 = a + b ;
        wynik3 = a * b ;
        wynik4 = a / b ;
        wynik5 = a%b ;
        System.out.println("Wynik = " + wynik1);
        System.out.println("Wynik = " + wynik2);
        System.out.println("Wynik = " + wynik3);
        System.out.println("Wynik = " + wynik4);
        System.out.println("Wynik = " + wynik5);
        wynik5++;
        wynik5++;
        wynik5++; // Inkrementacja
        System.out.println("Wynik = " + wynik5);
        wynik1--;
        wynik1--;
        wynik1--; // Dekrementacja
        System.out.println("Wynik = " + wynik1);

    }
}