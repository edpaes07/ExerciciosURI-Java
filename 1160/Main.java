import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        int T = leitor.nextInt();
        int PA, PB, anos;
        double G1, G2;
        for (int i = 1; i <= T; i++) {
        	anos = 0;
        	PA = leitor.nextInt();
        	PB = leitor.nextInt();
        	G1 = leitor.nextDouble();
        	G2 = leitor.nextDouble();
        	while ((PA <= PB) && (anos <= 100)) {
        		PA = (int)Math.floor(PA * (1 + (G1 / 100)));
                PB = (int)Math.floor(PB * (1 + (G2 / 100)));
        		anos++;
        	}
        	if (anos > 100) {
        		System.out.println("Mais de 1 seculo.");
        	} else {
        		System.out.println(anos + " anos");
        	}
        }
    }
}