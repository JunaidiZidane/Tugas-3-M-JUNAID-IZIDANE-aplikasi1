package com.example.jmapps;

import android.app.ListActivity;
import android.app.SearchManager;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class RsEkahospital extends ListActivity {
    protected void onCreate (Bundle icicle){
        super.onCreate(icicle);
        String[] listAct = new String[]{
                "Costumer Service", "SMS Service", "Driving Direction", "Website / Home Page", "Info Google", "Exit"
        };

        this.setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,listAct));
    }

    protected void onListItemClick (ListView a, View b, int position, long id){
        super.onListItemClick(a, b, position, id);
        Object o = this.getListAdapter().getItem(position);
        String pilihan = o.toString();
        display(pilihan);
    }

    private void display(String pilihan) {
        try {
            Intent x = null;
            switch (pilihan) {
                case "Costumer Service" :
                    String notelp ="tel:0853-87531584";
                    x = new Intent(Intent.ACTION_DIAL, Uri.parse(notelp));
                    break;
                case "SMS Service" :
                    String smsText = "M. Junaidi Zidane";
                    x = new Intent(Intent.ACTION_VIEW, Uri.parse(smsText));
                    x.setData(Uri.parse("sms:085387531584"));
                    x.putExtra("sms_body", smsText);
                    break;
                case "Driving Direction":
                    String addresshospital = "https://maps.app.goo.gl/6KuY1MG7x718HWvd7";
                    x = new Intent(Intent.ACTION_VIEW, Uri.parse(addresshospital));
                    break;
                case "Website / Home Page":
                    String website ="http://www.ekahospital.com/id";
                    x = new Intent(Intent.ACTION_VIEW, Uri.parse(website));
                    break;
                case "Info Google":
                    x = new Intent(Intent.ACTION_WEB_SEARCH);
                    x.putExtra(SearchManager.QUERY, "Rumah Sakit Eka Hospital");
                    break;
            }
            startActivity(x);
        } catch (Exception y) {
            y.printStackTrace();
        }
    }
}
