import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        cadastraRebelde();
    }

    public static void cadastraRebelde() {
        Scanner sc = new Scanner(System.in);
        Rebelde rebeldeLombok = new Rebelde(sc.next(), sc.nextInt());
        System.out.println(rebeldeLombok);

        try {
            Rebelde.imprimirListaRebeldes(rebeldeLombok.getNome(), rebeldeLombok.getIdade());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }
}
