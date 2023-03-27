//import dao.StudentDAO;
//import model.Student;
//
//import java.util.List;
//import java.util.Scanner;
//
//public class main {
//    public static void main(String args[]) {
//        Scanner sc = new Scanner(System.in);
//        int choice;
//        while (true){
//            System.out.println("1   - Xuất ra danh sách các SV");
//            System.out.println("2   - Xuất ra thông tin SV theo student_id");
//            System.out.println("3   - Thêm 1 SV");
//            System.out.println("4   - Cập nhật SV theo student_id");
//            System.out.println("5   - Xoá SV");
//            System.out.println("6   - Thoát khỏi chương trình!!!");
//            System.out.println("your choice");
//            choice = sc.nextInt();
//            switch (choice){
//                case 1:
//                    List<Student> Students = StudentDAO.getAllStudent();
//                    Students.forEach(st->{
//                        System.out.print(st.toString());
//                    });
//                    break;
//                case 2:
//                    List<Student> Student = StudentDAO.getStudent_id();
//                    Student.forEach(st->{
//                        System.out.print(st.toString());
//                    });
//                    break;
//                case 3:
//                    List<Student> a = StudentDAO.AddStudent();
//                    a.forEach(st->{
//                        System.out.print(st.toString());
//                    });
//                    break;
//                case 4:
//                    List<Student> b = StudentDAO.UpdateStudent();
//                    b.forEach(st->{
//                        System.out.print(st.toString());
//                    });
//                    break;
//                case 5:
//                    List<Student> c = StudentDAO.DeleteStudent();
//                    c.forEach(st->{
//                        System.out.print(st.toString());
//                    });
//                    break;
//                case 6:
//                    System.out.println("Xin chao hen gap lai!!!");
//                    System.exit(0);
//                    break;
//                default:
//                    System.out.println("Nhap sai vui long nhap lai");
//                    break;
//            }
//        }
//    }
//
//
//}

//public interface DBConfiguration
//{
//    // Declare DB configuration here, such as URL, ...
//    // TO DO: add your code here
//    String URL = ....
//        .....
//}
