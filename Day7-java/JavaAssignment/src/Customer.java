public class Customer {

     private int id;
     private String name;
     private String email;

     Customer()
     {

     }

     public void setId(int id)
     {
         this.id=id;
     }

    public void setName(String name)
    {
        this.name=name;
    }


    public void setEmail(String email)
    {
        this.email=email;
    }

    public int getId()
    {
        return id;
    }

    public String getName()
    {
        return name;
    }
    public String getEmail()
    {
        return email;
    }

    public static void main(String[] args)
    {
         Customer cs1=new Customer();
         cs1.setId(1);
         cs1.setName("Praveen");
         cs1.setEmail("Praveen231@gmail.com");

         System.out.print("Id of Customer is "+cs1.getId()+"\nName of Customer is "+cs1.getName()+"\nEmail of Customer is "+cs1.getEmail());
    }
}
