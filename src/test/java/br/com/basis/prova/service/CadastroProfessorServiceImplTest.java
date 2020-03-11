package br.com.basis.prova.service;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import br.com.basis.prova.dominio.Professor;
import br.com.basis.prova.repository.ProfessorRepository;
import br.com.basis.prova.resource.model.ProfessorResource;

@SpringBootTest
@RunWith(SpringRunner.class)
@WebAppConfiguration
//@Sql(scripts = "/sql/delete_professors.sql")
public class CadastroProfessorServiceImplTest {

	@Autowired
	private CadastroProfessorServiceImpl serviceImpl;

	@Autowired
	private ProfessorRepository professorRepository;

	private ProfessorResource resource;

	@Before
	public void setUp() {
		resource = new ProfessorResource();
		resource.setNome("Murilo");
		resource.setMatricula("P123");
		resource.setArea("TI");
		resource.setDataNascimento("1999-11-11");
	}

	@Test
	public void cadastroTest() {
		serviceImpl.cadastro(resource);

		Professor professor = professorRepository.findAll().stream().filter(profe -> profe.getNome().equals("Murilo"))
				.findFirst().get();
		assertEquals("Murilo", professor.getNome());
		assertEquals("P123", professor.getMatricula());
		assertEquals("TI", professor.getArea());
		assertEquals("1999/11/11", professor.getDataNascimento());
	}

}
