package page;

import org.openqa.selenium.By;


public class LoginPage  extends BasePage {


    public final By  entrarConta = By.xpath("//*[@id=\"__next\"]/div/div[2]/div/header/div/div[3]/button");
    public final By  usuario =  By.xpath("//*[@id=\"cpf\"]");
    public final By  botaoConfirmarLogin =   By.xpath("//*[@id=\"valgrind\"]/div/div[2]/div/div/form/button");
    public final By  senha =   By.xpath("//*[@id=\"password\"]");


    public void entrarConta(){

        clickElement(entrarConta);
 }


    public void login() {
        clickElement(usuario);
        insertElement(usuario,USUARIO);
        clickElement(botaoConfirmarLogin);
        clickElement(senha);
        insertElement(senha,SENHA);
        clickElement(botaoConfirmarLogin);

    }





}


