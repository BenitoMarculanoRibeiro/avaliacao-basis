package br.com.basis.prova.service;

import org.springframework.stereotype.Component;

import br.com.basis.prova.dominio.Disciplina;
import br.com.basis.prova.exception.DisciplinaResourceException;
import br.com.basis.prova.resource.model.DisciplinaResource;

@Component
public class DisciplinaConversor {

	public Disciplina conversor(DisciplinaResource disciplinaResource) throws DisciplinaResourceException {
		try {
			Disciplina disciplina = new Disciplina();
			// LocalDate dataNascimento =
			// checkIdade(disciplinaResource.getDataNascimento());
			disciplina.setNome(disciplinaResource.getNome());
			disciplina.setDescricao(disciplinaResource.getDescricao());
			disciplina.setCargaHoraria(Integer.parseInt(disciplinaResource.getCargaHoraria()));
			disciplina.setAtiva(Integer.parseInt(disciplinaResource.getAtiva()));
			disciplina.setProfessor(disciplinaResource.getProfessor());
			// ProfessorResource p = disciplinaResource.getProfessor();

			return disciplina;
		} catch (Exception e) {
			throw new DisciplinaResourceException(
					"Falha ao converter o resource para entidade, resouce: " + disciplinaResource);
		}

	}

}
