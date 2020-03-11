package br.com.basis.prova.service;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.basis.prova.dominio.Disciplina;
import br.com.basis.prova.exception.DisciplinaResourceException;
import br.com.basis.prova.repository.DisciplinaRepository;
import br.com.basis.prova.resource.model.DisciplinaResource;

@Service
public class CadastroDisciplinaServiceImpl {

	private static final Logger LOG = Logger.getLogger(CadastroDisciplinaServiceImpl.class);

	@Autowired
	private DisciplinaRepository disciplinaRepository;

	@Autowired
	private DisciplinaConversor service;

	public void cadastro(DisciplinaResource disciplinaResource) {

		try {
			Disciplina disciplina = service.conversor(disciplinaResource);
			disciplinaRepository.saveAndFlush(disciplina);
		} catch (DisciplinaResourceException e) {
			LOG.error("Erro ao salvar o disciplina: " + e.getMessage(), e);
		}
	}

}
