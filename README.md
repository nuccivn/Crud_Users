# CRUD de Usuários em Java ☕

Este é um sistema de gerenciamento de usuários desenvolvido em Java para console (CLI). O projeto aplica os quatro pilares do CRUD (Create, Read, Update, Delete) com foco em robustez e experiência do usuário.

## 🎯 Objetivo
O objetivo foi transitar da lógica de scripts simples para uma aplicação estruturada em Java, explorando tipagem estática, coleções e, principalmente, o tratamento de exceções para evitar travamentos do sistema.



## 🛠️ Tecnologias e Conceitos Utilizados
* **Java SDK:** Linguagem base do projeto.
* **ArrayList:** Utilizado para armazenamento dinâmico de dados em memória.
* **Scanner:** Captura de entradas do usuário via teclado.
* **Estrutura Switch-Case:** Organização limpa e eficiente do menu principal.
* **Tratamento de Exceções (Try-Catch):** Implementado para capturar erros de entrada (como digitar letras em campos numéricos), garantindo que o programa não encerre inesperadamente.

## 🛡️ Diferenciais do Projeto
Ao contrário de um CRUD básico, este projeto inclui:
1. **Limpeza de Buffer:** Gerenciamento correto do objeto `Scanner` para evitar saltos de linha ou bugs na captura de Strings após números.
2. **Persistência em Memória:** Organização de dados em tempo de execução.

## 🚀 Como Executar
1. Certifique-se de ter o **JDK** instalado.
2. Salve o arquivo como `Main.java`.
3. Compile o código no terminal:
   ```bash
   javac Main.java
4. Rode o código no terminal:
   ```bash
   java Main.java

