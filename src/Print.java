public class Print {
    public static void main(String[] args) {

//        int x = 5;
//        int y = 8;
//        String z = "5";
//
//        System.out.println(x == y);

        //Nested if
//        int studentGrade1 = 50;
//
//        int studentGrade2 = 80;
//
//        if (studentGrade2 > 50) {
//            System.out.println("You qualified");
//            if(studentGrade2 / 2 >= 45) {
//                System.out.println("You are a G");
//            } else {
//                System.out.println("You are not a G");
//            }
//        }

        // Conditional Operator
//        int studentGrade1 = 60;
//
//        System.out.println(studentGrade1 >= 50 ? "Passed" : "Failed");


        //Using logical Operators
        int studentGrade2 = 80;
//        if(studentGrade2 > 50 && studentGrade2 / 2 >=45) {
//            System.out.println("You are a G");
//        }else {
//            System.out.println("You are not a G");
//        }

        if(studentGrade2 > 50 || studentGrade2 / 2 >=45) {
            System.out.println("You are a G");
        }else {
            System.out.println("You are not a G");
        }

    }
}
