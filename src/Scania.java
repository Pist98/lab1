import java.awt.*;

public class Scania extends Car{


    /* Uppgift 1: Extensibilitet
Skapa en representation av en Scania-lastbil med modellnamn Scania. Ge den rimliga startvärden för relevanta fält.
Lägg den i filen Scania.java i samma mapp.
Scania ska införlivas i er arvs-hierarki från tidigare, men ha ytterligare funktionalitet: den har ett flak som kan höjas
(tippas) och sänkas. Införliva detta i er design så att vi kan hålla reda på vilken vinkel flaket har för närvarande,
samt funktioner för att höja och sänka det.
Följande förhållanden ska gälla:

Vinkeln på flaket kan inte vara lägre än 0 eller högre än 70.
Det är bara om lastbilen står stilla som flaket får ha en annan vinkel än 0. Flaket ska inte kunna höjas om
lastbilen är i rörelse; och lastbilen ska inte kunna köra om flaket är uppfällt.
Lägg allt i Scania.java. Gör minst ett JUnit-test i er testklass. */


    double vinkel;
    boolean flak= true;

    public Scania(){
        nrDoors = 2;
        color = Color.white;
        enginePower = 530;
        modelName = "Scania";
        vinkel = 0;
        stopEngine();
    }



public void höj_flak() {
        if (flak){ vinkel+=5;
            if (vinkel>70) {vinkel=70;}}
    }

  public void sänk_flak() {
        if (flak) {
      vinkel-=5;
      if (vinkel<0) {vinkel=0;}}
    }

    @Override // Den gör ingenting egentligen ty bilen är ej beroande av engine/motorn
    protected void startEngine() {
        if (vinkel>0) {stopEngine();}
        else {currentSpeed = 0.1;}
    }


}
