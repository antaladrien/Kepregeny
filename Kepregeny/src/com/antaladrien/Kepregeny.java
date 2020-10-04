package com.antaladrien;

import java.io.*;
import java.util.ArrayList;

public class Kepregeny {

    public static ArrayList<Szuperhos> lista = new ArrayList<Szuperhos>();

    public static void szereplok(String path) throws FileNotFoundException, IOException {
        BufferedReader br = new BufferedReader(new FileReader(path));
        String line = br.readLine();
        while (line != null) {
            String[] szavak = line.split(" ");
            if (szavak[0].equals("Vasember")) {
                Vasember a = new Vasember();
                for (int i = 0; i < Integer.parseInt(szavak[1]); i++) {
                    a.kutyutKeszit();
                }
                lista.add(a);
            } else if (szavak[0].equals("Batman")) {
                Batman a = new Batman();
                for (int i = 0; i < Integer.parseInt(szavak[1]); i++) {
                    a.kutyutKeszit();
                }
                lista.add(a);
            } else {
                System.out.println("Hibás sor");
            }
            line = br.readLine();
        }
        br.close();
    }

    public static void szuperhosok() {
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i).toString());
        }
    }

    public static void main(String[] args) {
        try {
            szereplok("input.txt");
            szuperhosok();
        } catch (Exception ex) {
            System.out.println("Hiba történt");
        }
    }
}
