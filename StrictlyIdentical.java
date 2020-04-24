// Enter 5 elements of list1: 1 2 3 4 5
// Enter 5 elements of list2: 1 2 3 4 5 
// Two lists are strictly identical.


import java.util.Scanner;

public class StrictlyIdentical {
    public static boolean equals(int[] ray1, int[] ray2){
        for(int i = 0;i<ray1.length;i++){
            if(ray1[i]!=ray2[i]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
			
        	// created a variable named ray1 
			int ray1[] = new int[5];
			 
			// created a int variable named ray2
			int ray2[] = new int[5];

			System.out.print("Enter 5 elements of list1: ");  // prints this phrase out
			
			for(int i = 0;i<5;i++){
			    
				ray1[i] = scanner.nextInt(); // allows you to make an input which is variable ray1
			}

			System.out.print("Enter 5 elements of list2: "); // prints this phrase out 
			
			for(int i = 0;i<5;i++){
			    ray2[i] = scanner.nextInt(); // allows you to make an input which is variable ray1
			}

			if(equals(ray1,ray2)){ 
			    
				System.out.println("Two lists are strictly identical."); // if the list have the same #'s it will print this out
			}
			else{  // // if the list are not the same it will go to the else statement and print this out
			   
				System.out.println("Two lists are not strictly identical."); 
			
			}
		}
    
    
    }
}