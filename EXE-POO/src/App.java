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
        outraConta.saldo = 150.0;

        System.out.println("Saldo na minha conta:"+minhaConta.saldo);
        System.out.println("Saldo na outra conta:"+outraConta.saldo);

    }
}
