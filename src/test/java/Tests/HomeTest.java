package Tests;

import PageModel.BaseModel;
import PageModel.HomeModel;
import com.thoughtworks.gauge.Step;

public class HomeTest {

    HomeModel homeModel = new HomeModel();
    BaseModel baseModel = new BaseModel();

    @Step("User <key> visit site.")
    public void userVisitSite(String key){
        homeModel.userVisitSite(key);
    }

    @Step("Scroll down to the bottom of the page")
    public void scroolBottomPage(){
        baseModel.scroolBottomPage();
    }

    @Step("Click Kredi Hesaplama")
    public void clickCreditCalculation(){
        homeModel.clickCreditCalculation();
    }


}
