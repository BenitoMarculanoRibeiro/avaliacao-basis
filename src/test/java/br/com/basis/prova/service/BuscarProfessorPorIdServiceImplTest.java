package br.com.basis.prova.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import java.util.Optional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import br.com.basis.prova.dominio.Professor;
import br.com.basis.prova.exception.ProfessorNotFoundException;
import br.com.basis.prova.repository.ProfessorRepository;

@SpringBootTest
@RunWith(SpringRunner.class)
@WebAppConfiguration
//@Sql(scripts = "/sql/insert_nutri_para_test_buscar_por_id.sql")
public class BuscarProfessorPorIdServiceImplTest {

	@Autowired
	private BuscarProfessorPorIdServiceImpl serviceImpl;

	@Autowired
	private ProfessorRepository professorRepository;

	@Test
	public void buscarPorIdTest() throws ProfessorNotFoundException {

		Professor professor = serviceImpl.buscarPorId(1500);
		assertEquals("Murilo", professor.getNome());
		assertEquals("P123", professor.getMatricula());
		assertEquals("TI", professor.getArea());
		assertEquals("1999-11-11", String.valueOf(professor.getDataNascimento()));
	}

	@Test
	public void deletarPorIdTest() throws ProfessorNotFoundException {
		serviceImpl.deletarPorId(1450);

		Optional<Professor> optionalProfessor = professorRepository.findById(1450);

		assertFalse(optionalProfessor.isPresent());
	}

}
