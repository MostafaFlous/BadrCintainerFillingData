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

WebUI.click(findTestObject('Object Repository/FirmSettingsObjRepo/Page_Badr Container/span_'))

WebUI.click(findTestObject('Object Repository/FirmSettingsObjRepo/Page_Badr Container/a_'))

WebUI.doubleClick(findTestObject('Object Repository/FirmSettingsObjRepo/Page_Badr Container/input__name'))

WebUI.setText(findTestObject('Object Repository/FirmSettingsObjRepo/Page_Badr Container/input__name'), 'Mostafa Flous')

WebUI.doubleClick(findTestObject('Object Repository/FirmSettingsObjRepo/Page_Badr Container/input__name_en'))

WebUI.setText(findTestObject('Object Repository/FirmSettingsObjRepo/Page_Badr Container/input__name_en'), 'Mostafa Flous')

WebUI.click(findTestObject('Object Repository/FirmSettingsObjRepo/Page_Badr Container/input__name'))

WebUI.doubleClick(findTestObject('Object Repository/FirmSettingsObjRepo/Page_Badr Container/input__phone'))

WebUI.setText(findTestObject('Object Repository/FirmSettingsObjRepo/Page_Badr Container/input__phone'), '+201205313232')

WebUI.doubleClick(findTestObject('Object Repository/FirmSettingsObjRepo/Page_Badr Container/input__email'))

WebUI.setText(findTestObject('Object Repository/FirmSettingsObjRepo/Page_Badr Container/input__email'), 'mostafaflous@gmail.com')

WebUI.doubleClick(findTestObject('Object Repository/FirmSettingsObjRepo/Page_Badr Container/input__governorate'))

WebUI.setText(findTestObject('Object Repository/FirmSettingsObjRepo/Page_Badr Container/input__governorate'), 'الغربية')

WebUI.doubleClick(findTestObject('Object Repository/FirmSettingsObjRepo/Page_Badr Container/input__address'))

WebUI.setText(findTestObject('Object Repository/FirmSettingsObjRepo/Page_Badr Container/input__address'), 'سمنود')

WebUI.doubleClick(findTestObject('Object Repository/FirmSettingsObjRepo/Page_Badr Container/input__address_en'))

WebUI.setText(findTestObject('Object Repository/FirmSettingsObjRepo/Page_Badr Container/input__address_en'), 'gharbie')

WebUI.click(findTestObject('Object Repository/FirmSettingsObjRepo/Page_Badr Container/input__tax_number'))

WebUI.doubleClick(findTestObject('Object Repository/FirmSettingsObjRepo/Page_Badr Container/input__tax_number'))

WebUI.setText(findTestObject('Object Repository/FirmSettingsObjRepo/Page_Badr Container/input__tax_number'), '123456789123456')

WebUI.doubleClick(findTestObject('Object Repository/FirmSettingsObjRepo/Page_Badr Container/input__commercial_register'))

WebUI.setText(findTestObject('Object Repository/FirmSettingsObjRepo/Page_Badr Container/input__commercial_register'), '2569874123')

WebUI.selectOptionByValue(findTestObject('Object Repository/FirmSettingsObjRepo/Page_Badr Container/select_'), 'inactive', 
    true)

WebUI.click(findTestObject('Object Repository/FirmSettingsObjRepo/Page_Badr Container/button__1'))

WebUI.click(findTestObject('Object Repository/FirmSettingsObjRepo/Page_Badr Container/a_admin'))

WebUI.click(findTestObject('Object Repository/FirmSettingsObjRepo/Page_Badr Container/a__1'))

WebUI.closeBrowser()

