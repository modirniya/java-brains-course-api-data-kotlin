package mobi.cyrus.courseapidata.topic

import org.springframework.data.repository.CrudRepository

interface TopicRepository : CrudRepository<Topic, String>