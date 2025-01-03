package com.example.shayri;

import static com.example.shayri.R.id.list;
import static com.example.shayri.R.id.next;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Random;

public class MainActivity2 extends AppCompatActivity {
    TextView txt;
    ListView shayri;

    String[] m = {"\nना किसी के आभाव में जियो,\n" +
            "ना किसी के प्रभाव में जियो,\n" +
            "ज़िन्दगी आपकी है बस अपने,\n" +
            "मस्त स्वभाव में जियो……….\n" +
            "“सुप्रभात” \uD83C\uDF05\n", "\nसुबह सुबह सूरज का साथ हो \n" +
            "गुनगुनाते परिंदों की आवाज\n" +
            "में हाथ में चाय का कप और यादोंमें कोई खास हो\n" +
            "उस खूबसूरत सुबह की पहली याद आप हो\n" +
            "सुप्रभात\n", "\nनयी नयी सुबह नया नया सवेरा\n" +
            "सुरज की किरणे हवाओं का बसेरा\n" +
            "और मुस्कुराता हुआ आपका ये चहेरा\n" +
            "मुबारक हो आपको ये हँसी सवेरा\n", "\nरात की चांदनी से मांगता हु सवेरा\n" +
            "फूलों की चमक से मांगता हु रंग गहरा\n" +
            "दौलत शोहरत से ताल्लुख़ नहीं है मेरा\n" +
            "मुझे चाहिए हर सुबह में बस साथ तेरा\n", "\nसुबह का मौसम जैसे जन्नत का एहसास हो\n" +
            "आंखों में नींद और चाय की तलाश हो\n" +
            "जागने की मजबूरी थोड़ा और सोने की आस\n" +
            "पर आपका दिन शुभ हो हमारी सुप्रभात के साथ\n"};

    String[] e = {"\nवो भी क्या शाम थी,\n" +
            "जब पंछी घोसलों में आते थे,\n" +
            "और अब ये शाम है,\n" +
            "जब टीवी सीरियल घरों में आते हैं !\n", "\nतुम्हारी शाम की चाय में चीनी मिलाने की,\n" +
            "कोई जरूरत नहीं है,\n" +
            "क्योंकि तुमारी बातों में ही मिठास है !\n", "\nबागों में फूल खिलते रहेंगे रात में दीप जलते रहेंगे,\n" +
            "दुआ है भगवान से की आप खुश रहो,\n" +
            "बाकी तो हम आपको मिस करते रहेंगे !\n", "\nहुई शाम उनका ख्याल आ गया,\n" +
            "वो ही जिन्दगी का सवाल आ गया,\n" +
            "आप मुझे मिलेंगे या नहीं,\n" +
            "ये सोच के दिल में भूचाल आ गया !\n", "\nदिन है उदास रंगीन बना दो तुम आकर ये शाम,\n" +
            "तेरे से दुर हूँ तो क्या हुआ,\n" +
            "तेरी यादे भी आकर रंगीन बना देती है शाम !\n"};

    String[] ng = {"\nरात तो वक़्त की पाबंद है ढल जाएगी\n" +
            "देखना ये है चरागों का सफर कितना है।\n", "\nमिलने आयेंगे हम आपसे ख्वाबों में,\n" +
            "ये ज़रा रौशनी के दिये बुझा दीजिए,\n" +
            "अब नही होता इंतज़ार आपसे मुलाकात का,\n" +
            "ज़रा अपनी आंखों से परदे तो गिरा दीजिए।\n", "\nऐसा लगता है कुछ होने जा रहा है\n" +
            "कोई मीठे सपनो में खोने जा रहा है\n" +
            "धीमी कर दे अपनी रोशनी ऐ चाँद\n" +
            "मेरा कोई अपना सोने जा रहा है.\n", "\nरात को चुपके से आती है एक परी\n" +
            "कुछ खुशियों के सपने लाती है एक परी\n" +
            "कहती है सपनो के आगोश में खो जाओ\n" +
            "भूल के सारे गम चुपके से सो जाओ।\n", "\nचांद के लिए सितारे अनेक है..\n" +
            "पर सितारों के लिए चांद एक है।\n" +
            "आपके लिए तो हजारों होंगे परन्तु\n" +
            "हमारे लिए तो आप हजारों में एक हैं।\n"};

    String[] cl = {"\nचलो आज फिर थोडा मुस्कुराया जाये,\n" +
            "बिना माचिस के कुछ लोगो को जलाया जाये.....!!!\n", "\nबस इतनी सी बात पर हमारा परिचय तमाम होता है,\n" +
            "हम उस रास्ते नही जाते जो रास्ता आम होता है…........!!!\n", "\nये मत समझ कि तेरे काबिल नहीं हैं हम,\n" +
            "तड़प रहे हैं वो जिसे हासिल नहीं हैं हम.....!!!\n", "\nसर झुकाने की आदत नहीं है,\n" +
            "आँसू बहाने की आदत नहीं है,\n" +
            "हम खो गए तो पछताओगे बहुत,\n" +
            "क्युकी हमारी लौट के आने की आदत नहीं है......!!!\n", "\nराज तो हमारा हर जगह पे है,\n" +
            "पसंद करने वालों के \"दिल\" में और,\n" +
            "नापसंद करने वालों के \"दिमाग\" में.......!!!\n"};
    String[] sd = {"\nजो कहते हैं प्यार अगर सच्चा होता तो कभी बिछडते नहीं,\n" +
            "उन्हें बता देना प्यार सच्चा था मगर बिछड़ना मज़बूरी थी…!\n", "\nमै अगर ख़ाक हो जाऊं तुझे याद करते करते,\n" +
            "तो ये याद रखना याद बोहोत आएगी मेरी…!\n", "\nइस से ज्यादा मै तुम्हे और क्या कह सकता हु,\n" +
            "घर मेरा जल गया तो फिर ये उदासी कैसी…!\n", "\nयु न खिल खिल के हँसा कर उदास लोगो पे ऐ दोस्त,\n" +
            "तेरे चेहरे की रंगत भी किसी दिन मोहब्बत उड़ा देगी…!\n", "\nवफ़ा की बात किया करते थे जो रात दिन हमसे,\n" +
            "खफा हुए तो मानाने भी नहीं आये हैं…!\n"};

    String[] atd = {"\nहम बुरे है इसमें कोई शक नहीं\n" +
            "पर कोई बुराई करे\n" +
            "इतना किसी को हक़ नहीं\n", "\nमेरे भाई शेर को जगाना \n" +
            "और हमे सुलाना मित्र \n" +
            "किसी के बस की बात नही है \n" +
            "और हम वहाँ खड़े होते हैं \n" +
            "जहाँ पर मैटर बड़े होते हैं \n", "\nजिन्हे हम जहर लगते हैं\n" +
            "वो कौनसा हमे शहद लगते हैं\n", "\nज़रा सा वक़्त क्या बदला नज़र मिलाने लगे\n" +
            "जिनकी औक़ात नहीं थी वह भी सर उठाने लगे\n", "\nअपना कोई क्या बिगाड़ सकता है\n" +
            "अपनी तो क़िस्मत उसने लिखी है\n" +
            "जिसका कोई कुछ नहीं बिगाड़ सकता\n"};

    String[] lv = {"\n❤\uFE0Fवो प्यार जो हकीकत में प्यार होता है\n" +
            "जिन्दगी में सिर्फ एक बार होता है\n" +
            "निगाहों के मिलते मिलते दिल मिल जाये\n" +
            "ऐसा इतेफाक सिर्फ एक बार होता है\n❤\uFE0F", "\nनिखर जाती हैं मेरी मोहब्बत\n" +
            "तेरी आजमाइश के बाद\n" +
            "सवरता जा रहा है ये इश्क\n" +
            "तेरी हर फरमाइश के बाद\n", "\nआँखो की चमक और पलकों की शान हो तुम\n" +
            "चेहरे की हँसी और मुस्कान हो तुम\n" +
            "इस दिल की धड़कन और मेरी गुमान हो तुम\n" +
            "कैसे बताऊँ मेरी जान हो तुम\n", "\nरख लो छुपा के किसी\n" +
            "दिल के कोने में यही\n" +
            "तो इश्क है मेरा एक\n" +
            "दूसरे के बाहो में होने में\n", "\nअगर हो इजाजत तेरी वफा\n" +
            "में हम पूरी महफिल सजा देंगे\n" +
            "रूठ ले तू जितना रूठना है मुझसे\n" +
            "फिर भी हम तुझे मना लेंगे\n"};

    String[] fn = {"\nजब हम उनके घर गए…\n" +
            "कहने दिल से दिल लगा लो,\n" +
            "उनकी माँ ने खोला दरवाजा,\n" +
            "हम घबरा कर बोले..\n" +
            "आंटी बच्चों को पोलियो ड्राप पिलवा लो।\n", "\nदोस्तों हम उन्हें मुड़ मुड़कर देखते रहे,\n" +
            "और वो हमें मुड़-मुड़कर देखते रहे\n" +
            "वो हमें, हम उन्हें…\n" +
            "वो हमें, हम उन्हें…\n" +
            "क्योंकि परीक्षा में\n" +
            "न उन्हें कुछ आता था न हमे।\n", "\nहो गए,\n" +
            "हुस्न के तेवर नुकीले हो गए,\n" +
            "हम इज़हार करने में रह गए,\n" +
            "उधर उनके हाथ पीले हो गए।\n", "\nतुम्हारी याद दिल से जाने नहीं देंगे ,\n" +
            "तुम्हारे जैसा दोस्त खोने भी नहीं देंगे।\n" +
            "रोज़ शराफत से SMS किया करो ,\n" +
            "एक कान के नीचे देंगे और रोने भी नहीं देंगे।\n", "\nज़ोर से चली हवा और उड़ गए आप,\n" +
            "रुक गयी हवा और गिर गए आप।\n"};

    String[] l = {"\nज़िंदगी इक हादसा है और कैसा हादसा\n" +
            "मौत से भी ख़त्म जिस का सिलसिला होता नहीं\n", "\nज़िंदगी कहते हैं जिस को चार दिन की बात है\n" +
            "बस हमेशा रहने वाली इक ख़ुदा की ज़ात है\n", "\nधूप में निकलो घटाओं में नहा कर देखो\n" +
            "ज़िंदगी क्या है किताबों को हटा कर देखो\n", "\nजो पढ़ा है उसे जीना ही नहीं है मुमकिन\n" +
            "ज़िंदगी को मैं किताबों से अलग रखता हूँ\n", "\nलगता था जिंदगी को बदलने में वक्त लगेगा,\n" +
            "पर क्या पता था बदलता हुआ वक्त, जिंदगी बदल देगा।\n"};

    String[] btd = {"\nतुम्हारी राह का हर पत्थर फूल बन जाए,\n" +
            "खुशियों के बादल झूम के बरस जाए,\n" +
            "जो मांगा है तुमने रब से वो तुमको मिल जाए,\n" +
            "जन्मदिन की शुभकामनाएं\n", "\nआज ही के दिन…\n" +
            "एक चांद उतर के आया था…\n" +
            "ऊपर वाले ने बड़ी फुर्सत से\n" +
            "आज एक नूर बनाया था।\n" +
            "जन्मदिन मुबारक हो\n", "\nआपके जीवन में यह हसीन पल,\n" +
            "बार बार आयें और हम हर बार ऐसे ही,\n" +
            "आपका जन्मदिन मनाये !\n", "\nभगवान करे आप Enjoyment से\n" +
            "भरपूर और Smile से अपना आज\n" +
            "का दिन Celebrate करो, और\n" +
            "बहुत सारी Surprises पाओ,\n" +
            "Happy Birthday to You!!\n", "\nतमाम उम्र तुम्हे ज़िन्दगी का प्यार मिले,\n" +
            "खुदा करे ये ख़ुशी तुमको बार बार मिले,\n" +
            "तुम्हे जन्मदिन की ढेर सारी शुभकामनाएं।\n"};

    String[] mt = {"\nकाम करो ऐसा कि एक पहचान बन जाए,\n" +
            "हर कदम ऐसा चलो कि निशान बन जाए,\n" +
            "यहां जिंदगी तो हर कोई काट लेता है,\n" +
            "जिंदगी जियो इस कदर कि मिसाल बन जाए।\n", "\nलक्ष्य को पाने के लिए यदि हम तन, मन और धन लगा देते हैं,\n" +
            "सच कहता हूं दोस्तों, कुंडली के सितारे भी अपनी जगह बदल देते हैं।\n", "\nहवाओं के भरोसे मत उड़,\n" +
            "चट्टाने तूफानों का भी रुख मोड़ देती हैं,\n" +
            "अपने पंखों पर भरोसा रख,\n" +
            "हवाओं के भरोसे तो पतंगे उड़ा करती हैं।\n", "\nबेहतर से बेहतर कि तलाश करो,\n" +
            "मिल जाए नदी तो समंदर कि तलाश करो,\n" +
            "टूट जाता है शीशा पत्थर कि चोट से,\n" +
            "टूट जाए पत्थर ऐसा शीशा तलाश करो।\n", "\nवक्त से लड़कर जो नसीब बदल दे,\n" +
            "इंसान वही जो अपनी तकदीर बदल दे,\n" +
            "कल क्या होगा कभी मत सोचो,\n" +
            "क्या पता कल वक्त खुद अपनी तस्वीर बदल ले।\n"};

    String[] an = {"\nसात फेरों से बंधा यह प्यार का बंधन,\n" +
            "जीवन भर यूं ही बंधा रहे।\n" +
            "किसी की नजर ना लगे आपके प्यार को,\n" +
            "और आप यूं ही हर साल सालगिरह मनाते रहे।\n", "\n जीवन की बगियां हरी रहें\n" +
            "जीवन में खुशियां भरी रहें,\n" +
            "यह जोड़ी यूं ही बनी रहें\n" +
            "सौ सालों तक यूं ही सजी रहें।\n", "\nआपकी जोड़ी रबने\n" +
            "है कुछ ऐसी बनाई,\n" +
            "साथ रहे आप दोनों हमेशा\n" +
            "हर दिल दे रहा बधाई\n", "\nएक दूसरे के बिना हो आप अधूरे,\n" +
            "एक दूसरे के संग रहते हो पूरे,\n" +
            "हमेशा बना रहे आपका साथ,\n" +
            "बस यही है मेरे रब जी से मांग।\n", "\nएक-दूजे पर भरोसे से बना ये\n" +
            "प्यारा रिश्ता उम्रभर का\n" +
            "सलामत रहे हमेशा\n"};
    String[] blank = {""};
    int draw[] = {R.drawable.fn, R.drawable.lv, R.drawable.night, R.drawable.np, R.drawable.cl, R.drawable.np, R.drawable.even, R.drawable.lv, R.drawable.even, R.drawable.night, R.drawable.cl};


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        txt = findViewById(R.id.textview);
        shayri = findViewById(R.id.shayri);


        String s = getIntent().getStringExtra("new");
        txt.setText(s);

        Log.d("=========", "onCreate: " + s);
        ArrayAdapter ad;

        if (s.equals("Morning")) {
            blank = m;
        } else if (s.equals("Evening")) {
            blank = e;
        } else if (s.equals("Night")) {
            blank = ng;
        } else if (s.equals("Cool")) {
            blank = cl;
        } else if (s.equals("Sad")) {
            blank = sd;
        } else if (s.equals("Attitude")) {
            blank = atd;
        } else if (s.equals("Love")) {
            blank = lv;
        } else if (s.equals("Funny")) {
            blank = fn;
        } else if (s.equals("Life")) {
            blank = l;
        } else if (s.equals("Birthday")) {
            blank = btd;
        } else if (s.equals("Motivation")) {
            blank = mt;
        } else if (s.equals("Anniversary")) {
            blank = an;
        }
        second as = new second(blank, MainActivity2.this, draw);
        shayri.setAdapter(as);

        shayri.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Log.e("+++", "onItemClick: " + position);
                String a = blank[position];
                startActivity(new Intent(MainActivity2.this, MainActivity3.class).putExtra("shayri", blank[position]).putExtra("array", blank).putExtra("Int", position));
            }
        });

    }
}