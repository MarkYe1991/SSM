import java.util.ArrayList;
import java.util.List;

public interface I1 extends  I3 {
	public default  void a() {
		int a = 1_1;
		System.out.println(1);
	}

}
