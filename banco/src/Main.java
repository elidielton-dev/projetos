public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    Opcao opcoes = new Opcao();

    opcoes.name = "admin";
    opcoes.password = "1234";
    opcoes.saldo = 2000;

    for (int tentativas = 1; tentativas <= 3; tentativas ++) {
        System.out.println("Usuario:");
        String usuario = sc.next();
        System.out.println("Senha:");
        String senha = sc.next();

        if (usuario.equals(opcoes.name) && senha.equals(opcoes.password)) {
            System.out.println("Login bem Sucedido");
            System.out.println("BEM-VINDO");
            break;

        } else {
            System.out.println("Usuario ou senha incorreta!");
            System.out.println("Tente Novamente!");
            System.out.println("Tentativa " + tentativas + " De 3");
        }
    }

        int menu;
        do {
            System.out.println("        OPERAÇOES:");
            System.out.println("Digite um numero da operação");
            System.out.println("      1 - Saldo");
            System.out.println("    2 - Depositar ");
            System.out.println("      3 - Sacar");
            System.out.println("      4 - Sair");

            menu = sc.nextInt();

            switch (menu) {

                case 1:
                    System.out.println("Saldo Atual:");
                    System.out.println(opcoes.saldo);
                    break;

                case 2:
                System.out.println("Depositar");
                System.out.println("Digita o valor");
                double valorDeposito = sc.nextDouble();
                opcoes.saldo += valorDeposito;
                System.out.println("R$" + valorDeposito + "Depositado com sucesso" + "Seu saldo atual: R$" + opcoes.saldo);
                break;

                case 3:
                    for (int saque = 0; saque <= 3; saque++) {
                        System.out.println("Sacar");
                        System.out.println("Digite o valor");
                        double valorSacar = sc.nextDouble();

                        if (valorSacar <= 0 || valorSacar > opcoes.saldo) {
                            System.out.println("Operação Invalida");

                        } else {
                            opcoes.saldo -= valorSacar;
                            System.out.println("Saque " + valorSacar);
                            System.out.println("Operação realizada com sucesso | Saldo atual: R$" + opcoes.saldo);
                            break;

                        }
                    }
                    break;
                case 4:
                    System.out.println("Obrigado pela confiança");
                    System.out.println("Saindo...");

            }
        }
        while (menu !=4);

}