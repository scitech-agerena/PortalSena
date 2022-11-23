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

WebUI.maximizeWindow()

WebUI.navigateToUrl('http://172.29.35.252:8080/PortalSena16/servlet/com.portalsena.scigamlogin')

WebUI.click(findTestObject('Object Repository/Participantes/Page_Inicio de Sesin/div_Iniciar conSENA  InternoUsuario Externo'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Participantes/Page_Inicio de Sesin/select_SENA  InternoUsuario Externo'), 
    'local', true)

WebUI.setText(findTestObject('Object Repository/Participantes/Page_Inicio de Sesin/input_Iniciar con_vUSERNAME'), 'scitech_1')

WebUI.setEncryptedText(findTestObject('Object Repository/Participantes/Page_Inicio de Sesin/input_Iniciar con_USERPASSWORDContainer_Use_26b53f'), 
    'Ov80Ze0TAxrrh43olNsrTA==')

WebUI.click(findTestObject('Object Repository/Participantes/Page_Inicio de Sesin/button_Iniciar con_USERPASSWORDContainer_Us_b9789e'))

WebUI.click(findTestObject('Object Repository/Participantes/Page_Inicio de Sesin/button_Iniciar con_USERPASSWORDContainer_Us_b9789e_1'))

WebUI.click(findTestObject('Object Repository/Participantes/Page_Inicio de Sesin/input_Por favor ingrese en siguiente texto_LOGIN'))

WebUI.click(findTestObject('Object Repository/Participantes/Page_Security Backend Home/a_Administracin'))

WebUI.click(findTestObject('Object Repository/Participantes/Page_Security Backend Home/a_Proceso'))

WebUI.click(findTestObject('Object Repository/Participantes/Page_Security Backend Home/a_Participantes'))

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/Participantes/Page_Participantes/input_Estado_INSERT'))

WebUI.takeScreenshot()

WebUI.selectOptionByValue(findTestObject('Object Repository/Participantes/Page_Participantes/select_Seleccione.CDULA DE CIUDADANACDULA D_f8deef'), 
    '1', true)

WebUI.setText(findTestObject('Object Repository/Participantes/Page_Participantes/input_Nmero Identificacin_W0026W0007W0012PATNUMIDE'), 
    '1007469704')

WebUI.setText(findTestObject('Object Repository/Participantes/Page_Participantes/input_Primer nombre_W0026W0007W0012PATNOMPRI'), 
    'JORGE')

WebUI.setText(findTestObject('Object Repository/Participantes/Page_Participantes/input_Segundo nombre_W0026W0007W0012PATNOMSEG'), 
    'LUIS')

WebUI.setText(findTestObject('Object Repository/Participantes/Page_Participantes/input_Primer apellido_W0026W0007W0012PATAPEPRI'), 
    'GERENA')

WebUI.setText(findTestObject('Object Repository/Participantes/Page_Participantes/input_Segundo apellido_W0026W0007W0012PATAPESEG'), 
    'CASTELLANOS')

WebUI.setText(findTestObject('Object Repository/Participantes/Page_Participantes/input_Correo electrnico_W0026W0007W0012PATCORELE'), 
    'jgerena@scitech.com.co')

WebUI.setText(findTestObject('Object Repository/Participantes/Page_Participantes/input_Cargo_W0026W0007W0012PATCAR'), 'Q.A Analista')

WebUI.setText(findTestObject('Object Repository/Participantes/Page_Participantes/input_Telfono_W0026W0007W0012PATTEL'), 
    '0001234')

WebUI.setText(findTestObject('Object Repository/Participantes/Page_Participantes/input_Celular_W0026W0007W0012PATCEL'), 
    '3133162500')

WebUI.setText(findTestObject('Object Repository/Participantes/Page_Participantes/textarea_Direccin_W0026W0007W0012PATDIR'), 
    'Avenida Bucaros 3 - 308')

WebUI.setText(findTestObject('Object Repository/Participantes/Page_Participantes/textarea_Profesin_W0026W0007W0012PATPRO'), 
    'Tecnologo en desarrollo de sistemas informaticos ')

WebUI.rightClick(findTestObject('Object Repository/Participantes/Page_Participantes/textarea_Profesin_W0026W0007W0012PATPRO'))

WebUI.setText(findTestObject('Object Repository/Participantes/Page_Participantes/textarea_Profesin_W0026W0007W0012PATPRO'), 
    'Tecnólogo en desarrollo de sistemas informaticos ')

WebUI.rightClick(findTestObject('Object Repository/Participantes/Page_Participantes/textarea_Profesin_W0026W0007W0012PATPRO'))

WebUI.setText(findTestObject('Object Repository/Participantes/Page_Participantes/textarea_Profesin_W0026W0007W0012PATPRO'), 
    'Tecnólogo en desarrollo de sistemas informáticos ')

WebUI.selectOptionByValue(findTestObject('Object Repository/Participantes/Page_Participantes/select_Seleccione.AMAZONASANTIOQUIAARAUCAAT_c008ef'), 
    '22', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Participantes/Page_Participantes/select_Seleccione.AGUADA - 68013ALBANIA - 6_cdbd7a'), 
    '845', true)

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/Participantes/Page_Participantes/input_ltima Modificacin_W0026W0007W0012ENTER'))

WebUI.takeScreenshot()

