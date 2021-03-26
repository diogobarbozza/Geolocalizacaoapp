package br.com.progiv.geolocalizacao;

public class Localizacao {

    //{"ip":"177.93.169.137","country_code":"BR","country_name":"","region_code":"MG","region_name":"","city":"","zip_code":"37900","time_zone":"America/Sao_Paulo","latitude":-20.7635,"longitude":-46.6205,"metro_code":0}
    private String country_code;
    private String country_name;

    public Localizacao(String code, String name){
        this.country_code = code;
        this.country_name = name;
    }

    public String getCountry_code(){ return this.country_code; }
    public String getCountry_name(){ return this.country_name; }
}
