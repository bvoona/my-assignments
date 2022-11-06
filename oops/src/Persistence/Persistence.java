package Persistence;
abstract class Persistence{
    public abstract void persist();
}
class FilePersistence extends Persistence{
    public void persist(){
        System.out.println("The data is stored in file");
    }
}
class DatabasePersistence extends Persistence{
    public void persist(){
        System.out.println("The data  is stored in  database");
    }
    
}