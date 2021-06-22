package mobi.cyrus.courseapidata.course

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class CourseService {

    @Autowired
    private lateinit var courseRepo: CourseRepository

    fun getAll(topicId: String): List<Course> = courseRepo.findAll().filter { it.topic.id == topicId }.toList()

    fun get(id: String): Course = courseRepo.findById(id).get()

    fun add(course: Course) = courseRepo.save(course)

    fun update(updatedCourse: Course) = courseRepo.save(updatedCourse)

    fun remove(id: String) = courseRepo.deleteById(id)

}