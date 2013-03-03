package models;


import play.db.ebean.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Store extends Model {
    @Id
    public Long id;
    public String name;
    public String city;

    public static Finder<Long, Store> find = new Finder<Long, Store>(Long.class, Store.class);
}
