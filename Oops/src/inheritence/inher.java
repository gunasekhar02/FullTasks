package inheritence;
class guna{
	int a=10;
	void add() {
		System.out.println(200);
	}
}

public class inher extends guna {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		inher ob=new inher();
		System.out.println(ob.a);
		ob.add();

	}

}
