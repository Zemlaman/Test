package educanet;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Zadejte cislo");
        int x = sc.nextInt();
        int output = 0;

        for(int y = 0; y <= x; y++){
            output = y * y;
            for(int w = 0; w < output; w++){
                System.out.print(" x ");
            }
            System.out.println(" ");
        }
        System.out.println(output);

    }
}

