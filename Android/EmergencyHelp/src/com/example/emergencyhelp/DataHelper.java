package com.example.emergencyhelp;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteStatement;
import android.provider.BaseColumns;
import android.util.Log;
import java.util.Vector;

public class DataHelper {

   private static final String DATABASE_NAME = "CONTACT1";
   private static final int DATABASE_VERSION = 1;
   private static final String TABLE_NAME = "FRIEND";
   private Context context;
   private SQLiteDatabase db;
   private SQLiteStatement insertStmt;
   
   private static final String INSERT = "insert into " 
      + TABLE_NAME + "(id,name,number) values (?,?,?)";
 

   public DataHelper(Context context) {
      this.context = context;
      OpenHelper openHelper = new OpenHelper(this.context);
      this.db = openHelper.getWritableDatabase();
      this.insertStmt = this.db.compileStatement(INSERT);
     
   }
   
   public static abstract class ContactTableInfo implements BaseColumns{
	   public static final String id = "_id";
       public static final String name = "contact_name";
       public static final String cellNumber = "cell_number";
       public static final String databaseTableName = "UserContact";
   }

   public long insert(String name,String number) {
    
      this.insertStmt.bindString(2,name);
      this.insertStmt.bindString(3,number);
      return this.insertStmt.executeInsert();
   }

   public void update(String name,String number,int id) {
	   ContentValues updateContact = new ContentValues();
	   updateContact.put("name",name);
	   updateContact.put("number",number);
	   db.update(TABLE_NAME,updateContact,"id=?", new String[] {Integer.toString(id)});      
	   }
 
   
   public void deleteAll() {
	   
      this.db.delete(TABLE_NAME, null, null);
   }


   public void delete(int id) {
	      this.db.delete(TABLE_NAME,"id=?", new String [] {String.valueOf(id)});
	   }
   
   public void close() 
   {
      db.close();
   }
 
   
   @SuppressWarnings("rawtypes")
public Vector getRecord(int id) {
	     Vector list = new Vector();	     
	      Cursor cursor = this.db.query(TABLE_NAME, new String[] {"name","number"}, 
	        "id=?", new String [] {String.valueOf(id)}, null, null, null);
	      if (cursor.moveToFirst()) {	    
	             list.add(id); 
	            list.add(cursor.getString(0)); 
	            list.add(cursor.getString(1));
	      }
	   
	      if (cursor != null && !cursor.isClosed()) {
	         cursor.close();
	      }
	      return list;
	   }
 
   public Vector selectAll() {
     Vector list = new Vector();
     
      Cursor cursor = this.db.query(TABLE_NAME, new String[] { "id","name","number"}, 
        null, null, null, null, "name asc");
      if (cursor.moveToFirst()) {
         do {
        	 Vector listinner=new Vector();
             listinner.add(cursor.getInt(0)); 
            listinner.add(cursor.getString(1)); 
            listinner.add(cursor.getString(2)); 
            list.add(listinner);
         } while (cursor.moveToNext());
      }
      if (cursor != null && !cursor.isClosed()) {
         cursor.close();
      }
      return list;
   }
   
   public Vector selectAllUserContact() {
	     Vector list = new Vector();
	     
	      Cursor cursor = this.db.query(ContactTableInfo.databaseTableName, new String[] { ContactTableInfo.id,ContactTableInfo.name,ContactTableInfo.cellNumber}, 
	        null, null, null, null, "name asc");
	      if (cursor.moveToFirst()) {
	         do {
	        	 Vector listinner=new Vector();
	             listinner.add(cursor.getInt(0)); 
	             listinner.add(cursor.getString(1)); 
	             listinner.add(cursor.getString(2)); 
	             list.add(listinner);
	         } while (cursor.moveToNext());
	      }
	      if (cursor != null && !cursor.isClosed()) {
	         cursor.close();
	      }
	      return list;
	   }

   
   public Vector selectWithName(String name) {
	     Vector list = new Vector();
	     
	      Cursor cursor = this.db.query(TABLE_NAME, new String[] { "id","name","number"}, 
	        "name like '"+name+"%'",null,null, null, "name asc");
	      if (cursor.moveToFirst()) {
	         do {
	        	 Vector listinner=new Vector();
	             listinner.add(cursor.getInt(0)); 
	            listinner.add(cursor.getString(1));
	            listinner.add(cursor.getString(2)); 
	            list.add(listinner);
	         } while (cursor.moveToNext());
	      }
	      if (cursor != null && !cursor.isClosed()) {
	         cursor.close();
	      }
	      return list;
	   }

   private static class OpenHelper extends SQLiteOpenHelper {

      OpenHelper(Context context) {
         super(context, DATABASE_NAME, null, DATABASE_VERSION);
      }

      @Override
      public void onCreate(SQLiteDatabase db) {
         db.execSQL("CREATE TABLE " + TABLE_NAME + "(id INTEGER PRIMARY KEY,name text,number text)");
      }

      @Override
      public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
         Log.w("Example", "Upgrading database, this will drop tables and recreate.");
         db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
         onCreate(db);
      }
      
   }
   
   
}