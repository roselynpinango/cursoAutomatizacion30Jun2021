package paginas;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaginaInicio {
	/*
	 * Elementos de la página web
	 * */
	@FindBy(xpath="//a[contains(text(),'Sign in')]")
	WebElement lnkSignIn;
	
	@FindBy(xpath="//header/div[2]/div[1]/div[1]/nav[1]/div[2]/a[1]")
	WebElement lnkContactUs;
	
	@FindBy(xpath="//input[@id='search_query_top']")
	WebElement txtBuscador;
	
	/*
	 * Constructor
	 * */
	public PaginaInicio(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	/*
	 * Métodos: Acciones sobre los elementos
	 * */
	public void clicOnSignIn() {
		lnkSignIn.click();
	}
	
	public void clicOnContactUs() {
		lnkContactUs.click();
	}
	
	public void llenarBuscador(String palabra) {
		txtBuscador.sendKeys(palabra);
	}
	
	public void enterOnBusqueda() {
		txtBuscador.sendKeys(Keys.ENTER);
	}
}
