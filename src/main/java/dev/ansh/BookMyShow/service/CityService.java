package dev.ansh.BookMyShow.service;

import dev.ansh.BookMyShow.model.City;
import dev.ansh.BookMyShow.repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CityService {

    @Autowired
    CityRepository cityRepository;

    public City saveCity(String cityName) {
        City city = new City();
        city.setName(cityName);
        return cityRepository.save(city);
    }
    public boolean deleteCity(int cityId) {
        cityRepository.deleteById(cityId);
        return true;
    }

    public City getCityByName(String cityName) {
        City city = cityRepository.findCityByName(cityName);
        return city;
    }

    public City getCityById(int cityId) {
        return cityRepository.findById(cityId).get();
    }

    public City saveCity(City city) {
        return cityRepository.save(city);
    }
}
