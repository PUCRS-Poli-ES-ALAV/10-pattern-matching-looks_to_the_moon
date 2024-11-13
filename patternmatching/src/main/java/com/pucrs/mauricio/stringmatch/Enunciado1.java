package com.pucrs.mauricio.stringmatch;

public class Enunciado1 { 
    private int iteracoes = 0;
    private int instrucoes = 0;

    public int getIteracoes() {
        return this.iteracoes;
    }

    public int getInstrucoes() {
        return this.instrucoes;
    }

    public int indexOf(String haystack, String needle) {
        iteracoes = 0;
        instrucoes = 7;
        int hLen = haystack.length();
        int nLen = needle.length();
        instrucoes += 5;
        for (int i = 0; i <= hLen - nLen; i++) { // O(n^2) ?
            iteracoes++;
            int j = 0;
            boolean match = haystack.charAt(i) == needle.charAt(j);
            instrucoes += 9;
            while (j < nLen && match) {
                instrucoes += 7;
                iteracoes++;
                match = match && haystack.charAt(i + j) == needle.charAt(j);
                j++;
            }
            instrucoes += 2;
            if (match) {
                return i;
            }
            instrucoes += 5;
        }
        instrucoes++;
        return -1;
    }
}