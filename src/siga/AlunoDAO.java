package siga;

import java.util.List;

// Implementação do AlunoDAo sem utilizar sql, apenass o vocabulário de dominio aluno e matricula
public interface AlunoDAO {

    void inserir(Aluno aluno);

    Aluno buscarPorMatricula(String matricula);

    List<Aluno> listarTodos();

    void atualizar(Aluno aluno);

    void remover(String matricula);
}
