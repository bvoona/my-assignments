package hierarchey;
public class Main {
public static void main(String[] args) {
Manager m1 = new Manager(01,"M. Das",40000);
Manager m2 = new Manager(02,"M. Nath", 52000);
Manager m3 = new Manager(03,"M. Ghosh", 65000);
Labour l1= new Labour(1,"L. Pal", 1000);
Labour l2= new Labour(2,"L. Ghosh", 15000);
Labour l3= new Labour(3,"L. Singh", 16000);
System.out.println(l1.getSalary()+l2.getSalary()+l3.getSalary()+m1.getSalary()+m2.getSalary()+m3.getSalary());
}

}
