package pages;

import org.openqa.selenium.By;
import utils.Dados;

public class LoginPage extends BasePage  {

    public final By intUsuario = By.xpath("//*[@id='f-cpf']");
    public final By btnContinuar = By.xpath("//*[@class='jsx-1222364814 ec-form-submit --align-center']");
    public final By intSenha = By.xpath("//input[@id='current-password']");
    public final By vldAcesso = By.xpath("//*[@class='eu-text-ellipsis ea-typography ea-typography--subheading et-text-dark-high']");
    public final By vldMensagemErro = By.xpath("//*[@class='jsx-3422569950 field-error field-error--show']");

    Dados dados = new Dados();

    public void entrarComUsuario() {

        inserirElemento(intUsuario, dados.usuario());
    }

    public void clicoContinuar() {

        clicarNoElemento(btnContinuar);
    }

    public void entroComSenha() {

        inserirElemento(intSenha, dados.senha());
    }

    public void validoAcesso() {
        elementoVisivel(vldAcesso);
    }

    public void entroComUsuarioInvalido() {
        inserirElemento(intUsuario, dados.usuarioInvalido());
    }

    public void validoMensagemDeErro() {
        elementoVisivel(vldMensagemErro);
    }

}
