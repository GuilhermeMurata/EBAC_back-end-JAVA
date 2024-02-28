public class calculoMedia {

    public static void main(String[] args) {
        System.out.println("****Média das notas****");
        somaNotas();
        mediaNotas(totalNotas);
    }
    public static int nota1 = 10;
    public static double nota2 = 8.3;
    public static double nota3 = 6.5;
    public static int nota4 = 0;

    // SOMA DE NOTAS
    public static double somaNotas(){
        double totalNotas = nota1 + nota2 + nota3 + nota4;
        System.out.println("A soma das notas é:" + " " + totalNotas);
        // aredondar nota ---- double valor_arred = Math.round(mediaResultado);
        return totalNotas;
    }

    // Não sei porque na hora que eu torno a var publica ela perde o valor, sendo = 0
    public static double totalNotas;

    // MÉDIA DAS NOTAS
    public static void mediaNotas(double totalNotas){
        double notaFinal = totalNotas / 4;

        System.out.println("A média das notas é:" + " " + notaFinal);
    }
}
