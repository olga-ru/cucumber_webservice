package pages_sample;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class GooglePage {
    @FindBy (how = How.XPATH, using = "//*[@id=\"tsf\"]/div[2]/div[1]/div[1]/div/div[2]/input")
    private WebElement searchField;
    //@FindBy (how = How.NAME, using = "btnK")
    //private WebElement buttonSearch;
    @FindBy(how = How.ID, using = "result-stats")
    private WebElement searchResult;

    public void enterSearch (String input){
        searchField.sendKeys(input);
    }


    public boolean verifySearchResult(){
        return searchResult.isDisplayed();
    }
}
