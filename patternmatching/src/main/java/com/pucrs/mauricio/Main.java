package com.pucrs.mauricio;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

import com.pucrs.mauricio.stringmatch.Enunciado1;
import com.pucrs.mauricio.stringmatch.Enunciado2;

public class Main {
    public static void main(String[] args) throws URISyntaxException {
        Enunciado2 obj = new Enunciado2();
        
        URL res = Main.class.getResource("tests.txt");
        if (res == null) {
            System.out.println("oops!!");
            return;
        }
        try (BufferedReader br = new BufferedReader(new FileReader(new File(res.toURI())))) {
            String line = br.readLine();
            while ((line = br.readLine()) != null) {
                String[] inputs = line.split(", *");
                int idx = obj.indexOf(inputs[1], inputs[0]);
                System.out.printf(
                    "Pattern: %s\n\n" + 
                    "PatternIndex %d\n" +
                    "Iterations: %d\n" +
                    "-----------------------\n", inputs[0], idx, obj.getIteracoes());
                
            }
        } catch (IOException ioexcept) {
            System.out.println("frick");
        }
    }
}