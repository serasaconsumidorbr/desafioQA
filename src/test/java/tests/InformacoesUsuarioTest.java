package tests;

import static org.junit.Assert.assertEquals;

import org.easetech.easytest.annotation.DataLoader;
import org.easetech.easytest.annotation.Param;
import org.easetech.easytest.runner.DataDrivenTestRunner;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import pages.HomePage;
import suporte.Screenshot;
import suporte.Web;

@RunWith(DataDrivenTestRunner.class)
@DataLoader(filePaths="InformacoesUsuarioTest.csv")
public class InformacoesUsuarioTest {
	private WebDriver navegador;
	String diretorio = "C:\\Users\\Estudo\\evidencia\\Serasa\\";


	@Before
	public void setUp() {
		navegador = Web.createChrome();

	}

	@Test
	public void testTentativaCadastroDadosInvalidos(
			@Param(name = "cpf") String cpf,
			@Param(name = "nomesobrenome") String nomesobrenome, 
			@Param(name = "nascimento") String nascimento,
			@Param(name = "email") String email, 
			@Param(name = "senha") String senha,
			@Param(name = "mensagem") String mensagem) {
		
		//Print
		Screenshot.print(navegador, diretorio + "CT001 - testTentativaCadastroDadosInvalidos " + suporte.Generator.dataHoraParaArquivo() + ".png");
		
		String textoMsg = new HomePage(navegador)
		.clicarConsultarCpf()
		.informarCpf(cpf)
		.preencherFormulario(nomesobrenome, nascimento, email, senha)
		.capturarTexto();
		
		assertEquals(mensagem, textoMsg);
		
		//Print
		Screenshot.print(navegador, diretorio + "CT001 - testTentativaCadastroDadosInvalidos " + suporte.Generator.dataHoraParaArquivo() + ".png");

	}

	@Test
	public void testValidaLogin(
			@Param(name = "cpf") String cpf,
			@Param(name = "senha") String senha,
			@Param(name = "msglogado")String msglogado) {
		
		Screenshot.print(navegador, diretorio + "CT002 - testValidaLogin " + suporte.Generator.dataHoraParaArquivo() + ".png");
		
		String textoUsuario = new HomePage(navegador)
		.clicarEntrar()
		.informarCpfValido(cpf)
		.InformarSenha(senha)
		.clicarProfile()
		.capturarTextoUsuario();
		
		assertEquals(msglogado, textoUsuario);
		
		Screenshot.print(navegador, diretorio + "CT002 - testValidaLogin " + suporte.Generator.dataHoraParaArquivo() + ".png");
		
	}
	
	@Test
	public void testHistorico(
			@Param(name = "cpf") String cpf,
			@Param(name = "senha") String senha,
			@Param(name = "msghistorico")String msghistorico) {
		
		Screenshot.print(navegador, diretorio + "CT003 - testHistorico " + suporte.Generator.dataHoraParaArquivo() + ".png");
		
		String textoHistorico = new HomePage(navegador)
		.clicarEntrar()
		.informarCpfValido(cpf)
		.InformarSenha(senha)
		.clicarSaude()
		.clicarHistorico()
		.capturarTextoHistorico();
		
		assertEquals(msghistorico, textoHistorico);
		
		Screenshot.print(navegador, diretorio + "CT003 - testHistorico " + suporte.Generator.dataHoraParaArquivo() + ".png");
		
	}

	@After
	public void tearDown() {
		navegador.quit();
	}

}
