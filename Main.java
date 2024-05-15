
package Main;
import java.util.*;
import util.DBConnUtil;
import Hospital_Service.service_datahospital;
import exceptionn.exception.*;

public class Main {
	public static void main(String [] args) throws PatientNumberNotFoundException {
		service_datahospital hser=new service_datahospital();
		Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("1. schedule Appointment");
            System.out.println("2. Update appointment");
            System.out.println("3. cancel appointment");
            System.out.println("4. get appointment by id");
            System.out.println("5. get appointment for patient");
            System.out.println("6. get appointment for doctor");
            System.out.println("7. Exit");
            System.out.println("Enter your choice");

            int ch = sc.nextInt();
            if(ch==1) {
            	hser.scheduleAppointment();
            }
            else if(ch==2) {
            	hser.updateAppointment();
            }
            else if(ch==3) {
            	hser.cancelAppointment();
            }
            else if(ch==4) {
            	hser.getAppointmentById();
            }
            else if(ch==5) {
            
				try {
					hser.getAppointmentForPatient();
				} 
				catch (PatientNumberNotFoundException e) {
					System.out.println(e.getMessage());
				}
            }
            else if(ch==6) {
            	hser.getAppointmentForDoctor();
            }
            else {
            	break;
            }
        }

		sc.close();
	}
}
