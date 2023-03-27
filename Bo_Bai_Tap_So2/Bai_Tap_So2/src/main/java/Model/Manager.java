package Model;

public class Manager extends Staff {
    //method
    public Manager() {
        job_pos = 2;
        salary = 1500;
    }

    public double getSalary() {
        return (type_of_contr == 1) ? (1.5 * salary) : (1.2 * salary);
    }

    public void xuat() {
        super.xuat();
        System.out.println("Luong nhan vien : " + getSalary() + " \n" );
    }

    public String to_String() {

        return super.toString() + "Luong nhan vien : " + getSalary();
    }
}