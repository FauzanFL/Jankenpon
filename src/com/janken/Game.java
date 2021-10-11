package com.janken;

import java.util.Random;
import java.util.Scanner;

public class Game {
    private String gunting = "gunting";
    private String kertas = "kertas";
    private String batu = "batu";
    private int skorp;
    private int skorl;

    String lawan(){
        String result;
        Random random = new Random();
        int nilai = random.nextInt(10);

        if (nilai <= 2) {
            result = gunting;
        } else if (nilai > 2 && nilai <=5 ){
            result = kertas;
        } else  {
            result = batu;
        }

        return result;
    }

    void pilihan(){
        System.out.println("<=====(***)=====>");
        System.out.println("1. Gunting\n2. Kertas\n3. Batu");
        System.out.println("<--------------->");
    }

    void proses(String player){
        if (player.equals(gunting)){
            System.out.println("Player memilih gunting");
            if (lawan().equals(kertas)){
                System.out.println("Lawan memilih kertas");
                System.out.println("Player menang!!");
                skorp += 1;
            } else if(lawan().equals(batu)){
                System.out.println("Lawan memilih batu");
                System.out.println("Player kalah!!");
                skorl += 1;
            } else {
                System.out.println("Lawan memilih gunting");
                System.out.println("DRAWW!!");
            }
        } else if (player.equals(kertas)){
            System.out.println("Player memilih kertas");
            if (lawan().equals(batu)){
                System.out.println("Lawan memilih batu");
                System.out.println("Player menang!!");
                skorp += 1;
            } else if (lawan().equals(gunting)){
                System.out.println("Lawan memilih gunting");
                System.out.println("Player kalah!!");
                skorl += 1;
            } else {
                System.out.println("Lawan memilih kertas");
                System.out.println("DRAWW!!");
            }
        } else if (player.equals(batu)){
            System.out.println("Player memilih batu");
            if (lawan().equals(gunting)){
                System.out.println("Lawan memilih gunting");
                System.out.println("Player menang!!");
                skorp += 1;
            } else if (lawan().equals(kertas)) {
                System.out.println("Lawan memilih kertas");
                System.out.println("Player kalah!!");
                skorl += 1;
            } else {
                System.out.println("Lawan memilih batu");
                System.out.println("DRAWW!!");
            }
        }
    }

    void skor(){
        System.out.println("<===SKOR===>");
        System.out.println("Player\t||\tLawan\t");
        System.out.println(skorp+"\t||\t"+skorl+"\t");
    }

    void mulai(){
        Scanner input = new Scanner(System.in);
        int pil;
        boolean ulang = true;
        while (ulang){
            pilihan();
            System.out.print("Masukkan pilihan: ");
            pil = input.nextInt();
            switch (pil){
                case 1:
                    proses(gunting);
                    skor();
                    ulang = false;
                    System.out.println("\n");
                    break;
                case 2:
                    proses(kertas);
                    skor();
                    ulang = false;
                    System.out.println("\n");
                    break;
                case 3:
                    proses(batu);
                    skor();
                    ulang = false;
                    System.out.println("\n");
                    break;
                default:
                    System.out.println("Pilihan yang Anda masukkan salah! Silakan ulangi!");
                    ulang = true;
                    System.out.print("Masukkan pilihan: ");
                    pil = input.nextInt();
                    switch (pil){
                        case 1:
                            proses(gunting);
                            skor();
                            ulang = false;
                            System.out.println("\n");
                            break;
                        case 2:
                            proses(kertas);
                            skor();
                            ulang = false;
                            System.out.println("\n");
                            break;
                        case 3:
                            proses(batu);
                            skor();
                            ulang = false;
                            System.out.println("\n");
                            break;
                        default:
                            System.out.println("Pilihan yang Anda masukkan salah!");
                    }
            }
        }
    }
}
