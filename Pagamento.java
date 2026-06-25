public abstract class Pagamento {

    private double valor;

    public Pagamento(double valor) {
        this.valor = valor;
    }


    public double getValor() {
        return valor;
    }


    public abstract void realizarPagamento();
}

public class PagamentoPix extends Pagamento {

    public PagamentoPix(double valor) {
        super(valor);
    }


    @Override
    public void realizarPagamento() {
        System.out.println("Pagamento de R$ " + getValor() + " realizado via Pix.");
    }
}

public class PagamentoCartao extends Pagamento {

    private String numeroCartao;


    public PagamentoCartao(double valor, String numeroCartao) {
        super(valor);
        this.numeroCartao = numeroCartao;
    }


    public String getNumeroCartao() {
        return numeroCartao;
    }


    @Override
    public void realizarPagamento() {
        System.out.println("Pagamento de R$ " + getValor() + " realizado no cartão.");
    }
}

public class PagamentoDinheiro extends Pagamento {


    public PagamentoDinheiro(double valor) {
        super(valor);
    }


    @Override
    public void realizarPagamento() {
        System.out.println("Pagamento de R$ " + getValor() + " em dinheiro.");
    }
}
