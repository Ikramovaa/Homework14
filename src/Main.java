public class Main {
    public static void main(String[] args) {

        Literature literature=new Literature("Toolor kulaganda");
        literature.setAuthorOfBook("Chyngyz Aitmatov");
        literature.setPages(400);

        System.out.println(literature.nameOfBook);
        System.out.println(literature.getAuthorOfBook());
        System.out.println(literature.getPages());

        literature.read();
        literature.collect();
        literature.writing();
        System.out.println(literature.toString());


    }
}