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

WebUI.click(findTestObject('Object Repository/AddClients/Page_Badr Container/a_'))

WebUI.click(findTestObject('Object Repository/AddClients/Page_Badr Container/a__1'))

WebUI.setText(findTestObject('Object Repository/AddClients/Page_Badr Container/input__name'), 'شعبان')

WebUI.selectOptionByValue(findTestObject('Object Repository/AddClients/Page_Badr Container/select_'), '1', true)

WebUI.setText(findTestObject('Object Repository/AddClients/Page_Badr Container/input__phone'), '123456789')

WebUI.doubleClick(findTestObject('Object Repository/AddClients/Page_Badr Container/input__phone'))

WebUI.setText(findTestObject('Object Repository/AddClients/Page_Badr Container/input__phone'), '0512345678')

WebUI.setText(findTestObject('Object Repository/AddClients/Page_Badr Container/input__address'), 'الدمام')

WebUI.setText(findTestObject('Object Repository/AddClients/Page_Badr Container/input__credit_limit'), '2000')

WebUI.setText(findTestObject('Object Repository/AddClients/Page_Badr Container/input__tax_number'), '123456789123456')

WebUI.setText(findTestObject('Object Repository/AddClients/Page_Badr Container/input__activity'), 'مقاول هدم')

WebUI.setText(findTestObject('Object Repository/AddClients/Page_Badr Container/input__record_number'), '152356125')

WebUI.doubleClick(findTestObject('Object Repository/AddClients/Page_Badr Container/input__record_number'))

WebUI.setText(findTestObject('Object Repository/AddClients/Page_Badr Container/input__record_number'), '152356125')

WebUI.click(findTestObject('Object Repository/AddClients/Page_Badr Container/button__1'))

WebUI.setText(findTestObject('Object Repository/AddClients/Page_Badr Container/input__name'), 'سعفان')

WebUI.selectOptionByValue(findTestObject('Object Repository/AddClients/Page_Badr Container/select_'), '1', true)

WebUI.setText(findTestObject('Object Repository/AddClients/Page_Badr Container/input__phone'), '05123456788')

WebUI.setText(findTestObject('Object Repository/AddClients/Page_Badr Container/input__address'), 'الجبيل')

WebUI.setText(findTestObject('Object Repository/AddClients/Page_Badr Container/input__credit_limit'), '5000')

WebUI.setText(findTestObject('Object Repository/AddClients/Page_Badr Container/input__tax_number'), '123456789789456')

WebUI.setText(findTestObject('Object Repository/AddClients/Page_Badr Container/input__activity'), 'مقاول بناء')

WebUI.setText(findTestObject('Object Repository/AddClients/Page_Badr Container/input__record_number'), '256985')

WebUI.click(findTestObject('Object Repository/AddClients/Page_Badr Container/button__1'))

WebUI.setText(findTestObject('Object Repository/AddClients/Page_Badr Container/input__name'), 'نعمان')

WebUI.selectOptionByValue(findTestObject('Object Repository/AddClients/Page_Badr Container/select_'), '1', true)

WebUI.setText(findTestObject('Object Repository/AddClients/Page_Badr Container/input__phone'), '05123456787')

WebUI.setText(findTestObject('Object Repository/AddClients/Page_Badr Container/input__address'), 'خميس مشيط')

WebUI.setText(findTestObject('Object Repository/AddClients/Page_Badr Container/input__credit_limit'), '3000')

WebUI.setText(findTestObject('Object Repository/AddClients/Page_Badr Container/input__tax_number'), '123456789123456')

WebUI.doubleClick(findTestObject('Object Repository/AddClients/Page_Badr Container/input__tax_number'))

WebUI.setText(findTestObject('Object Repository/AddClients/Page_Badr Container/input__tax_number'), '123456789369258')

WebUI.setText(findTestObject('Object Repository/AddClients/Page_Badr Container/input__activity'), 'مقاول نظافه')

WebUI.setText(findTestObject('Object Repository/AddClients/Page_Badr Container/input__record_number'), '25458')

WebUI.click(findTestObject('Object Repository/AddClients/Page_Badr Container/button__1'))

WebUI.click(findTestObject('Object Repository/AddClients/Page_Badr Container/div_'))

WebUI.click(findTestObject('Object Repository/AddClients/Page_Badr Container/a_admin'))

WebUI.click(findTestObject('Object Repository/AddClients/Page_Badr Container/a__1_2'))

WebUI.closeBrowser()

