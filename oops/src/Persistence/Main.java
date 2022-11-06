package Persistence;
public class Main
{
	public static void main(String[] args) {
		FilePersistence client1= new FilePersistence();
		DatabasePersistence client2=new DatabasePersistence();
		client1.persist();
		client2.persist();
	}
}
