package br.com.basis.prova.service;

import java.time.LocalDate;

import org.springframework.stereotype.Component;

import br.com.basis.prova.dominio.Professor;
import br.com.basis.prova.exception.ProfessorResourceException;
import br.com.basis.prova.resource.model.ProfessorResource;

@Component
public class ProfessorConversor {

	public Professor conversor(ProfessorResource professorResource) throws ProfessorResourceException {
		try {
			Professor professor = new Professor();
			LocalDate dataNascimento = professorResource.getDataNascimento();
			professor.setNome(professorResource.getNome());
			professor.setMatricula(professorResource.getMatricula());
			professor.setArea(professorResource.getArea());
			professor.setDataNascimento(dataNascimento);
			;
			return professor;
		} catch (Exception e) {
			throw new ProfessorResourceException(
					"Falha ao converter o resource para entidade, resouce: " + professorResource);
		}

	}
}
