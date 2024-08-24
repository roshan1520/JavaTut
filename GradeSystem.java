public class GradeSystem {
    public static void main(String[] args) {
        System.out.println("----------------------------------------");
        System.out.println("            Grading System              ");
        System.out.println("----------------------------------------");

        float marks = 81f;
        System.out.println("Marks: "+ marks);

        // if(a>89 && a<=100){
        //     System.out.println("Grade : A");
        // } 
        // if(a>79 && a<=89){
        //     System.out.println("Grade: B");
        // } else {
        //     System.out.println("Fail");
        // }
        if (marks>=90)
            System.out.println("Garde:A");
        else if (marks>=80)
            System.out.println("Grade:B");
        else 
            System.out.println("Fail");
    }
    
}
