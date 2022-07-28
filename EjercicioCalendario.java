
package github_projects;
import java.time.DayOfWeek;
import java.time.LocalDate;


/**
 *
 * @author Jhampier
 */
public class EjercicioCalendario {
    public static void main(String[] args) {
        
        LocalDate fechaEntrada = LocalDate.now();
        System.out.println("");
        System.out.println("         AÑO: "+fechaEntrada.getYear());
        System.out.println("===========================");

        
        for (int m = 1; m < 13; m++) {
            //Captura el dia y mes a iterar
            LocalDate fecha = LocalDate.of(fechaEntrada.getYear(), m, fechaEntrada.getDayOfMonth());
            
            int mesActual = fecha.getMonthValue();
            int diaHoy = fecha.getDayOfMonth();
            
            System.out.println("\nMes: "  + "      " + fecha.getMonth().name());
            //resta n dias a la fecha actual
            //f = 1 inicio del mes
            fecha = fecha.minusDays(diaHoy - 1);
            DayOfWeek weekday = fecha.getDayOfWeek();
            int valor = weekday.getValue(); // 1 = Lunes, . . . , 7 = Domingo

            System.out.println("Lun Mar Mié Jue Vie Sáb Dom");
            for (int i = 1; i < valor; i++) {
                System.out.print("    ");
            }
            //no sabe si tendrá 31,30,29 o 28 días
            //itera mientras la fecha siga en el mes actual 
            while (fecha.getMonthValue() == mesActual) {
                System.out.printf("%3d", fecha.getDayOfMonth());

                if (fecha.getDayOfMonth() == diaHoy && fecha.getMonth()==fechaEntrada.getMonth()) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
                //suma un día a la fecha
                fecha = fecha.plusDays(1);
                if (fecha.getDayOfWeek().getValue() == 1) {
                    System.out.println();
                }
            }
            if (fecha.getDayOfWeek().getValue() != 1) {
                System.out.println();
            }

            }
    }
}