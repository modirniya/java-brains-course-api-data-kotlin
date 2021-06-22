package mobi.cyrus.courseapidata.topic

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class TopicService {

    @Autowired
    private lateinit var topicsRepo: TopicRepository

    fun getAll(): List<Topic> = topicsRepo.findAll().toList()

    fun get(id: String): Topic = topicsRepo.findById(id).get()

    fun add(topic: Topic) = topicsRepo.save(topic)

    fun update(updatedCourse: Topic) = topicsRepo.save(updatedCourse)

    fun remove(id: String) = topicsRepo.deleteById(id)

}