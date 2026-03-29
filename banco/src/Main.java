public void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    Opcao opcoes = new Opcao();

    opcoes.name = "admin";
    opcoes.passowrd = "1234";
    opcoes.saldo = 2000;

    for (int tentativas = 1; tentativas <= 3; tentativas ++) {
        System.out.println("Usuario:");
        opcoes.name = sc.next();
        System.out.println("Senha:");
        opcoes.passowrd = sc.next();

        if (!opcoes.name.equals("admin") || !opcoes.passowrd.equals("1234")){
            System.out.println("Usuario ou senha incorreta!");
            System.out.println("Tente Novamente!");
            System.out.println("Tentativa " + tentativas + " De 3");
            break;

        } else {
            System.out.println("Login bem Sucedido");
            System.out.println("BEM-VINDO");

        }




    }



}