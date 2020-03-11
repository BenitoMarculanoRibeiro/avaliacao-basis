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

import br.com.basis.prova.dominio.Disciplina;
import br.com.basis.prova.exception.DisciplinaNotFoundException;
import br.com.basis.prova.repository.DisciplinaRepository;

@SpringBootTest
@RunWith(SpringRunner.class)
@WebAppConfiguration
//@Sql(scripts = "/sql/insert_nutri_para_test_buscar_por_id.sql")
public class BuscarDisciplinaPorIdServiceImplTest {

	@Autowired
	private BuscarDisciplinaPorIdServiceImpl serviceImpl;

	@Autowired
	private DisciplinaRepository disciplinaRepository;

	@Test
	public void buscarPorIdTest() throws DisciplinaNotFoundException {

		Disciplina disciplina = serviceImpl.buscarPorId(1900);
		assertEquals("P1", disciplina.getNome());
		assertEquals("1", disciplina.getAtiva());
		assertEquals("40", disciplina.getCargaHoraria());
		assertEquals("Disciplina de Programação 1", disciplina.getDescricao());
		assertEquals("1500", disciplina.getProfessor().getId());
	}

	@Test
	public void deletarPorIdTest() throws DisciplinaNotFoundException {
		serviceImpl.deletarPorId(1850);

		Optional<Disciplina> optionalDisciplina = disciplinaRepository.findById(1850);

		assertFalse(optionalDisciplina.isPresent());
	}

}
