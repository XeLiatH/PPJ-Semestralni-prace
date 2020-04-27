package cz.tul.beran.weather.entity;

import javax.persistence.*;

@Entity
@Table(name = "city")
public class City {

  @Id
  @Column(name = "city_id")
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;

  @Column(name = "name", nullable = false, unique = true)
  private String name;

  @ManyToOne(cascade = CascadeType.ALL)
  @JoinColumn(name = "country_id")
  private Country country;

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public void setId(int id) {
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