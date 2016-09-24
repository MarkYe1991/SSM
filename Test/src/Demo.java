import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Demo {
	public static void main(String[] args) throws Exception {
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("D:\\x.person"));
		oos.writeObject(new Person("张三", 20));
		oos.writeObject(new Person("李四", 18));
		oos.writeObject(new Person("王五", 23));
		oos.writeObject(null);// 插入null是用来判断是否读取到结尾。
		oos.close();
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("D:\\x.person"));
		Object obj = null;
		while ((obj = ois.readObject()) != null) { // 如果为null就读取到文件结尾了。
			Person person = (Person) obj;
			System.out.println(person);
		}
	}
}