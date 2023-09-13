/**
 *
 * @author roudet
 */
public class Citron {
    private double prix;
    private String origine;
	
    public Citron() 
    {
        this.prix = 0.5;  //prix en euros
        this.origine="Espagne";
    }
    
    public Citron(double prix, String origine) 
    {
	if(prix < 0)
	    this.prix = -prix;  //une solution possible pour interdire les prix negatifs
	else
	    this.prix = prix;

	if(origine.equals(""))
            this.origine = "Espagne";  //Espagne par défaut
	else
            this.origine = origine;   
    }

    public double getPrix(){
	return prix;
    }

    public void setPrix(double prix){
	this.prix=prix;
    }

    public String getOrigine(){
	return origine;
    }
 
    public void setOrigine(String origine){
	this.origine=origine;
    }

    @Override
    public String toString(){
        return "Citron de " + origine + " a " + prix + " euros";
    }

    @Override
    public boolean equals(Object o){  //predicat pour tester si 2 Citrons sont equivalentes
        if(o != null && getClass() == o.getClass()){
            Citron or = (Citron) o;
            return (prix == or.prix && origine.equals(or.origine));
        }
        return false;
    }

    public boolean isSeedless() {  //predicat indiquant qu'une Citron a des pepins
        return false;
    }


    public static void main (String[] args){
        //Ecrire ici vos tests
        Citron o1 = new Citron(100, "france");
	System.out.println("premier test Citron");
    o1.toString();

   }
}
