import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        Solicitud solicitud=new Solicitud("Fernanda Montaño",1326258,25, Calendar.getInstance().getTime());
        System.out.println(solicitud);
        Bien bien=new Bien(5254,"moto",5,44,5000,25000);
        System.out.println(bien);
        
    }
}
