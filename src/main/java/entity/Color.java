package entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Color {

  @Id
  @GeneratedValue
  private Long codigo;

  private String descripcion;

  public Long getCodigo() {
    return codigo;
  }

  public String getDescripcion() {
    return descripcion;
  }
}
