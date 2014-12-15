    import groovy.xml.XmlUtil

/**
 * Created by Anshul Dutta on 08/12/2014.
 */

def oldFile = '/Users/vhmit006/work/spark/vsol/web-api/src/test/soapui/web-api-soapui.xml'
def xml = new XmlSlurper().parse(oldFile);
def prettyXml = XmlUtil.serialize(xml).toString()
def newFile = new File(oldFile + '-pretty.xml')
newFile << prettyXml

