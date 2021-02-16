package screens.login;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSFindBy;
import utils.BaseScreen;

public class LoginScreen extends BaseScreen {

    public String validCPF = "YOUR_CPF_HERE";
    public String validPassword = "YOUR_PASSWORD_HERE";
    public String invalidCPF = "00000000000";

    @iOSFindBy(xpath = "NA")
    @AndroidFindBy(id = "edittext_cpf_dialog")
    public MobileElement editTextInputCpf;

    @iOSFindBy(xpath = "NA")
    @AndroidFindBy(id = "textview_insert_cpf")
    public MobileElement textViewInsertCpf;

    @iOSFindBy(xpath = "NA")
    @AndroidFindBy(id = "button_confirm_action")
    public MobileElement buttonConfirmAction;

    @iOSFindBy(xpath = "NA")
    @AndroidFindBy(id = "button_sign_in")
    public MobileElement buttonSignIn;

    @iOSFindBy(xpath = "NA")
    @AndroidFindBy(id = "edittext_input_password")
    public MobileElement edittextInputPassword;

    @iOSFindBy(xpath = "NA")
    @AndroidFindBy(id = "button_dialog_input_password_second")
    public MobileElement buttonDialogInputPasswordSecond;

    @iOSFindBy(xpath = "NA")
    @AndroidFindBy(id = "textview_register_title")
    public MobileElement textviewRegisterTitle;

    public boolean textViewInsertCpfDisplayed(){
        return isVisible(textViewInsertCpf);
    }
    public void fillCpf(){
        fillInput(validCPF, editTextInputCpf);
    }
    public void fillWrongCpf(){
        fillInput(invalidCPF, editTextInputCpf);
    }
    public void clickButtonConfirmActon(){
        click(buttonConfirmAction);
    }
    public void clickButtonSignin(){
        click(buttonSignIn);
    }
    public void fillPassword(){
        fillInput(validPassword, edittextInputPassword);
    }
    public void clickButtonDialogInputPasswordSecond(){
        click(buttonDialogInputPasswordSecond);
    }
    public boolean textviewRegisterTitleDisplayed(){
        return isVisible(textviewRegisterTitle);
    }

}
