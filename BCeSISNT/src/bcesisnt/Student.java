package bcesisnt;

public class Student implements Comparable{
    
    String lname;
    String fname;
    int id;
    int grade;
    int age;
    String gender;
    int phone;
    String address;
    
    
    public Student(String l, String f, int i, int gr, int a, String gen, int ph, String add){
        lname = l;
        fname = f;
        id = i;
        phone = ph;
        address = add;
        age = a;
        gender = gen;
        grade = gr;
        System.out.println(fname + " " + lname + " created.");
    }
    
    public int compareTo(Object o){
        return(0);
    }
    
    public String toString(){
        return(lname + ";"+fname+";"+id+";"+grade+";"+age+";"+gender+";"+phone+";"+address);
    }
}
