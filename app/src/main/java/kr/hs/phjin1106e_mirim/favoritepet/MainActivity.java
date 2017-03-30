package kr.hs.phjin1106e_mirim.favoritepet;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener, View.OnClickListener{
    CheckBox checkSelect;
    TextView textQuest;
    RadioGroup rg;
    RadioButton radioDog, radioCat, radioBird;
    Button butOk;
    ImageView imagvPet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        checkSelect=(CheckBox)findViewById(R.id.check_select);
        textQuest=(TextView) findViewById(R.id.text_quest); 
        rg=(RadioGroup) findViewById(R.id.rg);
        radioDog=(RadioButton) findViewById(R.id.radio_dog);
        radioCat=(RadioButton) findViewById(R.id.radio_cat);
        radioBird=(RadioButton) findViewById(R.id.radio_bird);
        butOk=(Button) findViewById(R.id.but_ok);
        imagvPet=(ImageView)findViewById(R.id.imgv_pet);
        checkSelect.setOnCheckedChangeListener(this);
        butOk.setOnClickListener(this);
    }// end onCreate

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        if(checkSelect.isChecked()){
            textQuest.setVisibility(View.VISIBLE);
            rg.setVisibility(View.VISIBLE);
            butOk.setVisibility(View.VISIBLE);
            imagvPet.setVisibility(View.VISIBLE);
        }
        else {
            textQuest.setVisibility(View.INVISIBLE);
            rg.setVisibility(View.INVISIBLE);
            butOk.setVisibility(View.INVISIBLE);
            imagvPet.setVisibility(View.INVISIBLE);
        }
    }

    @Override
    public void onClick(View v) {
        switch (rg.getCheckedRadioButtonId()){
            case R.id.radio_dog :
                imagvPet.setImageResource(R.drawable.dog);
                break;
            case R.id.radio_cat :
                imagvPet.setImageResource(R.drawable.cat);
                break;
            case R.id.radio_bird :
                imagvPet.setImageResource(R.drawable.bird);
                break;
            default:
                Toast.makeText(this, "라디오버튼이 선택이 안되었군요.", Toast.LENGTH_SHORT).show();
        }
    }
}
