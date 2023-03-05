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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://albadrsupport.com/container-testing/login')

WebUI.setText(findTestObject('Object Repository/RentNotPaid/Page_Badr Container/input__username'), 'admin')

WebUI.setEncryptedText(findTestObject('Object Repository/RentNotPaid/Page_Badr Container/input__password'), 'tzH6RvlfSTg=')

WebUI.sendKeys(findTestObject('Object Repository/RentNotPaid/Page_Badr Container/input__password'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/RentNotPaid/Page_Badr Container/span_'))

WebUI.selectOptionByValue(findTestObject('Object Repository/RentNotPaid/Page_Badr Container/select_'), '2', true)

WebUI.click(findTestObject('Object Repository/RentNotPaid/Page_Badr Container/input__from_date'))

WebUI.click(findTestObject('Object Repository/RentNotPaid/Page_Badr Container/a_14'))

WebUI.click(findTestObject('Object Repository/RentNotPaid/Page_Badr Container/input__to_date'))

WebUI.click(findTestObject('Object Repository/RentNotPaid/Page_Badr Container/a_22'))

WebUI.click(findTestObject('Object Repository/RentNotPaid/Page_Badr Container/div_'))

WebUI.selectOptionByValue(findTestObject('Object Repository/RentNotPaid/Page_Badr Container/select__1'), '1', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/RentNotPaid/Page_Badr Container/select_20  30'), '1', true)

WebUI.setText(findTestObject('Object Repository/RentNotPaid/Page_Badr Container/input__client_name'), 'مصطفى فلوس')

WebUI.setText(findTestObject('Object Repository/RentNotPaid/Page_Badr Container/input__client_tax_number'), '123654789321456987')

WebUI.setText(findTestObject('Object Repository/RentNotPaid/Page_Badr Container/input__client_phone'), '01205313232')

WebUI.setText(findTestObject('Object Repository/RentNotPaid/Page_Badr Container/input__address'), 'المنصورة')

WebUI.setText(findTestObject('Object Repository/RentNotPaid/Page_Badr Container/input__cost'), '500')

WebUI.click(findTestObject('Object Repository/RentNotPaid/Page_Badr Container/input__payment_method'))

WebUI.selectOptionByValue(findTestObject('Object Repository/RentNotPaid/Page_Badr Container/select__1_2'), '3', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/RentNotPaid/Page_Badr Container/select__1_2_3'), '4', true)

WebUI.setText(findTestObject('Object Repository/RentNotPaid/Page_Badr Container/input__notes'), 'سيش')

WebUI.click(findTestObject('Object Repository/RentNotPaid/Page_Badr Container/button_'))

WebUI.closeBrowser()

