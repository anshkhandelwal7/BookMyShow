package dev.ansh.BookMyShow.controller;

import dev.ansh.BookMyShow.dto.CityRequestDTO;
import dev.ansh.BookMyShow.model.City;
import dev.ansh.BookMyShow.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class CityController {

    @Autowired
    private CityService cityService;

    @PostMapping("/city")
    public ResponseEntity createCity(@RequestBody CityRequestDTO cityRequestDTO) {
        try{
            String cityName = cityRequestDTO.getName();
            if(cityName == null || cityName.isEmpty() || cityName.isBlank()) {
                throw new Exception("City Name is invalid");
            }
            City savedCity = cityService.saveCity(cityName);
            return ResponseEntity.ok(savedCity); // we would return cityResponseDTO
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

    @DeleteMapping("/city/{id}")
    public ResponseEntity deleteCity(@PathVariable("id") int cityId) {
        boolean deleted = cityService.deleteCity(cityId);
        return ResponseEntity.ok(deleted);
    }

    @GetMapping("city/{name}")
    public ResponseEntity getCityByName(@PathVariable("name") String cityName) {
        City city= cityService.getCityByName(cityName);
        return ResponseEntity.ok(city);

    }
}
