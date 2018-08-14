// Exported from:        http://xenotron.home:5516/#/templates/Foldera040dc9c89574a63b1eb1b596672fa83-Release3308100043b54fa6bed23e4f92de9437/releasefile
// XL Release version:   8.1.0-SNAPSHOT
// Date created:         Tue Aug 14 11:15:26 CEST 2018

xlr {
  template('t1') {
    folder('test')
    scheduledStartDate Date.parse("yyyy-MM-dd'T'HH:mm:ssZ", '2018-08-14T09:00:00+0200')
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