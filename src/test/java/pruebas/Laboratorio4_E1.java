package pruebas;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import paginas.PaginaInicio;
import paginas.PaginaLogin;

public class Laboratorio4_E1 {
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
	
	@Test(dataProvider="Datos Login")
	public void login(String correo, String contrasenia) {
		// 1. Hacer clic en Sign In
		PaginaInicio inicio = new PaginaInicio(driver);
		inicio.clicOnSignIn();
	
		// 2. Ingresar el correo y contraseña
		PaginaLogin login = new PaginaLogin(driver);
		login.llenarCorreo(correo);
		login.llenarContrasenia(contrasenia);
		
		// 3. Hacer clic en el botón
		login.clicOnEnter();
	}
	
	@DataProvider(name="Datos Login")
	public Object[][] obtenerDatos() {
		Object[][] datos = new Object[3][2];
		
		datos[0][0] = "correo01@mailinator.com";
		datos[0][1] = "1q2w3e4r5t";
		datos[1][0] = "correo02@mailinator.com";
		datos[1][1] = "7y6t5r5ee";
		datos[2][0] = "correo03@mailinator.com";
		datos[2][1] = "lkjhgfd";
		
		return datos;
	}
}
