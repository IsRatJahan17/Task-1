package israt;

public class Main {

    public static void main(String[] args) {
	 /* Name: Israt Jahan
       Id   : 2012020163
       Section : D
       E-mail : cse_2012020163@lus.ac.bd
       Date : 14-07-2021
    */
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter section: ");
        String section = sc.nextLine();
        System.out.println("section: " + section);
        Info student = new Info();
        System.out.println("Name: "+student.name);
        System.out.println("Id: "+student.id);
        Hobby test = new Hobby();
        System.out.println("Hobby: "+test.hobbyName);

    }
}

