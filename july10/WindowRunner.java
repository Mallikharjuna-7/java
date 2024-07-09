public class WindowRunner{
	public static void main(String args[]){
	System.out.println(Window.info());
	System.out.println(Window.info(10000000L));
	System.out.println(Window.info((byte)5,500.20));
	System.out.println(Window.info((byte)5,500.20,'A'));
	System.out.println(Window.info((byte)5,500.20,true,'A'));
	System.out.println(Window.info("Plus",(byte)5,500.20,true,'A'));
	System.out.println(Window.info(10,"Plus",(byte)5,500.20,true,'A'));
	System.out.println(Window.info("Plus",10,(byte)5,500.20,(short)500,true,'A'));
	System.out.println(Window.info("Plus",100.0f,10,500.20,(short)500,true,'A',(byte)5));
	}
}
