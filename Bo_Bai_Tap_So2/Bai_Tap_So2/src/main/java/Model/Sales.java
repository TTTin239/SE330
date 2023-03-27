package Model;

public class Sales extends Staff {
    // data class
    private int nb_of_product;
    private int KPI;
    // method
    public Sales (){
        salary = 1000;
        job_pos = 1;
    }
    public void nhap() {
        super.nhap();
        System.out.print("Nhap so san pham nv da ban : ");nb_of_product = sc.nextInt();
        System.out.print("Nhap KPI cua nhan vien  : ");KPI = sc.nextInt();
        
    }
    public void xuat() {
        super.xuat();
        System.out.print("so san pham nv da ban : " + nb_of_product+ "\n");
        System.out.print("KPI cua nhan vien  : " + KPI+ "\n");
        System.out.print("Luong cua nhan vien  : " + getSalary()+ " \n");

    }

    public String to_String() {
        return (super.toString() + "so san pham nv da ban : " + nb_of_product + "\n" + "KPI cua nhan vien  : " + KPI + "\n" + "Luong nhan vien : "
        + getSalary() + "\n");
    }

    public double getSalary() {
        double luongTT = 0;
        double luongTN = 0;
        if (type_of_contr == 1) {
            luongTT = salary;
        }
        else {
            return (double)0.7 * salary+100;
        }
        float valueSale = nb_of_product/KPI;
        if(valueSale == 0) {
            luongTN = luongTT;
        }
        else if (valueSale <= 0.5 && valueSale > 0) {
            luongTN = luongTT + 150;
        }
        else if (valueSale <= 0.8 && valueSale > 0.5) {
            luongTN = luongTT + 300;
        }
        else if (valueSale <= 0.9 && valueSale > 0.8) {
            luongTN = luongTT + 400;
        }
        else if (valueSale > 0.9) {
            luongTN = luongTT + 550;
        }

        return luongTN;
    }  
}