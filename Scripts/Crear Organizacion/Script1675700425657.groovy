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

WebUI.navigateToUrl('http://172.29.35.252:8080/PortalSena16/servlet/com.portalsena.scigamlogin')

WebUI.selectOptionByValue(findTestObject('Object Repository/Crear Organizacion/Page_Inicio de Sesin/select_SENA  InternoUsuario Externo'), 
    'local', true)

WebUI.setText(findTestObject('Object Repository/Crear Organizacion/Page_Inicio de Sesin/input_Iniciar con_vUSERNAME'), 'scitech_1')

WebUI.setEncryptedText(findTestObject('Object Repository/Crear Organizacion/Page_Inicio de Sesin/input_Iniciar con_USERPASSWORDContainer_Use_26b53f'), 
    'Ov80Ze0TAxrrh43olNsrTA==')

WebUI.click(findTestObject('Object Repository/Crear Organizacion/Page_Inicio de Sesin/input_Por favor ingrese en siguiente texto_LOGIN'))

WebUI.click(findTestObject('Object Repository/Crear Organizacion/Page_Security Backend Home/a_Administracin'))

WebUI.click(findTestObject('Object Repository/Crear Organizacion/Page_Security Backend Home/a_Proceso'))

WebUI.click(findTestObject('Object Repository/Crear Organizacion/Page_Security Backend Home/span_Organizaciones'))

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/Crear Organizacion/Page_Organizaciones/input_Indicador de Marca_INSERT'))

WebUI.setText(findTestObject('Object Repository/Crear Organizacion/Page_Organizaciones/input_Nro. Identificacin_W0031W0007W0012EMPNUMID'), 
    '1097332867')

WebUI.setText(findTestObject('Object Repository/Crear Organizacion/Page_Organizaciones/input_Dgito Verificacin_W0031W0007W0012EMPDIGVER'), 
    '7')

WebUI.setText(findTestObject('Object Repository/Crear Organizacion/Page_Organizaciones/textarea_Razon Social_W0031W0007W0012EMPRAZSOC'), 
    'Pruebas Katalon')

WebUI.selectOptionByValue(findTestObject('Object Repository/Crear Organizacion/Page_Organizaciones/select_Seleccione.Grande (200)Pequea (11-50_a45360'), 
    '1', true)

WebUI.setText(findTestObject('Object Repository/Crear Organizacion/Page_Organizaciones/input_N Empleados_W0031W0007W0012EMPNUMEMP'), 
    '200')

WebUI.selectOptionByValue(findTestObject('Object Repository/Crear Organizacion/Page_Organizaciones/select_Seleccione.AMAZONASANTIOQUIAARAUCAAT_32378a'), 
    '4', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Crear Organizacion/Page_Organizaciones/select_Seleccione.BOGOT D.C'), 
    '150', true)

WebUI.setText(findTestObject('Object Repository/Crear Organizacion/Page_Organizaciones/input_Direccin_W0031W0007W0012EMPDIR'), 
    'AV 1 # 2 - 3')

WebUI.setText(findTestObject('Object Repository/Crear Organizacion/Page_Organizaciones/input_Sigla_W0031W0007W0012EMPSIG'), 
    'KATALON')

WebUI.setText(findTestObject('Object Repository/Crear Organizacion/Page_Organizaciones/input_Telfono_W0031W0007W0012EMPTEL'), 
    '3211212')

WebUI.setText(findTestObject('Object Repository/Crear Organizacion/Page_Organizaciones/input_Celular_W0031W0007W0012EMPCEL'), 
    '3211231111')

WebUI.setText(findTestObject('Object Repository/Crear Organizacion/Page_Organizaciones/input_Fax_W0031W0007W0012EMPFAX'), 
    '3211212')

WebUI.setText(findTestObject('Object Repository/Crear Organizacion/Page_Organizaciones/input_Correo_W0031W0007W0012EMPCOR'), 
    'asgerenac@gmail.com')

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/Crear Organizacion/Page_Organizaciones/div_OrganizacionesNombre EmpresaOrganizacio_d30114'))

WebUI.setText(findTestObject('Object Repository/Crear Organizacion/Page_Organizaciones/input_Representante legal_W0031W0007W0012EMPGER'), 
    'JUAN JOSE PELAEZ')

WebUI.click(findTestObject('Object Repository/Crear Organizacion/Page_Organizaciones/img_Seleccione_W0031W0007W0012SELACTIVIDAD'))

WebUI.click(findTestObject('Object Repository/Crear Organizacion/Page_Organizaciones/a_ACTIVIDADES DE APOYO DIAGNOSTICO'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Crear Organizacion/Page_Organizaciones/select_Seleccione.SECTOR ACADMICOSECTOR GUB_12026a'), 
    '3', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Crear Organizacion/Page_Organizaciones/select_Seleccione.CENTRO DE INVESTIGACIN Y _015f4d'), 
    '1', true)

WebUI.setText(findTestObject('Object Repository/Crear Organizacion/Page_Organizaciones/input_Pgina web_W0031W0007W0012EMPPAGWEB'), 
    'WWW.ALGECAS.COM')

WebUI.selectOptionByValue(findTestObject('Object Repository/Crear Organizacion/Page_Organizaciones/select_Seleccione.SiNo'), 
    '1', true)

WebUI.setText(findTestObject('Object Repository/Crear Organizacion/Page_Organizaciones/input_N Empleados_W0031W0007W0012EMPNUMEMP'), 
    '201')

WebUI.click(findTestObject('Object Repository/Crear Organizacion/Page_Organizaciones/div_Tamao.Seleccione.Grande (200)Pequea (11_5cc073'))

WebUI.click(findTestObject('Object Repository/Crear Organizacion/Page_Organizaciones/input_-       000000_W0031W0007W0012ENTER'))

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/Crear Organizacion/Page_Organizaciones/div_La empresas PRUEBAS KATALON fue creada'))

WebUI.closeBrowser()

