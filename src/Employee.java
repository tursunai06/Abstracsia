public class Employee extends Person{
   private int ID;

   public Employee(String name, String gender, int ID) {
      super(name, gender);
      this.ID = ID;
   }

   public int getID() {
      return ID;
   }

   public void setID(int ID) {
      this.ID = ID;
   }

   @Override
   public String toString() {
      return "Employee{" + "Name" + getName() + "gender" + getGender() +
              "ID=" + ID +
              '}';
   }

   @Override
   public void work() {
     if (ID ==  0){
        System.out.println("Жумушчу иштебейт");
     }else {
        System.out.println("Жумушчу иштейт");
     }


   }
}
