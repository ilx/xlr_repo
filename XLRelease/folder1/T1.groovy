// Exported from:        http://xenotron.local:5516/#/templates/Folder5aa3aa2da8044d3092a566e910d61282-Released0552e7990344249ac804a8fda0cf1b/releasefile
// XL Release version:   8.1.0-SNAPSHOT
// Date created:         Thu Aug 02 12:36:22 CEST 2018

xlr {
  template('T1') {
    folder('folder1')
    scheduledStartDate Date.parse("yyyy-MM-dd'T'HH:mm:ssZ", '2018-08-02T09:00:00+0200')
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