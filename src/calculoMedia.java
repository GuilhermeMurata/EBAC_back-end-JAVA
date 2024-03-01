
public class calculoMedia {
    public static void main(String[] args) {
        System.out.println("****Média das notas****");
        totalNotas = somaNotas();
        mediaNotas(totalNotas);
    }
    public static double nota1 = 7.2;
    public static double nota2 = 8.3;
    public static double nota3 = 6.5;
    public static double nota4 = 2.4;

    // SOMA DE NOTAS
    public static double somaNotas(){
        double totalNotas = nota1 + nota2 + nota3 + nota4;
        System.out.println("A soma das notas é:" + " " + totalNotas);
        return totalNotas;
    }
    public static double totalNotas;

    // MÉDIA DAS NOTAS + Condicional de aprovação
    public static double mediaNotas(double totalNotas){
        double notaFinal = totalNotas / 4;
        System.out.println("A média das notas é:" + " " + notaFinal);

        if (notaFinal >= 6){
            System.out.println("Aluno aprovado");
        }else{
            System.out.println("Aluno reprovado");
        }
        return notaFinal;
    }
}