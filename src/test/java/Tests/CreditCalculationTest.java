package Tests;

import PageModel.CreditCalculationModel;
import PageModel.HomeModel;
import com.thoughtworks.gauge.Step;

public class CreditCalculationTest {
    CreditCalculationModel creditCalculationModel = new CreditCalculationModel();

    @Step("Enter <key> in TUTAR field")
    public void setAmountField(String key){
        creditCalculationModel.setAmountField(key);
    }
    @Step("Choose insured type <key>")
    public void chooseInsured(String key){
        creditCalculationModel.chooseInsured(key);
    }

    @Step("Set maturity <key>")
    public void setMaturity(String key){
        creditCalculationModel.setMaturity(key);
    }

    @Step("Click HESAPLAMA DETAYLARI")
    public void clickCalculationDetails(){
        creditCalculationModel.clickCalculationDetails();
    }

    @Step("Click ODEME PLANI")
    public void clickPaymentPlan(){
        creditCalculationModel.clickPaymentPlan();
    }

    @Step("Check <key> calculator car loan is visible")
    public void calculatorCarLoanIsVisible(String key){
        creditCalculationModel.calculatorCarLoanIsVisible(key);
    }

    @Step("Scroll down on the ODEME PLANI page until 20th is seen")
    public void scrollDownPaymentPlan(){
        creditCalculationModel.scrollDownPaymentPlan();
    }
}
