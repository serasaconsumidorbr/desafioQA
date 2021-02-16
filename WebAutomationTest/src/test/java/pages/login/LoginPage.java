package pages.login;


import org.openqa.selenium.By;
import utils.BasePage;

public class LoginPage extends BasePage {

    public final By ENTER_BUTTON = By.xpath("//*[@id=\"__next\"]/div/div[2]/div/header/div/div[3]/button");
    private final By CPF_FIELD = By.id("cpf");
    private final By CONFIRM_BUTTON = By.xpath("//*[@id=\"valgrind\"]/div/div[2]/div/div/form/button");
    private final By PASSWORD_FIELD = By.id("password");
    private final By FINANCIAL_EXPLORE = By.xpath("//*[@id=\"__next\"]/div/div[3]/div[1]/div/div[2]/p");
    private final By PROFILE_ICON = By.xpath("//*[@id=\"__next\"]/div/div[2]/div[2]/button");
    private final By LOGOUT_BUTTON = By.xpath("//*[@id=\"__next\"]/div/div[2]/div[2]/ul/li[2]/button");
    private final By INVALID_CPF = By.xpath("//*[contains(text(),'Você precisa informar um CPF válido.')]");

    public boolean enterButtonDisplayed() {
        return isVisible(ENTER_BUTTON);
    }

    public void clickEnterButton() {
        click(ENTER_BUTTON);
    }

    public void fillCPF(String any) {
        fillInput(any, CPF_FIELD);
    }

    public void clickConfirmButton() {
        click(CONFIRM_BUTTON);
    }

    public void fillPassword(String any) {
        fillInput(any, PASSWORD_FIELD);
    }

    public boolean financialExploreDisplayed() {
        return isVisible(FINANCIAL_EXPLORE);
    }

    public void clickProfileIcon() {
        click(PROFILE_ICON);
    }

    public void logoutButton() {
        click(LOGOUT_BUTTON);
    }

    public boolean invalidCPFDisplayed() {
        return isVisible(INVALID_CPF);
    }

}
