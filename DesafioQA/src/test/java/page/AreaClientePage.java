package page;

import org.openqa.selenium.By;


public class AreaClientePage extends BasePage {


    public final By tituloExploreSuaVidaFinanceira =  By.xpath("//*[@id=\"__next\"]/div/div[3]/div[1]/div/div[2]/p");
    public final By seuSerasaScore =  By.xpath("//*[@id=\"__next\"]/div/div[3]/div[1]/div/div[2]/a[1]/span/div");

    public void verificarInformaçõesTela(){
        clickElement(tituloExploreSuaVidaFinanceira);

    }

    public void entendaSeuSerasaScore(){
        clickElement(seuSerasaScore);
    }

}
