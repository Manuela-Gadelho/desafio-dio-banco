# 💰 Desafio DIO: Simulador de Banco em Java

Este projeto foi desenvolvido como parte de um desafio da Digital Innovation One (DIO), com o objetivo de reforçar os conceitos de **Programação Orientada a Objetos (POO)** em Java.

A aplicação simula um banco com funcionalidades básicas como **saque**, **depósito** e **transferência** entre contas, utilizando classes e herança para representar entidades bancárias.

---

## 📚 Conceitos Utilizados

O projeto foi idealizado para treinar os **4 pilares da Programação Orientada a Objetos**:

- **Abstração**
- **Encapsulamento**
- **Herança**
- **Polimorfismo**

---

## 🛠️ Funcionalidades

- 📥 Criar contas (corrente ou poupança)
- 💳 Realizar depósitos
- 💸 Realizar saques
- 🔁 Transferir valores entre contas
- 👤 Associar contas a clientes
- 🏦 Armazenar contas em um banco

---

## 🧱 Estrutura do Projeto

```text
src/
├── Banco.java
├── Cliente.java
├── Conta.java         // Classe abstrata
├── ContaCorrente.java
├── ContaPoupanca.java
├── IConta.java        // Interface com métodos de saque, depósito, etc.
└── Main.java          // Classe principal para testes e execução
```

## 🚀 Como Executar
Clone o repositório:
git clone https://github.com/Manuela-Gadelho/desafio-dio-banco.git
Abra o projeto em sua IDE Java favorita (IntelliJ, Eclipse, VS Code...)

Execute a classe Main.java, onde você pode visualizar o funcionamento das operações bancárias simuladas.

### 💡 Exemplo de Uso

Cliente cliente1 = new Cliente("Manuela");

Conta cc = new ContaCorrente(cliente1);
Conta poupanca = new ContaPoupanca(cliente1);
 
cc.depositar(1000);
cc.transferir(300, poupanca);

cc.imprimirExtrato();
poupanca.imprimirExtrato();

## 🧪 Tecnologias
Java 11+

Nenhuma dependência externa – projeto puro para foco total em lógica e POO

## 👩‍💻 Autor
Feito com ❤️ por Manuela Gadelho

## 📄 Licença
Este projeto está sob a licença MIT.
Sinta-se livre para estudar, modificar e compartilhar como quiser.
