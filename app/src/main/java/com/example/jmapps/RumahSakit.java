package com.example.jmapps;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class RumahSakit extends ListActivity {
    protected void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        String[] listRumahSakit = new String[]{
                "Rumah Sakit Eka Hospital", "Rumah Sakit Jiwa Tampan", "Rumah Sakit Awal Bros", "Rumah Sakit Prima", "Rumah Sakit Ibnu Sina"
        };
        this.setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, listRumahSakit));
    }

    protected void onListItemClick(ListView a, View b, int position, long id){
        super.onListItemClick(a, b, position, id);
        Object o = this.getListAdapter().getItem(position);
        String pilihan = o.toString();
        tampilkanpilihan(pilihan);
    }

    private void tampilkanpilihan (String pilihan){
        try {
            Intent x = null;
            if (pilihan.equals("Rumah Sakit Eka Hospital")){
                x = new Intent(this, RsEkahospital.class);
            } else if (pilihan.equals("Rumah Sakit Jiwa Tampan")) {

            }
            startActivity(x);
        }   catch (Exception y) {
            y.printStackTrace();
        }
    }
}
