package pages;

import io.appium.java_client.*;
import io.appium.java_client.pagefactory.AndroidFindBy;
import utils.DadosDeAcesso;

public class LoginPage extends BasePage {

    DadosDeAcesso dadosDeAcesso = new DadosDeAcesso();

    @AndroidFindBy  (id = "onboarding_button_next")
    public MobileElement btnProximo;

    @AndroidFindBy  (id = "edittext_cpf_dialog")
    public MobileElement intUsuario;

    @AndroidFindBy  (id = "button_confirm_action")
    public MobileElement btnContinuar;

    @AndroidFindBy  (id = "button_sign_in")
    public MobileElement btnEntroComSenha;

    @AndroidFindBy  (id = "edittext_input_password")
    public MobileElement intSenha;

    @AndroidFindBy  (id = "button_dialog_input_password_second")
    public MobileElement btnEntrar;

    @AndroidFindBy  (id = "button_enable_later")
    public MobileElement btnMaisTarde;

    @AndroidFindBy  (id = "imageview_home_active")
    public MobileElement vldTelaLogada;

    @AndroidFindBy  (id = "textinput_error")
    public MobileElement vldCPFIncorreto;


    public void tocoEmProximo() {
       if (elementoVisivel(btnProximo)){
           tocar(btnProximo);
       }
    }
    public void colocoUsuario() {
        inserirDados(dadosDeAcesso.usuario(), intUsuario);
    }

    public void colocoUsuarioIncorreto() {
        inserirDados(dadosDeAcesso.usuarioInvalido(), intUsuario);
    }

    public void tocoEmContinuar() {
        tocar(btnContinuar);
    }

    public void tocoEntroComSenha() {
        tocar(btnEntroComSenha);
    }

    public void colocoSenha() {
        inserirDados(dadosDeAcesso.senha(), intSenha);
    }

    public void tocoEmEntrar() {
        tocar(btnEntrar);
    }

    public void tocoEmMaisTarde() {
        tocar(btnMaisTarde);
    }

    public void validaTelaLogada() {
        elementoVisivel(vldTelaLogada);
    }

    public void validoUsuarioIncorreto() {
        elementoVisivel(vldCPFIncorreto);
    }

}
