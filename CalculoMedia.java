import java.util.Scanner;

public class CalculoMedia {

    public static void main(String args[]){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a  primeira nota do aluno: ");
        double num1 = scanner.nextDouble();
        System.out.println("Digite a segunda nota do aluno: ");
        double num2 = scanner.nextDouble();
        System.out.println("Digite a terceira nota do aluno: ");
        double num3 = scanner.nextDouble();
        System.out.println("Digite a quarta nota do aluno: ");
        double num4 = scanner.nextDouble();

        double media = (num1 + num2 + num3 + num4) / 4;
        System.out.println("A média do aluno é de: " + media);
        
        if (media >=7 && media <=10) {
            System.out.println("Aluno aprovado");
        } else if (media >=5){
            System.err.println("O aluno esta de recuperação");
        } else {
            System.err.println("Aluno reprovado");
        }
    }

    // static double nota1;
    // static double nota2;

    // public static double somaNotas(Scanner totalNotas){
    //     double notaFinal = nota1 + nota2 / 4;
    //     System.out.println("Total: " + totalNotas);
    //     return notaFinal;
    // }

    // public static double totalNotas;

    // public static String getNotas(int nota) {
    //     if (nota1 >=7 && nota1 <=10) {
    //         return "Parabéns você passou!!";
    //     } else {
    //         return "Reprovado";
    //     }
    // }
}
