package javaSE;

import java.util.Arrays;

// Inner POJO
public class Country {
    // Field
    private String countryName;

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    // Inner Class
    public static class City {
        private String cityName;

        public String getCityName() {
            return cityName;
        }

        public void setCityName(String cityName) {
            this.cityName = cityName;
        }
    }

    public static void main(String[] args) {
        Country country = new Country();
        country.setCountryName("Turkey");

        City city = new City();
        city.setCityName("Istanbul");

        System.out.println(country.getCountryName() + " " + city.getCityName());
    }
}

