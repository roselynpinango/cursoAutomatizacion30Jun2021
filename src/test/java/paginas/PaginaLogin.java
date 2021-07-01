package paginas;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaginaLogin {
	/*
	 * Elementos de la página
	 * */
	@FindBy(xpath="//input[@id='email']")
	WebElement txtCorreo;
	
	@FindBy(xpath="//input[@id='passwd']")
	WebElement txtContrasenia;
	
	@FindBy(xpath="//button[@id='SubmitLogin']")
	WebElement btnEnter;
	
	/*
	 * Constructor
	 * */
	public PaginaLogin(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	/*
	 * Acciones que puedo hacer sobre los elementos de la pagina
	 * */
	public void llenarCorreo(String correo) {
		txtCorreo.sendKeys(correo);
	}
	
	public void llenarContrasenia(String contrasenia) {
		txtContrasenia.sendKeys(contrasenia);
	}
	
	public void clicOnEnter() {
		btnEnter.click();
	}
}
