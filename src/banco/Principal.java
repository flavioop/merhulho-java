package banco;

public class Principal {

    public static void main(String[] args) {

        Pessoa titular1 = new Pessoa();
        titular1.setNome("João da silva");
        titular1.setDocumento("1231231313");

        Pessoa titular2 = new Pessoa();
        titular2.setNome("Maria Abadia");
        titular2.setDocumento("22222236666511");

        Conta minhaConta = new Conta(titular1,123,987);

       /* minhaConta.titular = titular1;
        minhaConta.agecia = 123;
        minhaConta.numero = 987;
        minhaConta.saldo = 15.000;*/


        Conta suaConta = new Conta(titular2, 222, 333);

        /*suaConta.setTitular(titular2);
        suaConta.setAgecia (222);
        suaConta.setNumero = (333);
        //suaConta.saldo = 30.000;*/
        suaConta.depositar(30.000);
        minhaConta.depositar(15.000);

        minhaConta.sacar(0.000, 10);

        System.out.println("Titular: " + minhaConta.getTitular().getNome());
        System.out.println("Titular: " + minhaConta.getSaldo());

        System.out.println("Titular: " + suaConta.getTitular().getNome());
        System.out.println("Titular: " + suaConta.getSaldo());

    }
}
