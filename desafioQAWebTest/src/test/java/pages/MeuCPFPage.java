package pages;

import org.openqa.selenium.By;

public class MeuCPFPage extends BasePage  {

    public final By abaMeuCPF = By.xpath("//*[@id=\"__next\"]/div/nav/ul/li[4]/a");
    public final By btnDividasNegativas = By.xpath("(//*[@class='report-card-info__title ea-typography ea-typography--body-m et-text-dark-high'])[1]");
    public final By vldDividaNegativa = By.xpath("//*[@class='jsx-2508286473 empty-state']");

    public void clicoNaAbaMeuCPF() {
        clicarNoElemento(abaMeuCPF);
    }

    public void clicoEmDividasNegativas() {
        clicarNoElemento(btnDividasNegativas);
    }

    public void validoSeNaoTenhoDividasNegativas() {
        elementoVisivel(vldDividaNegativa);
    }

}
