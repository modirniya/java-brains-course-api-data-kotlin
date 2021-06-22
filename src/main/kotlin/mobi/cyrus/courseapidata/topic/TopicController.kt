package mobi.cyrus.courseapidata.topic

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
class TopicController {

    @Autowired
    lateinit var topicService: TopicService

    @RequestMapping("/topics")
    fun getAllTopics(): List<Topic> = topicService.getAll()

    @RequestMapping("/topics/{id}")
    fun getSingleTopic(@PathVariable id: String): Topic = topicService.get(id)

    @RequestMapping(method = [RequestMethod.POST], value = ["/topics"])
    fun addTopic(@RequestBody topic: Topic) = topicService.add(topic)

    @RequestMapping(method = [RequestMethod.PUT], value = ["/topics"])
    fun updateTopic(@RequestBody topic: Topic) = topicService.update(topic)

    @RequestMapping(method = [RequestMethod.DELETE], value = ["/topics/{id}"])
    fun removeTopic(@PathVariable id: String) = topicService.remove(id)

}