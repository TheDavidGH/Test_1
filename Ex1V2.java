import java.util.Scanner;

public class Ex1V2 {

    static final int[] meses = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int dia, mes, res;
        int casos = s.nextInt();

        while (casos-- != 0) {

            dia = s.nextInt();
            mes = s.nextInt();

            res = meses[mes-1] - dia;
            for (int i = mes; i < 12; i++) res += meses[i];

            System.out.println( res );
        }

    }

}
System.out.println(‘Hola, Sóc <el teu DAVID JORDA’);