package com.pucrs.mauricio;

import com.pucrs.mauricio.stringmatch.Enunciado1;

public class Main {
    public static void main(String[] args) {
        Enunciado1 obj = new Enunciado1();
        System.out.println(obj.indexOf("ABCDCBDCBDACBDABDCBADF", "ADF"));
        System.out.println(obj.getIteracoes());
    }
}