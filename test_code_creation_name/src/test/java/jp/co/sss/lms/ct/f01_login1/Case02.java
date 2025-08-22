package jp.co.sss.lms.ct.f01_login1;

import static jp.co.sss.lms.ct.util.WebDriverUtils.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * 結合テスト ログイン機能①
 * ケース02
 * @author holy
 */
@TestMethodOrder(OrderAnnotation.class)
@DisplayName("ケース02 受講生 ログイン 認証失敗")
public class Case02 {

	/** 前処理 */
	@BeforeAll
	static void before() {
		createDriver();
	}

	/** 後処理 */
	@AfterAll
	static void after() {
		closeDriver();
	}

	ChromeDriver chromeDriver = new ChromeDriver();
	
	@Test
	@Order(1)
	@DisplayName("テスト01 トップページURLでアクセス")
	void test01() {
		// TODO ここに追加
		chromeDriver.get("http://localhost:8080/lms");
	}

	@Test
	@Order(2)
	@DisplayName("テスト02 DBに登録されていないユーザーでログイン")
	void test02() throws InterruptedException {
		// TODO ここに追加
		chromeDriver.get("http://localhost:8080/lms");
		
		WebElement a = chromeDriver.findElement(By.name("loginId"));
		a.sendKeys("StudentAA10");
		
		WebElement b = chromeDriver.findElement(By.name("password"));
		b.sendKeys("StudentAA10");
		
		WebElement btn = chromeDriver.findElement(By.name("botton"));
		btn.click();

		
		
		//Thread.sleep(2000);
		//loginForm.getLoginId(), loginForm.getPassword()
	}

}
