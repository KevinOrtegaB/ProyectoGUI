

public class Propiedad
{
    private String nombre,propietario;
    private Double area;
    private Integer habitantes;
    public Propiedad(String nombre,String propietario,Double area,Integer habitantes)
    {
        this.nombre=nombre;
        this.propietario=propietario;
        this.area=area;
        this.habitantes=habitantes;
    }
    public String getNombre(){
     return nombre;
    }
    public String getPropietario(){
     return propietario;
    }
    public Double getArea(){
     return area;
    }
    public Integer gethabitantes(){
     return habitantes;
    }
    public void setNombre(String nombre){
     this.nombre=nombre;
    }
    public void setPropietario(String propietario){
     this.propietario=propietario;
    }
    public void setArea(Double area){
     this.area=area;
    }
    public void setHabitantes(Integer habitantes){
     this.habitantes=habitantes;
    }
}
