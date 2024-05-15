
package Hospital_Service;
import java.util.List;
import java.util.Scanner;

import dao.HospitalServiceImpl;
import entity.appointment;
import exceptionn.exception.PatientNumberNotFoundException;

public class service_datahospital {
	Scanner sc;
	HospitalServiceImpl hdao;
	
	public service_datahospital()
	{
		sc= new Scanner(System.in);
		hdao= new HospitalServiceImpl();
	}
	
	
	 public void getAppointmentById()
	 {
		 System.out.println("enter appointment id");
		 int appointmentID = sc.nextInt();
		 hdao.getById(appointmentID);
		
	 }	
	 
	 public void getAppointmentForPatient() throws PatientNumberNotFoundException {
		 int patientID;
		 System.out.println("enter patient id");
		 patientID=sc.nextInt();
		 List<appointment> appointments =  hdao.getForPatient(patientID);
		 
		 for(appointment appointment : appointments) {
			 System.out.println(appointment.toString());
		 }
		 
	 }
	 
	 public void getAppointmentForDoctor() {
		 int DoctorID;
		 System.out.println("enter doctor id");
		 DoctorID=sc.nextInt();
		 List<appointment> appointments =  hdao.getForDoctor(DoctorID);
		 for(appointment appointment:appointments) {
			 System.out.println(appointment.toString());
		 }
	 }
	 
	 public void scheduleAppointment() {
		 appointment a = new appointment();
			
		 System.out.println("enter appointment id");
		 a.setAppointmentID(sc.nextInt());
		 System.out.println("enter patient id");
		 a.setPatientID(sc.nextInt());
		 System.out.println("enter doctor id");
		 a.setDoctorID(sc.nextInt());
		 sc.nextLine();
		 System.out.println("enter appointment date");
		 a.setAppointmentDate(sc.nextLine());
		 sc.nextLine();
		 System.out.println("enter desciption");
		 a.setDescription(sc.nextLine());
		 hdao.add(a);
	 }
	 
	 public void updateAppointment() {
		 String appointmentDate;
		 int appointmentID;
		 System.out.println("enter apppointment date");
		 appointmentDate=sc.nextLine();
		 sc.nextLine();
		 System.out.println("enter appointment id ");
		 appointmentID=sc.nextInt();
		 hdao.update(appointmentDate, appointmentID);
		 
	 }
	 
	 public void cancelAppointment() {
		 int appointmentID;
		 System.out.println("enter appointment id");
		 appointmentID=sc.nextInt();
		 hdao.remove(appointmentID);
	 }
}
