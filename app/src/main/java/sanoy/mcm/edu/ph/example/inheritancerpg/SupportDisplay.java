package sanoy.mcm.edu.ph.example.inheritancerpg;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SupportDisplay extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_herodisplay);

        String hroclassstrng = getIntent().getStringExtra("Support");
        String supportstrng = getIntent().getStringExtra("Healer");
        String supportstrng2 = getIntent().getStringExtra("Enchanter");
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

        final Hero healer = new Hero("Support (Healer)", "Ezra", 20200000, 1);
        final Hero enchanter = new Hero("Support (Enchanter)", "Ezra", 20200000, 1);

        if(supportstrng.equals("Enchanter")) {
            callClass.setText(enchanter.getHeroClass());
            callName.setText(enchanter.getHeroName());
            callID.setText(String.valueOf(enchanter.getHeroID()));

            int i = Integer.parseInt(String.valueOf(callLevel.getText()));
            enchanter.setHeroLevel(i);
            callLevel.setText(String.valueOf(enchanter.getHeroLevel()));

            enchanter.heroStat(20, 34, 14);
            callStr.setText(String.valueOf((Math.round(enchanter.computeStrength()))));
            callAgi.setText(String.valueOf(Math.round(enchanter.computeAgility())));
            callInt.setText(String.valueOf(Math.round(enchanter.computeIntelligence())));

            callHP1.setText(String.valueOf(Math.round(enchanter.computeHP())));
            callHP2.setText(String.valueOf(Math.round(enchanter.computeHP())));
            callMP1.setText(String.valueOf(Math.round(enchanter.computeMP())));
            callMP2.setText(String.valueOf(Math.round(enchanter.computeMP())));

            callPhysicalAtk.setText(String.valueOf(Math.round(enchanter.computePhysicalDmg())));
            callMagicAtk.setText(String.valueOf(Math.round(enchanter.computeMagicDmg())));
            callPhysicalDef.setText(String.valueOf(Math.round(enchanter.computePhysicalDef())));
            callMagicDef.setText(String.valueOf(Math.round(enchanter.computeMagicDef())));
        }

        else if(supportstrng.equals("Healer")) {
            callClass.setText(healer.getHeroClass());
            callName.setText(healer.getHeroName());
            callID.setText(String.valueOf(healer.getHeroID()));

            int i = Integer.parseInt(String.valueOf(callLevel.getText()));
            healer.setHeroLevel(i);
            callLevel.setText(String.valueOf(healer.getHeroLevel()));

            healer.heroStat(20, 34, 14);
            callStr.setText(String.valueOf((Math.round(healer.computeStrength()))));
            callAgi.setText(String.valueOf(Math.round(healer.computeAgility())));
            callInt.setText(String.valueOf(Math.round(healer.computeIntelligence())));

            callHP1.setText(String.valueOf(Math.round(healer.computeHP())));
            callHP2.setText(String.valueOf(Math.round(healer.computeHP())));
            callMP1.setText(String.valueOf(Math.round(healer.computeMP())));
            callMP2.setText(String.valueOf(Math.round(healer.computeMP())));

            callPhysicalAtk.setText(String.valueOf(Math.round(healer.computePhysicalDmg())));
            callMagicAtk.setText(String.valueOf(Math.round(healer.computeMagicDmg())));
            callPhysicalDef.setText(String.valueOf(Math.round(healer.computePhysicalDef())));
            callMagicDef.setText(String.valueOf(Math.round(healer.computeMagicDef())));
        }
    }
}
