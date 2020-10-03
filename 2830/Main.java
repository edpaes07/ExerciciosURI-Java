import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main {
    
    public static void main(String[] args) throws IOException {
        
        InputStreamReader inputReader = new InputStreamReader(System.in); //reader = da onde pegarei informação
        BufferedReader buffer = new BufferedReader(inputReader); //buffer = onde a informação será guardada
        
        int K = Integer.parseInt(buffer.readLine().trim());
        int L = Integer.parseInt(buffer.readLine().trim());

        if(K >= 1 && K <= 16 && L >= 1 && L <= 16 && K != L) { //K e L devem estar entre 1 e 16, além de serem distintos

            if((L - 1)/2 == (K - 1)/2) {
                System.out.println("oitavas");
            } else if ((L - 1)/4 == (K - 1)/4) {
                System.out.println("quartas");
            } else if ((L - 1)/8 == (K - 1)/8) {
                System.out.println("semifinal");
            } else if((K <= 8 && L >= 9) || (L <= 8 && K >= 9)) {
                System.out.println("final");
            }
        }
    }
}