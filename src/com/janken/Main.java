package com.janken;

import java.util.Scanner;

public class Main {
    static boolean lanjut(){
        Scanner input = new Scanner(System.in);
        char c;
        boolean loop = true;
        boolean result = false;
        while (loop){
            System.out.print("Lanjutkan permainan (y/n)? ");
            c = input.next().charAt(0);
            if (c == 'y' || c =='Y'){
                loop = false;
                result = true;
            } else if (c == 'n' || c == 'N'){
                loop = false;
                result = false;
            } else {
                System.out.print("Lanjutkan permainan (y/n)? ");
                c = input.next().charAt(0);
                loop = true;
                if (c == 'y' || c =='Y'){
                    loop = false;
                    result =  true;
                } else if (c == 'n' || c == 'N'){
                    loop = false;
                    result = false;
                } else {
                    loop = true;
                }
            }
        }

        return result;
    }
    public static void main(String[] args) {
        Game game = new Game();
        boolean ulang = true;
        while (ulang){
            game.mulai();
            ulang = lanjut();
        }
    }
}
