package pl.sda.projekt.pansamochodzik.entity;

import org.aspectj.asm.IModelFilter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "carlistintellij")
public class Car {
    @Id
    @Column
    private int id;
    @Column(name = "Marka")
    private String marka;
    @Column(name = "Model")
    private String model;
    @Column(name = "Rocznik")
    private double rocznik;
    @Column(name = "Cena")
    private int cena;

    public Car() {
        this.id = id;
        this.marka = marka;
        this.model = model;
        this.rocznik = rocznik;
        this.cena = cena;
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

    public double getRocznik() {
        return rocznik;
    }

    public void setRocznik(double rocznik) {
        this.rocznik = rocznik;
    }

    public int getCena() {
        return cena;
    }

    public void setCena(int cena) {
        this.cena = cena;
    }
}