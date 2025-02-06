# Projeto de Polimorfismo em Java: Sistema de Bônus para Funcionários

Este projeto foi desenvolvido como parte do meu portfólio para demonstrar o uso de **polimorfismo**, **herança**, **interfaces** e o operador **`instanceof`** em **Programação Orientada a Objetos (POO)** com Java. O objetivo é simular um sistema de cálculo de bônus para funcionários, onde gerentes e vendedores têm regras diferentes para o cálculo do bônus.

---

## Descrição

O projeto consiste em:
- Uma classe abstrata `Funcionario`, que define atributos comuns (nome, salário, cargo) e implementa a interface `Bonus`.
- Duas subclasses: `Gerente` e `Vendedor`, que herdam de `Funcionario` e implementam o método `calcularBonus()` de forma específica.
- Uma interface `Bonus`, que define o contrato para o cálculo do bônus.
- Uma classe `CalculadoraBonus`, que usa polimorfismo para calcular e exibir o bônus de qualquer funcionário.
- O operador **`instanceof`** é utilizado para verificar se o funcionário é um vendedor e, nesse caso, exibir quantas vendas foram realizadas no mês.

---

## Estrutura do Projeto

### Classes Principais

1. **Classe Abstrata `Funcionario`**:
   - **Atributos**:
     - `String nome`: Nome do funcionário.
     - `double salario`: Salário do funcionário.
     - `String cargo`: Setor do funcionário.
   - **Métodos**:
     - `calcularBonus()`: Método abstrato para cálculo do bônus.

2. **Interface `Bonus`**:
   - Define o método `calcularBonus()`.

3. **Classe `Gerente`**:
   - Herda de `Funcionario`.
   - Implementa o método `calcularBonus()` com um bônus de 10% do salário.

4. **Classe `Vendedor`**:
   - Herda de `Funcionario`.
   - Adiciona o atributo `double vendaMes` (valor total das vendas no mês).
   - Implementa o método `calcularBonus()` com um bônus de 15% do salário.

5. **Classe `CalculadoraBonus`**:
   - **Método**:
     - `calculadoraBonus(Funcionario funcionario)`: Calcula e exibe o bônus do funcionário, utilizando `instanceof` para tratar vendedores de forma específica.

6. **Classe `Teste`**:
   - Cria objetos de `Gerente` e `Vendedor` e usa a `CalculadoraBonus` para calcular e exibir o bônus de cada um.

---

## Como Executar

1. Clone o repositório:
   ```bash
   git clone https://github.com/jopsantossilva2005/Heranca-e-Polimorfismo.git
