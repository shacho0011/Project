package com.example.emergencyhelp;

import com.example.emergencyhelp.DataHelper.ContactTableInfo;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class GetOperations extends SQLiteOpenHelper{
	
	String TableName;

	public GetOperations(Context context, String tablename) {
		super(context, "EmergencyServiceDatabase", null, (int) 1.0);
		// TODO Auto-generated constructor stub
		TableName = tablename;
		Log.i("log:", "DataBase Created");
	}

	@Override
	public void onCreate(SQLiteDatabase db) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		// TODO Auto-generated method stub
		
	}
	
	
	public void InsertUserContact(GetOperations dbop, String name, String cell_number){
		SQLiteDatabase sql = dbop.getWritableDatabase();
		ContentValues contentvalues = new ContentValues();
		contentvalues.put(ContactTableInfo.id, "INTEGER PRIMARY KEY AUTOINCREMENT");
		contentvalues.put(ContactTableInfo.name, name);
		contentvalues.put(ContactTableInfo.cellNumber, cell_number);
		sql.insert(ContactTableInfo.databaseTableName, null, contentvalues);
		sql.close();
		Log.i("log:", "Insert Operation");
	}
	
	public Cursor GetAllUserContact(GetOperations dbop){
		SQLiteDatabase sql = dbop.getReadableDatabase();
		String[] coloumns = {ContactTableInfo.name, ContactTableInfo.cellNumber};
		Cursor cursor = sql.query(TableName, coloumns, null, null, null, null, null);
		return cursor;
	}
	
	
	
	public Cursor getAllData(GetOperations dbop){
		SQLiteDatabase sql = dbop.getReadableDatabase();
		String[] coloumns = {"name", "contact"};
		Cursor cursor = sql.query(TableName, coloumns, null, null, null, null, null);
		return cursor;
	}
	
	public Cursor getSelectionData(GetOperations dbop, String name_contact){
		SQLiteDatabase sql = dbop.getReadableDatabase();
		String selection = "name" + " LIKE ?";
		String[] coloumns = {"name", "contact"};
		String args[] = {name_contact};
		Cursor cursor = sql.query(TableName, coloumns, selection, args, null, null, null);
		return cursor;
	}
	
}
