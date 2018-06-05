// Exported from:        http://xenotron.local:5516/#/templates/Folderada7dabea33a44faa7864cde0d842068-Released07143a2a98f4cc0b67df16d45a3abfa/releasefile
// XL Release version:   8.0.2-SNAPSHOT
// Date created:         Tue Jun 05 18:29:17 CEST 2018

def scmConnectorConfig1 = 'PLEASE IMPLEMENT THIS METHOD'

xlr {
  template('test') {
    folder('ilx')
    scheduledStartDate Date.parse("yyyy-MM-dd'T'HH:mm:ssZ", '2018-06-05T09:00:00+0200')
    scmConnectorConfig scmConnectorConfig1
    phases {
      phase('New Phase') {
        tasks {
          manual('m1') {
            
          }
        }
      }
    }
    
  }
}