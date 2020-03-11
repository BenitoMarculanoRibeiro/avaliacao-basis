package br.com.basis.prova.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.List;
import java.util.Objects;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import br.com.basis.prova.dominio.Professor;
import br.com.basis.prova.repository.ProfessorRepository;

@SpringBootTest
@RunWith(SpringRunner.class)
@WebAppConfiguration
//@Sql(scripts = "/sql/insert_profe_buscar_todos_os_profe.sql")
public class BuscarProfessorsServiceImplTest {

	@Autowired
	private BuscarProfessorsServiceImpl serviceImpl;

	@Autowired
	private ProfessorRepository professorRepository;

	@Test
	public void buscarTodosOsProfessorsTest() {
		List<Professor> listaProfessors = serviceImpl.buscarTodosOsProfessors();

		List<Professor> listaProfessorsDatabase = professorRepository.findAll();

		Professor professorService = listaProfessors.stream().filter(profe -> profe.getNome().equals("Murilo"))
				.findFirst().get();

		Professor professorDatabase = listaProfessorsDatabase.stream().filter(profe -> profe.getNome().equals("Murilo"))
				.findFirst().get();

		assertNotNull(Objects.nonNull(listaProfessors));
		assertEquals(professorDatabase.getNome(), professorService.getNome());
		assertEquals(professorDatabase.getMatricula(), professorService.getMatricula());
		assertEquals(professorDatabase.getArea(), professorService.getArea());
		assertEquals(professorDatabase.getDataNascimento(), professorService.getDataNascimento());
		assertEquals(listaProfessors.size(), listaProfessorsDatabase.size());

	}

}
