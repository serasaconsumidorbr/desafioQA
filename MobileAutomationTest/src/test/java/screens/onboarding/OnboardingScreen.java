package screens.onboarding;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSFindBy;
import utils.BaseScreen;


public class OnboardingScreen extends BaseScreen {

    private String FIRST_VIEW_TEXT = "Consulte grátis seu CPF e seu Serasa Score";
    private String SECOND_VIEW_TEXT = "Coloque suas contas em dia";
    private String THIRD_VIEW_TEXT = "Tudo isso com a segurança da Serasa";

    @iOSFindBy(xpath = "NA")
    @AndroidFindBy(id = "textview_title_onboarding")
    public MobileElement textViewOnboard;

    @iOSFindBy(xpath = "NA")
    @AndroidFindBy(id = "onboarding_button_next")
    public MobileElement onboardNextButton;

    public boolean textViewOnboardDisplayed(){
        isVisible(textViewOnboard);
        return textViewOnboard.getText().equals(FIRST_VIEW_TEXT);
    }
    public void clickBtnOnboardNext(){
        isVisible(onboardNextButton);
        click(onboardNextButton);
    }
    public boolean textSecondViewOnboardDisplayed(){
        isVisible(textViewOnboard);
        return textViewOnboard.getText().equals(SECOND_VIEW_TEXT);
    }
    public boolean textThirdViewOnboardDisplayed(){
        isVisible(textViewOnboard);
        return textViewOnboard.getText().equals(THIRD_VIEW_TEXT);
    }
}
