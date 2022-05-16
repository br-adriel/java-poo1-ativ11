import java.lang.Math;

/**
 * Resoluçao dos exercicios disponibilizados no site
 * sites.google.com/view/fabricio10/p%C3%A1gina-inicial/cursos/poo1/texto02
 * 
 * @author Adriel Faria dos Santos
 * @version 15/05/2022
 */
public class Texto02
{
    /* Receber dois inteiros e retorná-los em ordem crescente */
    public int[] exercicio2_02(int n1, int n2){
        int[] r = new int[2];
        if (n1 < n2) {
            r[0] = n1;
            r[1] = n2;
            return r;
        }
        r[0] = n2;
        r[1] = n1;
        return r;
    }
    
    /* Receber três números reais e retorná-los em ordem decrescente */
    public float[] exercicio2_03 (float n1, float n2, float n3) {
        float r[] = new float[3];
        if (n1 >= n2 && n1 >= n3) {
            if (n2 > n3){
                r[0] = n1;
                r[1] = n2;
                r[2] = n3;
                return r;
            }
            r[0] = n1;
            r[1] = n3;
            r[2] = n2;
            return r;
        } else if (n2 >= n1 && n2 >= n3) {
            if (n1 < n3){
                r[0] = n2;
                r[1] = n1;
                r[2] = n3;
                return r;
            }
            r[0] = n2;
            r[1] = n3;
            r[2] = n1;
            return r;
        } else if (n1 >= n2) {
            r[0] = n3;
            r[1] = n1;
            r[2] = n2;
            return r;
        }
        r[0] = n3;
        r[1] = n2;
        r[2] = n1;
        return r;
    }
    
    /* Receber um número real e retornar sua raiz quadrada */
    public double exercicio2_04(double n) {
        return Math.sqrt(n);
    }
    
    /* Receber dois Strings e informar se o primeiro String 
     * está contido no segundo (use o método indexOf) */
    public boolean exercicio2_05(String buscado, String fonte) {
        return fonte.indexOf(buscado) != -1;
    }
    
    /* Receber dois Strings e retorná-los em ordem alfabética 
     * (use o método compareTo) */
    public String[] exercicio2_06(String texto1, String texto2) {
        String r[] = new String[2];
        if (texto1.compareTo(texto2) < 0) {
            r[0] = texto1;
            r[1] = texto2;
            return r;
        }
        r[0] = texto2;
        r[1] = texto1;
        return r;
    }

    /* Receber três Strings e retorná-los em ordem alfabética 
     * (use o método compareTo) */
    public String[] exercicio2_07(String texto1, String texto2, String texto3) {
        String r[] = new String[3];
        if (texto1.compareTo(texto2) <= 0 && texto1.compareTo(texto3) <= 0) {
            r[0] = texto1;
            if (texto2.compareTo(texto3) <= 0) {
                r[1] = texto2;
                r[2] = texto3;
                return r;
            }
            r[1] = texto3;
            r[2] = texto2;
            return r;
        } else if (texto2.compareTo(texto1) <= 0 && texto2.compareTo(texto3) <= 0) {
            r[0] = texto2;
            if (texto1.compareTo(texto3) <= 0) {
                r[1] = texto1;
                r[2] = texto3;
                return r;
            }
            r[1] = texto3;
            r[2] = texto1;
            return r;
        }
        r[0] = texto3;
        if(texto1.compareTo(texto2) <= 0) {
            r[1] = texto1;
            r[2] = texto2;
            return r;
        }
        r[1] = texto2;
        r[2] = texto1;
        return r;
    }
    
    /* Receber um array de Strings na forma "nome sobrenome" e 
     * retornar um array na forma "sobrenome, nome" (use os métodos 
     * indexOf e substring) */
    public String[] exercicio2_08(String[] entrada) {
        String saida[] = new String[entrada.length];
        
        for (int i=0; i<entrada.length; i++) {
            int pos = entrada[i].indexOf(" ");
            String nome = entrada[i].substring(0, pos);
            String sobrenome = entrada[i].substring(pos+1, entrada[i].length());
            saida[i] = sobrenome + ", " + nome;
        }
        return saida;
    }
    
    /* Receber um array de Strings e modificá-lo de forma que todos 
     * os seus itens fiquem com todas as letras maiúsculas (use o 
     * método toUpperCase) */
    public void exercicio2_09(String[] entrada) {
        for (int i=0; i<entrada.length; i++) {
            entrada[i] = entrada[i].toUpperCase();
        }
    }
    
    /* Receber um array de Strings e retornar um array com os mesmos 
     * Strings mas com todas as letras maiúsculas (use o método 
     * toUpperCase) */
    public String[] exercicio2_10(String[] entrada) {
        String retorno[] = entrada.clone();
        exercicio2_09(retorno);
        return retorno;
    }
    
    /* Receber um vetor de inteiros. Percorrer o vetor com um comando
     * for. A cada repetição, troque o elemento corrente com o que 
     * estiver uma posição à frente sempre que o elemento da frente 
     * for menor que o elemento corrente. */
    public void exercicio2_11(int[] entrada) {
        for (int i=0; i<entrada.length-1; i++) {
            if (entrada[i] > entrada[i+1]) {
                int aux = entrada[i];
                entrada[i] = entrada[i+1];
                entrada[i+1] = aux;
            }
        }
    }
    
    /* Adapte o exercício anterior de forma que as trocas sejam 
     * efetuadas e, além disso, o método retorne a quantidade de 
     * trocas realizadas. */
    public int exercicio2_12(int[] entrada) {
        int count = 0;
        for (int i=0; i<entrada.length-1; i++) {
            if (entrada[i] > entrada[i+1]) {
                int aux = entrada[i];
                entrada[i] = entrada[i+1];
                entrada[i+1] = aux;
                count++;
            }
        }
        return count;
    }
    
    /* Adapte o exercício anterior para que funcione com um vetor de 
     * Strings e faça as trocas sempre que um String for 
     * lexicograficamente maior que o String que está à sua frente no 
     * vetor. Lembre de retornar o número de trocas. */
    public int exercicio2_13(String[] entrada) {
        int count = 0;
        String saida[] = new String[entrada.length +1];
        
        for (int i=0; i<entrada.length-1; i++) {
            if (entrada[i].compareTo(entrada[i+1]) > 0) {
                saida[i] = entrada[i+1];
                saida[i+1] = entrada[i];
                count++;
            } else {
                saida[i] = entrada[i];
            }
        }
        
        return count;
    }
    
    /* (Desafio) Receber um vetor de inteiros e modificá-lo para que 
     * fique em ordem decrescente. Dica de amigo: se você usar o 
     * método do exercício 2.12 e a quantidade de trocas retornada 
     * for 0 (zero), o vetor estará ordenado. É possível chamar um 
     * método de dentro de outro, assim como em qualquer linguagem de 
     * programação que você já estudou. */
    public void exercicio2_14(int[] entrada) {
        int trocas = 0;
        do {
            trocas = exercicio2_12(entrada);
        } while (trocas != 0);
    }
    
    /* (Desafio) Receber um vetor de Strings e modificá-lo para que 
     * fique ordem alfabética. Dica de amigo: veja a dica de amigo da 
     * questão anterior. */
    public void exercicio2_15(String[] entrada) {
        int trocas = 0;
        do {
            trocas = exercicio2_13(entrada);
        } while (trocas != 0);
    }
    
    /* (Desafio) Receber um vetor de Strings na forma "nome sobrenome"
     * e modificá-lo para que fique ordenado alfabeticamente por 
     * sobrenome. Por exemplo: se o vetor {"robert plant", 
     *     "ian gillan", "neil young"} for passado como parâmetro, 
     * após a execução do método, o conteúdo do vetor deve ser 
     * {"ian gillan", "robert plant",  "neil young"}. Sem dicas, se 
     * vire sozinho. */
    public void exercicio2_16(String[] entrada) {
        boolean trocou = false;
        do {
            trocou = false;
            for (int i=0; i<entrada.length-1; i++) {
                int index1 = entrada[i].indexOf(" ");
                int index2 = entrada[i+1].indexOf(" ");
                
                String sobrenome1 = entrada[i].substring(index1);
                String sobrenome2 = entrada[i+1].substring(index2);
                
                if (sobrenome1.compareTo(sobrenome2) > 0 ) {
                    String aux = entrada[i];
                    entrada[i] = entrada[i+1];
                    entrada[i+1] = aux;
                    trocou = true;
                }
            }     
        } while(trocou);
    }
    
    /* (Desafio) Receber um vetor de Strings na forma "nome sobrenome"
     * e modificá-lo para que fique ordenado alfabeticamente por 
     * sobrenome e com a forma dos strings alterada para "sobrenome, 
     * nome".  Por exemplo: se o vetor {"robert plant", "ian gillan", 
     *     "neil young"} for passado como parâmetro, após a execução 
     * do método, o conteúdo do vetor deve ser {"gillan, ian",
     *     "plant, robert", "young, neil"} */
    public void exercicio2_17(String[] entrada) {        
        exercicio2_16(entrada);
        exercicio2_08(entrada);
    }
}
