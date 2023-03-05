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

WebUI.setText(findTestObject('Object Repository/PayContractRepo/Page_Badr Container/input__username'), 'admin')

WebUI.setEncryptedText(findTestObject('Object Repository/PayContractRepo/Page_Badr Container/input__password'), 'tzH6RvlfSTg=')

WebUI.click(findTestObject('Object Repository/PayContractRepo/Page_Badr Container/button_'))

WebUI.click(findTestObject('Object Repository/PayContractRepo/Page_Badr Container/span_'))

WebUI.click(findTestObject('Object Repository/PayContractRepo/Page_Badr Container/span__1'))

WebUI.click(findTestObject('Object Repository/PayContractRepo/Page_Badr Container/a_'))

WebUI.selectOptionByValue(findTestObject('Object Repository/PayContractRepo/Page_Badr Container/select_'), '2', true)

WebUI.setText(findTestObject('Object Repository/PayContractRepo/Page_Badr Container/input__location'), 'المنصورة')

WebUI.selectOptionByValue(findTestObject('Object Repository/PayContractRepo/Page_Badr Container/select__1'), '2', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/PayContractRepo/Page_Badr Container/select_20  30'), '4', true)

WebUI.setText(findTestObject('Object Repository/PayContractRepo/Page_Badr Container/input__size_trips'), '10')

WebUI.setText(findTestObject('Object Repository/PayContractRepo/Page_Badr Container/input__price'), '300')

WebUI.click(findTestObject('Object Repository/PayContractRepo/Page_Badr Container/a__addContainerSizeList'))

WebUI.setText(findTestObject('Object Repository/PayContractRepo/Page_Badr Container/input__trip_days'), '4')

WebUI.click(findTestObject('Object Repository/PayContractRepo/Page_Badr Container/input__from_date'))

WebUI.click(findTestObject('Object Repository/PayContractRepo/Page_Badr Container/a_5'))

WebUI.click(findTestObject('Object Repository/PayContractRepo/Page_Badr Container/input__to_date'))

WebUI.click(findTestObject('Object Repository/PayContractRepo/Page_Badr Container/a_28'))

WebUI.setText(findTestObject('Object Repository/PayContractRepo/Page_Badr Container/input__notes'), 'تم انشاء تعاقد لعمل سداد عليه')

WebUI.click(findTestObject('Object Repository/PayContractRepo/Page_Badr Container/button__1'))

WebUI.click(findTestObject('Object Repository/PayContractRepo/Page_Badr Container/span__1_2'))

WebUI.click(findTestObject('Object Repository/PayContractRepo/Page_Badr Container/a__1'))

WebUI.click(findTestObject('Object Repository/PayContractRepo/Page_Badr Container/i__fa fa-calendar'))

WebUI.click(findTestObject('Object Repository/PayContractRepo/Page_Badr Container/input__transaction_date'))

WebUI.click(findTestObject('Object Repository/PayContractRepo/Page_Badr Container/a_14'))

WebUI.click(findTestObject('Object Repository/PayContractRepo/Page_Badr Container/span__1_2_3'))

WebUI.click(findTestObject('Object Repository/PayContractRepo/Page_Badr Container/a_'))

WebUI.selectOptionByValue(findTestObject('Object Repository/PayContractRepo/Page_Badr Container/select__1_2'), '2', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/PayContractRepo/Page_Badr Container/select_23033 23036 23039 230310'), 
    '10', true)

WebUI.setText(findTestObject('Object Repository/PayContractRepo/Page_Badr Container/input__value'), '500')

WebUI.click(findTestObject('Object Repository/PayContractRepo/Page_Badr Container/i__fa fa-calendar'))

WebUI.click(findTestObject('Object Repository/PayContractRepo/Page_Badr Container/i__fa fa-calendar'))

WebUI.click(findTestObject('Object Repository/PayContractRepo/Page_Badr Container/input__pay_till_date'))

WebUI.click(findTestObject('Object Repository/PayContractRepo/Page_Badr Container/a_21'))

WebUI.selectOptionByValue(findTestObject('Object Repository/PayContractRepo/Page_Badr Container/select_- AlRayan Cash Safe                 _aad2a8'), 
    '1', true)

WebUI.setText(findTestObject('Object Repository/PayContractRepo/Page_Badr Container/input__notes_1'), 'تم السداد نقدى على التعاقد')

WebUI.click(findTestObject('Object Repository/PayContractRepo/Page_Badr Container/button__1_2'))

WebUI.closeBrowser()

