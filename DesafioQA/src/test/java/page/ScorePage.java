package page;

import org.openqa.selenium.By;

public class ScorePage extends BasePage{




    public final By linkVerHistorico =  By.xpath("//*[@id=\"__next\"]/div/div[4]/div/div[1]/div[1]/a[1]/span/div");
    public final By tituloHistoricoDoSeuScore =  By.xpath("//*[@id=\"__next\"]/div/div[4]/div[1]/div/div[1]/p[1]");
    public final By linkVerFaixaScore =  By.xpath("//*[@id=\"__next\"]/div/div[4]/div/div[1]/div[1]/a[2]/span/div");
    public final By botaoCompromissoCredito =  By.xpath("//*[@id=\"__next\"]/div/div[4]/div/div[1]/div[1]/div[2]/div/div[2]/a/span");
    public final By tituloEntendaSuaSaudeFinanceira =  By.xpath("//*[@id=\"__next\"]/div/div[4]/div/div[1]/div[1]/p[1]");
    public final By tituloFaixaScore =  By.xpath("//*[@id=\"__next\"]/div/div[4]/div/div[1]/div[1]/p[1]");
    public final By tituloCompromissoCredito =  By.xpath("//*[@id=\"__next\"]/div/div[4]/div/div[1]/div[1]/p");

    public void verHistorico(){
        clickElement(linkVerHistorico);
    }

    public void tituloEntendaSuaSaudeFinanceira(){
        clickElement(tituloEntendaSuaSaudeFinanceira);
    }

    public void tituloHistoricoScore(){
        clickElement(tituloHistoricoDoSeuScore);
    }

    public void clicarFaixaScore(){
        scrollPage();
        clickElement(linkVerFaixaScore);
    }

    public void clicarCompromissoCredito(){
        scrollPage();
        clickElement(botaoCompromissoCredito);
    }

    public void tituloFaixaScore(){
        clickElement(tituloFaixaScore);
    }

    public void tituloCompromissoCredito(){
        clickElement(tituloCompromissoCredito);
    }

}
