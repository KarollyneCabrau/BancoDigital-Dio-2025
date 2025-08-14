# 💻 Desafio Banco Digital - Java POO

## 📌 Descrição do Projeto
Este projeto tem como objetivo **reforçar conhecimentos em Programação Orientada a Objetos (POO) em Java** através da implementação de um **Banco Digital**.  
Aqui você poderá aplicar conceitos de POO para criar funcionalidades bancárias reais, desenvolvendo sua **capacidade de abstração** e prática em Java.  

---

## 🎯 Objetivo
Reproduzir um projeto de referência disponível no GitHub, aplicando os pilares da POO:  

- **Abstração**  
- **Encapsulamento**  
- **Herança**  
- **Polimorfismo**  

💡 Além disso, você poderá **implementar melhorias e evoluções próprias**, tornando o projeto ainda mais completo.  

---

## 🛠 Requisitos Técnicos
- ⚡ Conhecimentos básicos em **Java e POO**  
- 🖥 **IDE Java** configurada (Eclipse, IntelliJ, etc.)  
- 🌐 **Acesso à internet** para clonar o projeto do GitHub  
- 🗂 Familiaridade com **Git** (opcional, mas recomendado)  
- 🧠 Capacidade de **abstração** para reproduzir e evoluir a solução proposta  

---

## 📝 Exemplo de Código
```java
// Criando uma conta bancária simples
public class Conta {
    private String titular;
    private double saldo;

    public Conta(String titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public void sacar(double valor) {
        if(valor <= saldo) saldo -= valor;
    }

    public void mostrarSaldo() {
        System.out.println("Saldo de " + titular + ": R$" + saldo);
    }
}
