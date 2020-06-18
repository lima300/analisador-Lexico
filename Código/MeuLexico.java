import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class MeuLexico {
    public static void main(String[] args) throws IOException {
        InputStream inputstream = new FileInputStream("Fatorial.txt");
        InputStreamReader isr = new InputStreamReader(inputstream);
        BufferedReader programa = new BufferedReader(isr);

        Lexico lexico = new Lexico();
        lexico.setInput(programa);

        try {
            Token t = null;
            while ((t = lexico.nextToken()) != null) {
                System.out.println(t.toString());
            }
        } catch (LexicalError e) {
            System.err.println(e.getMessage() + "em" + e.getPosition());
        }
    }
}