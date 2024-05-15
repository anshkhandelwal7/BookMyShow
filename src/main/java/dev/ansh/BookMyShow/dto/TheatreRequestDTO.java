package dev.ansh.BookMyShow.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TheatreRequestDTO {
    private String Name;
    private String Address;
    private int cityId;
}
