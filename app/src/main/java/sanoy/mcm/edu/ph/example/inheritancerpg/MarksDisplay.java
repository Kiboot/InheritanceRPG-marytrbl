package sanoy.mcm.edu.ph.example.inheritancerpg;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MarksDisplay extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_herodisplay);

        String hroclassstrng = getIntent().getStringExtra("Marksman");
        String marksstring = getIntent().getStringExtra("Ranger");
        String marksstring2 = getIntent().getStringExtra("Archer");
        String heroLvl = getIntent().getStringExtra("level");

        TextView callName = findViewById(R.id.heroName);
        TextView callClass = findViewById(R.id.heroClass);
        TextView callID = findViewById(R.id.heroID);
        TextView callLevel = findViewById(R.id.heroLvlnum);
        callLevel.setText(heroLvl);

        final TextView callHP1 = findViewById(R.id.currhp);
        final TextView callHP2 = findViewById(R.id.totalhp);
        final TextView callMP1 = findViewById(R.id.currmp);
        final TextView callMP2 = findViewById(R.id.totalmp);

        final TextView callStr = findViewById(R.id.strength);
        final TextView callAgi = findViewById(R.id.agility);
        final TextView callInt = findViewById(R.id.intelligence);

        final TextView callPhysicalAtk = findViewById(R.id.physAtk);
        final TextView callMagicAtk = findViewById(R.id.mgAtk);
        final TextView callPhysicalDef = findViewById(R.id.physDef);
        final TextView callMagicDef = findViewById(R.id.mgDef);

        final Hero ranger = new Hero("Marksman (Ranger)", "Myrcelle", 20200000, 1);
        final Hero archer = new Hero("Marksman (Archer)", "Myrcelle", 20200000, 1);


       if(marksstring.equals("Archer")) {
            callClass.setText(archer.getHeroClass());
            callName.setText(archer.getHeroName());
            callID.setText(String.valueOf(archer.getHeroID()));

            int i = Integer.parseInt(String.valueOf(callLevel.getText()));
            archer.setHeroLevel(i);
            callLevel.setText(String.valueOf(archer.getHeroLevel()));

            archer.heroStat(20, 34, 14);
            callStr.setText(String.valueOf((Math.round(archer.computeStrength()))));
            callAgi.setText(String.valueOf(Math.round(archer.computeAgility())));
            callInt.setText(String.valueOf(Math.round(archer.computeIntelligence())));

            callHP1.setText(String.valueOf(Math.round(archer.computeHP())));
            callHP2.setText(String.valueOf(Math.round(archer.computeHP())));
            callMP1.setText(String.valueOf(Math.round(archer.computeMP())));
            callMP2.setText(String.valueOf(Math.round(archer.computeMP())));

            callPhysicalAtk.setText(String.valueOf(Math.round(archer.computePhysicalDmg())));
            callMagicAtk.setText(String.valueOf(Math.round(archer.computeMagicDmg())));
           callPhysicalDef.setText(String.valueOf(Math.round(archer.computePhysicalDef())));
           callMagicDef.setText(String.valueOf(Math.round(archer.computeMagicDef())));
        }

        else if(marksstring.equals("Ranger")) {
            callClass.setText(ranger.getHeroClass());
            callName.setText(ranger.getHeroName());
            callID.setText(String.valueOf(ranger.getHeroID()));

            int i = Integer.parseInt(String.valueOf(callLevel.getText()));
            ranger.setHeroLevel(i);
            callLevel.setText(String.valueOf(ranger.getHeroLevel()));

            ranger.heroStat(20, 34, 14);
            callStr.setText(String.valueOf((Math.round(ranger.computeStrength()))));
            callAgi.setText(String.valueOf(Math.round(ranger.computeAgility())));
            callInt.setText(String.valueOf(Math.round(ranger.computeIntelligence())));

            callHP1.setText(String.valueOf(Math.round(ranger.computeHP())));
            callHP2.setText(String.valueOf(Math.round(ranger.computeHP())));
            callMP1.setText(String.valueOf(Math.round(ranger.computeMP())));
            callMP2.setText(String.valueOf(Math.round(ranger.computeMP())));

            callPhysicalAtk.setText(String.valueOf(Math.round(ranger.computePhysicalDmg())));
            callMagicAtk.setText(String.valueOf(Math.round(ranger.computeMagicDmg())));
           callPhysicalDef.setText(String.valueOf(Math.round(ranger.computePhysicalDef())));
           callMagicDef.setText(String.valueOf(Math.round(ranger.computeMagicDef())));
        }
    }
}

