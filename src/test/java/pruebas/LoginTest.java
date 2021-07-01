package pruebas;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import paginas.PaginaInicio;
import paginas.PaginaLogin;

public class LoginTest {
	WebDriver driver;
	String url = "http://automationpractice.com";
	String driverPath = "..\\EducacionIT\\Drivers\\chromedriver.exe";
	
	/**
	 * Método para setear el navegador a utilizar y configurar las propiedades
	 */
	@BeforeSuite
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", driverPath);
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
	}
	
	@Test
	public void login() {
		// 1. Hacer clic en Sign In
		PaginaInicio inicio = new PaginaInicio(driver);
		inicio.clicOnSignIn();
	
		// 2. Ingresar el correo y contraseña
		PaginaLogin login = new PaginaLogin(driver);
		login.llenarCorreo("correo0001@mailinator.com");
		login.llenarContrasenia("12345678");
		
		// 3. Hacer clic en el botón
		login.clicOnEnter();
	}
	
	@Test
	public void irAContactUs() {
		PaginaInicio inicio = new PaginaInicio(driver);
		inicio.clicOnContactUs();
	}
	
	@Test
	public void buscarPalabra() {
		PaginaInicio inicio = new PaginaInicio(driver);
		inicio.llenarBuscador("dress");
		inicio.enterOnBusqueda();
	}
}
