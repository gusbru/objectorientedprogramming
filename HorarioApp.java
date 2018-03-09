
public class HorarioApp {
  
  public static void main(String[] args) throws Exception {
    try {
      Horario h1 = new Horario(2, 40, 20);
      Horario h2 = new Horario(3, 50, 40);

      Horario h3 = h1.mais(h2);
      
      System.out.println(h3.getHoras());

    } catch (Exception error) {
      System.err.println(error);
    }
    
  }

}