import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        int consultar = 1;
        int receber = 2;
        int transferir = 3;
        int sair = 4;

        String dados = "DADOS INICIAIS DO CLIENTE";
        String nome = "Camila Feldkricher Antunes";
        String conta = "Corrente";
        double valor = 2500;

        System.out.println(dados);
        System.out.println("***************");
        System.out.println("\nNome:  " +  nome);
        System.out.println("Tipo de Conta:  " +  conta);
        System.out.println("Saldo Inicial:  R$ " +  valor);
        System.out.println("\n***************");

        System.out.println();
        System.out.println("Operações");
        System.out.println();
        System.out.println("1- Consultar saldo");
        System.out.println("2- Receber valor");
        System.out.println("3- Tranferir valor");
        System.out.println("4- Sair");
        System.out.println();
        System.out.println("Digite a opção desejada");
        int opcao = leitura.nextInt();

        while(opcao != sair){
            if(opcao == consultar){
                System.out.println("O saldo atual é: " + valor);
                System.out.println();
                System.out.println("1- Consultar saldo");
                System.out.println("2- Receber valor");
                System.out.println("3- Tranferir valor");
                System.out.println("4- Sair");
                System.out.println();
            }
            if(opcao == receber){
                System.out.println("Digite o valor para receber");
                double valorRecebe = leitura.nextDouble();
                valor += valorRecebe;
                System.out.println("Novo saldo: " + valor);
                System.out.println();
                System.out.println("1- Consultar saldo");
                System.out.println("2- Receber valor");
                System.out.println("3- Tranferir valor");
                System.out.println("4- Sair");
                System.out.println();
            }
            if(opcao == transferir){
                System.out.println("Digite o valor da tranferência");
                double valorTransferencia = leitura.nextDouble();
                if(valorTransferencia > valor){
                    System.out.println("Saldo Indisponível");
                } else{
                    valor -= valorTransferencia;
                    System.out.println("O valor atual é: " + valor);
                    System.out.println();
                    System.out.println("1- Consultar saldo");
                    System.out.println("2- Receber valor");
                    System.out.println("3- Tranferir valor");
                    System.out.println("4- Sair");
                    System.out.println();
                }
            }
            if(opcao > 4){
                System.out.println("Não existe essa opção");
                System.out.println();
                System.out.println("1- Consultar saldo");
                System.out.println("2- Receber valor");
                System.out.println("3- Tranferir valor");
                System.out.println("4- Sair");
                System.out.println();
            }
            System.out.println("Digite a opção desejada");
            opcao = leitura.nextInt();
        }



    }
}


