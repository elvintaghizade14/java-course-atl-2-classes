package az.atl.springbootrealtions.entity.manytomany;

import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
class Student {

    @Id
    private Long id;

    @ManyToMany
    private Set<Course> likedCourses;

    // additional properties
    // standard constructors, getters, and setters
}
