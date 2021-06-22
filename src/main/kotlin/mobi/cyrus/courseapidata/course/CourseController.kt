package mobi.cyrus.courseapidata.course

import mobi.cyrus.courseapidata.topic.Topic
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
class CourseController {

    @Autowired
    lateinit var courseService: CourseService

    @RequestMapping("/topics/{id}/courses")
    fun getAll(@PathVariable id: String): List<Course> = courseService.getAll(id)

    @RequestMapping("/topics/*/courses/{id}")
    fun get(@PathVariable id: String): Course = courseService.get(id)

    @RequestMapping(method = [RequestMethod.POST], value = ["/topics/{topicId}/courses"])
    fun add(@RequestBody course: Course, @PathVariable topicId: String) {
        course.topic = Topic(topicId)
        courseService.add(course)
    }

    @RequestMapping(method = [RequestMethod.PUT], value = ["/topics/{topicId}/courses"])
    fun update(@RequestBody course: Course, @PathVariable topicId: String) {
        course.topic = Topic(topicId)
        courseService.update(course)
    }

    @RequestMapping(method = [RequestMethod.DELETE], value = ["/topics/*/courses/{id}"])
    fun remove(@PathVariable id: String) = courseService.remove(id)

}