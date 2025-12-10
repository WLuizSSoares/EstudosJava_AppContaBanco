### Tecnologias Utilizadas
Java 17+
Scanner (entrada de dados)
Enum (TipoConta)
Random (geração de número da conta)
Programação Orientada a Objetos

### Funcionalidades Implementadas
✔ Criar conta

O usuário informa:
nome do dono
tipo da conta:
CP = Conta Poupança
CC = Conta Corrente
O sistema gera automaticamente um número de conta aleatório entre 1000 e 9999.

✔ Depositar
O cliente insere um valor e ele é somado ao saldo.

✔ Sacar
Um valor é descontado, desde que haja saldo suficiente.

✔ Exibir saldo
Mostra o saldo atual da conta.

✔ Pagar mensalidade
Baseado no tipo da conta:

Poupança: mensalidade X

Corrente: mensalidade Y
(Valores dependem da sua implementação da classe ContaBanco.)

✔ Fechar conta
A conta só pode ser fechada se:

Não houver saldo positivo
Não houver saldo negativo
(Regras controladas dentro da classe ContaBanco.)

✔ Menu interativo
Sempre retorna ao menu principal até o usuário escolher 0 - Sair.

##Exemplo do Menu
----BND | Banco Sempre Duro----
----Menu Banco----
1. Criar conta [CP - Poupança | CC - Corrente]
2. Fechar conta
3. Depositar
4. Sacar
5. Saldo
6. Pagamento Mensalidade
0. Sair
