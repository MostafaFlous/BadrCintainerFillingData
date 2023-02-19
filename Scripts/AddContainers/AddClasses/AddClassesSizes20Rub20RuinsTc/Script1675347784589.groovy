import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('LoginTcs/LoginTC'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/AddClassesTc/Page_Badr Container/a_'))

WebUI.click(findTestObject('Object Repository/AddClassesTc/Page_Badr Container/span_'))

WebUI.click(findTestObject('Object Repository/AddClassesTc/Page_Badr Container/a__1'))

WebUI.setText(findTestObject('Object Repository/AddClassesTc/Page_Badr Container/input__classification_name'), 'نفايات')

WebUI.setText(findTestObject('Object Repository/AddClassesTc/Page_Badr Container/input__measure_unit'), 'يارده')

WebUI.click(findTestObject('Object Repository/AddClassesTc/Page_Badr Container/button__1'))

WebUI.delay(3)

WebUI.refresh()

WebUI.delay(3)

WebUI.setText(findTestObject('Object Repository/AddClassesTc/Page_Badr Container/input__classification_name'), 'انقاض')

WebUI.setText(findTestObject('Object Repository/AddClassesTc/Page_Badr Container/input__measure_unit'), 'ياردة')

WebUI.click(findTestObject('Object Repository/AddClassesTc/Page_Badr Container/button__1'))

WebUI.delay(3)

WebUI.refresh()

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/AddClassesTc/Page_Badr Container/a_'))

WebUI.click(findTestObject('Object Repository/AddClassesTc/Page_Badr Container/a__1_2'))

WebUI.click(findTestObject('Object Repository/AddClassesTc/Page_Badr Container/button__1_2'))

WebUI.selectOptionByValue(findTestObject('Object Repository/AddClassesTc/Page_Badr Container/select_'), '1', true)

WebUI.setText(findTestObject('Object Repository/AddClassesTc/Page_Badr Container/input__size'), '20')

WebUI.setText(findTestObject('Object Repository/AddClassesTc/Page_Badr Container/input__price'), '200')

WebUI.click(findTestObject('Object Repository/AddClassesTc/Page_Badr Container/input__show_in_rubble_contract'))

WebUI.click(findTestObject('Object Repository/AddClassesTc/Page_Badr Container/input__show_in_trash_contract'))

WebUI.click(findTestObject('Object Repository/AddClassesTc/Page_Badr Container/input__show_in_cash_rent'))

WebUI.click(findTestObject('Object Repository/AddClassesTc/Page_Badr Container/button__1_2_3'))

WebUI.delay(3)

WebUI.refresh()

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/AddClassesTc/Page_Badr Container/button__1_2'))

WebUI.selectOptionByValue(findTestObject('Object Repository/AddClassesTc/Page_Badr Container/select_'), '2', true)

WebUI.setText(findTestObject('Object Repository/AddClassesTc/Page_Badr Container/input__size'), '20')

WebUI.setText(findTestObject('Object Repository/AddClassesTc/Page_Badr Container/input__price'), '200')

WebUI.click(findTestObject('Object Repository/AddClassesTc/Page_Badr Container/input__show_in_rubble_contract'))

WebUI.click(findTestObject('Object Repository/AddClassesTc/Page_Badr Container/input__show_in_trash_contract'))

WebUI.click(findTestObject('Object Repository/AddClassesTc/Page_Badr Container/input__show_in_cash_rent'))

WebUI.click(findTestObject('Object Repository/AddClassesTc/Page_Badr Container/button__1_2_3'))

WebUI.click(findTestObject('Object Repository/AddClassesTc/Page_Badr Container/a_admin'))

WebUI.click(findTestObject('Object Repository/AddClassesTc/Page_Badr Container/a__1_2_3'))

WebUI.closeBrowser()

