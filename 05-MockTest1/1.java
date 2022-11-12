class Person {

    private String name;
    private int age;


    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }


    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }


    public boolean isAdult(){
        return age >= 18;
    }
    
    public String toString(){
        String person = "";
        person += getName() + getAge();
        return person;
    }

    public static void main(String[] args){
        Person p = new Person("Anna",21);
        p.getAge();
        p.isAdult();
        p.setAge(17);
        p.isAdult();
        p.toString();

    }

    
}