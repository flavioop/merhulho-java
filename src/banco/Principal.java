package banco;

public class Principal {

    public static void main(String[] args) {

        Pessoa titular1 = new Pessoa();
        titular1.nome = "João da silva";
        titular1.documento = "1231231313";

        Pessoa titular2 = new Pessoa();
        titular2.nome = "Maria Abadia";
        titular2.documento = "22222236666511";

        Conta minhaConta = new Conta();

        minhaConta.titular = titular1;
        minhaConta.agecia = 123;
        minhaConta.numero = 987;
        minhaConta.saldo = 15.000;

        Conta suaConta = new Conta();

        suaConta.titular = titular2;
        suaConta.agecia = 222;
        suaConta.numero = 333;
        suaConta.saldo = 30.000;

        System.out.println("Titular: " + minhaConta.titular.nome);
        System.out.println("Titular: " + minhaConta.saldo);

        System.out.println("Titular: " + suaConta.titular.nome);
        System.out.println("Titular: " + suaConta.saldo);

    }
}
