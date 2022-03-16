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

        minhaConta.depositar(500.00);
        minhaConta.sacar(100.0);
        minhaConta.vizualizarSaldo();

    }
}
