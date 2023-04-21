package me.dio.academia.digital.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import me.dio.academia.digital.entity.Matricula;

@Repository
public interface MatriculaRepository extends JpaRepository<Matricula, Long>{


//@Query(value = "Select * FROM tb_matriculas m " + "INNER JOIN tb_alunos a ON m.aluno_id = a.id " + "WHERE a.bairro = :bairro", nativeQuery = true)
//@Query("From Matricula m Where m.aluno.bairrro = :bairro ")
//List<Matricula> findAlunosMatriculadosBairro(String bairro);

List<Matricula> findByAlunoBairro(String bairro);
}