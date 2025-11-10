# 🎬 Festival de Premiação de Filmes

Um projeto desenvolvido para a disciplina de **Programação Orientada a Objetos (POO)** em Java, com o objetivo de simular um **festival de cinema** — incluindo filmes, categorias de premiação, equipes técnicas e participantes individuais.  

---

## 🧠 Sobre o projeto  

O **Festival de Premiação de Filmes** simula o funcionamento de uma cerimônia de prêmios cinematográficos.  
O programa cria categorias (como *Melhor Filme*, *Melhor Ator*, *Melhores Efeitos Visuais*), adiciona filmes participantes, equipes e atores, realiza nomeações e define os vencedores em cada categoria.  

No final, é exibida a **pontuação total de cada filme** com base nas premiações recebidas.  

---

## 🧩 Estrutura do projeto  

O sistema é composto pelas seguintes classes:  

| Classe | Função |
|:--|:--|
| **Main** | Contém o ponto de entrada do programa e simula o festival. |
| **Festival** | Gerencia as listas de filmes e categorias do evento. |
| **Categoria** | Representa uma categoria de premiação (ex: Melhor Filme, Melhor Ator). |
| **Filme** | Modela as informações básicas de um filme (título, gênero, pontuação, etc). |
| **Participante** | Representa um indivíduo (como um ator) que pode concorrer em categorias individuais. |
| **Equipe** | Representa uma equipe técnica, como a de efeitos visuais, composta por vários participantes. |
| **Premiavel** | Interface (ou classe abstrata) que define o comportamento de itens que podem ser premiados. |
| **TipoCategoria** | Enum que diferencia o tipo de categoria (*FILME*, *INDIVIDUAL*, *EQUIPE*). |

---

## 💻 Tecnologias utilizadas  

- **Java 17+**  
- Programação Orientada a Objetos (POO)  
- Console (saída de texto no terminal)

---

## 🧠 Conceitos de POO aplicados  

Este projeto faz uso dos principais pilares da Programação Orientada a Objetos:

| Conceito | Aplicação |
|:--|:--|
| **Encapsulamento** | As classes possuem atributos privados e métodos públicos para acesso e modificação controlada. |
| **Herança** | Algumas classes compartilham comportamentos e características comuns, reutilizando código. |
| **Polimorfismo** | Métodos são implementados de formas diferentes dependendo da classe que os utiliza (ex: premiar filmes, participantes ou equipes). |
| **Abstração** | Classes como `Premiavel` definem comportamentos genéricos que são detalhados apenas nas subclasses. |

---

## 🚀 Execução  

Para testar o projeto, basta executar o arquivo `Main.java`.  
Ele cria um festival, adiciona filmes, equipes e participantes, faz as nomeações e imprime os resultados no console.

---

## 👩‍💻 Autora

**Juliana Piccinini**  
Projeto desenvolvido como parte da disciplina de **Programação Orientada a Objetos**.  
**2025.2**


