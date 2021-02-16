package screens.services;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSFindBy;
import utils.BaseScreen;

public class ServicesScreen extends BaseScreen {

    @iOSFindBy(xpath = "NA")
    @AndroidFindBy(id = "texview_title_card_monitoring")
    public MobileElement textviewTitleCardMonitoring;

    @iOSFindBy(xpath = "NA")
    @AndroidFindBy(id = "report_detail_title")
    public MobileElement reportDetailTitle;


    public boolean textviewTitleCardMonitoringDisplayed(){
        return isVisible(textviewTitleCardMonitoring);
    }
    public void clickTextviewTitleCardMonitoring(){
        click(textviewTitleCardMonitoring);
    }
    public boolean reportDetailTitleDisplayed(){
        return isVisible(reportDetailTitle);
    }
}
