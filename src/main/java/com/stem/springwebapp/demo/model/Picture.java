package com.stem.springwebapp.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

/*
 *
 * TABLE:  For storing all the mood information
----------
 
CREATE TABLE public."mood_distribution" (
   pictureid   integer,
   latitude   double precision,
   longitude   double precision,
   userid   text,
   locationtype   text,
   mood   text
)


FREQUENCY: Per user
--------------------
select md.userid, md.mood, count(mood) as moodcount from mood_distribution md group by mood, userid having userid='1'
  
 
FREQUENCY: All users
--------------------
select  md.mood, count(mood) as moodcount from mood_distribution md group by mood


 */

@Entity
public class Picture implements Serializable {

	private static final long serialVersionUID = 1500516986755256732L;

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @NotNull
    private Mood mood;
    
    private String user_id;
    
    private Double latitude;
    
    private Double longitude;
    
    private String location_type;
    

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Mood getMood() {
        return mood;
    }

    public void setMood(Mood mood) {
        this.mood = mood;
    }

    public String getUserId() {
        return user_id;
    }
    
    public void setUserId(String user_id){
    		this.user_id = user_id;
    }
    
    public Double getLatutude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    } 
    
    public String getLocationType() {
        return location_type;
    }
    
    public void setLocationType(String location_type){
    		this.location_type = location_type;
    }
    
}
