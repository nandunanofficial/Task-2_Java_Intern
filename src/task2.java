import javax.xml.transform.Source;
import java.util.ArrayList;
import java.util.Scanner;

public class task2 {

    public static void main(String args[]) {

        ArrayList<Student> sl = new ArrayList<Student>();
        Scanner in = new Scanner(System.in);
        while (true){
        System.out.println("\nEnter the choice to be performed:\n1.Add Students\n2.View Students List\n3.Update Students\n4.Delete Students\n5.Exit");
        int n = in.nextInt();
            if(n==1){
                System.out.println("Enter Id of the Student:");
                int id=in.nextInt();
                in.nextLine();
                System.out.println("Enter the Name of the Student:");
                String na=in.nextLine();
                System.out.println("Enter the mark obtained by the student:");
                Float mark=in.nextFloat();
                sl.add(new Student(id,na,mark));
                System.out.println("\nRecords Added Sucessfully!!");
            }
            if(n==2){
                if(sl.isEmpty()){
                    System.out.println("\nNo Records Found!!");
                }
                else{
                    for (Student i:sl){
                        i.display();
                    }
                }

            }
            if(n==3){
                System.out.println("Enter the id of the Student to be updated:");
                int uid=in.nextInt();
                boolean found=false;
                for(Student s:sl){
                    if(s.id==uid){
                        System.out.println("Enter the new Id to be Updated:");
                        s.id= in.nextInt();
                        in.nextLine();
                        System.out.println("Enter the new Name to be Updated:");
                        s.name=in.nextLine();
                        System.out.println("Enter the new marks to be updated:");
                        s.mark=in.nextFloat();
                        System.out.println("\nStudent Details updated!!");
                        found=true;
                        break;
                    }
                }
                if(found==false){
                    System.out.println("\nId not found!!");
                    break;
                }
            }
            if(n==4){
                System.out.println("Enter the ID to be Deleted:");
                boolean found =false;
                int nid= in.nextInt();
                for(int i=0;i<sl.size();i++){
                    if(sl.get(i).id==nid){
                        sl.remove(i);
                        System.out.println("\nStudent Record Deleted!!");
                        found=true;
                        break;
                    }
                }
                if(found==false){
                    System.out.println("\nId not found!!");
                    break;
                }
            }
            if(n==5){
                System.out.println("\nOperation Ended!!");
                System.exit(0);
            }
        }
    }
}
class Student{
    int id;
    String name;
    Float mark;
    public Student(int i,String n,Float m){
        id=i;
        name=n;
        mark=m;
    }
    void display(){
        System.out.println("\nName:"+name+"\nId:"+id+"\nMarks:"+mark+"\n");
    }
}
