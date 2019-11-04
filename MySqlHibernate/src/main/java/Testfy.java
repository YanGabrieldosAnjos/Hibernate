import java.util.Scanner;

public class Testfy {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Qual seu nome?");
        String nome = s.next();
        System.out.println("Qual sua matricula?");
        String mat = s.next();
        AlunoBD bd = new AlunoBD();
        Aluno a1 = new Aluno(mat,nome);

        int i = 0;
        int c = 0;
        Nota notas [] = new Nota[100];
        while (c != -1){
            System.out.println("Qual a nota recebida");
            float r = s.nextFloat();
            System.out.println("Qual o código");
            c = s.nextInt();
            notas[i] = new Nota(c,a1.getMatricula(),r);
            i++;
        }
        AlunoBD.insertAlunoWithNotas(a1,notas);
        System.out.println("foi");

    }
}