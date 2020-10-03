import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main {
    
    public static void main(String[] args) throws IOException {
    
        //leitura de input:
        InputStreamReader inputReader = new InputStreamReader(System.in); //reader = da onde pegarei informação
        BufferedReader buffer = new BufferedReader(inputReader); //buffer = onde a informação será guardada

        int N = Integer.parseInt(buffer.readLine());

        for(int i = 0; i < N; i++) {
            String frase = buffer.readLine().trim();
        
            String palavras[] = frase.split("\\s+"); 

            for (String inicial : palavras) {
                System.out.print(inicial.substring(0, 1).toLowerCase());
            }
            System.out.println("");
        }
    }
}