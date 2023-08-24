package az.atl.springbootrealtions.entity.manytomany;

import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Course {

    @Id
    private Long id;

    @ManyToMany
    private Set<Student> likes;

    // additional properties
    // standard constructors, getters, and setters
}
