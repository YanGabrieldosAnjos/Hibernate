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

        Nota n1 =  new Nota(1,"1076",10);
        Nota n2 =  new Nota(2,"1076",10);

        a1.getNota().add(n1);
        a1.getNota().add(n2);
        AlunoBD.createAluno(a1);
        System.out.println("foi");

    }
}