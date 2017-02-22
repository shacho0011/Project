package com.example.database;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import com.example.database.TableModel.*;

public class DatabaseGetOperations extends SQLiteOpenHelper{
	
	public static String dataBaseTableName;
	public static final int data_base_version = 1;
	
	public static final String[] ALL_KEY = new String[]{FacultyMemberTableInfo.id, FacultyMemberTableInfo.name, FacultyMemberTableInfo.designation, FacultyMemberTableInfo.cellNumber, FacultyMemberTableInfo.email};

	public DatabaseGetOperations(Context context, String tableName) {
		super(context, "AUSTDatabase", null, data_base_version);
		dataBaseTableName = tableName;
		Log.i("log:", "DataBase Created");
	}
	
	@Override
	public void onCreate(SQLiteDatabase sqldb) {
		// TODO Auto-generated method stub
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		// TODO Auto-generated method stub
	}
	
	public Cursor getAllData(DatabaseGetOperations dbop){
		SQLiteDatabase sql = dbop.getReadableDatabase();
		String[] coloumns = {FacultyMemberTableInfo.id, FacultyMemberTableInfo.name, FacultyMemberTableInfo.designation, FacultyMemberTableInfo.cellNumber, FacultyMemberTableInfo.email};
		Cursor cursor = sql.query(dataBaseTableName, coloumns, null, null, null, null, null);
		return cursor;
	}
	
	public Cursor getSelectionData(DatabaseGetOperations dbop, String faculty_member_name){
		SQLiteDatabase sql = dbop.getReadableDatabase();
		String selection = FacultyMemberTableInfo.name + " LIKE ?";
		String coloumns[] = {FacultyMemberTableInfo.id,FacultyMemberTableInfo.name + " ," +FacultyMemberTableInfo.designation + " ," + FacultyMemberTableInfo.cellNumber + " ," + FacultyMemberTableInfo.email};
		String args[] = {faculty_member_name};
		Cursor cursor = sql.query(dataBaseTableName, coloumns, selection, args, null, null, null);
		return cursor;
	}
	
	public Cursor getAUSTDescriptionData(DatabaseGetOperations dbop){
		SQLiteDatabase sql = dbop.getReadableDatabase();
		String[] coloumns = {AboutAUSTTableInfo.aboutAust+" ,"+AboutAUSTTableInfo.recognization+" ,"+AboutAUSTTableInfo.ranking+" ,"+AboutAUSTTableInfo.international+" ,"+AboutAUSTTableInfo.research+" ,"+AboutAUSTTableInfo.publication+" ,"+AboutAUSTTableInfo.examAndGradingSystem+" ,"+AboutAUSTTableInfo.tutionsAndFees+" ,"+AboutAUSTTableInfo.classes+" ,"+AboutAUSTTableInfo.lab+" ,"+AboutAUSTTableInfo.library};
		Cursor cursor = sql.query(dataBaseTableName, coloumns, null, null, null, null, null);
		return cursor;
	}
	
	public Cursor getDepartmentDescriptionData(DatabaseGetOperations dbop){
		SQLiteDatabase sql = dbop.getReadableDatabase();
		String[] coloumns = {DepartmentDetailsTableInfo.architecture+" ,"+DepartmentDetailsTableInfo.cse+" ,"+DepartmentDetailsTableInfo.eee+" ,"+DepartmentDetailsTableInfo.mpe+" ,"+DepartmentDetailsTableInfo.civil+" ,"+DepartmentDetailsTableInfo.textile+" ,"+DepartmentDetailsTableInfo.bba+" ,"+DepartmentDetailsTableInfo.artsAndScience};
		Cursor cursor = sql.query(dataBaseTableName, coloumns, null, null, null, null, null);
		return cursor;
	}

	public Cursor mySelectedRow(DatabaseGetOperations dbop, long id) {
		SQLiteDatabase sql = dbop.getReadableDatabase();
		String from = FacultyMemberTableInfo.id +"=" + id;
		String[] coloumns = {FacultyMemberTableInfo.id, FacultyMemberTableInfo.name, FacultyMemberTableInfo.designation, FacultyMemberTableInfo.cellNumber, FacultyMemberTableInfo.email};
		Cursor myCursor = sql.query(dataBaseTableName, coloumns, from, null, null, null, null, null);
		if(myCursor != null){
			myCursor.moveToFirst();
		}
		return myCursor;
	}
	
}
