package mobi.cyrus.courseapidata.course

import mobi.cyrus.courseapidata.topic.Topic
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.ManyToOne

@Entity
class Course(@Id var id: String, var name: String, var description: String) {
    @ManyToOne
    lateinit var topic: Topic
}