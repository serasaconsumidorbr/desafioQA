package screens.home;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSFindBy;
import utils.BaseScreen;

public class HomeScreen extends BaseScreen {

    @iOSFindBy(xpath = "NA")
    @AndroidFindBy(id = "textview_service")
    public MobileElement textViewService;

    @iOSFindBy(xpath = "NA")
    @AndroidFindBy(id = "view_background_ic_profile")
    public MobileElement viewBackgroundIcProfile;

    public boolean viewBackgroundIcProfileDisplayed(){
        return isVisible(viewBackgroundIcProfile);
    }

    public void clickTextViewService(){
        click(textViewService);
    }
}
