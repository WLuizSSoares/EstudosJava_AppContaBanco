public class ContaBanco {
    public int numConta;
    protected TipoConta tipo;
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
        if (this.status == false){
            this.status = true;
             if (this.tipo == TipoConta.CP){
                 this.saldo = 150;
                 System.out.println("----Conta----\n Tipo: " + tipo + "\n Dono: " + dono + "\n Aberta com saldo inicial de 150!");
                 System.out.println("-------------------------");
             }else{
                 this.saldo = 50;
                 System.out.println("Conta do tipo " + tipo + " dono " + dono + " aberta com saldo inicial de 50!");
             }
        }else{
            System.out.println("Conta já aberta! ");
        }


    }

    public void fecharConta(TipoConta tipo, String dono){
        if (this.status == true){
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
    public void depositar(Double deposito){
        if (this.status == true){
            this.saldo += deposito;
            System.out.println("Deposito de R$" + deposito +" feito com sucesso!");
        }else{
            System.out.println("A conta precisa estar aberta para depositar!");
        }

    }
    public void sacar(Double saque){
        if (this.status == true){
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
    public void pagarMensal(TipoConta tipo, String dono){
        this.tipo = tipo;
        this.dono = dono;
        int valorMensal = 0;
        if (this.status == true){
            if (this.tipo == TipoConta.CC){
                valorMensal = 12;
            }else{
                valorMensal = 20;

            }
            if (this.saldo >= valorMensal){
                this.saldo -= valorMensal;
                System.out.println("Mensalidade de R$"+valorMensal +" paga com sucesso, saldo atual: !"+this.saldo);
            }else{
                System.out.println("Saldo insuficiente para pagar a mensalidade");
            }
        }else{
            System.out.println("Não há conta aberta para pagamento de mensalidade.");
        }

    }
    public void saldoConta(TipoConta tipo, String dono){
        this.tipo = tipo;
        this.dono = dono;
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


