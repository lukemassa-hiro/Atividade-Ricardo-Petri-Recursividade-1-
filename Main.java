

public class Main {
    public static void main(String[] args) {
        int[] vetor = new int[7];
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = (int) (Math.random() * vetor.length);
        }
        System.out.println("Os valores do vetor são: ");
        for (int i = 0; i < vetor.length; i++) {

            System.out.println(vetor[i]);
        }
        System.out.println("O resultado das somas dos vetores é: ");

        System.out.println(somar( 0,0,vetor));
    }
        private static int somar(int soma, int posicao, int[] vetor){
            if (posicao < vetor.length){
                soma = soma + vetor[posicao];
                return somar(soma, posicao + 1, vetor);

            }else {
                return soma;

            }

        }

        }

