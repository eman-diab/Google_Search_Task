package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class SearchResultPage {
	
	private WebDriver driver;

	   // private By searchResultHeader = By.cssSelector("div[data-qa='searchHeader']");
	    //private By searchResultTitle = By.cssSelector("div[data-qa='product-name']");
	   private By searchResults = By.cssSelector("div[id='rso']");
	    private By searchRes = By.cssSelector("div[class='g']");
	    private By nextPageBtn = By.cssSelector("td>a[id='pnnext']");


	    public SearchResultPage (WebDriver driver) {
	        this.driver = driver;
	    }

	    public int countSearchResults(){
	        WebDriverWait wait = new WebDriverWait(driver, 20);
	        wait.until(ExpectedConditions.visibilityOfElementLocated(searchResults));
	        wait.until(ExpectedConditions.visibilityOfElementLocated(searchRes));

	        List<WebElement> listings = driver.findElements(searchRes);

	        return listings.size();
	    }


	    public void scrollToNextPageBtnAndClick(){
	        WebElement button= driver.findElement(nextPageBtn);
	        String script = "arguments[0].scrollIntoView();";
	        ((JavascriptExecutor)driver).executeScript(script, button);

	        WebDriverWait wait = new WebDriverWait(driver, 20);
	        wait.until(ExpectedConditions.visibilityOfElementLocated(nextPageBtn));

	        driver.findElement(nextPageBtn).click();
	    }


}
