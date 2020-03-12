package br.com.basis.prova.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.basis.prova.dominio.Aluno;
import br.com.basis.prova.repository.AlunoRepository;

@Service
public class BuscarAlunosServiceImpl {

	@Autowired
	private AlunoRepository alunoRepository;

	public List<Aluno> buscarTodosOsAlunos() {
		List<Aluno> listAluno = alunoRepository.findAll();
		return listAluno;
	}
}
