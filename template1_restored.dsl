// Exported from:        http://xenotron.local:5516/#/templates/Folderfaa46f5a92a04181a5608a0311403350-Folder6085727f9c3c4fd396f281224a45671f-Release2909d8085c514380ab4bc3d2b0d5cb8b/releasefile
// XL Release version:   0.0.0-SNAPSHOT
// Date created:         Mon Jun 11 13:01:21 CEST 2018

xlr {
  template('template1') {
    folder('ilx/initially_not_connected')
    scheduledStartDate Date.parse("yyyy-MM-dd'T'HH:mm:ssZ", '2018-06-11T09:00:00+0200')
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