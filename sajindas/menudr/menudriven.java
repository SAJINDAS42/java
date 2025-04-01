import java.util.*;

public class menudriven {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print("Enter number of elements: ");
int n = scanner.nextInt();
scanner.nextLine();
String[] array = new String[n];
System.out.println("Enter elements:");
for (int i = 0; i < n; i++) {
array[i] = scanner.nextLine();
}
int choice;
do {
System.out.println("\nMenu:");
System.out.println("1. Search a string");
System.out.println("2. Sort array");
System.out.println("3. Exit");
System.out.print("Enter choice: ");
choice = scanner.nextInt();
scanner.nextLine();           
switch (choice) {
case 1:
System.out.print("Enter string to search: ");
String searchStr = scanner.nextLine();
System.out.println(Arrays.asList(array).contains(searchStr) ? searchStr + " found." : searchStr + " not found.");
break;               
case 2:
Arrays.sort(array);
System.out.println("Sorted Array: " + Arrays.toString(array));
break;               
case 3:
System.out.println("Exited...");
break;                
default:
System.out.println("Invalid choice! Try again.");
}
} while (choice != 3);      
scanner.close();}
}
