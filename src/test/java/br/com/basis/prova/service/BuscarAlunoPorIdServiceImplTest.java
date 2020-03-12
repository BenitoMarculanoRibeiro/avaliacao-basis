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

import br.com.basis.prova.dominio.Aluno;
import br.com.basis.prova.exception.AlunoNotFoundException;
import br.com.basis.prova.repository.AlunoRepository;

@SpringBootTest
@RunWith(SpringRunner.class)
@WebAppConfiguration
//@Sql(scripts = "/sql/insert_nutri_para_test_buscar_por_id.sql")
public class BuscarAlunoPorIdServiceImplTest {

	@Autowired
	private BuscarAlunoPorIdServiceImpl serviceImpl;

	@Autowired
	private AlunoRepository alunoRepository;

	@Test
	public void buscarPorIdTest() throws AlunoNotFoundException {
		Aluno aluno = serviceImpl.buscarPorId(2200);
		assertEquals("Marcia", aluno.getNome());
		assertEquals("20181TADSt0180", aluno.getMatricula());
		assertEquals("12345678912", aluno.getCpf());
		assertEquals("1987-11-12", aluno.getDataNascimento());
	}

	@Test
	public void deletarPorIdTest() throws AlunoNotFoundException {
		serviceImpl.deletarPorId(2150);
		Optional<Aluno> optionalAluno = alunoRepository.findById(2150);
		assertFalse(optionalAluno.isPresent());
	}
}
