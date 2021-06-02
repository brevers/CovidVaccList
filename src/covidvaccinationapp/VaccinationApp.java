
package covidvaccinationapp;

/**
 * @08/03/2021
 * @author Tamara
 */
public class VaccinationApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //GUI Option
        
        //new VaccinationGUI().setVisible(true);
        
        
        //TEST Option
        
        PQVaccination pq = new PQVaccination();//Object
        
        Patients p1 = new Patients(01, "John", "Connelly", 45, true);//temp
        Patients p2 = new Patients(02, "Brian", "Sewn", 39, false);
        Patients p3 = new Patients(03, "Barry", "White", 22, false);
        
        pq.enqueue(p1);
        pq.enqueue(p2);
        pq.enqueue(p3);
        
        System.out.println("Queue Size: "+ pq.size()+"\n");
        System.out.println("Patients: "+"\n"+ pq.printPQueue());
        System.out.println("----------------------------------------------");
        pq.dequeue();
        System.out.println("Patients list 2: "+"\n"+ pq.printPQueue());
        
    }
    
}
