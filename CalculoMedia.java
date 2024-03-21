import java.util.Scanner;

public class CalculoMedia {

    public static void main(String args[]){
        Scanner n1 = new Scanner(System.in);
        Scanner n2 = new Scanner(System.in);

        System.out.println("Digite a nota do aluno: ");
        double nota1 = scanner.nextDouble();
        double nota2 = scanner.nextDouble();

        totalNotas = somaNotas();
        System.out.println(totalNotas);
    }

    public static double somaNotas(){
        double totalNotas = nota1 + nota2;
        System.out.println("Total: " + totalNotas);
        return totalNotas;
    }

    public static double totalNotas;

    // public static String getNotas(int nota) {
    //     if (nota1 >=7 && nota1 <=10) {
    //         return "Parabéns você passou!!";
    //     } else {
    //         return "Reprovado";
    //     }
    // }
}
