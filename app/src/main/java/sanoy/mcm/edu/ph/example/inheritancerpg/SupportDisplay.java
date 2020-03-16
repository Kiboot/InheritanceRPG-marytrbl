package sanoy.mcm.edu.ph.example.inheritancerpg;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SupportDisplay extends AppCompatActivity {

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
        final TextView callMP1 = findViewById(R.id.currmp);

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
            archerimage.setVisibility(View.GONE);
            riflemanimage.setVisibility(View.GONE);
            barbarianimage.setVisibility(View.GONE);
            knightimage.setVisibility(View.GONE);
            assassinimage.setVisibility(View.GONE);
            ninjaimage.setVisibility(View.GONE);
            necroimage.setVisibility(View.GONE);
            priestimage.setVisibility(View.GONE);
            healerimage.setVisibility(View.GONE);
            enchanterimage.setVisibility(View.VISIBLE);
            chsimage.setVisibility(View.GONE);
            thurmanimage.setVisibility(View.GONE);
            ignimage.setVisibility(View.GONE);
            belphimage.setVisibility(View.GONE);
            catnipimage.setVisibility(View.GONE);

            callClass.setText(enchanter.getHeroClass());
            callName.setText(enchanter.getHeroName());
            callID.setText(String.valueOf(enchanter.getHeroID()));

            int i = Integer.parseInt(String.valueOf(callLevel.getText()));
            enchanter.setHeroLevel(i);
            callLevel.setText(String.valueOf(enchanter.getHeroLevel()));

            enchanter.heroStat(15, 25, 30);
            callStr.setText(String.valueOf((Math.round(enchanter.computeStrength()))));
            callAgi.setText(String.valueOf(Math.round(enchanter.computeAgility())));
            callInt.setText(String.valueOf(Math.round(enchanter.computeIntelligence())));

            callHP1.setText(String.valueOf(Math.round(enchanter.computeHP())));
            callMP1.setText(String.valueOf(Math.round(enchanter.computeMP())));

            callPhysicalAtk.setText(String.valueOf(Math.round(enchanter.computePhysicalDmg())));
            callMagicAtk.setText(String.valueOf(Math.round(enchanter.computeMagicDmg())));
            callPhysicalDef.setText(String.valueOf(Math.round(enchanter.computePhysicalDef())));
            callMagicDef.setText(String.valueOf(Math.round(enchanter.computeMagicDef())));
        }

        else if(supportstrng.equals("Healer")) {
            archerimage.setVisibility(View.GONE);
            riflemanimage.setVisibility(View.GONE);
            barbarianimage.setVisibility(View.GONE);
            knightimage.setVisibility(View.GONE);
            assassinimage.setVisibility(View.GONE);
            ninjaimage.setVisibility(View.GONE);
            necroimage.setVisibility(View.GONE);
            priestimage.setVisibility(View.GONE);
            healerimage.setVisibility(View.VISIBLE);
            enchanterimage.setVisibility(View.GONE);
            chsimage.setVisibility(View.GONE);
            thurmanimage.setVisibility(View.GONE);
            ignimage.setVisibility(View.GONE);
            belphimage.setVisibility(View.GONE);
            catnipimage.setVisibility(View.GONE);

            callClass.setText(healer.getHeroClass());
            callName.setText(healer.getHeroName());
            callID.setText(String.valueOf(healer.getHeroID()));

            int i = Integer.parseInt(String.valueOf(callLevel.getText()));
            healer.setHeroLevel(i);
            callLevel.setText(String.valueOf(healer.getHeroLevel()));

            healer.heroStat(30, 15, 25);
            callStr.setText(String.valueOf((Math.round(healer.computeStrength()))));
            callAgi.setText(String.valueOf(Math.round(healer.computeAgility())));
            callInt.setText(String.valueOf(Math.round(healer.computeIntelligence())));

            callHP1.setText(String.valueOf(Math.round(healer.computeHP())));
            callMP1.setText(String.valueOf(Math.round(healer.computeMP())));

            callPhysicalAtk.setText(String.valueOf(Math.round(healer.computePhysicalDmg())));
            callMagicAtk.setText(String.valueOf(Math.round(healer.computeMagicDmg())));
            callPhysicalDef.setText(String.valueOf(Math.round(healer.computePhysicalDef())));
            callMagicDef.setText(String.valueOf(Math.round(healer.computeMagicDef())));
        }
    }
    @Override
    public void onBackPressed() {
        Intent intent = new Intent(SupportDisplay.this, MainActivity.class);
        startActivity(intent);
    }
}
