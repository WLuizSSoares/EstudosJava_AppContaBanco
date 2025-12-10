# Tecnologias Utilizadas

Java 17+
Scanner (entrada de dados)
Enum (TipoConta)
Random (geração de número da conta)
Programação Orientada a Objetos

# Funcionalidades implementadas

##Criar Conta
  * nome do dono
  * tipo de conta
      * CP = Conta Poupança
      * CC = Conta Corrente
   O sistema gera automaticamente um número de conta aleatório entre 1000 e 9999.

## Depositar conta
O cliente insere um valor e ele é somado ao saldo.

## Sacar
Um valor é descontado, desde que haja saldo suficiente.

## Exibir Saldo
Mostra o saldo atual da conta.

## Pagar Mensalidade
Baseado no tipo de conta:
  * Poupança: mensalidade x
  * Corrente: mensalidade y
(Valores dependem da sua implementação da classe ContaBanco.)

## Fechar Conta
A conta só pode ser fechada se:
  * Não houver saldo positivo
  * Não houver saldo negativo
 (Regras controladas dentro da classe ContaBanco.)

## Menu interativo
Sempre retorna ao menu principal até o usuário escolher 0 - Sair.

# Exemplo do Menu
----BND | Banco Sempre Duro----
----Menu Banco----
1. Criar conta [CP - Poupança | CC - Corrente]
2. Fechar conta
3. Depositar
4. Sacar
5. Saldo
6. Pagamento Mensalidade
0. Sair
