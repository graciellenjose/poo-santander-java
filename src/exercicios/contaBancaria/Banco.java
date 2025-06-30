package exercicios.contaBancaria;

import java.util.Scanner;

public class Banco extends Conta{

    private static String menu = "O que você deseja fazer? \n1 - Depósito\n2 - Saque\n3 - Verificar saldo\n4 - Pagar boletos\n5 - Sair";

    public static void main(String[] args){
        Conta conta = new Conta();
        Scanner scanner = new Scanner(System.in);

        try{
            System.out.println(menu);
            var opcoes = scanner.nextInt();
            var saldoEcheque = conta.getSaldo() + conta.getChequeEspecial();

            while (opcoes != 5){
               opcoesUsuario(opcoes);
               switch (opcoes){
                    case 1:
                        System.out.println("Insira valor para depósito:");
                        var saldo = scanner.nextFloat();
                        conta.setSaldo(saldo);
                        System.out.println("Saldo após depósito:" + conta.getSaldo());
                        break;
                    case 2:
                        System.out.println("Insira valor para saque:");
                        var saqueValor = scanner.nextFloat();

                        conta.setSaque(saqueValor);

                        var saldoPosSaque = conta.getSaldo() - saqueValor;
                        var chequeEspecial = conta.getChequeEspecial();
                        var taxa = 0f;

                        if(saldoPosSaque < 0) {
                            System.out.println(conta.getSaldo());
                            var chequeUsado = Math.abs(saldoPosSaque);
                            chequeEspecial = chequeEspecial- chequeUsado;

                            taxa = 0.20f * chequeUsado;

                            System.out.printf("Saque concluído!\nValor utilizado cheque especial: %s,\nTaxa de uso do cheque especial: %s", chequeUsado, taxa);
                        }

                        conta.setSaque(saldoPosSaque);

                        saldoEcheque = (saldoPosSaque + chequeEspecial) - taxa;
                        System.out.println("\nSaldo após saque: " + saldoEcheque);
                        break;
                    case 3:
                        System.out.println("Saldo: " + saldoEcheque);
                        break;
                    case 4:
                        if(!conta.isBoleto()){
                            conta.setBoleto(true);
                            System.out.println("Boleto pago com sucesso");
                        }else{
                            System.out.println("Não há boletos pendentes.");
                        }
                        break;
                }

                System.out.println(menu);
                opcoes = scanner.nextInt();
            }



        } catch (OpcaoInvalidaException e){
            System.out.println("Opção inválida. Tente novamente.");
        }

    }
    static void opcoesUsuario(int opcao) throws OpcaoInvalidaException {
        if(opcao > 5){
            throw new OpcaoInvalidaException(opcao);
        }
    }
}
