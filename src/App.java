public class App {
    public static void main(String[] args) {
        System.out.println("Hello NTOU");

        GradeConverter converter = new GradeConverter();

        for (int i=-1; i <= 100;i++){
            System.out.println(i+":"+converter.convert(i));
        }
    }
}
