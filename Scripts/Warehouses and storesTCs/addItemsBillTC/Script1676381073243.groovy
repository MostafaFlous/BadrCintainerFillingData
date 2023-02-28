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

WebUI.click(findTestObject('Object Repository/addItemsBillRepo/Page_Badr Container/span_'))

WebUI.click(findTestObject('Object Repository/addItemsBillRepo/Page_Badr Container/a_'))

WebUI.selectOptionByValue(findTestObject('Object Repository/addItemsBillRepo/Page_Badr Container/select_'), '1', true)

WebUI.click(findTestObject('Object Repository/addItemsBillRepo/Page_Badr Container/input__date'))

WebUI.click(findTestObject('Object Repository/addItemsBillRepo/Page_Badr Container/a_21'))

'Must Change it as it uniq\r\n'
WebUI.setText(findTestObject('Object Repository/addItemsBillRepo/Page_Badr Container/input__number'), '1')

WebUI.selectOptionByValue(findTestObject('Object Repository/addItemsBillRepo/Page_Badr Container/select__1'), '3', true)

WebUI.click(findTestObject('Object Repository/addItemsBillRepo/Page_Badr Container/input__price'))

WebUI.setText(findTestObject('Object Repository/addItemsBillRepo/Page_Badr Container/input__price'), '500')

WebUI.doubleClick(findTestObject('Object Repository/addItemsBillRepo/Page_Badr Container/input__quantity'))

WebUI.setText(findTestObject('Object Repository/addItemsBillRepo/Page_Badr Container/input__quantity'), '50')

WebUI.click(findTestObject('Object Repository/addItemsBillRepo/Page_Badr Container/a__1'))

WebUI.selectOptionByValue(findTestObject('Object Repository/addItemsBillRepo/Page_Badr Container/select__1'), '4', true)

WebUI.click(findTestObject('Object Repository/addItemsBillRepo/Page_Badr Container/input__price'))

WebUI.setText(findTestObject('Object Repository/addItemsBillRepo/Page_Badr Container/input__price'), '1000')

WebUI.doubleClick(findTestObject('Object Repository/addItemsBillRepo/Page_Badr Container/input__quantity'))

WebUI.setText(findTestObject('Object Repository/addItemsBillRepo/Page_Badr Container/input__quantity'), '10')

WebUI.click(findTestObject('Object Repository/addItemsBillRepo/Page_Badr Container/a__1'))

WebUI.click(findTestObject('Object Repository/addItemsBillRepo/Page_Badr Container/input__price'))

WebUI.selectOptionByValue(findTestObject('Object Repository/addItemsBillRepo/Page_Badr Container/select__1'), '6', true)

WebUI.doubleClick(findTestObject('Object Repository/addItemsBillRepo/Page_Badr Container/input__price'))

WebUI.setText(findTestObject('Object Repository/addItemsBillRepo/Page_Badr Container/input__price'), '10')

WebUI.doubleClick(findTestObject('Object Repository/addItemsBillRepo/Page_Badr Container/input__price'))

WebUI.setText(findTestObject('Object Repository/addItemsBillRepo/Page_Badr Container/input__price'), '100')

WebUI.doubleClick(findTestObject('Object Repository/addItemsBillRepo/Page_Badr Container/input__quantity'))

WebUI.setText(findTestObject('Object Repository/addItemsBillRepo/Page_Badr Container/input__quantity'), '10')

WebUI.click(findTestObject('Object Repository/addItemsBillRepo/Page_Badr Container/a__1'))

WebUI.click(findTestObject('addItemsBillRepo/Page_Badr Container/button__1'))

WebUI.closeBrowser()

