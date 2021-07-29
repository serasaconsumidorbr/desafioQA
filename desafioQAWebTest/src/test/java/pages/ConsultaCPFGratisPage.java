package pages;

import org.openqa.selenium.By;

public class ConsultaCPFGratisPage extends BasePage {

    public final By btnConsultaCPF = By.xpath("//*[@class='button button--primary _2dsxvAkd']");
    public final By vldMeuScore = By.xpath("//*[@id=\"__next\"]/div/div[3]/div[1]/div/div[2]/a[1]/div/p");

    public void clicoEmConsultaCPFGratis() {
        clicarNoElemento(btnConsultaCPF);
    }

    public void validoMeuScoreTelaInicio() {
        elementoVisivel(vldMeuScore);
    }
}
