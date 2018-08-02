// Exported from:        http://xenotron.local:5516/#/templates/Folderfc6c80da2fa74fda86b7b1fa063b2fbf-Folder1cfb79b968da472bbf8203dca57ab844-Release24a36be32bea4c89bf8f72653bfa8349/releasefile
// XL Release version:   8.1.0-SNAPSHOT
// Date created:         Thu Aug 02 18:03:49 CEST 2018

xlr {
  template('test template with a / in name') {
    folder('ilx/with a / in name')
    scheduledStartDate Date.parse("yyyy-MM-dd'T'HH:mm:ssZ", '2018-08-02T09:00:00+0200')
    phases {
      phase('New Phase') {
        
      }
    }
    
  }
}