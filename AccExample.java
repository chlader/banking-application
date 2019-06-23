import java.util.*;

public class AccExample {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // creating n number of bank members, organized by an array
        System.out.print("How many members: ");
        int n = input.nextInt();
        Account M[] = new Account[n];
        for (int i=0; i < M.length; i++){
            M[i] = new Account();
            M[i].openAccount();
        }

        int choice;
        do{
            System.out.println("Main Menu");
			System.out.println("1. Display All");
			System.out.println("2. Search By Account");
			System.out.println("3. Deposit");
			System.out.println("4. Withdrawal");
			System.out.println("5. Exit");

            System.out.println("Please enter an option: ");
            choice = input.nextInt();
            switch(choice){
                // traverses the list and prints out all accounts
                case 1:
                    for (int i=0; i < M.length; i++){
                        M[i].showAccount();
                    }
                    case 2:

					System.out.print("Enter account number: ");
					String acn = input.next();
                    boolean found=false;
                    
					for(int i = 0; i < M.length ; i++){  
						found = M[i].search(acn);
						if(found){
							break;
						}
					}
					if(!found) {
						System.out.println("Account does not exist");
					}
					break;
                 
                case 3:
                    System.out.print("Enter account number: ");
                    acn = input.next();
                    found = false;
                    
                    for (int i = 0; i < M.length; i++) {
                        found = M[i].search(acn);
                        if (found){
                            M[i].deposit();
                            break;
                        }
                    }
                    if (!found){
                        System.out.println("Search failed");
                    }
                    break;

                case 4:
                    System.out.print("Enter account number: ");
                    acn = input.next();
                    found = false;
                    for (int i = 0; i < M.length; i++) {
                        found = M[i].search(acn);
                        if (found){
                            M[i].withdraw();
                            break;
                        }
                    }
                    if (!found){
                        System.out.println("Search failed");
                    }
                    break;
                case 5:
                    System.out.println("Good bye!");
                    break;
                
                }
            
            
            }
            while (choice != 5);
            input.close();
        }
    }