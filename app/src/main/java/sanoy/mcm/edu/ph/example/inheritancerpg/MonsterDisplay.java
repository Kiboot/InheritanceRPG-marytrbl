package sanoy.mcm.edu.ph.example.inheritancerpg;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

public class MonsterDisplay extends AppCompatActivity {

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

        ConstraintLayout background = (ConstraintLayout) findViewById(R.id.layout);
        background.setBackgroundResource(R.drawable.den2bg);

        String monclassstrng = getIntent().getStringExtra("Monster");

        TextView callName = findViewById(R.id.heroName);
        TextView callClass = findViewById(R.id.heroClass);
        TextView callID = findViewById(R.id.heroID);
        TextView callLevel = findViewById(R.id.heroLvlnum);

        final TextView callHP1 = findViewById(R.id.currhp);
        final TextView callMP1 = findViewById(R.id.currmp);

        final TextView callStr = findViewById(R.id.strength);
        final TextView callAgi = findViewById(R.id.agility);
        final TextView callInt = findViewById(R.id.intelligence);

        final TextView callPhysicalAtk = findViewById(R.id.physAtk);
        final TextView callMagicAtk = findViewById(R.id.mgAtk);
        final TextView callPhysicalDef = findViewById(R.id.physDef);
        final TextView callMagicDef = findViewById(R.id.mgDef);

        final Monsters soul = new Monsters("4th Grade","Corrupted Soul",20200000,10);
        final Monsters belphie = new Monsters("4th Grade","Belphegor",20200000,20);
        final Monsters catnip = new Monsters("2nd Grade","Catnip",20200000,35);
        final Monsters truman = new Monsters("1st Grade", "Thurman",20200000,50);
        final Monsters boss = new Monsters("BOSS","Ignatius",20200000,70);

        if(monclassstrng.equals("Corrupted Soul")) {
            archerimage.setVisibility(View.GONE);
            riflemanimage.setVisibility(View.GONE);
            barbarianimage.setVisibility(View.GONE);
            knightimage.setVisibility(View.GONE);
            assassinimage.setVisibility(View.GONE);
            ninjaimage.setVisibility(View.GONE);
            necroimage.setVisibility(View.GONE);
            priestimage.setVisibility(View.GONE);
            healerimage.setVisibility(View.GONE);
            enchanterimage.setVisibility(View.GONE);
            chsimage.setVisibility(View.VISIBLE);
            thurmanimage.setVisibility(View.GONE);
            ignimage.setVisibility(View.GONE);
            belphimage.setVisibility(View.GONE);
            catnipimage.setVisibility(View.GONE);

            callClass.setText(soul.getMonClass());
            callName.setText(soul.getMonName());
            callID.setText(String.valueOf(soul.getMonID()));
            callLevel.setText(String.valueOf(soul.getMonLevel()));

            int i = Integer.parseInt(String.valueOf(callLevel.getText()));
            soul.setMonLevel(i);
            callLevel.setText(String.valueOf(soul.getMonLevel()));

            soul.monStat(20, 40, 10);
            callStr.setText(String.valueOf((Math.round(soul.computeStrength()))));
            callAgi.setText(String.valueOf(Math.round(soul.computeAgility())));
            callInt.setText(String.valueOf(Math.round(soul.computeIntelligence())));

            callHP1.setText(String.valueOf(Math.round(soul.computeHP())));
            callMP1.setText(String.valueOf(Math.round(soul.computeMP())));

            callPhysicalAtk.setText(String.valueOf(Math.round(soul.computePhysicalDmg())));
            callMagicAtk.setText(String.valueOf(Math.round(soul.computeMagicDmg())));
            callPhysicalDef.setText(String.valueOf(Math.round(soul.computePhysicalDef())));
            callMagicDef.setText(String.valueOf(Math.round(soul.computeMagicDef())));
        }

        else if(monclassstrng.equals("Belphegor")) {
            archerimage.setVisibility(View.GONE);
            riflemanimage.setVisibility(View.GONE);
            barbarianimage.setVisibility(View.GONE);
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
            belphimage.setVisibility(View.VISIBLE);
            catnipimage.setVisibility(View.GONE);

            callClass.setText(belphie.getMonClass());
            callName.setText(belphie.getMonName());
            callID.setText(String.valueOf(belphie.getMonID()));
            callLevel.setText(String.valueOf(belphie.getMonLevel()));

            int i = Integer.parseInt(String.valueOf(callLevel.getText()));
            belphie.setMonLevel(i);
            callLevel.setText(String.valueOf(belphie.getMonLevel()));

            belphie.monStat(35, 20, 15);
            callStr.setText(String.valueOf((Math.round(belphie.computeStrength()))));
            callAgi.setText(String.valueOf(Math.round(belphie.computeAgility())));
            callInt.setText(String.valueOf(Math.round(belphie.computeIntelligence())));

            callHP1.setText(String.valueOf(Math.round(belphie.computeHP())));
            callMP1.setText(String.valueOf(Math.round(belphie.computeMP())));
            callPhysicalAtk.setText(String.valueOf(Math.round(belphie.computePhysicalDmg())));
            callMagicAtk.setText(String.valueOf(Math.round(belphie.computeMagicDmg())));
            callPhysicalDef.setText(String.valueOf(Math.round(belphie.computePhysicalDef())));
            callMagicDef.setText(String.valueOf(Math.round(belphie.computeMagicDef())));
        }
        else if(monclassstrng.equals("Catnip")) {
            archerimage.setVisibility(View.GONE);
            riflemanimage.setVisibility(View.GONE);
            barbarianimage.setVisibility(View.GONE);
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
            catnipimage.setVisibility(View.VISIBLE);

            callClass.setText(catnip.getMonClass());
            callName.setText(catnip.getMonName());
            callID.setText(String.valueOf(catnip.getMonID()));
            callLevel.setText(String.valueOf(catnip.getMonLevel()));

            int i = Integer.parseInt(String.valueOf(callLevel.getText()));
            catnip.setMonLevel(i);
            callLevel.setText(String.valueOf(catnip.getMonLevel()));

            catnip.monStat(25, 25, 20);
            callStr.setText(String.valueOf((Math.round(catnip.computeStrength()))));
            callAgi.setText(String.valueOf(Math.round(catnip.computeAgility())));
            callInt.setText(String.valueOf(Math.round(catnip.computeIntelligence())));

            callHP1.setText(String.valueOf(Math.round(catnip.computeHP())));
            callMP1.setText(String.valueOf(Math.round(catnip.computeMP())));

            callPhysicalAtk.setText(String.valueOf(Math.round(catnip.computePhysicalDmg())));
            callMagicAtk.setText(String.valueOf(Math.round(catnip.computeMagicDmg())));
            callPhysicalDef.setText(String.valueOf(Math.round(catnip.computePhysicalDef())));
            callMagicDef.setText(String.valueOf(Math.round(catnip.computeMagicDef())));
        }

        else if(monclassstrng.equals("Thurman")) {
            archerimage.setVisibility(View.GONE);
            riflemanimage.setVisibility(View.GONE);
            barbarianimage.setVisibility(View.GONE);
            knightimage.setVisibility(View.GONE);
            assassinimage.setVisibility(View.GONE);
            ninjaimage.setVisibility(View.GONE);
            necroimage.setVisibility(View.GONE);
            priestimage.setVisibility(View.GONE);
            healerimage.setVisibility(View.GONE);
            enchanterimage.setVisibility(View.GONE);
            chsimage.setVisibility(View.GONE);
            thurmanimage.setVisibility(View.VISIBLE);
            ignimage.setVisibility(View.GONE);
            belphimage.setVisibility(View.GONE);
            catnipimage.setVisibility(View.GONE);

            callClass.setText(truman.getMonClass());
            callName.setText(truman.getMonName());
            callID.setText(String.valueOf(truman.getMonID()));
            callLevel.setText(String.valueOf(truman.getMonLevel()));

            int i = Integer.parseInt(String.valueOf(callLevel.getText()));
            truman.setMonLevel(i);
            callLevel.setText(String.valueOf(truman.getMonLevel()));

            truman.monStat(30, 20, 40);
            callStr.setText(String.valueOf((Math.round(truman.computeStrength()))));
            callAgi.setText(String.valueOf(Math.round(truman.computeAgility())));
            callInt.setText(String.valueOf(Math.round(truman.computeIntelligence())));

            callHP1.setText(String.valueOf(Math.round(truman.computeHP())));
            callMP1.setText(String.valueOf(Math.round(truman.computeMP())));

            callPhysicalAtk.setText(String.valueOf(Math.round(truman.computePhysicalDmg())));
            callMagicAtk.setText(String.valueOf(Math.round(truman.computeMagicDmg())));
            callPhysicalDef.setText(String.valueOf(Math.round(truman.computePhysicalDef())));
            callMagicDef.setText(String.valueOf(Math.round(truman.computeMagicDef())));
        }

        else if(monclassstrng.equals("Ignatius")) {
            archerimage.setVisibility(View.GONE);
            riflemanimage.setVisibility(View.GONE);
            barbarianimage.setVisibility(View.GONE);
            knightimage.setVisibility(View.GONE);
            assassinimage.setVisibility(View.GONE);
            ninjaimage.setVisibility(View.GONE);
            necroimage.setVisibility(View.GONE);
            priestimage.setVisibility(View.GONE);
            healerimage.setVisibility(View.GONE);
            enchanterimage.setVisibility(View.GONE);
            chsimage.setVisibility(View.GONE);
            thurmanimage.setVisibility(View.GONE);
            ignimage.setVisibility(View.VISIBLE);
            belphimage.setVisibility(View.GONE);
            catnipimage.setVisibility(View.GONE);

            callClass.setText(boss.getMonClass());
            callName.setText(boss.getMonName());
            callID.setText(String.valueOf(boss.getMonID()));
            callLevel.setText(String.valueOf(boss.getMonLevel()));

            int i = Integer.parseInt(String.valueOf(callLevel.getText()));
            boss.setMonLevel(i);
            callLevel.setText(String.valueOf(boss.getMonLevel()));

            boss.monStat(35, 25, 40);
            callStr.setText(String.valueOf((Math.round(boss.computeStrength()))));
            callAgi.setText(String.valueOf(Math.round(boss.computeAgility())));
            callInt.setText(String.valueOf(Math.round(boss.computeIntelligence())));

            callHP1.setText(String.valueOf(Math.round(boss.computeHP())));
            callMP1.setText(String.valueOf(Math.round(boss.computeMP())));

            callPhysicalAtk.setText(String.valueOf(Math.round(boss.computePhysicalDmg())));
            callMagicAtk.setText(String.valueOf(Math.round(boss.computeMagicDmg())));
            callPhysicalDef.setText(String.valueOf(Math.round(boss.computePhysicalDef())));
            callMagicDef.setText(String.valueOf(Math.round(boss.computeMagicDef())));
        }
}
    @Override
    public void onBackPressed() {
        Intent intent = new Intent(MonsterDisplay.this, MainActivity.class);
        startActivity(intent);
    }
}
