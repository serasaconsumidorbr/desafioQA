package page;

import org.openqa.selenium.By;

public class HomePage extends BasePage{

    public final By tituloSerasa =  By.xpath("//*[@id=\"__next\"]/div/div[4]/div/div[1]/h1");
    public final By  botaoConsultarCpfGratis =   By.xpath("//*[@id='__next']/div/div[4]/div/div[1]/div[2]/button");

    public void tituloSerasa(){
        clickElement(tituloSerasa);
    }

    public void botaoConsultarCPFGratis(){
        clickElement(botaoConsultarCpfGratis);
    }



}
