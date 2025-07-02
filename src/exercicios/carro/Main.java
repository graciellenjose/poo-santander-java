package exercicios.carro;

import java.util.Scanner;

public class Main extends Carro{
    private static final String menu = "Informe sua próxima ação:\n1 - Ligar/Desligar carro\n2 - Alterar velocidade\n3 - Virar para esquerda/direita\n4 - Verificar velocidade\n5 - Trocar marcha";
    public static void main(String[] args){
        Carro carro = new Carro();
        Scanner scanner = new Scanner(System.in);

        System.out.println(menu);
        var opcoes = scanner.nextInt();

        switch(opcoes){
            case 1:
                System.out.println("Você deseja:\n1 - Ligar carro\n2 - Desligar carro");
                var ligaDesligaCarro = scanner.nextInt();

                switch(ligaDesligaCarro){
                    case 1:
                        if(carro.isLigaDesliga()){
                            System.out.println("O carro já está ligado.");
                        }else{
                            carro.setLigaDesliga(true);
                            System.out.println("Carro ligado.");
                        }
                    case 2:
                        if(!carro.isLigaDesliga()){
                            System.out.println("O carro já está desligado.");
                        }else{
                            carro.setLigaDesliga(false);
                            System.out.println("Carro desligado.");
                        }
                }
                break;


//            case 2:
//            case 3:
//            case 4:
//            case 5:
        }
    }
}
