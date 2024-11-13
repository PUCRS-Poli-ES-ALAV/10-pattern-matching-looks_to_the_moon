package com.pucrs.mauricio;

import com.pucrs.mauricio.stringmatch.Enunciado1;
import com.pucrs.mauricio.stringmatch.Enunciado2;

public class Main {
    public static void main(String[] args) {
        Enunciado2 obj = new Enunciado2();
        System.out.println(obj.indexOf("ABCDCBDCBDACBDABDCBADF", "ADF"));
        System.out.println(obj.getIteracoes());
    }
}