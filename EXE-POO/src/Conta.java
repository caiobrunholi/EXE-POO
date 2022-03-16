public class Conta{
    //Atributos da nossa classe
    int numero;
    String titular;
    double saldo;
    String cpf;

    //Métodos da classe 

    void vizualizarSaldo(){
        System.out.println("Saldo atual na conta " + numero + ": R$" + saldo);
    }

    void depositar(double valor){
        saldo = saldo + valor;
    }

    void sacar(double valor){
        saldo = saldo - valor;
    }

    void transferirDinheiro(){

    }
}