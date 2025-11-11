public class Calculadora {
    public static void main(String[] args) {
        Operadores op = new Operadores();

        //Adição
        System.out.println("O Resultado da adição é: "+op.adicao(10,5));
        //Subtração
        System.out.println("O Resultado da subtração é: "+op.subtracao(10,5));
        //Multiplicação
        System.out.println("O Resultado da multiplicação é: "+op.multiplicacao(10,5));
        //Divisão
        System.out.println("O Resultado da divisão é: "+op.divisao(10,5));

        //Soma e Atribuição
        System.out.println("Atribuindo soma: "+op.atriSoma(10, 5));
        //Subtração e Atribuição
        System.out.println("Atribuindo subtração: "+op.atriSub(10, 5));
        //Multiplicação e Atribuição
        System.out.println("Atribuindo multiplicação: "+op.atriMult(10, 5));
        //Divisão e Atribuição
        System.out.println("Atribuindo divisão: "+op.atriDiv(10, 5));

        //E
        System.out.println("Ambos são maior que 6: "+op.e(10, 5));
        //OU
        System.out.println("Pelo menos um é maior que 6: "+op.ou(10, 5));

        //Maior que
        System.out.println("10 é maior que 5? "+op.maior(10, 5));
        //Maior igual
        System.out.println("10 é maior ou igual à 5? "+op.maiorIgual(10, 5));
        //Menor
        System.out.println("10 é menor que 5? "+op.menor(10, 5));
        //Menor igual
        System.out.println("10 é menor ou igual à 5? "+op.menorIgual(10, 5));
        //Igual
        System.out.println("10 é igual à 5? "+op.maior(10, 5));
        //Diferente
        System.out.println("10 é diferente de 5? "+op.maior(10, 5));

    }
}
