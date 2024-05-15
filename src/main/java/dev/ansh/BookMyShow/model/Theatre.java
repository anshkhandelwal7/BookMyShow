package dev.ansh.BookMyShow.model;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class Theatre extends BaseModel{
    private String name;
    private String address;

    @OneToMany
    private List<Auditorium> Auditoriums;

    public Theatre(String address, String name) {
        this.address = address;
        this.name = name;
    }
}
