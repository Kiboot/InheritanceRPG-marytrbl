package sanoy.mcm.edu.ph.example.inheritancerpg;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Spinner tankspnr,magespnr,marksmanspnr,roguespnr,supportspnr;
    Spinner HeroClass, MonsterClass;
    String tankstrng,magestrng,marksstring,roguestrng,supportstrng;
    String hroclassstrng, monclassstrng;

    ImageView archerimage,barbarianimage,knightimage,riflemanimage, assassinimage, ninjaimage, necroimage, enchanterimage, healerimage, priestimage;
    ImageView chsimage, ignimage, thurmanimage, belphimage,catnipimage;
    Button button, button2, herobtn, monsterbtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText heroLvl = findViewById(R.id.inputlvl);
        button=findViewById(R.id.button);
        herobtn=findViewById(R.id.herobtn);
        button2=findViewById(R.id.button2);
        monsterbtn=findViewById(R.id.monsterbtn);

        magespnr=findViewById(R.id.magesubclass);
        marksmanspnr=findViewById(R.id.marksmansubclass);
        roguespnr=findViewById(R.id.roguesubclass);
        supportspnr=findViewById(R.id.supportsubclass);
        tankspnr=findViewById(R.id.tanksubclass);
        HeroClass=findViewById(R.id.Heroclass);
        MonsterClass=findViewById(R.id.Monsterclass);

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
        catnipimage.setVisibility(View.GONE);

        HeroClass.setVisibility(View.GONE);
        MonsterClass.setVisibility(View.GONE);
        marksmanspnr.setVisibility(View.GONE);
        supportspnr.setVisibility(View.GONE);
        tankspnr.setVisibility(View.GONE);
        roguespnr.setVisibility(View.GONE);
        magespnr.setVisibility(View.GONE);
        button.setVisibility(View.GONE);
        button2.setVisibility(View.GONE);
        heroLvl.setVisibility(View.GONE);

        herobtn.setOnClickListener(
            new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    herobtn.setVisibility(View.GONE);
                    monsterbtn.setVisibility(View.GONE);
                    HeroClass.setVisibility(View.VISIBLE);
                    marksmanspnr.setVisibility(View.VISIBLE);
                    supportspnr.setVisibility(View.VISIBLE);
                    tankspnr.setVisibility(View.VISIBLE);
                    roguespnr.setVisibility(View.VISIBLE);
                    magespnr.setVisibility(View.VISIBLE);
                    button.setVisibility(View.VISIBLE);
                    heroLvl.setVisibility(View.VISIBLE);
                }
            }
        );

        monsterbtn.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        ConstraintLayout background = (ConstraintLayout) findViewById(R.id.layout);
                        background.setBackgroundResource(R.drawable.denbg);
                        herobtn.setVisibility(View.GONE);
                        monsterbtn.setVisibility(View.GONE);
                        MonsterClass.setVisibility(View.VISIBLE);
                        marksmanspnr.setVisibility(View.GONE);
                        supportspnr.setVisibility(View.GONE);
                        tankspnr.setVisibility(View.GONE);
                        roguespnr.setVisibility(View.GONE);
                        magespnr.setVisibility(View.GONE);
                        button2.setVisibility(View.VISIBLE);
                        heroLvl.setVisibility(View.GONE);
                        chsimage.setVisibility(View.GONE);
                        thurmanimage.setVisibility(View.GONE);
                        ignimage.setVisibility(View.GONE);
                        belphimage.setVisibility(View.GONE);
                        catnipimage.setVisibility(View.GONE);
                    }
                }
        );

        HeroClass.setOnItemSelectedListener(
                new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                       hroclassstrng=HeroClass.getSelectedItem().toString();

                        if (hroclassstrng.equals("Tank")) {
                            marksmanspnr.setVisibility(View.GONE);
                            supportspnr.setVisibility(View.GONE);
                            tankspnr.setVisibility(View.VISIBLE);
                            roguespnr.setVisibility(View.GONE);
                            magespnr.setVisibility(View.GONE);
                            knightimage.setVisibility(View.VISIBLE);
                            archerimage.setVisibility(View.GONE);
                            riflemanimage.setVisibility(View.GONE);
                            assassinimage.setVisibility(View.GONE);
                            ninjaimage.setVisibility(View.GONE);
                            necroimage.setVisibility(View.GONE);
                            priestimage.setVisibility(View.GONE);
                            healerimage.setVisibility(View.GONE);
                            enchanterimage.setVisibility(View.GONE);
                        }
                        else if (hroclassstrng.equals("Marksman")) {
                            marksmanspnr.setVisibility(View.VISIBLE);
                            supportspnr.setVisibility(View.GONE);
                            tankspnr.setVisibility(View.GONE);
                            roguespnr.setVisibility(View.GONE);
                            magespnr.setVisibility(View.GONE);
                            archerimage.setVisibility(View.GONE);
                            riflemanimage.setVisibility(View.VISIBLE);
                            barbarianimage.setVisibility(View.GONE);
                            knightimage.setVisibility(View.GONE);
                            assassinimage.setVisibility(View.GONE);
                            ninjaimage.setVisibility(View.GONE);
                            necroimage.setVisibility(View.GONE);
                            priestimage.setVisibility(View.GONE);
                            healerimage.setVisibility(View.GONE);
                            enchanterimage.setVisibility(View.GONE);
                        }
                        else if (hroclassstrng.equals("Mage")) {
                            marksmanspnr.setVisibility(View.GONE);
                            supportspnr.setVisibility(View.GONE);
                            tankspnr.setVisibility(View.GONE);
                            roguespnr.setVisibility(View.GONE);
                            magespnr.setVisibility(View.VISIBLE);
                            priestimage.setVisibility(View.GONE);
                            archerimage.setVisibility(View.GONE);
                            riflemanimage.setVisibility(View.GONE);
                            barbarianimage.setVisibility(View.GONE);
                            knightimage.setVisibility(View.GONE);
                            assassinimage.setVisibility(View.GONE);
                            ninjaimage.setVisibility(View.GONE);
                            necroimage.setVisibility(View.VISIBLE);
                            healerimage.setVisibility(View.GONE);
                            enchanterimage.setVisibility(View.GONE);
                        }
                        else if (hroclassstrng.equals("Rogue")) {
                            marksmanspnr.setVisibility(View.GONE);
                            supportspnr.setVisibility(View.GONE);
                            tankspnr.setVisibility(View.GONE);
                            roguespnr.setVisibility(View.VISIBLE);
                            magespnr.setVisibility(View.GONE);
                            assassinimage.setVisibility(View.VISIBLE);
                            archerimage.setVisibility(View.GONE);
                            riflemanimage.setVisibility(View.GONE);
                            barbarianimage.setVisibility(View.GONE);
                            knightimage.setVisibility(View.GONE);
                            ninjaimage.setVisibility(View.GONE);
                            necroimage.setVisibility(View.GONE);
                            priestimage.setVisibility(View.GONE);
                            healerimage.setVisibility(View.GONE);
                            enchanterimage.setVisibility(View.GONE);
                        }
                        else if (hroclassstrng.equals("Support")) {
                            marksmanspnr.setVisibility(View.GONE);
                            supportspnr.setVisibility(View.VISIBLE);
                            tankspnr.setVisibility(View.GONE);
                            roguespnr.setVisibility(View.GONE);
                            magespnr.setVisibility(View.GONE);
                            enchanterimage.setVisibility(View.GONE);
                            archerimage.setVisibility(View.GONE);
                            riflemanimage.setVisibility(View.GONE);
                            barbarianimage.setVisibility(View.GONE);
                            knightimage.setVisibility(View.GONE);
                            assassinimage.setVisibility(View.GONE);
                            ninjaimage.setVisibility(View.GONE);
                            necroimage.setVisibility(View.GONE);
                            priestimage.setVisibility(View.GONE);
                            healerimage.setVisibility(View.VISIBLE);
                        }
                    }
                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {
                    }
                }
        );
        tankspnr.setOnItemSelectedListener(
                new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                        tankstrng=tankspnr.getSelectedItem().toString();
                        if (tankstrng.equals("Barbarian")) {
                            barbarianimage.setVisibility(View.VISIBLE);
                            archerimage.setVisibility(View.GONE);
                            riflemanimage.setVisibility(View.GONE);
                            knightimage.setVisibility(View.GONE);
                            assassinimage.setVisibility(View.GONE);
                            ninjaimage.setVisibility(View.GONE);
                            necroimage.setVisibility(View.GONE);
                            priestimage.setVisibility(View.GONE);
                            healerimage.setVisibility(View.GONE);
                            enchanterimage.setVisibility(View.GONE);

                        }
                        else if (tankstrng.equals("Knight")) {
                            knightimage.setVisibility(View.VISIBLE);
                            archerimage.setVisibility(View.GONE);
                            riflemanimage.setVisibility(View.GONE);
                            barbarianimage.setVisibility(View.GONE);
                            assassinimage.setVisibility(View.GONE);
                            ninjaimage.setVisibility(View.GONE);
                            necroimage.setVisibility(View.GONE);
                            priestimage.setVisibility(View.GONE);
                            healerimage.setVisibility(View.GONE);
                            enchanterimage.setVisibility(View.GONE);
                        }

                        button.setOnClickListener(
                                new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        if((heroLvl.getText().toString()==null || heroLvl.getText().toString().trim().equals(""))) {
                                            Toast.makeText(MainActivity.this,
                                                    "Invalid level value",
                                                    Toast.LENGTH_LONG).show();
                                        }
                                        else {
                                            Intent i = new Intent(MainActivity.this, TankDisplay.class);
                                            i.putExtra("Tank", hroclassstrng);
                                            i.putExtra("Barbarian", tankstrng);
                                            i.putExtra("Knight", tankstrng);
                                            i.putExtra("level", heroLvl.getText().toString());
                                            startActivity(i);
                                        }
                                    }
                                }
                        );
                    }
                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {
                    }
                }
        );


        marksmanspnr.setOnItemSelectedListener(
                new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                        marksstring=marksmanspnr.getSelectedItem().toString();
                        if (marksstring.equals("Archer")) {
                            archerimage.setVisibility(View.VISIBLE);
                            riflemanimage.setVisibility(View.GONE);
                            barbarianimage.setVisibility(View.GONE);
                            knightimage.setVisibility(View.GONE);
                            assassinimage.setVisibility(View.GONE);
                            ninjaimage.setVisibility(View.GONE);
                            necroimage.setVisibility(View.GONE);
                            priestimage.setVisibility(View.GONE);
                            healerimage.setVisibility(View.GONE);
                            enchanterimage.setVisibility(View.GONE);
                        }
                        else if (marksstring.equals("Ranger")) {
                            riflemanimage.setVisibility(View.VISIBLE);
                            archerimage.setVisibility(View.GONE);
                            barbarianimage.setVisibility(View.GONE);
                            knightimage.setVisibility(View.GONE);
                            assassinimage.setVisibility(View.GONE);
                            ninjaimage.setVisibility(View.GONE);
                            necroimage.setVisibility(View.GONE);
                            priestimage.setVisibility(View.GONE);
                            healerimage.setVisibility(View.GONE);
                            enchanterimage.setVisibility(View.GONE);
                        }

                        button.setOnClickListener(
                                new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        if((heroLvl.getText().toString()==null || heroLvl.getText().toString().trim().equals(""))) {
                                            Toast.makeText(MainActivity.this,
                                                    "Invalid level value",
                                                    Toast.LENGTH_LONG).show();
                                        }
                                        else {
                                            Intent i = new Intent(MainActivity.this, MarksDisplay.class);
                                            i.putExtra("Marksman", hroclassstrng);
                                            i.putExtra("Ranger", marksstring);
                                            i.putExtra("Archer", marksstring);
                                            i.putExtra("level", heroLvl.getText().toString());
                                            startActivity(i);
                                        }
                                    }
                                }
                        );

                    }


                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {
                    }
                }
        );
        magespnr.setOnItemSelectedListener(
                new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                        magestrng=magespnr.getSelectedItem().toString();
                        if (magestrng.equals("Priest")) {
                            priestimage.setVisibility(View.VISIBLE);
                            archerimage.setVisibility(View.GONE);
                            riflemanimage.setVisibility(View.GONE);
                            barbarianimage.setVisibility(View.GONE);
                            knightimage.setVisibility(View.GONE);
                            assassinimage.setVisibility(View.GONE);
                            ninjaimage.setVisibility(View.GONE);
                            necroimage.setVisibility(View.GONE);
                            healerimage.setVisibility(View.GONE);
                            enchanterimage.setVisibility(View.GONE);
                        }
                        else if (magestrng.equals("Necromancer")) {
                            necroimage.setVisibility(View.VISIBLE);
                            archerimage.setVisibility(View.GONE);
                            riflemanimage.setVisibility(View.GONE);
                            barbarianimage.setVisibility(View.GONE);
                            knightimage.setVisibility(View.GONE);
                            assassinimage.setVisibility(View.GONE);
                            ninjaimage.setVisibility(View.GONE);
                            priestimage.setVisibility(View.GONE);
                            healerimage.setVisibility(View.GONE);
                            enchanterimage.setVisibility(View.GONE);
                        }

                        button.setOnClickListener(
                                new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        if((heroLvl.getText().toString()==null || heroLvl.getText().toString().trim().equals(""))) {
                                            Toast.makeText(MainActivity.this,
                                                    "Invalid level value",
                                                    Toast.LENGTH_LONG).show();
                                        }
                                        else {
                                            Intent i = new Intent(MainActivity.this, MageDisplay.class);
                                            i.putExtra("Mage", hroclassstrng);
                                            i.putExtra("Necromancer", magestrng);
                                            i.putExtra("Priest", magestrng);
                                            i.putExtra("level", heroLvl.getText().toString());
                                            startActivity(i);
                                        }
                                    }
                                }
                        );
                    }
                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {
                    }
                }
        );
        roguespnr.setOnItemSelectedListener(
                new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                        roguestrng=roguespnr.getSelectedItem().toString();
                        if (roguestrng.equals("Assassin")) {
                            assassinimage.setVisibility(View.VISIBLE);
                            archerimage.setVisibility(View.GONE);
                            riflemanimage.setVisibility(View.GONE);
                            barbarianimage.setVisibility(View.GONE);
                            knightimage.setVisibility(View.GONE);
                            ninjaimage.setVisibility(View.GONE);
                            necroimage.setVisibility(View.GONE);
                            priestimage.setVisibility(View.GONE);
                            healerimage.setVisibility(View.GONE);
                            enchanterimage.setVisibility(View.GONE);
                        }
                        else if (roguestrng.equals("Ninja")) {
                            ninjaimage.setVisibility(View.VISIBLE);
                            archerimage.setVisibility(View.GONE);
                            riflemanimage.setVisibility(View.GONE);
                            barbarianimage.setVisibility(View.GONE);
                            knightimage.setVisibility(View.GONE);
                            assassinimage.setVisibility(View.GONE);
                            necroimage.setVisibility(View.GONE);
                            priestimage.setVisibility(View.GONE);
                            healerimage.setVisibility(View.GONE);
                            enchanterimage.setVisibility(View.GONE);
                        }

                        button.setOnClickListener(
                                new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        if((heroLvl.getText().toString()==null || heroLvl.getText().toString().trim().equals(""))) {
                                            Toast.makeText(MainActivity.this,
                                                    "Invalid level value",
                                                    Toast.LENGTH_LONG).show();
                                        }
                                        else {
                                            Intent i = new Intent(MainActivity.this, RogueDisplay.class);
                                            i.putExtra("Rogue", hroclassstrng);
                                            i.putExtra("Assassin", roguestrng);
                                            i.putExtra("Ninja", roguestrng);
                                            i.putExtra("level", heroLvl.getText().toString());
                                            startActivity(i);
                                        }
                                    }
                                }
                        );
                    }
                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {
                    }
                }
        );
        supportspnr.setOnItemSelectedListener(
                new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                        supportstrng=supportspnr.getSelectedItem().toString();
                        if (supportstrng.equals("Enchanter")) {
                            enchanterimage.setVisibility(View.VISIBLE);
                            archerimage.setVisibility(View.GONE);
                            riflemanimage.setVisibility(View.GONE);
                            barbarianimage.setVisibility(View.GONE);
                            knightimage.setVisibility(View.GONE);
                            assassinimage.setVisibility(View.GONE);
                            ninjaimage.setVisibility(View.GONE);
                            necroimage.setVisibility(View.GONE);
                            priestimage.setVisibility(View.GONE);
                            healerimage.setVisibility(View.GONE);
                        }
                        else if (supportstrng.equals("Healer")) {
                            healerimage.setVisibility(View.VISIBLE);
                            archerimage.setVisibility(View.GONE);
                            riflemanimage.setVisibility(View.GONE);
                            barbarianimage.setVisibility(View.GONE);
                            knightimage.setVisibility(View.GONE);
                            assassinimage.setVisibility(View.GONE);
                            ninjaimage.setVisibility(View.GONE);
                            necroimage.setVisibility(View.GONE);
                            priestimage.setVisibility(View.GONE);
                            enchanterimage.setVisibility(View.GONE);
                        }

                        button.setOnClickListener(
                                new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        if((heroLvl.getText().toString()==null || heroLvl.getText().toString().trim().equals(""))) {
                                            Toast.makeText(MainActivity.this,
                                                    "Invalid level value",
                                                    Toast.LENGTH_LONG).show();
                                        }
                                        else {
                                            Intent i = new Intent(MainActivity.this, SupportDisplay.class);
                                            i.putExtra("Support", hroclassstrng);
                                            i.putExtra("Healer", supportstrng);
                                            i.putExtra("Enchanter", supportstrng);
                                            i.putExtra("level", heroLvl.getText().toString());
                                            startActivity(i);
                                        }
                                    }
                                }
                        );
                    }
                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {
                    }
                }
        );

        MonsterClass.setOnItemSelectedListener(
                new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                        monclassstrng=MonsterClass.getSelectedItem().toString();

                        if  (monclassstrng.equals("Corrupted Human Soul")){
                            chsimage.setVisibility(View.VISIBLE);
                            thurmanimage.setVisibility(View.GONE);
                            ignimage.setVisibility(View.GONE);
                            belphimage.setVisibility(View.GONE);
                            catnipimage.setVisibility(View.GONE);
                        }
                        else if (monclassstrng.equals("Belphegor")){
                            chsimage.setVisibility(View.GONE);
                            thurmanimage.setVisibility(View.GONE);
                            ignimage.setVisibility(View.GONE);
                            belphimage.setVisibility(View.VISIBLE);
                            catnipimage.setVisibility(View.GONE);;
                        }
                        else if (monclassstrng.equals("Catnip")){
                            chsimage.setVisibility(View.GONE);
                            thurmanimage.setVisibility(View.GONE);
                            ignimage.setVisibility(View.GONE);
                            belphimage.setVisibility(View.GONE);
                            catnipimage.setVisibility(View.VISIBLE);;
                        }
                        else if (monclassstrng.equals("Thurman")){
                            chsimage.setVisibility(View.GONE);
                            thurmanimage.setVisibility(View.VISIBLE);
                            ignimage.setVisibility(View.GONE);
                            belphimage.setVisibility(View.GONE);
                            catnipimage.setVisibility(View.GONE);
                        }
                        else if (monclassstrng.equals("Ignatius")){
                            chsimage.setVisibility(View.GONE);
                            thurmanimage.setVisibility(View.GONE);
                            ignimage.setVisibility(View.VISIBLE);
                            belphimage.setVisibility(View.GONE);
                            catnipimage.setVisibility(View.GONE);
                        }
                        else {
                        }

                        button2.setOnClickListener(
                                new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        Intent intent = new Intent(MainActivity.this, MonsterDisplay.class);
                                        intent.putExtra("Monster",monclassstrng);
                                        startActivity(intent);
                                    }
                                }
                        );
                    }
                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {
                    }
                }
        );
    }
}
