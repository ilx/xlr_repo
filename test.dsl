// Exported from:        http://xenotron.local:5516/#/templates/Folderc6882ac1d333480393e263697477f07d-Releasec6c047235dcd42589101c19788b54db8/releasefile
// XL Release version:   0.0.0-SNAPSHOT
// Date created:         Tue Jun 05 18:50:22 CEST 2018

def scmConnectorConfig1 = 'PLEASE IMPLEMENT THIS METHOD'

xlr {
  template('test') {
    folder('ilx')
    scheduledStartDate Date.parse("yyyy-MM-dd'T'HH:mm:ssZ", '2018-06-05T09:00:00+0200')
    scmConnectorConfig scmConnectorConfig1
    phases {
      phase('New Phase') {
        tasks {
          manual('does not exist in a current version!!!!') {
            
          }
        }
      }
    }
    
  }
}