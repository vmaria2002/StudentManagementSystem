package model;

abstract class Persoana {
 private String nume;
 private String parola;


 public Persoana(String nume, String parola) {
  this.nume = nume;
  this.parola=parola;
 }
 public Persoana(){

 }

 public Persoana(String nume){
  this.nume=nume;
 }

 public String getNume() {
  return nume;
 }

 public void setNume(String nume) {
  this.nume = nume;
 }

 public String getParola() {
  return parola;
 }

 public void setParola(String parola) {
  this.parola = parola;
 }

 @Override
 public String toString() {
  return "Persoana{" +
          "nume='" + nume + '\'' +
          ", parola='" + parola + '\'' +
          '}';
 }
}
