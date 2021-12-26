package SearchTest;


import Base.baseTest;
import InputData.propertiesReader;
import org.testng.Assert;
import org.testng.annotations.Test;
import Pages.HomePage;
import Pages.SearchResultPage;

public class searchTest extends baseTest {

	HomePage homeObject = new HomePage(driver);
    SearchResultPage  searchObject;
    
    String path= "/src/test/java/InputData/searchItemdata.properties";
	String searchItem = propertiesReader.read(path,"searchItem");


    @Test(priority = 1)
    public void SearchForExistingItem() throws InterruptedException {
 
    	    	
        homeObject = new HomePage(driver);
        searchObject= homeObject.searchForItem(searchItem);
        Thread.sleep(200);
        searchObject.scrollToNextPageBtnAndClick();
        int resultSizePage2= searchObject.countSearchResults();

        searchObject.scrollToNextPageBtnAndClick();
        int resultSizePage3= searchObject.countSearchResults();

        Assert.assertEquals(resultSizePage3, resultSizePage2);

    }
    
}
