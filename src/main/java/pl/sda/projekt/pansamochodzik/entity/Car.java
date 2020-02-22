package pl.sda.projekt.pansamochodzik.entity;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "cars")
public class Car {
    @Id
    @GeneratedValue //nie trzeba dodawać id wprost, hibernate wygeneruje sam wartość
    @Column
    private int id;
    @Column(name = "marka")
    private String marka;
    @Column(name = "model")
    private String model;
    @Column(name = "Typnadwozia")
    private String carType;
    @Column(name = "year")
    private Double year;
    @Column(name = "color")
    private String kolor;
    @Column(name = "price")
    private BigDecimal price;
    @Column(name = "booked")
    private Boolean isBooked;
    @OneToOne
    private User user;


    public Car() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    public Double getRocznik() {
        return year;
    }

    public void setRocznik(Double rocznik) {
        this.year = rocznik;
    }

    public String getKolor() {
        return kolor;
    }

    public void setKolor(String kolor) {
        this.kolor = kolor;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal cena) {
        this.price = cena;
    }

    public Boolean getBooked() {
        return isBooked;
    }

    public void setBooked(Boolean booked) {
        isBooked = booked;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
