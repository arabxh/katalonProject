package shortCallFunction

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import io.appium.java_client.android.nativekey.AndroidKey
import io.appium.java_client.android.nativekey.KeyEvent
import io.appium.java_client.android.AndroidDriver
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import io.appium.java_client.MobileElement

import internal.GlobalVariable

public class explorationEXEC {

	public static void startApps() {
		//Membuka aplikasi amartha
		Mobile.startExistingApplication(GlobalVariable.appName)
	}
	
	public static void firstPage() {
		//Explorasi Halaman Awal
		Mobile.delay(2)
		Mobile.tap(findTestObject('Object Repository/btnMasuk'), 0)
	}
	
	public static void loginPage(String email ,String password, String errorMessage) {
		//input username dan password
		Mobile.delay(2)
		Mobile.tap(findTestObject('Object Repository/inputEmail'), 0)
		Mobile.delay(2)
		Mobile.setText(findTestObject('Object Repository/emailAfterTap'), email, 0)
		Mobile.delay(2)
		Mobile.tap(findTestObject('Object Repository/passwordAfterTap'), 0)
		Mobile.delay(2)
		Mobile.setEncryptedText(findTestObject('Object Repository/passwordAfterTap'), password, 0)
		Mobile.delay(2)
		Mobile.pressBack()
		Mobile.delay(2)
		Mobile.tap(findTestObject('Object Repository/btnMasuk'), 0)
		//verifikasi error message
		Mobile.delay(5)
		Mobile.verifyElementExist(findTestObject('Object Repository/errorMessageWrongAccount'), 0)
	}
	
	public static void killApps() {
		//kill apps dengan swipe
		int device_Height = Mobile.getDeviceHeight()
		int device_Widht = Mobile.getDeviceWidth()
		int y
		int y1
		int x
		int x1
		int xx
		int xx1
		int yy
		int yy1
		//kiri
		x = device_Widht * 0.8
		x1 = device_Widht * 0.3
		y = device_Height * 0.5
		y1 = device_Height * 0.5
		//atas
		xx = device_Widht * 0.51
		xx1 = device_Widht * 0.49
		yy = device_Height * 0.53
		yy1 = device_Height * 0.12

		AndroidDriver<MobileElement> driver = MobileDriverFactory.getDriver()
		driver.pressKey(new KeyEvent(AndroidKey.APP_SWITCH))
		Mobile.delay(1)
		Mobile.swipe(x, y, x1, y1)  //kiri
		Mobile.delay(1)
		Mobile.swipe(xx, yy, xx1, yy1)  //atas
		Mobile.delay(2)
	}
	
}
