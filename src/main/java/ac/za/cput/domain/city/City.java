package ac.za.cput.domain.city;

import ac.za.cput.domain.country.Country;
import com.sun.istack.NotNull;
import javax.persistence.Embeddable;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
/*
 * Student Name: Damian du Toit
 * Student Number: 219200203
 * City.java
 * Date : 13th June 2022
 */
@Entity
@Embeddable
public class City implements Serializable {
    @NotNull
    @Id
    public String id;
    @NotNull
    public String cityName;
    @Embedded
    @NotNull
    public Country country;

    protected City(){}

    private City(Builder builder) {
        this.id = builder.id;
        this.cityName = builder.cityName;
        this.country = builder.country;
    }

    public String getId() {
        return id;
    }

    public String getCityName() {
        return cityName;
    }

    public Country getCountry() {
        return country;
    }

    @Override
    public String toString() {
        return "City{" +
                "id='" + id + '\'' +
                ", cityName='" + cityName + '\'' +
                ", country=" + country +
                '}';
    }

    public static class Builder {
        public String id;
        public String cityName;
        public Country country;

        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setName(String cityName) {
            this.cityName = cityName;
            return this;
        }

        public Builder setCountry(Country country) {
            this.country = country;
            return this;
        }

        public Builder copy(City city) {
            this.id = city.id;
            this.cityName = city.cityName;
            this.country = city.country;
            return this;
        }

        public City build() {
            return new City(this);
        }
    }
}
