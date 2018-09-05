public class ClassNameTest {

    private static String[] classname = new String[]{"C0618G1","K0818G1","C071G1","C0618GA","C0618G"};

    public static void main(String[] args) {
        ClassName className = new ClassName();
        for (String classname : classname) {
            boolean check = className.getName(classname);
            System.out.println("Class name " + classname + " la ten lop " + check);
        }
    }
}
