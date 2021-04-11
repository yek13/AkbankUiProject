package PageModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class CreditCalculationModel extends BaseModel {

    public static By amountField = By.id("t-credit-price");
    public static By uninsured = By.xpath("//*[@for='insuredType2']");
    public static By hoverBall = By.className("ui-slider-range-min");
    public static By calculationDetails = By.className("open-tooltip");
    public static By tabsContentCostRate = By.xpath("//div[@class='tabs-content oran active'][@id='content-1']");
    public static By tabsContentPaymentPlan = By.xpath("//div[@class='tabs-content plan active jspScrollable'][@id='content-2']");
    public static By btnPaymentPlan = By.id("accordion2");
    public static By btnPaymentPlan20th = By.xpath("//*[@id='content-2']/div/div[1]/table/tbody/tr[21]");
    public static By jspDrag = By.className("jspDrag");


    Actions action = new Actions(webDriver);

    public void setAmountField(String key){
        clearElement(amountField);
        sendKeys(amountField,key);
    }

    public void chooseInsured(String key){
        switch (key) {
            case "SİGORTASIZ":
                clickElement(uninsured);
                break;

            default:
                System.out.println("Nothing");

        }
    }
    public void setMaturity(String key){
        switch (key) {
            case "20AY":
                action.dragAndDropBy(findElement(hoverBall),10,0).build().perform();
                break;

            default:
                System.out.println("Nothing");

        }
    }
    public void clickCalculationDetails(){
        clickElement(calculationDetails);

    }

    public void clickPaymentPlan(){
        clickElement(btnPaymentPlan);

    }

    public boolean calculatorCarLoanIsVisible(String key){
        switch (key) {
            case "Masraf ve Maliyet Oranları":
                return isElementVisible(tabsContentCostRate);
            case "Ödeme Planı":
                return isElementVisible(tabsContentPaymentPlan);
            default:
                return false;
        }

    }

    public void scrollDownPaymentPlan(){
        scroolToElement(findElement(tabsContentPaymentPlan));
        action.dragAndDropBy(findElement(jspDrag),0,300).build().perform();

    }
}
