package com.anthony.senai.demo;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.anthony.senai.demo.domain.Cidade;
import com.anthony.senai.demo.domain.Cliente;
import com.anthony.senai.demo.domain.Endereco;
import com.anthony.senai.demo.domain.Estado;
import com.anthony.senai.demo.domain.enuns.TipoCliente;
import com.anthony.senai.demo.repositories.CidadeRepository;
import com.anthony.senai.demo.repositories.ClienteRepository;
import com.anthony.senai.demo.repositories.EnderecoRepository;
import com.anthony.senai.demo.repositories.EstadoRepository;

@SpringBootApplication
public class CursoSenaiApplication implements CommandLineRunner {

	@Autowired
	private EstadoRepository estadoRepository;

	@Autowired
	private ClienteRepository clienteRepository;

	@Autowired
	private EnderecoRepository enderecoRepository;

	@Autowired
	private CidadeRepository cidadeRepository;

	public static void main(String[] args) {
		SpringApplication.run(CursoSenaiApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Estado est1 = new Estado(null, "Minas Gerais");
		Estado est2 = new Estado(null, "São Paulo");
		estadoRepository.saveAll(Arrays.asList(est1, est2));

		Cidade c1 = new Cidade(null, "Uberlândia", est1);
		Cidade c2 = new Cidade(null, "São Paulo", est2);
		cidadeRepository.saveAll(Arrays.asList(c1, c2));

		Cliente cli1 = new Cliente(null, "Um", "10000000001", "um@gmail", TipoCliente.PESSOAFISICA);
		cli1.getTelefones().addAll(Arrays.asList("34900000001", "34900000002"));
		clienteRepository.saveAll(Arrays.asList(cli1));

		Cliente cli2 = new Cliente(null, "Dois", "10000000002", "dois@gmail", TipoCliente.PESSOAFISICA);
		cli2.getTelefones().addAll(Arrays.asList("34900000003", "34900000004"));
		clienteRepository.saveAll(Arrays.asList(cli2));

		Cliente cli3 = new Cliente(null, "Tres", "10000000003", "tres@gmail", TipoCliente.PESSOAFISICA);
		cli3.getTelefones().addAll(Arrays.asList("34900000005", "34900000006"));
		clienteRepository.saveAll(Arrays.asList(cli3));

		Cliente cli4 = new Cliente(null, "Quatro", "10000000004", "quatro@gmail", TipoCliente.PESSOAFISICA);
		cli4.getTelefones().addAll(Arrays.asList("34900000005", "34900000006"));
		clienteRepository.saveAll(Arrays.asList(cli4));

		Cliente cli5 = new Cliente(null, "Cinco", "10000000005", "cinco@gmail", TipoCliente.PESSOAFISICA);
		cli5.getTelefones().addAll(Arrays.asList("34900000007", "34900000008"));
		clienteRepository.saveAll(Arrays.asList(cli5));

		Cliente cli6 = new Cliente(null, "Seis", "10000000006", "seis@gmail", TipoCliente.PESSOAFISICA);
		cli6.getTelefones().addAll(Arrays.asList("34900000009", "34900000010"));
		clienteRepository.saveAll(Arrays.asList(cli6));

		Cliente cli7 = new Cliente(null, "Sete", "10000000007", "sete@gmail", TipoCliente.PESSOAFISICA);
		cli7.getTelefones().addAll(Arrays.asList("34900000011", "34900000012"));
		clienteRepository.saveAll(Arrays.asList(cli7));

		Cliente cli8 = new Cliente(null, "Oito", "10000000008", "@gmail", TipoCliente.PESSOAFISICA);
		cli8.getTelefones().addAll(Arrays.asList("34900000013", "34900000014"));
		clienteRepository.saveAll(Arrays.asList(cli8));

		Cliente cli9 = new Cliente(null, "Nove", "10000000009", "nove@gmail", TipoCliente.PESSOAFISICA);
		cli9.getTelefones().addAll(Arrays.asList("34900000015", "34900000016"));
		clienteRepository.saveAll(Arrays.asList(cli9));

		Cliente cli10 = new Cliente(null, "Dez", "10000000010", "dez@gmail", TipoCliente.PESSOAFISICA);
		cli10.getTelefones().addAll(Arrays.asList("34900000019", "34900000020"));
		clienteRepository.saveAll(Arrays.asList(cli10));

		Endereco e1 = new Endereco(null, "Rua Emboabas", "55b", "Ap 310", "Jardim", "38410000", cli1, c1);
		Endereco e2 = new Endereco(null, "Rua Alameda Nascimento", "234", null, "Centro", "38410001", cli2, c2);
		Endereco e3 = new Endereco(null, "Rua Emboabas", "100", null, "Jardim", "38410002", cli3, c1);
		Endereco e4 = new Endereco(null, "Rua Alameda Nascimento", "540", null, "Centro", "38410003", cli4, c2);
		Endereco e5 = new Endereco(null, "Rua Emboabas", "110", null, "Jardim", "38410004", cli5, c1);
		Endereco e6 = new Endereco(null, "Rua Emboabas", "120", null, "Jardim", "38410005", cli6, c1);
		Endereco e7 = new Endereco(null, "Rua Emboabas", "130", null, "Jardim", "38410006", cli7, c1);
		Endereco e8 = new Endereco(null, "Rua Alameda Nascimento", "572", null, "Centro", "38410007", cli8, c2);
		Endereco e9 = new Endereco(null, "Rua Alameda Nascimento", "562", null, "Centro", "38410008", cli9, c2);
		Endereco e10 = new Endereco(null, "Rua Emboabas", "140", null, "Jardim", "38410009", cli10, c1);

		cli1.getEnderecos().addAll(Arrays.asList(e1));
		cli2.getEnderecos().addAll(Arrays.asList(e2));
		cli3.getEnderecos().addAll(Arrays.asList(e1));
		cli4.getEnderecos().addAll(Arrays.asList(e2));
		cli5.getEnderecos().addAll(Arrays.asList(e1));
		cli6.getEnderecos().addAll(Arrays.asList(e1));
		cli7.getEnderecos().addAll(Arrays.asList(e1));
		cli8.getEnderecos().addAll(Arrays.asList(e2));
		cli9.getEnderecos().addAll(Arrays.asList(e2));
		cli10.getEnderecos().addAll(Arrays.asList(e1));
		enderecoRepository.saveAll(Arrays.asList(e1, e2, e3, e4, e5, e6, e7, e8, e9, e10));
	}

}
