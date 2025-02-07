package Lession1_SRP.Example02;
/*Solid Principles:
In the Single Responsibility Principle (SRP), each class should be responsible for a single part or functionality o…
In the Open Closed principle (OCP), software components should be open for extension but closed for modification.
In the Liskov Substitution Principle (LSP), objects of a superclass should be replaceable with objects of its subcl…
The Interface Segregation Principle (ISP) makes fine-grained interfaces that are client specific. Prevents the crea…
The Dependency Inversion Principle (DIP), ensures that the high-level modules are not dependent on low-level module…*/

public class UserManager {


    // create and delete is lifecycle and it can be in the manger class.
   public void crateUser(String username){}

    public void deleteUser(String username){}

  /*   public void logUserIn(){}

    */
}


class LogUserIn{

   public void logUserIn(String  username ){}
}