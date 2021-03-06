package usrt.technospace.controllers

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*
import usrt.technospace.exceptions.NotFoundException
import usrt.technospace.models.map.CountryPoint
//import usrt.technospace.repository.AddressRepository
//import usrt.technospace.repository.CityRepository
//import usrt.technospace.repository.CountryRepository
import usrt.technospace.repository.MapRepository

@RestController
class MapController {

    @Autowired
    lateinit var mapRepository: MapRepository<CountryPoint>

    @GetMapping("/points")
    fun getAllRootPoints() {

    }








//    @Autowired
//    lateinit var countryRepository: CountryRepository
//
//    @Autowired
//    lateinit var cityRepository: CityRepository
//
//    @Autowired
//    lateinit var addressesRepository: AddressRepository
//
//    @PostMapping("/countries")
//    fun addCountry(@RequestBody country: Country): Country {
//        return countryRepository.save(country)
//    }
//
//    @GetMapping("/countries")
//    fun getAllCountries(): List<Country> {
//        return countryRepository.findAll()
//    }
//
//    @GetMapping("/countries/{country}")
//    fun getCountry(country: Country): Country {
//        return country
//    }
//
//    @GetMapping("/countries/{countryId}/cities")
//    fun getCitiesInCountry(@PathVariable countryId: Long): List<City> {
//        return cityRepository.findCityByCountryId(countryId)
//    }
//
//    @DeleteMapping("/countries/{countryId}")
//    fun deleteCountry(@PathVariable countryId: Long) {
//        this.countryRepository.deleteById(countryId)
//    }
//
//
//    @GetMapping("/cities/main")
//    fun getMainCity(): City {
//        return cityRepository.findByIsMainTrue()
//    }
//
//    @PostMapping("/countries/{country}/cities")
//    fun addCityToCountry(country: Country, @RequestBody city: City): City {
//        city.country = country
//        return cityRepository.save(city)
//    }
//
//    @GetMapping("/cities")
//    fun getAllCities(): List<City> {
//        return cityRepository.findAll()
//    }
//
//    @GetMapping("/cities/{city}")
//    fun getCity(city: City): City {
//        return city
//    }
//
//    @GetMapping("/cities/{city}/addresses")
//    fun getAddressesInCity(city: City): List<Address> {
//        return city.addresses
//    }
//
//    @GetMapping("/cities/{city}/country")
//    fun getCountryOfCity(city: City): Country {
//        return city.country
//    }
//
//    @GetMapping("/cities/search")
//    @ResponseBody fun searchCity(@RequestParam name: String): City {
//        val cities = cityRepository.findByNameOrNameEn(name, name)
//        if (cities.size != 1) {
//            throw NotFoundException()
//        }
//        return cities[0]
//    }
//
//    @DeleteMapping("/cities/{cityId}")
//    fun deleteCity(@PathVariable cityId: Long) {
//        this.cityRepository.deleteById(cityId)
//    }
//
//
//    @PostMapping("/cities/{city}/addresses")
//    fun addAddressToCity(@PathVariable city: City, @RequestBody address: Address): Address? {
//        address.city = city
//        return addressesRepository.save(address)
//    }
//
//    @GetMapping("/addresses/{address}")
//    fun getAddress(address: Address): Address {
//        return address
//    }
//
//    @DeleteMapping("/addresses/{addressId}")
//    fun deleteAddress(@PathVariable addressId: Long) {
//        this.addressesRepository.deleteById(addressId)
//    }
}