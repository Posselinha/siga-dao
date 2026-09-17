# SIGA — Atividade de Persistência e padrão DAO

## Estrutura do projeto

```
siga-dao/
└── src/
    └── siga/
        ├── Aluno.java             (entidade de domínio; pronta)
        ├── BancoSimulado.java     (simula o banco; representa a tecnologia)
        ├── ServicoMatricula.java  (contém os problemas a refatorar)
        └── Main.java              (demonstra os problemas em execução)
```

## Como compilar e executar

Pré-requisito: JDK 17 ou superior (`java -version` para verificar).

```bash
# 1. Compilar (a saída vai para a pasta "bin")
javac -d bin src/siga/*.java

# 2. Executar
java -cp bin siga.Main
```
