
public class Person {
    private String name;
    private String email;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public Person(String name,String email){
        this.name=name;
        this.email=email;
    }
    @Override
    public String toString(){

            return"The name of owner is: "+name+"The email of the owner is: "+email;
    }
    @Override
    public boolean equals(Object obj){

            Person temp=(Person)obj;
            return this.getName().equals(temp.getName());
    }

    
}
