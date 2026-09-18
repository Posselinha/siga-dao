package siga;

import java.util.List;

public class AlunoDAOBanco implements AlunoDAO {

    @Override
    public void inserir(Aluno aluno) {
        // Aqui — e somente aqui — mora o SQL.
        String sql = "INSERT INTO aluno (nome, matricula, media) VALUES (?, ?, ?)";

        BancoSimulado.executar(sql, aluno);

    }

    @Override
    public List<Aluno> listarTodos() {
        String sql = "SELECT nome, matricula, media FROM aluno";
        List<Aluno> linhas = BancoSimulado.consultar(sql);

        return linhas;
    }

    @Override
    public void remover(String matricula) {
        // Não será utilizado, apenas adicionando por conta 
        // da interface
    }

    @Override
    public void atualizar(Aluno aluno) {
        // Não será utilizado, apenas adicionando por conta 
        // da interface
    }

    @Override
    public Aluno buscarPorMatricula(String matricula) {
        // Não será utilizado, apenas adicionando por conta 
        // da interface
        return new Aluno("Aluno Teste", matricula, 10);
    }

    // demais operações...
}
