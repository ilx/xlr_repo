// Exported from:        http://xenotron.local:5516/#/templates/Releaseb74271f68296415e9801aaaebc7ecb1a/releasefile
// XL Release version:   0.0.0-SNAPSHOT
// Date created:         Mon Jun 11 17:04:48 CEST 2018

xlr {
  template('fdsafsda') {
    scheduledStartDate Date.parse("yyyy-MM-dd'T'HH:mm:ssZ", '2018-06-11T09:00:00+0200')
    phases {
      phase('New Phase') {
        
      }
    }
    teams {
      team('Template Owner') {
        members 'admin'
        permissions 'template#edit', 'template#lock_task', 'template#view', 'template#edit_triggers', 'template#edit_security', 'template#create_release'
      }
      team('Release Admin') {
        permissions 'release#edit', 'release#lock_task', 'release#start', 'release#reassign_task', 'release#edit_blackout', 'template#view', 'release#edit_security', 'release#abort', 'release#view', 'release#edit_task'
      }
    }
  }
}