package iterator_design_pattern;

public class Main {

    public static void main(String[] args) {

        UserManagemant user = new UserManagemant();
        user.addUser(new User("Shivam","141"));
        user.addUser(new User("Dhruv","142"));
        user.addUser(new User("Yash","143"));
        user.addUser(new User("Nayan","144"));

        MyIterator it = user.getIterator();

        while(it.hasNext()){
            System.out.println((User)it.next());
        }

    }

}
