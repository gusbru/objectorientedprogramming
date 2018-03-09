
public class Horario {
  private int horas, minutos, segundos;

  public Horario(int horas, int minutos, int segundos) throws Exception {
    if (horas < 0 )
      throw new Exception("Horas must be in greater or equal than 0");

    if (minutos < 0 || minutos > 60) 
      throw new Exception("Minutos must be in between 0 and 60");

    if (segundos < 0 || segundos > 60)
      throw new Exception("Segundos must be in between 0 and 60");

    
    this.horas = horas;
    this.minutos = minutos;
    this.segundos = segundos;
  }

  public int getHoras() {
    return this.horas;
  }

  public int getMinutos() {
    return this.minutos;
  }

  public int getSegundos() {
    return this.segundos;
  }

  public void setHoras(int horas) throws Exception {
    if (horas < 0 )
      throw new Exception("Horas must be >= 0");

    this.horas = horas;
  }

  public void setMinutos(int minutos) throws Exception {
    if (minutos < 0 || minutos > 60)
      throw new Exception("Minutos must be in between 0 and 60");

    this.minutos = minutos;
  }

  public void setSegundos(int segundos) throws Exception {
    if (segundos < 0 || segundos > 60)
      throw new Exception("Segundos must be in between 0 and 60");
  }

  public Horario mais(Horario horario) throws Exception {
    if (horario == null)
      throw new Exception("Must provide a Horario");

    int h, m, s, min60, seg60;

    // segundos
    s = this.getSegundos() + horario.getSegundos();
    m = this.getMinutos() + horario.getMinutos();
    h = this.getHoras() + horario.getHoras();

    seg60 = s % 60;
    min60 = ((int)(s / 60) + m) % 60;
    h += (int)(m / 60);

    return new Horario(h, min60, seg60);
    
  }

  // public Horario menos(Horario horario) throws Exception {
  //   if (horario == null)
  //     throw new Exception("Must provide a Horario");

    
  // }

}