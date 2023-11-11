package stream.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author Administrator
 */
@Data
@AllArgsConstructor
public class Student {

    public int id;
    public String name;
    public int age;
    public String gender;

}
