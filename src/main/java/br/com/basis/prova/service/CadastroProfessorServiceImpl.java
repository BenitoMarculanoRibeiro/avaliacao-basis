package br.com.basis.prova.service;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.basis.prova.dominio.Professor;
import br.com.basis.prova.exception.ProfessorResourceException;
import br.com.basis.prova.repository.ProfessorRepository;
import br.com.basis.prova.resource.model.ProfessorResource;

@Service
public class CadastroProfessorServiceImpl {

	private static final Logger LOG = Logger.getLogger(CadastroProfessorServiceImpl.class);

	@Autowired
	private ProfessorRepository professorRepository;

	@Autowired
	private ProfessorConversor service;

	public void cadastro(ProfessorResource professorResource) {

		try {
			Professor professor = service.conversor(professorResource);
			professorRepository.saveAndFlush(professor);
		} catch (ProfessorResourceException e) {
			LOG.error("Erro ao salvar o professor: " + e.getMessage(), e);
		}
	}

}
