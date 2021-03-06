package models;

import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
public class PeopleModel {

	@JsonProperty("films")
	private List<String> films;

	@JsonProperty("homeworld")
	private String homeworld;

	@JsonProperty("gender")
	private String gender;

	@JsonProperty("skin_color")
	private String skinColor;

	@JsonProperty("edited")
	private String edited;

	@JsonProperty("created")
	private String created;

	@JsonProperty("mass")
	private String mass;

	@JsonProperty("vehicles")
	private List<String> vehicles;

	@JsonProperty("url")
	private String url;

	@JsonProperty("hair_color")
	private String hairColor;

	@JsonProperty("birth_year")
	private String birthYear;

	@JsonProperty("eye_color")
	private String eyeColor;

	@JsonProperty("species")
	private List<String> species;

	@JsonProperty("starships")
	private List<String> starships;

	@JsonProperty("name")
	private String name;

	@JsonProperty("height")
	private String height;

	public PeopleModel() {
	}

	public PeopleModel(List<String> films, String homeworld, String gender, String skinColor, String edited, String created, String mass, List<String> vehicles, String url, String hairColor, String birthYear, String eyeColor, List<String> species, List<String> starships, String name, String height) {
		this.films = films;
		this.homeworld = homeworld;
		this.gender = gender;
		this.skinColor = skinColor;
		this.edited = edited;
		this.created = created;
		this.mass = mass;
		this.vehicles = vehicles;
		this.url = url;
		this.hairColor = hairColor;
		this.birthYear = birthYear;
		this.eyeColor = eyeColor;
		this.species = species;
		this.starships = starships;
		this.name = name;
		this.height = height;
	}

	public void setFilms(List<String> films){
		this.films = films;
	}

	public List<String> getFilms(){
		return films;
	}

	public void setHomeworld(String homeworld){
		this.homeworld = homeworld;
	}

	public String getHomeworld(){
		return homeworld;
	}

	public void setGender(String gender){
		this.gender = gender;
	}

	public String getGender(){
		return gender;
	}

	public void setSkinColor(String skinColor){
		this.skinColor = skinColor;
	}

	public String getSkinColor(){
		return skinColor;
	}

	public void setEdited(String edited){
		this.edited = edited;
	}

	public String getEdited(){
		return edited;
	}

	public void setCreated(String created){
		this.created = created;
	}

	public String getCreated(){
		return created;
	}

	public void setMass(String mass){
		this.mass = mass;
	}

	public String getMass(){
		return mass;
	}

	public void setVehicles(List<String> vehicles){
		this.vehicles = vehicles;
	}

	public List<String> getVehicles(){
		return vehicles;
	}

	public void setUrl(String url){
		this.url = url;
	}

	public String getUrl(){
		return url;
	}

	public void setHairColor(String hairColor){
		this.hairColor = hairColor;
	}

	public String getHairColor(){
		return hairColor;
	}

	public void setBirthYear(String birthYear){
		this.birthYear = birthYear;
	}

	public String getBirthYear(){
		return birthYear;
	}

	public void setEyeColor(String eyeColor){
		this.eyeColor = eyeColor;
	}

	public String getEyeColor(){
		return eyeColor;
	}

	public void setSpecies(List<String> species){
		this.species = species;
	}

	public List<String> getSpecies(){
		return species;
	}

	public void setStarships(List<String> starships){
		this.starships = starships;
	}

	public List<String> getStarships(){
		return starships;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setHeight(String height){
		this.height = height;
	}

	public String getHeight(){
		return height;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		PeopleModel that = (PeopleModel) o;
		return Objects.equals(films, that.films) &&
				Objects.equals(homeworld, that.homeworld) &&
				Objects.equals(gender, that.gender) &&
				Objects.equals(skinColor, that.skinColor) &&
				Objects.equals(edited, that.edited) &&
				Objects.equals(created, that.created) &&
				Objects.equals(mass, that.mass) &&
				Objects.equals(vehicles, that.vehicles) &&
				Objects.equals(url, that.url) &&
				Objects.equals(hairColor, that.hairColor) &&
				Objects.equals(birthYear, that.birthYear) &&
				Objects.equals(eyeColor, that.eyeColor) &&
				Objects.equals(species, that.species) &&
				Objects.equals(starships, that.starships) &&
				Objects.equals(name, that.name) &&
				Objects.equals(height, that.height);
	}

	@Override
	public int hashCode() {
		return Objects.hash(films, homeworld, gender, skinColor, edited, created, mass, vehicles, url, hairColor, birthYear, eyeColor, species, starships, name, height);
	}

	@Override
 	public String toString(){
		return 
			"PeopleModel{" + 
			"films = '" + films + '\'' + 
			",homeworld = '" + homeworld + '\'' + 
			",gender = '" + gender + '\'' + 
			",skin_color = '" + skinColor + '\'' + 
			",edited = '" + edited + '\'' + 
			",created = '" + created + '\'' + 
			",mass = '" + mass + '\'' + 
			",vehicles = '" + vehicles + '\'' + 
			",url = '" + url + '\'' + 
			",hair_color = '" + hairColor + '\'' + 
			",birth_year = '" + birthYear + '\'' + 
			",eye_color = '" + eyeColor + '\'' + 
			",species = '" + species + '\'' + 
			",starships = '" + starships + '\'' + 
			",name = '" + name + '\'' + 
			",height = '" + height + '\'' + 
			"}";
		}
}