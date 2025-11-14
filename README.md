# Projeto: Vetor com Recursão (preencher, exibir e somar)
Docente: Ricardo Petri


Discente:Lucas Massahiro Obuchi


Este projeto em Java tem como objetivo demonstrar o uso de **recursão** em operações básicas com vetores. A aplicação trabalha com três operações principais:

1. **Preencher** um vetor de inteiros de forma recursiva
2. **Exibir** os elementos do vetor recursivamente
3. **Somar** os elementos do vetor recursivamente

O código base já contém a soma recursiva, mas pode ser adaptado para atender completamente ao enunciado da atividade.

---

## Descrição do Projeto

O programa solicita ao usuário o tamanho **N** do vetor, gera números aleatórios entre 0 e N-1, exibe todos os valores e calcula a soma total por meio de chamadas recursivas.

As operações são realizadas sem o uso de laços de repetição tradicionais (`for` ou `while`), utilizando apenas chamadas de métodos recursivos.


## Estrutura do Projeto

```
/seu-projeto
├── src
│   └── Main.java
└── README.md
```

---

## Como Executar

No terminal (dentro da pasta `src`):

## Análise de Complexidade

* Preencher recursivo: O(N)
* Exibir recursivo: O(N)
* Somar recursivo: O(N)
* Espaço adicional: O(N) devido à pilha de chamadas recursivas

---

## Critérios de Avaliação

* [x] Leitura do tamanho N do vetor
* [x] Criação dinâmica do vetor
* [x] Preenchimento recursivo
* [x] Exibição recursiva
* [x] Soma recursiva
* [x] Saída organizada e legível

---

## Casos de Teste Recomendados

1. **N = 0** → vetor vazio, soma igual a 0
2. **N = 1** → apenas um valor, fácil de validar
3. **Valores repetidos** → verificar se a soma confere
4. **N grande (ex.: 10000)** → testar limites da recursão

---


