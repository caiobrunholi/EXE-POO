public class App {
    public static void main(String[] args) throws Exception 
    {
        //Declara um objeto do tipo Conta
        Conta minhaConta;
        //Instaciar um objeto do tipo Conta
        minhaConta = new Conta();

        //Declarou e Instanciou uma nova conta
        Conta outraConta = new Conta();

        minhaConta.saldo = 200.00;
        minhaConta.numero = 1234;
        outraConta.saldo = 150.0;
        outraConta.numero = 5678;

        System.out.println("Saldo na minha conta:");
        minhaConta.vizualizarSaldo();
        System.out.println("Saldo na outra conta:");
        outraConta.vizualizarSaldo();

        // if (!minhaConta.depositar(500.00)){
        //     System.out.println("Operação falhou!");
        // }

        // if (!minhaConta.sacar(10000.0)){
        //     System.out.println("Operação falhou!");
        // }

        // minhaConta.vizualizarSaldo();
        minhaConta.transferirDinheiro(-100, outraConta);


        System.out.println("Saldo na minha conta:");
        minhaConta.vizualizarSaldo();
        System.out.println("Saldo na outra conta:");
        outraConta.vizualizarSaldo();


    }
}
