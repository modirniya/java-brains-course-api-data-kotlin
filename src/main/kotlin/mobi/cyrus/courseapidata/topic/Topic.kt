package mobi.cyrus.courseapidata.topic

import javax.persistence.Entity
import javax.persistence.Id

@Entity
class Topic(@Id var id: String, var name: String, var description: String) {
    constructor(id: String) : this(id, "", "")
}