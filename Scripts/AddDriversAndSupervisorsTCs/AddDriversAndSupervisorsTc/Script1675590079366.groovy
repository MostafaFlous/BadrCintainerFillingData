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

WebUI.click(findTestObject('Object Repository/AddDriversAndSupervisorsrepo/Page_Badr Container/span_'))

WebUI.click(findTestObject('Object Repository/AddDriversAndSupervisorsrepo/Page_Badr Container/a_'))

WebUI.setText(findTestObject('Object Repository/AddDriversAndSupervisorsrepo/Page_Badr Container/input__name'), 'مؤمن')

WebUI.selectOptionByValue(findTestObject('Object Repository/AddDriversAndSupervisorsrepo/Page_Badr Container/select_'), 
    '1', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/AddDriversAndSupervisorsrepo/Page_Badr Container/select__1'), 
    '1', true)

WebUI.setText(findTestObject('Object Repository/AddDriversAndSupervisorsrepo/Page_Badr Container/input__residency_number'), 
    '12365478963258')

WebUI.click(findTestObject('Object Repository/AddDriversAndSupervisorsrepo/Page_Badr Container/input__residency_end_date'))

WebUI.click(findTestObject('Object Repository/AddDriversAndSupervisorsrepo/Page_Badr Container/a_14'))

WebUI.setText(findTestObject('Object Repository/AddDriversAndSupervisorsrepo/Page_Badr Container/input__salary'), '3000')

WebUI.click(findTestObject('Object Repository/AddDriversAndSupervisorsrepo/Page_Badr Container/input__license_end_date'))

WebUI.click(findTestObject('Object Repository/AddDriversAndSupervisorsrepo/Page_Badr Container/a_13'))

WebUI.click(findTestObject('Object Repository/AddDriversAndSupervisorsrepo/Page_Badr Container/input__medical_insurance_end_date'))

WebUI.click(findTestObject('Object Repository/AddDriversAndSupervisorsrepo/Page_Badr Container/a_21'))

WebUI.click(findTestObject('Object Repository/AddDriversAndSupervisorsrepo/Page_Badr Container/input__passport_end_date'))

WebUI.click(findTestObject('Object Repository/AddDriversAndSupervisorsrepo/Page_Badr Container/a_21'))

WebUI.click(findTestObject('Object Repository/AddDriversAndSupervisorsrepo/Page_Badr Container/button__1'))

WebUI.setText(findTestObject('Object Repository/AddDriversAndSupervisorsrepo/Page_Badr Container/input__name'), 'سعيد')

WebUI.selectOptionByValue(findTestObject('Object Repository/AddDriversAndSupervisorsrepo/Page_Badr Container/select_'), 
    '2', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/AddDriversAndSupervisorsrepo/Page_Badr Container/select__1'), 
    '1', true)

WebUI.setText(findTestObject('Object Repository/AddDriversAndSupervisorsrepo/Page_Badr Container/input__residency_number'), 
    '125874693258')

WebUI.click(findTestObject('Object Repository/AddDriversAndSupervisorsrepo/Page_Badr Container/input__residency_end_date'))

WebUI.click(findTestObject('Object Repository/AddDriversAndSupervisorsrepo/Page_Badr Container/a_28'))

WebUI.setText(findTestObject('Object Repository/AddDriversAndSupervisorsrepo/Page_Badr Container/input__salary'), '25000')

WebUI.click(findTestObject('Object Repository/AddDriversAndSupervisorsrepo/Page_Badr Container/input__license_end_date'))

WebUI.click(findTestObject('Object Repository/AddDriversAndSupervisorsrepo/Page_Badr Container/a_21'))

WebUI.click(findTestObject('Object Repository/AddDriversAndSupervisorsrepo/Page_Badr Container/input__passport_end_date'))

WebUI.click(findTestObject('Object Repository/AddDriversAndSupervisorsrepo/Page_Badr Container/a_14'))

WebUI.click(findTestObject('Object Repository/AddDriversAndSupervisorsrepo/Page_Badr Container/input__medical_insurance_end_date'))

WebUI.click(findTestObject('Object Repository/AddDriversAndSupervisorsrepo/Page_Badr Container/a_22'))

WebUI.click(findTestObject('Object Repository/AddDriversAndSupervisorsrepo/Page_Badr Container/button__1'))

WebUI.setText(findTestObject('Object Repository/AddDriversAndSupervisorsrepo/Page_Badr Container/input__name'), 'ماجد')

WebUI.selectOptionByValue(findTestObject('Object Repository/AddDriversAndSupervisorsrepo/Page_Badr Container/select_'), 
    '2', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/AddDriversAndSupervisorsrepo/Page_Badr Container/select__1'), 
    '1', true)

WebUI.click(findTestObject('Object Repository/AddDriversAndSupervisorsrepo/Page_Badr Container/h4_'))

WebUI.setText(findTestObject('Object Repository/AddDriversAndSupervisorsrepo/Page_Badr Container/input__residency_number'), 
    '36985214785')

WebUI.click(findTestObject('Object Repository/AddDriversAndSupervisorsrepo/Page_Badr Container/input__residency_end_date'))

WebUI.click(findTestObject('Object Repository/AddDriversAndSupervisorsrepo/Page_Badr Container/a_21'))

WebUI.setText(findTestObject('Object Repository/AddDriversAndSupervisorsrepo/Page_Badr Container/input__salary'), '5000')

WebUI.click(findTestObject('Object Repository/AddDriversAndSupervisorsrepo/Page_Badr Container/input__license_end_date'))

WebUI.click(findTestObject('Object Repository/AddDriversAndSupervisorsrepo/Page_Badr Container/a_21'))

WebUI.click(findTestObject('Object Repository/AddDriversAndSupervisorsrepo/Page_Badr Container/input__medical_insurance_end_date'))

WebUI.click(findTestObject('Object Repository/AddDriversAndSupervisorsrepo/Page_Badr Container/a_14'))

WebUI.click(findTestObject('Object Repository/AddDriversAndSupervisorsrepo/Page_Badr Container/input__passport_end_date'))

WebUI.click(findTestObject('Object Repository/AddDriversAndSupervisorsrepo/Page_Badr Container/a_20'))

WebUI.click(findTestObject('Object Repository/AddDriversAndSupervisorsrepo/Page_Badr Container/button__1'))

WebUI.setText(findTestObject('Object Repository/AddDriversAndSupervisorsrepo/Page_Badr Container/input__name'), 'رأفت')

WebUI.selectOptionByValue(findTestObject('Object Repository/AddDriversAndSupervisorsrepo/Page_Badr Container/select_'), 
    '1', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/AddDriversAndSupervisorsrepo/Page_Badr Container/select__1'), 
    '1', true)

WebUI.setText(findTestObject('Object Repository/AddDriversAndSupervisorsrepo/Page_Badr Container/input__residency_number'), 
    '1254885456255')

WebUI.click(findTestObject('Object Repository/AddDriversAndSupervisorsrepo/Page_Badr Container/input__residency_end_date'))

WebUI.click(findTestObject('Object Repository/AddDriversAndSupervisorsrepo/Page_Badr Container/a_27'))

WebUI.setText(findTestObject('Object Repository/AddDriversAndSupervisorsrepo/Page_Badr Container/input__salary'), '8000')

WebUI.click(findTestObject('Object Repository/AddDriversAndSupervisorsrepo/Page_Badr Container/input__license_end_date'))

WebUI.click(findTestObject('Object Repository/AddDriversAndSupervisorsrepo/Page_Badr Container/a_14'))

WebUI.click(findTestObject('Object Repository/AddDriversAndSupervisorsrepo/Page_Badr Container/input__medical_insurance_end_date'))

WebUI.click(findTestObject('Object Repository/AddDriversAndSupervisorsrepo/Page_Badr Container/td_21'))

WebUI.click(findTestObject('Object Repository/AddDriversAndSupervisorsrepo/Page_Badr Container/input__passport_end_date'))

WebUI.click(findTestObject('Object Repository/AddDriversAndSupervisorsrepo/Page_Badr Container/a_21'))

WebUI.click(findTestObject('Object Repository/AddDriversAndSupervisorsrepo/Page_Badr Container/button__1'))

WebUI.click(findTestObject('Object Repository/AddDriversAndSupervisorsrepo/Page_Badr Container/a_admin'))

WebUI.click(findTestObject('Object Repository/AddDriversAndSupervisorsrepo/Page_Badr Container/a__1'))

WebUI.closeBrowser()

