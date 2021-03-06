package cz.tul.beran.weather.entity.mysql;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "city")
public class City {

  @Id
  @Column(name = "city_id")
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  @Column(name = "name", nullable = false, unique = true)
  @NotBlank
  private String name;

  @ManyToOne(cascade = CascadeType.ALL)
  @JoinColumn(name = "country_id")
  @NotNull
  private Country country;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Country getCountry() {
    return country;
  }

  public void setCountry(Country country) {
    this.country = country;
  }
}
