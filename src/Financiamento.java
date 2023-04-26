public interface Financiamento {
    boolean pegaEmprestimo(Conta conta);
    double liberaEmprestimo(Conta conta, double numero);
}
