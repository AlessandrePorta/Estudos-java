import java.util.Scanner;

public class While {
    static class whiile {
        public static void main(String[] args) {

            Scanner ale = new Scanner(System.in);

            int y = 500;
            int x = 0;
            int A;

            int exercicio = ale.nextInt();

            while (x < y) {
                x += 1;
                System.out.println("InicioOri_a_Obj" + x);
            }
        }

        static class exercicioexemplo {
            public static void main(String[] args) {

                Scanner ale = new Scanner(System.in);

                System.out.println("Digite um número inteiro: ");
                int exercicio = ale.nextInt();

                int A = 0;

                while (exercicio != 0) {
                    System.out.println("Digite um número inteiro: ");
                    exercicio = ale.nextInt();
                    if (exercicio != 0) {
                        A += A + exercicio;
                    } else {
                        System.out.println("Sua soma deu: " + A);
                    }
                }
            }
        }
    }
}
