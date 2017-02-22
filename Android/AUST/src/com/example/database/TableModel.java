package com.example.database;

import android.provider.BaseColumns;

public class TableModel {
	
	public TableModel(){
		
	}
	
	
	
	public static abstract class AboutAUSTTableInfo implements BaseColumns{
		public static final String  aboutAust = "AboutAust";
		public static final String  recognization = "Recognization";
		public static final String  ranking = "Ranking";
		public static final String  international = "International";
		public static final String  research = "Research";
		public static final String  publication = "Publication";
		public static final String  examAndGradingSystem = "ExamAndGradingSystem";
		public static final String  tutionsAndFees = "TutionsAndFees";
		public static final String  classes = "Classes";
		public static final String  lab = "Lab";
		public static final String  library = "Library";
		public static final String databaseName = "AUSTDatabase";
	}
	
	public static abstract class DepartmentDetailsTableInfo implements BaseColumns{
		public static final String  architecture = "Architecture";
		public static final String  cse = "CSE";
		public static final String  eee = "EEE";
		public static final String  mpe = "MPE";
		public static final String  civil = "Civil";
		public static final String  textile = "Textile";
		public static final String  bba = "BBA";
		public static final String  artsAndScience = "ArtsAndScience";
		public static final String databaseName = "AUSTDatabase";
	}
	
	public static abstract class FacultyMemberTableInfo implements BaseColumns{
		public static final String id = "_id";
		public static final String name = "name";
		public static final String designation = "designation";
		public static final String cellNumber = "number";
		public static final String email = "email";
		public static final String databaseName = "AUSTDatabase";
	}
	
	public static abstract class FacultyMemberTableInfo_INT implements BaseColumns{
		public static final int ID = 0;
		public static final int NAME = 1;
		public static final int DESIGNATION = 2;
		public static final int CELL_NUMBER = 3;
		public static final int EMAIL = 4;
	}
	
	
}
