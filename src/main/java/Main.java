import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        while (true){
            int x = scanner.nextInt();

            if (x != 0){
                throw new IOException();
            }
        }


    }
}
