package com.pucrs.mauricio.stringmatch;

import java.util.Objects;

public class Enunciado2 {
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
        instrucoes = 0;
        int M = haystack.length();
        int N = needle.length();
        long needHash = needle.hashCode();
        
        for (int i = 0; i <= M - N; i++) {
            iteracoes++;
            iteracoes += N;
            long hash = Objects.hashCode(haystack.substring(i, i + N));
            if (needHash == hash) {
                return i;
            }
        }
        return -1;
    }
}
