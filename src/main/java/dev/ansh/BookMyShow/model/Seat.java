package dev.ansh.BookMyShow.model;

import dev.ansh.BookMyShow.constant.SeatStatus;
import dev.ansh.BookMyShow.constant.SeatType;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Seat extends BaseModel{
    private String seatNumber;
    @Enumerated(EnumType.STRING)
    private SeatType seatType;
    @Enumerated(EnumType.STRING)
    private SeatStatus seatStatus;
    private int row;
    private int col;

    public Seat(int row, int col, String seatNumber, SeatType seatType, SeatStatus status) {
        this.seatNumber = seatNumber;
        this.seatType = seatType;
        this.seatStatus = seatStatus;
        this.row = row;
        this.col = col;
    }
}
