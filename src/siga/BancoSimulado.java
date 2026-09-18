package siga;

import java.util.ArrayList;
import java.util.List;

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
