package br.com.basis.prova.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.basis.prova.dominio.Aluno;
import br.com.basis.prova.exception.AlunoNotFoundException;
import br.com.basis.prova.repository.AlunoRepository;

@Service
public class BuscarAlunoPorIdServiceImpl {

	@Autowired
	private AlunoRepository alunoRepository;

	public Aluno buscarPorId(Integer id) throws AlunoNotFoundException {
		Optional<Aluno> optionalAluno = getOptional(id);
		Aluno aluno = null;
		if (!optionalAluno.isPresent()) {
			throw new AlunoNotFoundException("Aluno nao encontrado atraves do ID: " + id);
		} else {
			aluno = optionalAluno.get();
		}
		return aluno;
	}

	private Optional<Aluno> getOptional(Integer id) {
		Optional<Aluno> optionalAluno = alunoRepository.findById(id);
		return optionalAluno;
	}

	public void deletarPorId(Integer id) throws AlunoNotFoundException {
		Optional<Aluno> optionalAluno = getOptional(id);
		if (!optionalAluno.isPresent()) {
			throw new AlunoNotFoundException("Aluno nao encontrado atraves do ID: " + id);
		} else {
			alunoRepository.delete(optionalAluno.get());
		}

	}

}
