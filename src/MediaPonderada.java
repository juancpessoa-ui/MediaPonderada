import java.util.Scanner;

public class MediaPonderada {
    String nomeAluno;
    double nota1;
    double peso1;
    double nota2;
    double peso2;
    double nota3;
    double peso3;
    double notaFinal;


    public void obterDados(){
        Scanner leitor = new Scanner(System.in);

        System.out.println(" Nome do aluno:");
        nomeAluno= leitor.nextLine();

        System.out.println(" Nota 1:");
        nota1= leitor.nextDouble();

        System.out.println(" Peso 1:");
        peso1= leitor.nextDouble();

        System.out.println(" Nota 2:");
        nota2= leitor.nextDouble();

        System.out.println(" Peso 2:");
        peso2= leitor.nextDouble();

        System.out.println(" Nota 3:");
        nota3 = leitor.nextDouble();

        System.out.println(" Peso 3:");
        peso3= leitor.nextDouble();
    }

    public void realizarCalculos(){
    notaFinal= (nota1 * peso1) + (nota2 * peso2) + (nota3 * peso3)/ (peso1 + peso2 + peso3)
    }
    public void exibirResultado(){
        obterDados();// sequencia de execução
        realizarCalculos();
        System.out.println(" ");


    }

}
