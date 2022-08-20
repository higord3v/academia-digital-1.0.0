package me.dio.academia.digital.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import me.dio.academia.digital.entity.Aluno;
import me.dio.academia.digital.entity.Matricula;
import me.dio.academia.digital.entity.form.MatriculaForm;
import me.dio.academia.digital.repository.AlunoRepository;
import me.dio.academia.digital.repository.MatriculaRepository;

@Service
public class MatriculaServiceImpl implements IMatriculaService{

    @Autowired
    private MatriculaRepository repository;

    @Autowired
    private AlunoRepository alunoRepository;

    @Override
    public Matricula create(MatriculaForm form) {
        // TODO Auto-generated method stub

        Aluno aluno = alunoRepository.getById(form.getAlunoId());
        
        Matricula matricula = new Matricula();
        matricula.setAluno(aluno);
        return repository.save(matricula);
    }

    @Override
    public Matricula get(Long id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<Matricula> getAll() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void delete(Long id) {
        // TODO Auto-generated method stub
        
    }
    
}
