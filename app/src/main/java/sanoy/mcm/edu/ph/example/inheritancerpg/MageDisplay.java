package sanoy.mcm.edu.ph.example.inheritancerpg;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MageDisplay extends AppCompatActivity {

    ImageView archerimage,barbarianimage,knightimage,riflemanimage, assassinimage, ninjaimage, necroimage, enchanterimage, healerimage, priestimage;
    ImageView chsimage, ignimage, thurmanimage, belphimage,catnipimage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_herodisplay);

        archerimage=findViewById(R.id.archerimage);
        barbarianimage=findViewById(R.id.barbarianimage);
        knightimage=findViewById(R.id.knightimage);
        riflemanimage=findViewById(R.id.riflemanimage);
        assassinimage=findViewById(R.id.assassinimage);
        ninjaimage=findViewById(R.id.ninjaimage);
        necroimage=findViewById(R.id.necroimage);
        priestimage=findViewById(R.id.priestimage);
        healerimage=findViewById(R.id.healerimage);
        enchanterimage=findViewById(R.id.enchanterimage);
        chsimage = findViewById(R.id.chsimage);
        thurmanimage = findViewById(R.id.thurmanimage);
        ignimage = findViewById(R.id.ignimage);
        belphimage = findViewById(R.id.belphimage);
        catnipimage = findViewById(R.id.catnipimage);

        String hroclassstrng = getIntent().getStringExtra("Mage");
        String magestrng = getIntent().getStringExtra("Necromancer");
        String magestrng2 = getIntent().getStringExtra("Priest");
        String heroLvl = getIntent().getStringExtra("level");

        TextView callName = findViewById(R.id.heroName);
        TextView callClass = findViewById(R.id.heroClass);
        TextView callID = findViewById(R.id.heroID);
        TextView callLevel = findViewById(R.id.heroLvlnum);
        callLevel.setText(heroLvl);

        final TextView callHP1 = findViewById(R.id.currhp);
        final TextView callMP1 = findViewById(R.id.currmp);

        final TextView callStr = findViewById(R.id.strength);
        final TextView callAgi = findViewById(R.id.agility);
        final TextView callInt = findViewById(R.id.intelligence);

        final TextView callPhysicalAtk = findViewById(R.id.physAtk);
        final TextView callMagicAtk = findViewById(R.id.mgAtk);
        final TextView callPhysicalDef = findViewById(R.id.physDef);
        final TextView callMagicDef = findViewById(R.id.mgDef);

        final Hero priest = new Hero("Mage (Priest)", "Sibyl", 20200000, 1);
        final Hero necro = new Hero("Mage (Necromancer)", "Sibyl", 20200000, 1);

        if(magestrng.equals("Priest")) {
            archerimage.setVisibility(View.GONE);
            riflemanimage.setVisibility(View.GONE);
            barbarianimage.setVisibility(View.GONE);
            knightimage.setVisibility(View.GONE);
            assassinimage.setVisibility(View.GONE);
            ninjaimage.setVisibility(View.GONE);
            necroimage.setVisibility(View.GONE);
            priestimage.setVisibility(View.VISIBLE);
            healerimage.setVisibility(View.GONE);
            enchanterimage.setVisibility(View.GONE);
            chsimage.setVisibility(View.GONE);
            thurmanimage.setVisibility(View.GONE);
            ignimage.setVisibility(View.GONE);
            belphimage.setVisibility(View.GONE);
            catnipimage.setVisibility(View.GONE);

            callClass.setText(priest.getHeroClass());
            callName.setText(priest.getHeroName());
            callID.setText(String.valueOf(priest.getHeroID()));

            int i = Integer.parseInt(String.valueOf(callLevel.getText()));
            priest.setHeroLevel(i);
            callLevel.setText(String.valueOf(priest.getHeroLevel()));

            priest.heroStat(25, 10, 35);
            callStr.setText(String.valueOf((Math.round(priest.computeStrength()))));
            callAgi.setText(String.valueOf(Math.round(priest.computeAgility())));
            callInt.setText(String.valueOf(Math.round(priest.computeIntelligence())));

            callHP1.setText(String.valueOf(Math.round(priest.computeHP())));
            callMP1.setText(String.valueOf(Math.round(priest.computeMP())));

            callPhysicalAtk.setText(String.valueOf(Math.round(priest.computePhysicalDmg())));
            callMagicAtk.setText(String.valueOf(Math.round(priest.computeMagicDmg())));
            callPhysicalDef.setText(String.valueOf(Math.round(priest.computePhysicalDef())));
            callMagicDef.setText(String.valueOf(Math.round(priest.computeMagicDef())));
        }

        else if(magestrng.equals("Necromancer")) {
            archerimage.setVisibility(View.GONE);
            riflemanimage.setVisibility(View.GONE);
            barbarianimage.setVisibility(View.GONE);
            knightimage.setVisibility(View.GONE);
            assassinimage.setVisibility(View.GONE);
            ninjaimage.setVisibility(View.GONE);
            necroimage.setVisibility(View.VISIBLE);
            priestimage.setVisibility(View.GONE);
            healerimage.setVisibility(View.GONE);
            enchanterimage.setVisibility(View.GONE);
            chsimage.setVisibility(View.GONE);
            thurmanimage.setVisibility(View.GONE);
            ignimage.setVisibility(View.GONE);
            belphimage.setVisibility(View.GONE);
            catnipimage.setVisibility(View.GONE);

            callClass.setText(necro.getHeroClass());
            callName.setText(necro.getHeroName());
            callID.setText(String.valueOf(necro.getHeroID()));

            int i = Integer.parseInt(String.valueOf(callLevel.getText()));
            necro.setHeroLevel(i);
            callLevel.setText(String.valueOf(necro.getHeroLevel()));

            necro.heroStat(25, 15, 30);
            callStr.setText(String.valueOf((Math.round(necro.computeStrength()))));
            callAgi.setText(String.valueOf(Math.round(necro.computeAgility())));
            callInt.setText(String.valueOf(Math.round(necro.computeIntelligence())));

            callHP1.setText(String.valueOf(Math.round(necro.computeHP())));
            callMP1.setText(String.valueOf(Math.round(necro.computeMP())));

            callPhysicalAtk.setText(String.valueOf(Math.round(necro.computePhysicalDmg())));
            callMagicAtk.setText(String.valueOf(Math.round(necro.computeMagicDmg())));
            callPhysicalDef.setText(String.valueOf(Math.round(necro.computePhysicalDef())));
            callMagicDef.setText(String.valueOf(Math.round(necro.computeMagicDef())));
        }
    }
    @Override
    public void onBackPressed() {
        Intent intent = new Intent(MageDisplay.this, MainActivity.class);
        startActivity(intent);
    }
}

