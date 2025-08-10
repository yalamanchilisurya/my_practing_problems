package projects;

import java.util.*;


class UserList {

    ArrayList<String> list = new ArrayList<>();

    public void addingData(String name) {
        list.add(name);
    }

    public void display() {
        if (list.isEmpty()) {
            System.out.println("List is Empty..");
        } else {
            for (int i = 0; i < list.size(); i++) {
                System.out.println("----------------------------------------1");
                System.out.println((i + 1)+ " "+list.get(i));
                System.out.println("-----------------------------------------");
            }
        }
    }

    public static class ToDoList {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            UserList ls = new UserList();
            while (true) {

                System.out.println("1. Add Data into List.");
                System.out.println("2. view Data into List.");
                System.out.println("3. Exist .");
                int choice = input.nextInt();
                input.nextLine();
                switch (choice) {
                    case 1:
                        System.out.print("Enter the list what do you want:");
                        String data = input.nextLine();
                        ls.addingData(data);
                        break;

                    case 2:
                        ls.display();
                        break;
                    case 3:
                        System.out.println("Existing ....");
                        return;
                }

            }

        }
    }
}
