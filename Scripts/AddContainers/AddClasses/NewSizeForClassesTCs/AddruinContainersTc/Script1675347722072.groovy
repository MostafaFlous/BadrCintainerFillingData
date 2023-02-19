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

WebUI.click(findTestObject('Object Repository/AddruinContainers/Page_Badr Container/a_'))

WebUI.click(findTestObject('Object Repository/AddruinContainers/Page_Badr Container/span_'))

WebUI.click(findTestObject('Object Repository/AddruinContainers/Page_Badr Container/a__1'))

WebUI.setText(findTestObject('Object Repository/AddruinContainers/Page_Badr Container/input__number'), '3030Rub30')

WebUI.selectOptionByValue(findTestObject('Object Repository/AddruinContainers/Page_Badr Container/select_'), '1', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/AddruinContainers/Page_Badr Container/select_30'), '3', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/AddruinContainers/Page_Badr Container/select__1'), '1', true)

WebUI.click(findTestObject('Object Repository/AddruinContainers/Page_Badr Container/button__1'))

WebUI.setText(findTestObject('Object Repository/AddruinContainers/Page_Badr Container/input__number'), '3031Rub30')

WebUI.selectOptionByValue(findTestObject('Object Repository/AddruinContainers/Page_Badr Container/select_'), '1', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/AddruinContainers/Page_Badr Container/select_30'), '3', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/AddruinContainers/Page_Badr Container/select__1'), '1', true)

WebUI.click(findTestObject('Object Repository/AddruinContainers/Page_Badr Container/button__1'))

/*

WebUI.setText(findTestObject('Object Repository/AddruinContainers/Page_Badr Container/input__number'), '3032Rub30')

WebUI.selectOptionByValue(findTestObject('Object Repository/AddruinContainers/Page_Badr Container/select_'), '1', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/AddruinContainers/Page_Badr Container/select_30'), '3', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/AddruinContainers/Page_Badr Container/select__1'), '1', true)

WebUI.click(findTestObject('Object Repository/AddruinContainers/Page_Badr Container/button__1'))

WebUI.setText(findTestObject('Object Repository/AddruinContainers/Page_Badr Container/input__number'), '3033Rub30')

WebUI.selectOptionByValue(findTestObject('Object Repository/AddruinContainers/Page_Badr Container/select_'), '1', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/AddruinContainers/Page_Badr Container/select_30'), '3', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/AddruinContainers/Page_Badr Container/select__1'), '1', true)

WebUI.click(findTestObject('Object Repository/AddruinContainers/Page_Badr Container/button__1'))

WebUI.setText(findTestObject('Object Repository/AddruinContainers/Page_Badr Container/input__number'), '3034Rub30')

WebUI.selectOptionByValue(findTestObject('Object Repository/AddruinContainers/Page_Badr Container/select_'), '1', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/AddruinContainers/Page_Badr Container/select_30'), '3', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/AddruinContainers/Page_Badr Container/select__1'), '1', true)

WebUI.click(findTestObject('Object Repository/AddruinContainers/Page_Badr Container/button__1'))

WebUI.setText(findTestObject('Object Repository/AddruinContainers/Page_Badr Container/input__number'), '3035Rub30')

WebUI.selectOptionByValue(findTestObject('Object Repository/AddruinContainers/Page_Badr Container/select_'), '1', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/AddruinContainers/Page_Badr Container/select_30'), '3', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/AddruinContainers/Page_Badr Container/select__1'), '1', true)

WebUI.click(findTestObject('Object Repository/AddruinContainers/Page_Badr Container/button__1'))

WebUI.setText(findTestObject('Object Repository/AddruinContainers/Page_Badr Container/input__number'), '3036Rub30')

WebUI.selectOptionByValue(findTestObject('Object Repository/AddruinContainers/Page_Badr Container/select_'), '1', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/AddruinContainers/Page_Badr Container/select_30'), '3', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/AddruinContainers/Page_Badr Container/select__1'), '1', true)

WebUI.click(findTestObject('Object Repository/AddruinContainers/Page_Badr Container/button__1'))

WebUI.setText(findTestObject('Object Repository/AddruinContainers/Page_Badr Container/input__number'), '3037Rub30')

WebUI.selectOptionByValue(findTestObject('Object Repository/AddruinContainers/Page_Badr Container/select_'), '1', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/AddruinContainers/Page_Badr Container/select_30'), '3', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/AddruinContainers/Page_Badr Container/select__1'), '1', true)

WebUI.click(findTestObject('Object Repository/AddruinContainers/Page_Badr Container/button__1'))

WebUI.setText(findTestObject('Object Repository/AddruinContainers/Page_Badr Container/input__number'), '3038Rub30')

WebUI.selectOptionByValue(findTestObject('Object Repository/AddruinContainers/Page_Badr Container/select_'), '1', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/AddruinContainers/Page_Badr Container/select_30'), '3', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/AddruinContainers/Page_Badr Container/select__1'), '1', true)

WebUI.click(findTestObject('Object Repository/AddruinContainers/Page_Badr Container/button__1'))

WebUI.setText(findTestObject('Object Repository/AddruinContainers/Page_Badr Container/input__number'), '3039Rub30')

WebUI.selectOptionByValue(findTestObject('Object Repository/AddruinContainers/Page_Badr Container/select_'), '1', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/AddruinContainers/Page_Badr Container/select_30'), '3', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/AddruinContainers/Page_Badr Container/select__1'), '1', true)

WebUI.click(findTestObject('Object Repository/AddruinContainers/Page_Badr Container/button__1'))

WebUI.setText(findTestObject('Object Repository/AddruinContainers/Page_Badr Container/input__number'), '3040Rub30')

WebUI.selectOptionByValue(findTestObject('Object Repository/AddruinContainers/Page_Badr Container/select_'), '1', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/AddruinContainers/Page_Badr Container/select_30'), '3', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/AddruinContainers/Page_Badr Container/select__1'), '1', true)

WebUI.click(findTestObject('Object Repository/AddruinContainers/Page_Badr Container/button__1'))

WebUI.setText(findTestObject('Object Repository/AddruinContainers/Page_Badr Container/input__number'), '3041Rub30')

WebUI.selectOptionByValue(findTestObject('Object Repository/AddruinContainers/Page_Badr Container/select_'), '1', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/AddruinContainers/Page_Badr Container/select_30'), '3', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/AddruinContainers/Page_Badr Container/select__1'), '1', true)

WebUI.click(findTestObject('Object Repository/AddruinContainers/Page_Badr Container/button__1'))

WebUI.setText(findTestObject('Object Repository/AddruinContainers/Page_Badr Container/input__number'), '3042Rub30')

WebUI.selectOptionByValue(findTestObject('Object Repository/AddruinContainers/Page_Badr Container/select_'), '1', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/AddruinContainers/Page_Badr Container/select_30'), '3', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/AddruinContainers/Page_Badr Container/select__1'), '1', true)

WebUI.click(findTestObject('Object Repository/AddruinContainers/Page_Badr Container/button__1'))

WebUI.setText(findTestObject('Object Repository/AddruinContainers/Page_Badr Container/input__number'), '3043Rub30')

WebUI.selectOptionByValue(findTestObject('Object Repository/AddruinContainers/Page_Badr Container/select_'), '1', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/AddruinContainers/Page_Badr Container/select_30'), '3', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/AddruinContainers/Page_Badr Container/select__1'), '1', true)

WebUI.click(findTestObject('Object Repository/AddruinContainers/Page_Badr Container/button__1'))

WebUI.setText(findTestObject('Object Repository/AddruinContainers/Page_Badr Container/input__number'), '3044Rub30')

WebUI.selectOptionByValue(findTestObject('Object Repository/AddruinContainers/Page_Badr Container/select_'), '1', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/AddruinContainers/Page_Badr Container/select_30'), '3', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/AddruinContainers/Page_Badr Container/select__1'), '1', true)

WebUI.click(findTestObject('Object Repository/AddruinContainers/Page_Badr Container/button__1'))

WebUI.setText(findTestObject('Object Repository/AddruinContainers/Page_Badr Container/input__number'), '3045Rub30')

WebUI.selectOptionByValue(findTestObject('Object Repository/AddruinContainers/Page_Badr Container/select_'), '1', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/AddruinContainers/Page_Badr Container/select_30'), '3', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/AddruinContainers/Page_Badr Container/select__1'), '1', true)

WebUI.click(findTestObject('Object Repository/AddruinContainers/Page_Badr Container/button__1'))

WebUI.setText(findTestObject('Object Repository/AddruinContainers/Page_Badr Container/input__number'), '3046Rub30')

WebUI.selectOptionByValue(findTestObject('Object Repository/AddruinContainers/Page_Badr Container/select_'), '1', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/AddruinContainers/Page_Badr Container/select_30'), '3', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/AddruinContainers/Page_Badr Container/select__1'), '1', true)

WebUI.click(findTestObject('Object Repository/AddruinContainers/Page_Badr Container/button__1'))

WebUI.setText(findTestObject('Object Repository/AddruinContainers/Page_Badr Container/input__number'), '3047Rub30')

WebUI.selectOptionByValue(findTestObject('Object Repository/AddruinContainers/Page_Badr Container/select_'), '1', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/AddruinContainers/Page_Badr Container/select_30'), '3', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/AddruinContainers/Page_Badr Container/select__1'), '1', true)

WebUI.click(findTestObject('Object Repository/AddruinContainers/Page_Badr Container/button__1'))

WebUI.setText(findTestObject('Object Repository/AddruinContainers/Page_Badr Container/input__number'), '3048Rub30')

WebUI.selectOptionByValue(findTestObject('Object Repository/AddruinContainers/Page_Badr Container/select_'), '1', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/AddruinContainers/Page_Badr Container/select_30'), '3', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/AddruinContainers/Page_Badr Container/select__1'), '1', true)

WebUI.click(findTestObject('Object Repository/AddruinContainers/Page_Badr Container/button__1'))

WebUI.setText(findTestObject('Object Repository/AddruinContainers/Page_Badr Container/input__number'), '3049Rub30')

WebUI.selectOptionByValue(findTestObject('Object Repository/AddruinContainers/Page_Badr Container/select_'), '1', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/AddruinContainers/Page_Badr Container/select_30'), '3', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/AddruinContainers/Page_Badr Container/select__1'), '1', true)

WebUI.click(findTestObject('Object Repository/AddruinContainers/Page_Badr Container/button__1'))

WebUI.setText(findTestObject('Object Repository/AddruinContainers/Page_Badr Container/input__number'), '3050Rub30')

WebUI.selectOptionByValue(findTestObject('Object Repository/AddruinContainers/Page_Badr Container/select_'), '1', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/AddruinContainers/Page_Badr Container/select_30'), '3', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/AddruinContainers/Page_Badr Container/select__1'), '1', true)

WebUI.click(findTestObject('Object Repository/AddruinContainers/Page_Badr Container/button__1'))
*/
WebUI.click(findTestObject('Object Repository/AddruinContainers/Page_Badr Container/a_admin'))

WebUI.click(findTestObject('Object Repository/AddruinContainers/Page_Badr Container/a__1_2'))

WebUI.closeBrowser()

