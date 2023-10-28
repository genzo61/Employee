public class Employee {
     String name;
     int SSN;
     int wage;
     int hours;


    public Employee(String name,int SSN,int wage, int hours){
        this.name=name;
        this.SSN=SSN;
        this.wage=wage;
        this.hours=hours;
    }


    public void displayinfo(){
        System.out.println(this.name + this.SSN);
    }

    public void displaysalary(){
        float saalary = wage * hours;
        System.out.println("salary : " + saalary);
    }

}
