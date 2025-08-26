public class ContaBanco {
    private int numConta;
    private TipoConta tipo;
    private double saldo;
    private String dono;
    private Boolean status = false;

    public ContaBanco(int numConta, TipoConta tipo, String dono) {
        this.status = false;
        this.saldo = 0.0;
        this.numConta = numConta;
        this.dono = dono;
        this.tipo = tipo;
    }

    public void abrirConta(){
        if (!this.status){
            this.status = true;
            double saldoInicial;
             if (this.tipo == TipoConta.CP){
                 saldoInicial = 150;
             }else{
                 saldoInicial = 50;
             }
             this.saldo = saldoInicial;
            System.out.println("----Conta----\n Tipo: " + this.tipo + "\n Dono: " + this.dono + "\n Aberta com saldo inicial de R$" + saldoInicial);
            System.out.println("-------------------------");
        }else{
            System.out.println("Conta já aberta! ");
        }


    }

    public void fecharConta(){
        if (this.status){
            if (this.saldo == 0){
                this.status = false;
                System.out.println("Conta fechada com sucesso!");
            }else{
                System.out.println("Sua conta não pode ser fechada, existe dinheiro para sacar ou débitos para pagar, verifique!");
            }
        }else{
            System.out.println("A conta já está fechada!");
        }

    }
    public void depositar(Double deposito) {
        if (this.status) {
            if (deposito > 0) {
                this.saldo += deposito;
                System.out.println("Deposito de R$" + deposito + " feito com sucesso!");
            } else {
                System.out.println("ERRO: O valor do depósito deve ser maior que zero.");
            }

        } else {
            System.out.println("Não foi possível depositar. A conta está fechada!");
        }
    }
    public void sacar(Double saque){
        if (this.status){
            if (this.saldo >= saque){
                this.saldo -= saque;
                System.out.println("Valor do saque de R$"+saque+" sacado com sucesso!");
            }else{
                System.out.println("O valor do saque de R$"+saque+" é maior que o saldo de R$"+this.saldo);
            }
        }else{
            System.out.println("A conta não está aberta, saque inválido!");
        }

    }
    public void pagarMensal(){
        int valorMensal = 0;
        if (this.status){
            if (this.tipo == TipoConta.CC){
                valorMensal = 12;
            }else{
                valorMensal = 20;

            }
            if (this.saldo >= valorMensal){
                this.saldo -= valorMensal;
                System.out.println("Mensalidade de R$"+valorMensal +" paga com sucesso, saldo atual: R$"+this.saldo);
            }else{
                System.out.println("Saldo insuficiente para pagar a mensalidade");
            }
        }else{
            System.out.println("Não há conta aberta para pagamento de mensalidade.");
        }

    }
    public void saldoConta(){
        System.out.println("-------------------");
        System.out.println(" Dono: "+dono);
        System.out.println(" Tipo: "+tipo);
        System.out.println(" Saldo: "+this.saldo);
        System.out.println("-------------------");
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public TipoConta getTipo() {
        return tipo;
    }

    public void setTipo(TipoConta tipo) {
        this.tipo = tipo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }
}


