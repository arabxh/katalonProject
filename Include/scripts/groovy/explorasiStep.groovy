import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When
import shortCallFunction.explorationEXEC as jalankan


class explorasiStep {
	@Given("saya membuka aplikasi Amartha")
	def saya_membuka_aplikasi_Amartha() {
		jalankan.startApps()
	}

	@When("saya berada pada halaman awal aplikasi Amartha")
	def saya_berada_pada_halaman_awal_aplikasi_Amartha() {
		jalankan.firstPage()
	}

	@And("saya melakukan login email (.*) dan password (.*) serta memastikan (.*) yang sesuai jika user gagal login")
	def saya_juga_explorasi_pada_halaman_login_dan_memastikan_yang_sesuai_jika_user_gagal_login(String email, String password, String errorMessage) {
		jalankan.loginPage(email, password, errorMessage)
	}

	@Then("saya sudah selesai melakukan explorasi")
	def saya_sudah_selesai_melakukan_explorasi() {
		jalankan.killApps()
	}
}