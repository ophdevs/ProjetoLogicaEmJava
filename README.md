# Projetos de Lógica em Java

Repositório com projetos práticos para estudo de lógica de programação e orientação a objetos em Java.

## Projetos

### PetShop

Sistema de gerenciamento de serviços para pets via terminal.

O programa recebe os dados de um pet e seu dono, registra os serviços realizados e calcula o total gasto em um determinado mês e ano.

**Funcionalidades:**
- Cadastro de pet (nome, espécie e dono)
- Registro de múltiplos serviços com data, tipo, preço e duração
- Cálculo do total gasto por mês/ano

**Tipos de serviços disponíveis:**
- `BANHO`
- `TOSA`
- `VETERINARIO`

**Estrutura:**
```
src/PetShop/
├── Main.java
└── entities/
    ├── Dono.java
    ├── Pet.java
    ├── ServicoPet.java
    └── ennum/
        └── TiposServicos.java
```

**Exemplo de uso:**
```
Nome do seu pet: Rex
Especie do seu pet: Cachorro
Nome do Dono: João

Quantos servicos? 2

Servico #1
digite a data (DD/MM/YYYY): 10/05/2026
Qual o tipo de serviço (BANHO/VETERINARIO/TOSA): BANHO
Preço: 50.00
qual a duracao em minutos: 30

Servico #2
digite a data (DD/MM/YYYY): 20/05/2026
Qual o tipo de serviço (BANHO/VETERINARIO/TOSA): TOSA
Preço: 40.00
qual a duracao em minutos: 45

Coloque o mes: 5
Coloque o ano: 2026

-----Resultado-----
Pet = Rex
Dono = João
Especie = Cachorro
Gasto de 05/2026 é 90,00
```

## Tecnologias

- Java
- IntelliJ IDEA
