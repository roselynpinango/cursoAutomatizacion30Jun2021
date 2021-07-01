package Edit.EducacionIT;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Laboratorio1 {
	/**
	 * Método para abrir selenium.dev desde el navegador Chrome
	 */
	@Test
	public void abrirPaginaChrome() {
		// 1. Indicar dónde está el driver a utilizar
		System.setProperty("webdriver.chrome.driver", "..\\EducacionIT\\Drivers\\chromedriver.exe");
		
		// 2. Crear el objeto WebDriver 
		WebDriver driver = new ChromeDriver();
		
		// 3. Abrir el navegador en la página selenium.dev
		driver.get("https://www.selenium.dev/");
		driver.manage().window().maximize();
	}
	
	/**
	 * Método para abrir selenium.dev desde el navegador Firefox
	 */
	@Test
	public void abrirPaginaFirefox() {
		// 1. Indicar dónde está el driver a utilizar
		System.setProperty("webdriver.gecko.driver", "..\\EducacionIT\\Drivers\\geckodriver.exe");
		
		// 2. Crear el objeto WebDriver 
		WebDriver driver = new FirefoxDriver();
		
		// 3. Abrir el navegador en la página selenium.dev
		driver.get("https://www.selenium.dev/");
		driver.close();
	}
	
	/**
	 * Método para abrir selenium.dev desde el navegador Chrome y hacer una búsqueda
	 */
	@Test
	public void buscarChrome() {
		// 1. Indicar dónde está el driver a utilizar
		System.setProperty("webdriver.chrome.driver", "..\\EducacionIT\\Drivers\\chromedriver.exe");
		
		// 2. Crear el objeto WebDriver 
		WebDriver driver = new ChromeDriver();
		
		// 3. Abrir el navegador en la página selenium.dev
		driver.get("https://www.selenium.dev/");
		driver.manage().window().maximize();
		
		// 4. Escribir la palabra a buscar
		WebElement txtBuscador = driver.findElement(By.id("gsc-i-id1"));
		txtBuscador.sendKeys("Java");
		
		// 5. Simular presionar la tecla ENTER
		txtBuscador.sendKeys(Keys.ENTER);
	}
}
