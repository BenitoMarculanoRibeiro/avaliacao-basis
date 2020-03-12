package br.com.basis.prova.service;

import java.time.LocalDate;

import org.springframework.stereotype.Component;

import br.com.basis.prova.dominio.Aluno;
import br.com.basis.prova.exception.AlunoResourceException;
import br.com.basis.prova.resource.model.AlunoResource;

@Component
public class AlunoConversor {

	public Aluno conversor(AlunoResource alunoResource) throws AlunoResourceException {
		try {
			Aluno aluno = new Aluno();
			aluno.setNome(alunoResource.getNome());
			aluno.setMatricula(alunoResource.getMatricula());
			aluno.setCpf(alunoResource.getCpf());
			aluno.setDataNascimento(LocalDate.parse(alunoResource.getDataNascimento()));
			return aluno;
		} catch (Exception e) {
			throw new AlunoResourceException("Falha ao converter o resource para entidade, resouce: " + alunoResource);
		}

	}

}
