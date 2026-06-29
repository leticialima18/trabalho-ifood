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

class PagamentoPix extends Pagamento {

    public PagamentoPix(double valor) {
        super(valor);
    }

    @Override
    public void realizarPagamento() {
        System.out.println("Pagamento de R$ " + getValor() + " realizado via Pix.");
    }
}

class PagamentoCartao extends Pagamento {

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

class PagamentoDinheiro extends Pagamento {

    public PagamentoDinheiro(double valor) {
        super(valor);
    }

    @Override
    public void realizarPagamento() {
        System.out.println("Pagamento de R$ " + getValor() + " em dinheiro.");
    }
}

class Main {
    public static void main(String[] args) {
        Pagamento pagamento1 = new PagamentoPix(100.0);
        Pagamento pagamento2 = new PagamentoCartao(250.0, "1234-5678-9012-3456");
        Pagamento pagamento3 = new PagamentoDinheiro(50.0);

        pagamento1.realizarPagamento();
        pagamento2.realizarPagamento();
        pagamento3.realizarPagamento();
    }
}
