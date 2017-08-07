package serializable;
import java.io.Serializable;

/**
 * Created by lc114 on 2017/8/7.
 */
public class User1 implements Serializable {
    private String name;
    private int age;
    transient int height;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHeight() {return height;}

    public void setHeight(int height){
        this.height = height;
    }

    @Override
    public String toString() {
        return "User{"+"name='"+name+"',age="+age+",height="+height+"}";
    }
}
