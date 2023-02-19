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

WebUI.click(findTestObject('Object Repository/CreateNewContract/Page_Badr Container/a_'))

WebUI.click(findTestObject('Object Repository/CreateNewContract/Page_Badr Container/span_'))

WebUI.click(findTestObject('Object Repository/CreateNewContract/Page_Badr Container/span__1'))

WebUI.selectOptionByValue(findTestObject('Object Repository/CreateNewContract/Page_Badr Container/select_'), '1', true)

WebUI.setText(findTestObject('Object Repository/CreateNewContract/Page_Badr Container/input__location'), 'الدمام')

WebUI.selectOptionByValue(findTestObject('Object Repository/CreateNewContract/Page_Badr Container/select__1'), '1', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/CreateNewContract/Page_Badr Container/select__1'), '2', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/CreateNewContract/Page_Badr Container/select_20  30'), '2', 
    true)

WebUI.setText(findTestObject('Object Repository/CreateNewContract/Page_Badr Container/input__size_trips'), '5')

WebUI.click(findTestObject('Object Repository/CreateNewContract/Page_Badr Container/i__fa fa-plus'))

WebUI.click(findTestObject('Object Repository/CreateNewContract/Page_Badr Container/input__tax_status'))

WebUI.setText(findTestObject('Object Repository/CreateNewContract/Page_Badr Container/input__trip_days'), '3')

WebUI.click(findTestObject('Object Repository/CreateNewContract/Page_Badr Container/input__from_date'))

WebUI.click(findTestObject('Object Repository/CreateNewContract/Page_Badr Container/a_5'))

WebUI.click(findTestObject('Object Repository/CreateNewContract/Page_Badr Container/input__to_date'))

WebUI.click(findTestObject('Object Repository/CreateNewContract/Page_Badr Container/a_28'))

WebUI.click(findTestObject('Object Repository/CreateNewContract/Page_Badr Container/input__notes'))

WebUI.setText(findTestObject('Object Repository/CreateNewContract/Page_Badr Container/input__notes'), 'تم انشاء التعاقد الجديد')

WebUI.click(findTestObject('Object Repository/CreateNewContract/Page_Badr Container/button__1'))

WebUI.click(findTestObject('Object Repository/CreateNewContract/Page_Badr Container/a_admin'))

WebUI.click(findTestObject('Object Repository/CreateNewContract/Page_Badr Container/a__1'))

WebUI.closeBrowser()

