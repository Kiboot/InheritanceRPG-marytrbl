package sanoy.mcm.edu.ph.example.inheritancerpg;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class RogueDisplay extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_herodisplay);

        String hroclassstrng = getIntent().getStringExtra("Tank");
        String roguestrng = getIntent().getStringExtra("Assassin");
        String roguestrng2 = getIntent().getStringExtra("Ninja");
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

        final Hero assassin = new Hero("Rogue (Assassin)", "Darion", 20200000, 1);
        final Hero ninja = new Hero("Rogue (Ninja)", "Darion", 20200000, 1);


        if(roguestrng.equals("Assassin")) {
            callClass.setText(assassin.getHeroClass());
            callName.setText(assassin.getHeroName());
            callID.setText(String.valueOf(assassin.getHeroID()));

            int i = Integer.parseInt(String.valueOf(callLevel.getText()));
            assassin.setHeroLevel(i);
            callLevel.setText(String.valueOf(assassin.getHeroLevel()));

            assassin.heroStat(20, 34, 14);
            callStr.setText(String.valueOf((Math.round(assassin.computeStrength()))));
            callAgi.setText(String.valueOf(Math.round(assassin.computeAgility())));
            callInt.setText(String.valueOf(Math.round(assassin.computeIntelligence())));

            callHP1.setText(String.valueOf(Math.round(assassin.computeHP())));
            callHP2.setText(String.valueOf(Math.round(assassin.computeHP())));
            callMP1.setText(String.valueOf(Math.round(assassin.computeMP())));
            callMP2.setText(String.valueOf(Math.round(assassin.computeMP())));

            callPhysicalAtk.setText(String.valueOf(Math.round(assassin.computePhysicalDmg())));
            callMagicAtk.setText(String.valueOf(Math.round(assassin.computeMagicDmg())));
            callPhysicalDef.setText(String.valueOf(Math.round(assassin.computePhysicalDef())));
            callMagicDef.setText(String.valueOf(Math.round(assassin.computeMagicDef())));
        }

        else if(roguestrng.equals("Ninja")) {
            callClass.setText(ninja.getHeroClass());
            callName.setText(ninja.getHeroName());
            callID.setText(String.valueOf(ninja.getHeroID()));

            int i = Integer.parseInt(String.valueOf(callLevel.getText()));
            ninja.setHeroLevel(i);
            callLevel.setText(String.valueOf(ninja.getHeroLevel()));

            ninja.heroStat(20, 34, 14);
            callStr.setText(String.valueOf((Math.round(ninja.computeStrength()))));
            callAgi.setText(String.valueOf(Math.round(ninja.computeAgility())));
            callInt.setText(String.valueOf(Math.round(ninja.computeIntelligence())));

            callHP1.setText(String.valueOf(Math.round(ninja.computeHP())));
            callHP2.setText(String.valueOf(Math.round(ninja.computeHP())));
            callMP1.setText(String.valueOf(Math.round(ninja.computeMP())));
            callMP2.setText(String.valueOf(Math.round(ninja.computeMP())));

            callPhysicalAtk.setText(String.valueOf(Math.round(ninja.computePhysicalDmg())));
            callMagicAtk.setText(String.valueOf(Math.round(ninja.computeMagicDmg())));
            callPhysicalDef.setText(String.valueOf(Math.round(ninja.computePhysicalDef())));
            callMagicDef.setText(String.valueOf(Math.round(ninja.computeMagicDef())));
        }
    }
}

