package utils;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebDriver;

public class DadosDeAcesso extends mobileDriver.AndroidAppiumDriver {
    public static AppiumDriver<?> appiumDriver;

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
}
