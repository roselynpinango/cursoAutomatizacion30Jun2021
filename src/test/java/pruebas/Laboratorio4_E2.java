package pruebas;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Utilidades.DatosExcel;
import paginas.PaginaInicio;
import paginas.PaginaLogin;

public class Laboratorio4_E2 {
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
	
	@AfterSuite
	public void close() {
		driver.close();
	}
	
	@DataProvider(name="Datos Login")
	public Object[][] obtenerDatos() throws Exception {
		Object[][] datos = new Object[3][2];
		
		datos = DatosExcel.leerExcel("..\\EducacionIT\\Datos\\datosLab4_E22.xlsx", "Hoja1");
		
		return datos;
	}
}
