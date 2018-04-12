import java.util.Scanner;
public class a5{

	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		String studentName;
		int[] grades;
		Scanner input = new Scanner(System.in);
		int studentgrade;
		int go = 1;
		int choice = 0;
		String name;
		String [] student_list;
		

		System.out.println("Welcome to Grade Viewer");
		System.out.println("Enter number of students: ");
		int num_of_students = input.nextInt();
		System.out.println("Enter Names and Scores of Students.");


		for (int i=0; i < num_of_students; i++){
		System.out.println("Enter Name for Student #" + (i+1) + ":");
    		studentName = input.next();

    	System.out.println("Enter Score:");
        	studentgrade = input.nextInt();

    }

    System.out.println("- Press 1 to display grade report\n- Press 2 to fetch individual grade\n- Press 0 to quit");
    choice = input.nextInt();

    int [] array = new int[5];

	int num_of_a = 0;
	int num_of_b = 0;
	int num_of_c = 0;
	int num_of_f = 0;
	for (int i = 0; i<array.length; i++){
		int grade = array[i];
		if (grade >=90){
			num_of_a++;
		} else if (grade >= 80){
			num_of_b++;
		} else if (grade >= 70){
			num_of_c++;
		} else if (grade >= 60){
			num_of_f++;
		}
	}
    
    	while (go == 1){
    	choice = input.nextInt();

    	if (choice == 1){

    	 System.out.println("Grade Report: ");
         System.out.println("Class Average: " + mean(values));
         System.out.println("Distribution Histogram: " + array.length);

	 }
   		if (choice == 2){
     	fetch_score(name, student_list, grades);
     }

  		if (choice == 0){

  		}
  	}
}

	public static void set_scores(String[] student_list, int[] grades){
	int num_of_a = 0;
	int num_of_b = 0;
	int num_of_c = 0;
	int num_of_f = 0;

	int [] array = new int[5];

	for (int i = 0; i<array.length; i++){
		int grade = array[i];
		if (grade >=90){
			num_of_a++;
		} else if (grade >= 80){
			num_of_b++;
		} else if (grade >= 70){
			num_of_c++;
		} else if (grade >= 60){
			num_of_f++;
		}
	}
	
		System.out.print("F: ");
		for (int i = 0; i<num_of_f; i++){
			System.out.print("*");
		}
		System.out.println();
		System.out.print("C: ");
		for (int i = 0; i<num_of_c; i++){
			System.out.print("*");
        }
        System.out.println();
        System.out.print("B: ");
		for (int i = 0; i<num_of_b; i++){
			System.out.print("*");
		}
		System.out.println();
		System.out.println();
        System.out.print("A: ");
		for (int i = 0; i<num_of_a; i++){
			System.out.print("*");
		}
        
       	System.out.println();

     }   
  

	public static int mean(int[] values){ 
	int [] values = new int[5];
	double sum=0;
	int count=0;
    double average=0;
       for(int i=0; i<values.length; i++){
       		values[i] = input.nextLine();
               sum = sum + values[i];
               count++;
           average=sum/values.length;
        
        System.out.print(average);
    }
   		return average;
}
	

	public static void print_histogram(int[] grades){

	int num_of_a = 0;
	int num_of_b = 0;
	int num_of_c = 0;
	int num_of_f = 0;

		System.out.print("F: ");
		for (int i = 0; i<num_of_f; i++){
			System.out.print("*");
		}
		System.out.println();
		System.out.print("C: ");
		for (int i = 0; i<num_of_c; i++){
			System.out.print("*");
        }
        System.out.println();
        System.out.print("B: ");
		for (int i = 0; i<num_of_b; i++){
			System.out.print("*");
		}
		System.out.println();
		System.out.println();
        System.out.print("A: ");
		for (int i = 0; i<num_of_a; i++){
			System.out.print("*");
		}
        
       	System.out.println();

     }   
	

	public static int fetch_score(String name, String[] student_list, int[] grades){
		for (int i = 0; i < student_list.length ; i++) {
			if(student_list[i].toLowerCase().contains(name.toLowerCase())){
				return grades[i];
			}
		}
		return -1;
	}
}
