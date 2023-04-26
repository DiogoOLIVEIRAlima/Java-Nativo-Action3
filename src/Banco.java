import java.util.Arrays;
import java.util.List;

public class Banco implements Financiamento, Tranferencia{
    private String nome;
    private List<Conta> contas;

    public Banco(String nome,List<Conta> contas) {
        this.nome = nome;
        this.contas = contas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Conta> getContas() {
        return contas;
    }

    public void setContas(List<Conta> contas) {
        this.contas = contas;
    }

    public void cadastraConta(Conta conta){
        contas.add(conta);
    }
    public boolean pegaEmprestimo(Conta conta){
        if (conta.getSaldo() > 0){
            return true;
        }
        return false;
    }
    public double liberaEmprestimo(Conta conta, double valor){
        if (valor > conta.getSaldo()){
            return (valor - conta.getSaldo()) * 2;
        }
        return valor;
    }
    public void realizaTransferencia(Conta conta1, Conta conta2, double valor){
        conta1.saca(valor);
        conta2.deposita(valor);
    }

    @Override
    public String toString() {
        return "Banco{" +
                "nome='" + nome + '\'' +
                ", contas=" + contas +
                '}';
    }
}
