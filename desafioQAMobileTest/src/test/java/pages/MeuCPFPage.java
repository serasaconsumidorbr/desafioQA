package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class MeuCPFPage extends BasePage {

    @AndroidFindBy(id = "textview_my_cpf")
    public MobileElement abaMeuCPF;

    @AndroidFindBy  (id = "text_debts_letters")
    public MobileElement btnDividaNegativada;

    @AndroidFindBy  (id = "text_view_empty_debts")
    public MobileElement vldNenhumaDividaNegativada;

    public void tocarNaAbaMeuCPF() {
        tocar(abaMeuCPF);
    }

    public void tocarEmDividasNegativas() {
        tocar(btnDividaNegativada);
    }

    public void validoSeNaoTenhoDividasNegativas() {
        elementoVisivel(vldNenhumaDividaNegativada);
    }
}
