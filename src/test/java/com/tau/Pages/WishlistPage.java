package com.tau.Pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WishlistPage extends PageBase{
    public WishlistPage(WebDriver driver)
    {
        super(driver);
    }
    @FindBy(name = "save_and_share")
    WebElement shareWishBtn;
    @FindBy(xpath = "/html/body/div/div/div[2]/div/div[2]/div/div[1]/ul/li/ul/li")
    public WebElement sucMsg;

    @FindBy(xpath = "/html/body/div/div/div[2]/div/div[2]/div[1]/div[2]/ul/li[1]/div/div[3]/ul/li[1]/a")
    WebElement wishLG;

    public void AddWishlist()
    {
        wishLG.click();
    }
    @FindBy(xpath = "//*[@id=\"item_75730\"]/td[5]/div/button")
    WebElement addCart;
    public void Open_ShareWishlistPage()
    {
        shareWishBtn.click();
    }
    public void AddToCart()
    {
        addCart.click();
    }

}
