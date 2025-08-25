package jp.co.sss.lms.ct.f02_faq;

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
 * 結合テスト よくある質問機能
 * ケース05
 * @author holy
 */
@TestMethodOrder(OrderAnnotation.class)
@DisplayName("ケース05 キーワード検索 正常系")
public class Case05 {

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
	@DisplayName("テスト02 初回ログイン済みの受講生ユーザーでログイン")
	void test02() {
		// TODO ここに追加
		chromeDriver.get("http://localhost:8080/lms");

		WebElement a = chromeDriver.findElement(By.name("loginId"));
		a.sendKeys("StudentAA01");

		WebElement b = chromeDriver.findElement(By.name("password"));
		b.sendKeys("Kazuma0323");

		WebElement btn = chromeDriver.findElement(By.name("botton"));
		btn.click();
	}

	@Test
	@Order(3)
	@DisplayName("テスト03 上部メニューの「ヘルプ」リンクからヘルプ画面に遷移")
	void test03() {
		// TODO ここに追加
		chromeDriver.get("http://localhost:8080/lms");

		WebElement a = chromeDriver.findElement(By.name("loginId"));
		a.sendKeys("StudentAA01");

		WebElement b = chromeDriver.findElement(By.name("password"));
		b.sendKeys("Kazuma0323");

		WebElement btn = chromeDriver.findElement(By.name("botton"));
		btn.click();

		chromeDriver.findElement(By.partialLinkText("機能")).click();
		chromeDriver.findElement(By.partialLinkText("ヘルプ")).click();
	}

	@Test
	@Order(4)
	@DisplayName("テスト04 「よくある質問」リンクからよくある質問画面を別タブに開く")
	void test04() {
		// TODO ここに追加

		chromeDriver.get("http://localhost:8080/lms");

		WebElement a = chromeDriver.findElement(By.name("loginId"));
		a.sendKeys("StudentAA01");

		WebElement b = chromeDriver.findElement(By.name("password"));
		b.sendKeys("Kazuma0323");

		WebElement btn = chromeDriver.findElement(By.name("botton"));
		btn.click();

		chromeDriver.findElement(By.partialLinkText("機能")).click();
		chromeDriver.findElement(By.partialLinkText("ヘルプ")).click();
		chromeDriver.findElement(By.partialLinkText("よくある質問")).click();
	}

	@Test
	@Order(5)
	@DisplayName("テスト05 キーワード検索で該当キーワードを含む検索結果だけ表示")
	void test05() {
		// TODO ここに追加
		chromeDriver.get("http://localhost:8080/lms");

		WebElement a = chromeDriver.findElement(By.name("loginId"));
		a.sendKeys("StudentAA01");

		WebElement b = chromeDriver.findElement(By.name("password"));
		b.sendKeys("Kazuma0323");

		WebElement btn = chromeDriver.findElement(By.name("botton"));
		btn.click();

		chromeDriver.findElement(By.partialLinkText("機能")).click();
		chromeDriver.findElement(By.partialLinkText("ヘルプ")).click();
		chromeDriver.findElement(By.partialLinkText("よくある質問")).click();


		WebElement keyword = chromeDriver.findElement(By.id("form"));

		keyword.sendKeys("助成金");

		// 検索ボタンをクリック
		WebElement searchbotton = chromeDriver.findElement(By.name("q"));;

		searchbotton.click();
	}

	@Test
	@Order(6)
	@DisplayName("テスト06 「クリア」ボタン押下で入力したキーワードを消去")
	void test06() {
		// TODO ここに追加
		chromeDriver.get("http://localhost:8080/lms");

		WebElement a = chromeDriver.findElement(By.name("loginId"));
		a.sendKeys("StudentAA01");

		WebElement b = chromeDriver.findElement(By.name("password"));
		b.sendKeys("Kazuma0323");

		WebElement btn = chromeDriver.findElement(By.name("botton"));
		btn.click();

		chromeDriver.findElement(By.partialLinkText("機能")).click();
		chromeDriver.findElement(By.partialLinkText("ヘルプ")).click();
		chromeDriver.findElement(By.partialLinkText("よくある質問")).click();
		
		
//		WebElement keyword = chromeDriver.findElement(By.id("form"));
//
//		keyword.sendKeys("助成金");
//
//		
//		WebElement searchbotton = chromeDriver.findElement(By.className("btn btn-primary"));;
//
//		searchbotton.click();
	}

}
