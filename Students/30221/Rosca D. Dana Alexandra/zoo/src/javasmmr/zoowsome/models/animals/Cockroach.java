package javasmmr.zoowsome.models.animals;

public class Cockroach extends Insect{
	public Cockroach(){
		 setNrLegs(6);
		 setName("Cockroach");
		 setCanFly(Boolean.FALSE);
		 setIsDangerous(Boolean.FALSE);
		}
	
	public Cockroach(Integer nrOfLegs, String name, Boolean canFly, Boolean isDangerous){
		 setNrLegs(nrOfLegs);
		 setName(name);
		 setCanFly(canFly);
		 setIsDangerous(isDangerous);
		 }

}
