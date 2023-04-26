public class Conta {
    private String nome;
    private double saldo;

    public Conta(String nome, double saldo) {
        this.nome = nome;
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Conta{" +
                "nome='" + nome + '\'' +
                ", saldo=" + saldo +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSaldo() {
        return saldo;
    }

    public  void deposita(double valor){
        saldo += valor;
    }

    public boolean saca(double valor){
        if (valor <= saldo){
            saldo -= valor;
            return true;
        }
        return false;
    }
}

