package mobi.cyrus.courseapidata.course

import org.springframework.data.repository.CrudRepository

interface CourseRepository : CrudRepository<Course, String>