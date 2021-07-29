package utils;

import org.openqa.selenium.WebDriver;

public class Dados extends webDriver.WebDriver {
    public static WebDriver driver;

    public String usuario(){
        String USUARIO = "Seu CPF";
        return USUARIO;
    }
    public String usuarioInvalido(){
        String USUARIO_INVALIDA = "12345678900";
        return USUARIO_INVALIDA;
    }

        public String senha(){
        String SENHA = "Sua Senha";
        return SENHA;
    }

    public void loginUrl() {
        webdriver().get("https://www.serasa.com.br/");
    }

}
