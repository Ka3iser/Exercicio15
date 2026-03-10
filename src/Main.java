import com.ebac.degraus;

import java.util.Scanner;

public class Main {
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        int quantidadeDegraus;

        System.out.println("Quantos degraus você deseja subir?");
        quantidadeDegraus = input.nextInt();

        degraus degraus = new degraus(quantidadeDegraus);

    }
}
