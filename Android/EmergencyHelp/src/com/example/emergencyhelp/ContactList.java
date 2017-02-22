package com.example.emergencyhelp;



import java.util.Vector;


import android.os.Bundle;
import android.app.Activity;
import android.app.ListActivity;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class ContactList extends ListActivity  implements OnItemClickListener{
	 String CONTACTS[];
	    int IDS[];
	    EditText name;
	    DataHelper dh;
	    ImageView add;
	    private ProductAdapter mAdapter;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
      setContentView(R.layout.activity_contact_list);
        
        name=(EditText)findViewById(R.id.editText1);         	
        Vector rows=new Vector();
        dh=new DataHelper(this);
        rows=dh.selectAllUserContact();
        dh.close();
        int size=rows.size();
        IDS=new int[size];
		CONTACTS=new String[size];
    	for(int i=0;i<rows.size();i++){
			Vector eachRecord=(Vector)rows.elementAt(i);
			String nameData=(String)eachRecord.elementAt(1);
			int idData=(Integer)eachRecord.elementAt(0);
			IDS[i]=idData;
			CONTACTS[i]=nameData;
		}
    	mAdapter = new ProductAdapter(CONTACTS);
    	getListView().setTextFilterEnabled(true); 
    	getListView().setOnItemClickListener(this);
    	setListAdapter(mAdapter);
    	
    	name.setOnKeyListener(new View.OnKeyListener() {
			
			@Override
			public boolean onKey(View v, int keyCode, KeyEvent event) {
			//	public boolean onKey(View arg0, int arg1, KeyEvent arg2) {
					// TODO Auto-generated method stub
					EditText et=(EditText)v;
					String nameString=et.getText().toString();
					Vector rows=new Vector();
					  dh=new DataHelper(ContactList.this);
					int size=0;
					if(nameString==null||nameString.equals("")){
						rows=dh.selectAll();				
						
					}
					else{	
						rows=dh.selectWithName(nameString);			
							
					}
					dh.close();
					size=rows.size();
					IDS=new int[size];
					CONTACTS=new String[size];
					for(int i=0;i<rows.size();i++){
						Vector eachRecord=(Vector)rows.elementAt(i);
						String nameData=(String)eachRecord.elementAt(1);
						int idData=(Integer)eachRecord.elementAt(0);
						IDS[i]=idData;
						CONTACTS[i]=nameData;
						
					}
					mAdapter = new ProductAdapter(CONTACTS);
					getListView().setTextFilterEnabled(true); 
					setListAdapter(mAdapter);
					return false;
			
			}
		});
    }

    public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
		
		int id=IDS[arg2];
		
	      Intent i=new Intent(this,ContactView.class);
	      i.putExtra("id",id);
	      startActivity(i);
		
	}
    
    private class ProductAdapter extends BaseAdapter {

        private String[] mData;

        public ProductAdapter(String[] data) {
            mData = data;
        }

        public void changeData(String[] data) {
            mData = data;
            notifyDataSetChanged();
        }

        @Override
        public int getCount() {
            return mData.length;
        }

        @Override
        public String getItem(int position) {
            return mData[position];
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {

            if (convertView == null) {
  //             convertView = getLayoutInflater().inflate(R.layout.text_item, parent, false);
            }

            ((TextView) convertView).setText(getItem(position));

            return convertView;
        }
    }


}
