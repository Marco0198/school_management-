package ac.za.cput.domain.country;

/*
 * Student Name : Devon Sherwyn May
 * Student Number : 219168296
 * Date : 18th June 2022
 * Country.java
 * */

import com.sun.istack.NotNull;

import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@Embeddable
@Entity
public class Country implements Serializable
{
    @NotNull
    @Id
    private String id;
    @NotNull private String name;
    protected Country(){}

    private Country(Builder builder)
    {
        this.id = builder.id;
        this.name = builder.name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Country{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public static class Builder
    {
        private String id,name;

        public Builder id(String id)
        {
            this.id=id;
            return this;
        }

        public Builder name(String name)
        {
            this.name=name;
            return this;
        }

        public Builder copy(Country country)
        {
            this.id= country.id;
            this.name= country.name;
            return this;
        }
        public Country build()
        {
            return new Country(this);
        }
    }
}
