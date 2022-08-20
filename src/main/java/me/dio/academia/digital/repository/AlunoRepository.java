package me.dio.academia.digital.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import me.dio.academia.digital.entity.Aluno;

public interface AlunoRepository extends JpaRepository<Aluno, Long>{

    /**
     * @param dataDeNascimento
     * @return
     */
    List<Aluno> findByDataDeNascimento(LocalDate dataDeNascimento);
    
    /**
     * @param bairro
     * @return
     */
    // @Query(value = "SELECT * FROM tb_matriculas m " + 
    // "INNER JOIN tb_alunos a ON m.aluno_id = a.id" + 
    // "WHERE a.bairro = :bairro", nativeQuery = true)
    // @Query("FROM Matricula m WHERE m.aluno.bairro = :bairro")
    List<Aluno> findByBairro(String bairro);
}
    