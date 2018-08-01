// Exported from:        http://xenotron.home:5516/#/templates/Folderfc6c80da2fa74fda86b7b1fa063b2fbf-Releaseb5eccb77070845b7a0f6f31bb73a4762/releasefile
// XL Release version:   8.1.0-SNAPSHOT
// Date created:         Wed Aug 01 17:04:33 CEST 2018

xlr {
  template('versioned_template') {
    folder('ilx')
    scheduledStartDate Date.parse("yyyy-MM-dd'T'HH:mm:ssZ", '2018-07-31T09:00:00+0200')
    phases {
      phase('New Phase') {
        tasks {
          manual('manual task') {
            attachments {
              attachment("sql:Attachment5d0bfbc73d06424b9feff0ea23fc3fdf") {
                filename "attachments/Attachment5d0bfbc73d06424b9feff0ea23fc3fdf-quokka.gif"
              }
            }
          }
          manual('task2') {
            attachments {
              attachment("sql:Attachmentaa3133c1236148b58512aef669818566") {
                filename "attachments/Attachmentaa3133c1236148b58512aef669818566-quokka.gif"
              }
            }
          }
          manual('task3') {
            
          }
        }
      }
    }
    
  }
}