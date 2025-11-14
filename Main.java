public class Main {
    public static void main(String[] args) {
        int[] vetor = new int[7];

        preencher(vetor, 0);

        System.out.println("Os valores do vetor são: ");
        imprimir(vetor, 0);

        System.out.println("O resultado das somas dos vetores é: ");
        System.out.println(somar(0, 0, vetor));
    }

    private static void preencher(int[] vetor, int pos) {
        if (pos < vetor.length) {
            vetor[pos] = (int) (Math.random() * vetor.length);
            preencher(vetor, pos + 1);
        }
    }

    private static void imprimir(int[] vetor, int pos) {
        if (pos < vetor.length) {
            System.out.println(vetor[pos]);
            imprimir(vetor, pos + 1);
        }
    }

    private static int somar(int soma, int posicao, int[] vetor) {
        if (posicao < vetor.length) {
            soma = soma + vetor[posicao];
            return somar(soma, posicao + 1, vetor);
        } else {
            return soma;
        }
    }
}
