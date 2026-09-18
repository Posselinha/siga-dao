package siga;

import java.util.ArrayList;
import java.util.List;

/**
 * Código INICIAL da atividade.
 *
 * SIMULADOR de banco de dados. Serve apenas para que o projeto execute sem
 * exigir um servidor de banco instalado: ele imita a execução de comandos SQL,
 * imprimindo o que seria enviado ao banco e guardando as linhas em memória.
 *
 * Trate esta classe como se fosse o driver JDBC real: ela representa a
 * "tecnologia de persistência" da qual a regra de negócio NÃO deveria depender.
 * Não é necessário alterá-la na atividade.
 */
public class BancoSimulado {

    private static final List<Aluno> ALUNOS = new ArrayList<>();

    /**
     * Simula a execução de um comando de escrita (INSERT, UPDATE, DELETE).
     */
    public static void executar(String sql, Aluno aluno) {
        System.out.println("[SQL] " + sql);
        ALUNOS.add(new Aluno(aluno.getNome(), aluno.getMatricula(), aluno.getMedia()));
    }

    /**
     * Simula a execução de uma consulta, devolvendo as linhas gravadas.
     */
    public static List<Aluno> consultar(String sql) {
        System.out.println("[SQL] " + sql);
        return new ArrayList<>(ALUNOS);
    }
}
