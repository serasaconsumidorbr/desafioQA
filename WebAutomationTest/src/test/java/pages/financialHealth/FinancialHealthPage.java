package pages.financialHealth;
import org.openqa.selenium.By;
import utils.BasePage;

public class FinancialHealthPage extends BasePage {

    private final By FINANCIAL_HEALTH_BUTTON = By.xpath("//*[@id=\"__next\"]/div/nav/ul/li[2]/a");
    private final By FINANCIAL_HEALTH = By.xpath("//*[contains(text(),'Entenda sua saúde financeira')]");
    private final By RISE_REASON = By.xpath("//*[@id=\"__next\"]/div/div[4]/div/div[1]/div[1]/div[2]/a[2]/i");
    private final By FALLEN_REASON = By.xpath("//*[@id=\"__next\"]/div/div[4]/div/div[1]/div[1]/div[2]/a[1]/i");
    private final By GOOD_REPORT = By.xpath("//*[contains(text(),'Esses fatores estão fazendo seu Serasa Score aumentar. Cuide da sua saúde financeira para manter os pontos positivos')]");
    private final By BAD_REPORT = By.xpath("//*[contains(text(),'Esses fatores estão fazendo seu Serasa Score diminuir. Busque resolvê-los para aumentar a sua pontuação')]");

    public void clickFinancialHealthButton() {
        click(FINANCIAL_HEALTH_BUTTON);
    }

    public boolean financialHealthDisplayed() {
        return isVisible(FINANCIAL_HEALTH);
    }

    public void clickRiseReason() {
        click(RISE_REASON);
    }

    public void clickFallenReason() {
        click(FALLEN_REASON);
    }

    public boolean goodReason() {
        return isVisible(GOOD_REPORT);
    }

    public boolean badReason() {
        return isVisible(BAD_REPORT);
    }
}
