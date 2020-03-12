package br.com.basis.prova.service;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.basis.prova.dominio.Aluno;
import br.com.basis.prova.exception.AlunoResourceException;
import br.com.basis.prova.repository.AlunoRepository;
import br.com.basis.prova.resource.model.AlunoResource;

@Service
public class CadastroAlunoServiceImpl {

	private static final Logger LOG = Logger.getLogger(CadastroAlunoServiceImpl.class);

	@Autowired
	private AlunoRepository alunoRepository;

	@Autowired
	private AlunoConversor service;

	public void cadastro(AlunoResource alunoResource) {

		try {
			Aluno aluno = service.conversor(alunoResource);
			alunoRepository.saveAndFlush(aluno);
		} catch (AlunoResourceException e) {
			LOG.error("Erro ao salvar o aluno: " + e.getMessage(), e);
		}
	}

}
