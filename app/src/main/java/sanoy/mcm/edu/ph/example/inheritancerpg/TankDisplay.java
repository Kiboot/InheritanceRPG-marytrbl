package sanoy.mcm.edu.ph.example.inheritancerpg;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class TankDisplay extends AppCompatActivity {

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

            String hroclassstrng = getIntent().getStringExtra("Tank");
            String tankstrng = getIntent().getStringExtra("Barbarian");
            String tankstrng2 = getIntent().getStringExtra("Knight");
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

            final Hero knight = new Hero("Tank (Knight)", "Ragnar", 20200000, 1);
            final Hero barb = new Hero("Tank (Barbarian)", "Ragnar", 20200000, 1);


            if (tankstrng.equals("Barbarian")) {
                archerimage.setVisibility(View.GONE);
                riflemanimage.setVisibility(View.GONE);
                barbarianimage.setVisibility(View.VISIBLE);
                knightimage.setVisibility(View.GONE);
                assassinimage.setVisibility(View.GONE);
                ninjaimage.setVisibility(View.GONE);
                necroimage.setVisibility(View.GONE);
                priestimage.setVisibility(View.GONE);
                healerimage.setVisibility(View.GONE);
                enchanterimage.setVisibility(View.GONE);
                chsimage.setVisibility(View.GONE);
                thurmanimage.setVisibility(View.GONE);
                ignimage.setVisibility(View.GONE);
                belphimage.setVisibility(View.GONE);
                catnipimage.setVisibility(View.GONE);

                callClass.setText(barb.getHeroClass());
                callName.setText(barb.getHeroName());
                callID.setText(String.valueOf(barb.getHeroID()));

                int i = Integer.parseInt(String.valueOf(callLevel.getText()));
                barb.setHeroLevel(i);
                callLevel.setText(String.valueOf(barb.getHeroLevel()));

                barb.heroStat(35, 25, 10);
                callStr.setText(String.valueOf((Math.round(barb.computeStrength()))));
                callAgi.setText(String.valueOf(Math.round(barb.computeAgility())));
                callInt.setText(String.valueOf(Math.round(barb.computeIntelligence())));

                callHP1.setText(String.valueOf(Math.round(barb.computeHP())));
                callMP1.setText(String.valueOf(Math.round(barb.computeMP())));

                callPhysicalAtk.setText(String.valueOf(Math.round(barb.computePhysicalDmg())));
                callMagicAtk.setText(String.valueOf(Math.round(barb.computeMagicDmg())));
                callPhysicalDef.setText(String.valueOf(Math.round(barb.computePhysicalDef())));
                callMagicDef.setText(String.valueOf(Math.round(barb.computeMagicDef())));
            }

            else if (tankstrng.equals("Knight")) {
                archerimage.setVisibility(View.GONE);
                riflemanimage.setVisibility(View.GONE);
                barbarianimage.setVisibility(View.GONE);
                knightimage.setVisibility(View.VISIBLE);
                assassinimage.setVisibility(View.GONE);
                ninjaimage.setVisibility(View.GONE);
                necroimage.setVisibility(View.GONE);
                priestimage.setVisibility(View.GONE);
                healerimage.setVisibility(View.GONE);
                enchanterimage.setVisibility(View.GONE);
                chsimage.setVisibility(View.GONE);
                thurmanimage.setVisibility(View.GONE);
                ignimage.setVisibility(View.GONE);
                belphimage.setVisibility(View.GONE);
                catnipimage.setVisibility(View.GONE);

                callClass.setText(knight.getHeroClass());
                callName.setText(knight.getHeroName());
                callID.setText(String.valueOf(knight.getHeroID()));

                int i = Integer.parseInt(String.valueOf(callLevel.getText()));
                knight.setHeroLevel(i);
                callLevel.setText(String.valueOf(knight.getHeroLevel()));

                knight.heroStat(25, 30, 15);
                callStr.setText(String.valueOf((Math.round(knight.computeStrength()))));
                callAgi.setText(String.valueOf(Math.round(knight.computeAgility())));
                callInt.setText(String.valueOf(Math.round(knight.computeIntelligence())));

                callHP1.setText(String.valueOf(Math.round(knight.computeHP())));
                callMP1.setText(String.valueOf(Math.round(knight.computeMP())));

                callPhysicalAtk.setText(String.valueOf(Math.round(knight.computePhysicalDmg())));
                callMagicAtk.setText(String.valueOf(Math.round(knight.computeMagicDmg())));
                callPhysicalDef.setText(String.valueOf(Math.round(knight.computePhysicalDef())));
                callMagicDef.setText(String.valueOf(Math.round(knight.computeMagicDef())));
            }
        }
    @Override
    public void onBackPressed() {
        Intent intent = new Intent(TankDisplay.this, MainActivity.class);
        startActivity(intent);
    }
}
