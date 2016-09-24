import java.io.ByteArrayInputStream;  
import java.io.ByteArrayOutputStream;  
import java.io.IOException;  
import java.io.ObjectInputStream;  
import java.io.ObjectOutputStream;  
import java.io.Serializable;  
  
public class Deep implements Serializable {  
  
  
    private static final long serialVersionUID = 9031569199021177136L;  
    private String name;  
    private Long age;  
  
    public Long getAge() {  
        return age;  
    }  
  
    public void setAge(Long age) {  
        this.age = age;  
    }  
  
    public String getName() {  
        return name;  
    }  
  
    public void setName(String name) {  
        this.name = name;  
    }  
  
    public Object deepClone() throws ClassNotFoundException, IOException{  
        ByteArrayOutputStream bo = new ByteArrayOutputStream();  
        ObjectOutputStream oo = new ObjectOutputStream(bo);  
        oo.writeObject(this);  
        ByteArrayInputStream bi = new ByteArrayInputStream(bo.toByteArray());  
        ObjectInputStream oi = new ObjectInputStream(bi);  
        return (oi.readObject());  
    }  
} 