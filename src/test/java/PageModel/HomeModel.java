package PageModel;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;


public class HomeModel extends BaseModel {

    public static By creditCalculation = By.id("ctl00_ucFooterMenu_rptMain_ctl02_rptChild_ctl00_linkChild");

    public void userVisitSite(String key){
        webDriver.get(key);
    }
    public void clickCreditCalculation(){
        clickElement(creditCalculation);
    }



}
