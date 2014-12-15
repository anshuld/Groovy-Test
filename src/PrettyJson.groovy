import groovy.json.JsonOutput
import groovy.json.JsonSlurper
import groovy.xml.XmlUtil

/**
 * Created by Anshul Dutta on 08/12/2014.
 */

def oldFile = '/Users/vhmit006/Documents/webapi/emptySearchResult.json'
def json = new JsonSlurper().parse(new File(oldFile));
//println json.toString()
assert 1 ==1
def prettyJson = JsonOutput.prettyPrint(JsonOutput.toJson(json))
def newFile = new File(oldFile + '-pretty.json')
newFile << prettyJson

