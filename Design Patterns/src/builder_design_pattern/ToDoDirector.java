package builder_design_pattern;

public class ToDoDirector{

    ToDo todo[] = new ToDo[100];

    ToDoDirector(){
        todo[0] = new ToDoBuilder().withId(1).title("Login Sprint")
                .discription("Login,Logout,Forgot Password,and Reset Password")
                .status("started").completed(false).build();

        todo[1] = new ToDoBuilder().withId(2).build();
    }

    public void print(){
        for(int i=0;i<2;i++){
            System.out.println(todo[i]);
        }
    }

}
