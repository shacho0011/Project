package com.example.aust;

import com.example.database.TableModel.AboutAUSTTableInfo;
import com.example.database.TableModel.DepartmentDetailsTableInfo;
import com.example.database.TableModel.FacultyMemberTableInfo;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;

public class Main extends Activity{
	Context context = this;
	Button tapToStartB;
	String databaseName;
	String databaseTableName;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setProgressBarVisibility(true);
		new MyTask().execute();
	}
	
	
	public class MyTask extends AsyncTask<Void, String, Void>{
		
		@Override
		protected void onPreExecute() {
			// TODO Auto-generated method stub
			setProgressBarVisibility(true);
			setContentView(R.layout.welcom_screen);
		}

		@Override
		protected Void doInBackground(Void... params) {
			// TODO Auto-generated method stub
			dataIn();
			return null;
		}
		
		@Override
		protected void onPostExecute(Void result) {
			// TODO Auto-generated method stub
			setProgressBarVisibility(false);
			Intent mainIntent = new Intent("com.example.aust.MAINACTIVITY");
			startActivity(mainIntent);
		}
		
	}
	
	public void dataIn(){
		databaseName = "AUSTDatabase";
		
		databaseTableName = "AUSTDescription";
		
		final String  aboutAust = "BACKGROUND"+ "\n"+ "\n"+"The Ahsanullah University of Science and Technology (AUST) was founded by the Dhaka Ahsania Mission in 1995."+ "\n"+"Dhaka Ahsania Mission is a non-profit voluntary organization in Bangladesh. The Mission was established in 1958 by Khan Bahadur Ahsanullah ( Hazrat Khan Bahadur Ahsanullah (R) M.A., M.R.S.A., I.E.S. (1873-1965), was the Assistant Director of Public Instruction for Bengal and Assam Provinces of undivided India (1925-29)), an outstanding educationist and social reformer of undivided India. With his own vision of a better society, characterized by a wealth of moral and spiritual values of the highest humanism that are universally acclaimed through ages and manifested in every sphere of life–social, economic and cultural; and access to education and resources, he established the Mission. His remarkable educational reforms include among others introduction of roll number system in the public examination and creating equal opportunity for education of all groups of people in the society."+ "\n"+"Besides, he has contributed to the society by writing a large number of books covering a wide range of areas from human and social life, history, human development, literature, religion, biography, moral values etc."+ "\n"+"Though initially charity and welfare activities were the major focus of the Mission agenda, it has expanded its arena of activities leaning towards sustainable development strategies with the passage of time since early 1980s."+ "\n"+ "\n"+ "\n"+"VISION & MISSION OF THE UNIVERSITY"+ "\n"+"The Ahsanullah University of Science and Technology will be the premier centre of excellence in science, engineering and technology by creating and transferring knowledge with human touch to the young generations to come to enhance the quality of life in Bangladesh and beyond."+ "\n"+"The mission of the Ahsanullah University of Science and Technology is to develop human resources in the fields of science, engineering and technology to meet the ever changing needs of the society in the perspective of the highly complex and globalized world and to do so it aims at producing quality graduates imbued with the spirit of ethical values and equipped with knowledge and skills appropriate to the fast changing world so that they can face the challenges successfully wherever they are and contribute to social and economic development of the country in their own humble way."+ "\n"+ "\n\n"+"OBJECTIVES OF THE UNIVERSITY"+ "\n"+"The aims and objectives of the University can be summarized as follows: "+ "\n"+"i. To impart need based programs of science, technology, business and social sciences for the students who will attend classes in the University as well as who are unable to attend classes and desire home based study. "+"\n"+"ii. To offer programs covering all important fields and disciplines of science, technology, medical science, business and social sciences including teachers’ training."+ "\n"+"iii. To develop programs examining the modern trends on the need and development of science, technology, business, social sciences and human resource development; observing carefully the employment opportunities and market needs both at home and abroad."+ "\n"+"iv. To organize programs in science, technology, business and social science including teachers’ training for awarding degrees, diplomas and certificate of proficiency at all levels."+ "\n"+"v. To arrange two methods of delivery – a) in-campus education and b) open learning system."+ "\n"+"vi. To go for gradual expansion of departments and programs of learning as per rules and regulations of Private University Act, 1992 and in accordance with the needs of the country and the demand abroad.";
		
		
		final String  recognization = "The Academic programs of the University are recognized by many national and international educational institutions and professional bodies such as: -"+"\n\n"+
         
                    "\t\tUGC   (University Grants Commission , Bangladesh)"+"\n"+
                    "\t\tIAU    (International Association of Universities)."+"\n"+
                    "\t\tAUAP (Association of Universities of Asia and the Pacific)."+"\n"+
                    "\t\tBUET  (Bangladesh University of Engg. & Tech.)"+"\n"+
                    "\t\tIEB    (The Institute of Engineers, Bangladesh),"+"\n"+
                    "\t\tIAB    (Institute of Architects Bangladesh (IAB)"+"\n"+
                    "\t\tITET   (Institute of Textile Engineers & Technologists, Bangladesh)"+"\n\n"+
      
"A number of memorandums of understanding have been signed between this University and"+"\n\n"+
 
                    "\t\t(i)   The University of Wyoming, USA,"+"\n"+
                    "\t\t(ii)  The Drexel University, USA,"+"\n"+
                    "\t\t(iii) The Washington State University, USA"+"\n"+
                    "\t\t(iv) The University of Houston, USA"+"\n"+
                    "\t\t(v)  The Sejong University, Seoul, Korea"+"\n"+
                    "\t\t(vi)  The Erasmus Mundus Mobility with Asia (EMMA)"+"\n"+
                    "\t\t(vii)  The Asian Institute of Technology (AIT), Thailand"+"\n"+
 
 
"so that the students of this university may have the opportunity of graduate and/or under graduate study with appropriate credit transfer."+"\n\n"+
 
"Similar arrangements are under process with Dublin City University, Ireland, University of Bradford and other universities of USA, Australia, UK, Ireland, Canada and South Korea.";
		
		
		final String  ranking = "Ahsanullah University of Science and Technology, Dhaka, ranks:"+"\n\n"+
				"1st in all Private Universities of Bangladesh"+"\n"+	
				"3rd in all Universities of Bangladesh"+"\n"+	
				"77th in the Indian Subcontinent"+"\n"+
				"7084th in the world"+"\n"+	
				"Source : Cybermetrics Lab (January 2008). Regional and Global Ranking of Indian subcontinent universities. CINDOC-CSIC, Madrid, Spain";
		
		
		final String  international = "International students willing to get admission in any Bachelor Degree Programme of this university should apply through their respective Embassies/ high commissions. They do not need to appear at the admission test. But they should apply with all particulars and credentials so that their eligibility may be assessed. However, their admission will be confirmed after payment of requisite fees."+"\n\n"+"\t\t\t\t\t\tIN TAKA"+"\n"+"\tNAME OF PROGRAMS"+"\t\t\t\tAT THE TIME\tSUBSEQUENT"+"\n"+"\t\t\t\tOF ADMISSION\tEACH SEMESTERt\tTOTAL FEE"+"\n"+"ARC 5 years (10 semesters)\t1,04,800.00	80,400.00\t8,28,400.00"+"\n"+"CE 4 years (8 semesters)\t1,04,800.00\t80,400.00\t6,67,600.00"+"\n"+"CSE 4 years (8 semesters)\t1,04,800.00\t80,400.00\t6,67,600.00"+"\n"+"EEE 4 years (8 semesters)\t1,04,800.00\t80,400.00\t6,67,600.00"+"\n"+"TE 4 years (8 semesters)\t1,04,800.00\t80,400.00\t6,67,600.00"+"\n"+"IPE 4 years (8 semesters)\t1,04,800.00\t80,400.00\t6,67,600.00"+"\n"+"ME 4 years (8 semesters)\t1,04,800.00\t80,400.00\t6,67,600.00"+"\n"+"BBA  4 years (8 semesters)\t80,360.00\t64,660.00\t5,32,980.00"+"\n"+"\n"+"* The above fees are without VAT and may be revised from time to time.";
		
		
		final String  research = "AUST promotes  research initiatives of its faculty members, students and other researches. All the departments carry out their own research programs."+"\n\n"+
				 
				"The University has established Research & Project Centers for the Computer Science & Engineering and Electrical and Electronics Engineering departments. Similar centers are going to be established for other departments. Recently, a Project Studio has been inaugurated for the Architecture department to encourage research and project works."+"\n\n"+
				 
				"The University has undertaken schemes for providing excellent research environment. For this purpose the library facilities are being improved significantly.  The University encourages potential researches to publish research outputs through national and international publications and conducting seminars, workshops, etc."+"\n\n"+
				 
				"A number of teachers of the University have already published their research output in different international conference proceedings. A number of seminars and workshops have also been arranged by the researches.";
		
		
		final String  publication = "Welcome to the Publications of AUST as well as of the Members of the Faculty of the University. We invite you to browse our site using the navigation found below.  Thank you for your interest in our publications.\n\n\nTo see Publication List click below...";
		
		
		final String  examAndGradingSystem = "(1)    The performance of a student in a theoretical course of study will be evaluated on the basis of the following criteria :"+"\n"+
	"(i)     Continuous assessment (assessment of class attendance, class performance, quizzes and/or assignments etc.)."+"\n"+
	"(ii)     Semester Final Examination."+"\n"+
	"(iii)   Clearance Examination (for clearance of the courses in which the students failed in the Regular Examination, if any)"+"\n"+
	"(iv)       Carry Over Examination (for clearance of back log of the course(s) of previous semester(s), if any)."+"\n"+
	"(v)         Improvement Examination (for improvement of the grade(s) obtained in the Regular Examinations, if any)"+"\n"+
	 
	"(2)     The continuous assessment and the Semester Final Examination will form Regular Examination while the Clearance Examination, Carry Over Examination and Improvement Examination will provide additional opportunities to the students."+"\n"+
	 

	"(3)     The distribution of marks in the continuous assessment and in the Semester Final/Clearance/Carry Over/Improvement Examination will be as follows:"+"\n"+
	 "(i) Class participation (i.e. class attendance, class performance etc.)..... 10%"+"\n"+
	"(ii) Quizzes and/or assignments.......................................................... 20%"+"\n"+
	"(iii) Semester Final/Clearance/Carry Over/Improvement Examination.... 70%"+"\n"+
	 "Total:...................................................................................100%"+"\n"+
	 
	"(4)     The number of quizzes and/or assignments in a theoretical course of study shall ordinarily be (n + 1), where ‘n’ is the number of credit hours of the course. Evaluation of the performance will be on the basis of the best ‘n’ quizzes and/or assignments."+"\n"+
	 
	"(5)     The performance of a student in a sessional/practical course will be evaluated on the basis of class attendance, class performance, quiz, assignment, report, practical examination, jury viva voce etc. The distribution of marks in the course will be determined by the teachers concerned."+"\n"+
	 
	"(6)     The letter grades and the corresponding grade-points will be awarded for the theoretical courses in the Regular Examination and for the practical/sessional courses in accordance with the provision shown below:"+"\n"+
	"Numerical Grade	Letter Grade\tGrade Point"+"\n"+
	"80% or above\tA+\t4.00"+"\n"+
	"75% to less than 80%\tA\t3.75"+"\n"+
	"70% to less than 75%\tA-\t3.50"+"\n"+
	"65% to less than 70%\tB+\t3.25"+"\n"+
	"60% to less than 65%\tB\t3.00"+"\n"+
	"55% to less than 60%\tB-\t2.75"+"\n"+
	"50% to less than 55%\tC+\t2.50"+"\n"+
	"45% to less than 50%\tC\t2.25"+"\n"+
	"40% to less than 45%\tD\t2.00"+"\n"+
	"Less than 40%\tF\t0.00"+"\n"+


	"(7)     Apart from the letter grades listed above, the students may be awarded some other letter grades for their different status in a course. The letter grade  ‘W’ will be given for the withheld result of a student in a course. Subject to the recommendation of the concerned Head of the Department and the approval of the Vice Chancellor of the University, a student may be awarded the letter grade ‘E’ for exemption or waiver of a course. The letter grade ‘P’ will be awarded for the course(s) the students passed in previous semester(s)."+"\n"+
	"Course Status	Letter Grade"+"\n"+
	"Withheld\tW"+"\n"+
	"Exempted\tE"+"\n"+
	"Passed\tP"+"\n"+
	         "Grade Point Average (GPA) of a student will be computed without the grades mentioned above."+"\n"+
	 
	"(8)     Every course has a certain number of credit hour which describes its weightage. The credit hour of a theoretical course and the credit hour of a practical/sessional course refer to contact hour per week and half of the contact hour per week of the courses respectively. The number of credit hours a student has completed satisfactorily and the weighted average of the grade points he/she has maintained measure the performance of the student. Calculation of Grade Point Average (GPA) can be explained as follows:"+"\n"+
	 	"Grade Point Average (GPA)\t=	"+"\n"+ 
	 	 
	"=\tSummation of (Credit hour in a course x Grade point earned in that  course)"+"\n"+
		 
		"Total number of credit hours completed"+"\n"+
	          "Suppose, a student has completed five courses in a semester and obtained the following grades:"+"\n"+
	"Course\tCredit Hour\tGrade\tGrade Point"+"\n"+
	"Course 1\t3\tA+\t4.00"+"\n"+
	"Course 2\t3\tB\t3.00"+"\n"+
	"Course 3\t3\tA\t3.75"+"\n"+
	"Course 4\t2\tB+\t3.25"+"\n"+
	"Course 5\t1\tA-\t3.50"+"\n"+
	"Then his/her Grade Point Average (GPA) for the semester will be computed as follows:"+"\n"+
	 	 	 	 
	 	"GPA\t="+"\n"+	 
	 	 	 	 
	 	 	"=\t3.52"+"\n"+
	           
	"(9)     The total marks assigned to a theoretical/practical course of study is 100 and the duration of Semester Final/Improvement/Clearance/Carry Over Examination of a theoretical course is 3 hours. The total marks assigned to continuous assessment (obtained on the basis of class participation, quizzes and/or assignments etc.) and the Semester Final/Clearance/Carry Over/Improvement Examination are 30 & 70 respectively."+"\n"+
	"(10)   A student who remains absent in the Semester Final/ Clearance/ Improvement/ Carry Over Examination of a course of study will be given the grade ‘F’ for the course. The total mark and the corresponding grade of the students who are absent in the examinations of a course will be entered in the mark sheet of the course considering the mark of the examinations as zero."+"\n"+
	"(11) The Clearance Examination of a course will be held only for the students obtaining the grade ‘F’ (failed in the course) in the Regular Examination of the course. The Clearance/Carry Over/Improvement Examination of a semester will be held over a period of 1 to 2 weeks at the end of the Semester Final Examination of the semester."+"\n"+
	"(12) The Clearance Examination of a course will carry 70% of the total marks assigned to the course, the rest of the mark (30%) will be entered from the record of the continuous assessment secured earlier by the student when he/she attended the classes. Whatever is the total mark obtained by the student, the highest attainable grade with the Clearance Examination is ‘C’."+"\n"+
	"So the grading scale for the students appearing in the Clearance Examination will be as follows:"+"\n"+
	"Numerical Grade\tLetter Grade\tGrade Point"+"\n"+
	"45% or above\tC\t2.25"+"\n"+
	"40% to less than 45%\tD\t2.00"+"\n"+
	"Less than 40%\tF\t0.00"+"\n"+
	"(13)   A student obtaining the grade ‘F’ in a maximum of 2 (two) theoretical courses of a semester will also be promoted to the next higher class with carry over in the failed theoretical course(s) if the cumulative number of the courses including the number of carry over courses of the previous semester(s) of the student concerned does not exceed the highest allowable limit of 4 (four). The students can clear the back log of the carry over course(s) in the Carry Over Examinations of the relevant semester. The examination & grading system of the Carry Over Examinations will be in the same manner as the Clearance Examination."+"\n"+
	"(14)   If the number of failed courses of a student in a semester exceeds the highest limit of 2 or if the cumulative number of failed courses including the number of carry over courses of the student exceeds the highest limit of 4, the student will not be promoted to the immediate higher class. In this case, the student must re-register for the course(s) in which he/she failed in the semester and bring down the number of failed courses including the carry over course(s) within the allowable limits of 4 & 2 to be promoted to the next higher semester. "+"\n"+
	"(15)   If the cumulative number of failed courses including the number of carry over courses of a student enrolled in 4th year 2nd semester of 4-year bachelor degree program or in 5th year 2nd semester of 5-year bachelor degree program exceeds the highest limit of 4 (four), the student will have to re-register for the courses of the semester in which he/she failed. If the number of failed courses of the last semester of the programs exceeds the highest limit of 2 (two), the student will have to re-register for the courses of the semester in which he/she failed. A student can appear at the Carry Over Examination of the courses in the relevant subsequent semester if the number of failed courses does not exceed the limit of 4 & 2 as specified above."+"\n"+ 
	"(16)   For appearing in the Carry Over Examinations, the students are required to apply for enrollment within due time in the prescribed application form available in the office of the Controller of Examinations of the University."+"\n"+ 
	"(17)   The students who have not been promoted to the next higher semester can re-register in the subsequent semester for the course(s) (both theoretical & practical) in which they failed. The grade(s) secured by the students in the re-registered course(s) will be considered for the result and Grade Point Average (G.P.A.) of the students concerned for that semester. However, the grade(s) obtained by the students in the previous semester will also be recorded in the transcript/grade card and tabulation sheet of previous semester only for chronological sequence. The students are required to apply in the prescribed application form available in the office of the Registrar of the University for re-registration. The application form duly filled in will be submitted within 2 weeks from the commencement of the classes."+"\n"+  
	"(18)   For the purpose of grade improvement, a student obtaining a passing grade lower than ‘B’ in the Regular Examination of a theoretical course can appear at the relevant Improvement Examination of the   semester by cancelling the passing grade of the  course  secured  by  him/her. The highest attainable grade with the Improvement Examination is ‘B’ and the grade obtained with the Improvement Examination will be considered for  the  result  and  G.P.A  of  a student. But the grade obtained by the student in the Regular Examination will also be recorded in the tabulation sheet/transcript/grade card only for chronological sequence. The letter grades will be awarded with the Improvement Examinations in accordance with the provision given below:"+"\n"+
	 
	"Numerical Grade\tLetter Grade\tGrade Point"+"\n"+
	"60% or above\tB\t3.00"+"\n"+
	"55% to less than 60%\tB-\t2.75"+"\n"+
	"50% to less than 55%\tC+\t2.50"+"\n"+
	"45% to less than 50%\tC\t2.25"+"\n"+
	"40% to less than 45%\tD\t2.00"+"\n"+
	"Less than 40%\tF\t0.00"+"\n"+
	 
	"(19)   The Improvement Examination of a course will carry 70% of the total mark assigned to the course and like the Semester Final/ Clearance Examinations, the rest of the mark will be entered in the mark sheet of the course from the record of the continuous assessment secured earlier by the student when he/she attended the classes of the semester. For appearing in the Improvement Examination of a course, the students are required to apply for enrollment in the prescribed application form available in the office of the Controller of Examinations at least four (4) days before the examination date of the course."+"\n"+ 
	"(20)   A student of a 4-year degree program can appear in the Improvement Examination in a maximum of 4 (four) courses while a student of a 5-year degree program can do the same in a maximum of 5 (five) courses in his/her student career at AUST."+"\n"+
	"(21)   A student failing in any sessional/practical course will have to repeat the semester. But a student failing in the course Surveying Practical may be promoted to the next higher class, if eligible. A student who remains absent in the classes of the course Surveying Practical due to reason acceptable to the authority of the University, will get another chance to attend the classes & pass the course along with the students of other batch in the next relevant semester."+"\n"+
	"(22)   A student of a semester who fails to submit the report/thesis of the course Project/Thesis during the semester will have to enroll for the course in the subsequent semester of his/her submission of the report/thesis."+"\n"+
	"(23)   The students of all bachelor degree programs are required to attend 60% of the classes held in each course of a semester. The students failing to attend the requisite percentage of classes in any course will not be allowed to appear at the Semester Final/ Clearance/Improvement/Carry Over Examinations of the course in the semester. However, the authority of the University may condone the shortage of requisite percentage of class attendance on grounds acceptable to the authority."+"\n"+
	 
	"(24)   All 4-year degree programs at AUST require completion of degree requirements within a maximum period of 7 years and a 5-year degree program requires completion of all degree requirements within a maximum period of 8 years. Failure to complete all degree requirements within the given time frame may disqualify a student from continuation of his/her study at AUST.";
		
		
		final String  tutionsAndFees = "payment of requisite fees."+"\n\n"+"\t\t\t\t\t\tIN TAKA"+"\n"+"\tNAME OF PROGRAMS"+"\t\t\t\tAT THE TIME\tSUBSEQUENT"+"\n"+"\t\t\t\tOF ADMISSION\tEACH SEMESTERt\tTOTAL FEE"+"\n"+"ARC 5 years (10 semesters)\t1,04,800.00	80,400.00\t8,28,400.00"+"\n"+"CE 4 years (8 semesters)\t1,04,800.00\t80,400.00\t6,67,600.00"+"\n"+"CSE 4 years (8 semesters)\t1,04,800.00\t80,400.00\t6,67,600.00"+"\n"+"EEE 4 years (8 semesters)\t1,04,800.00\t80,400.00\t6,67,600.00"+"\n"+"TE 4 years (8 semesters)\t1,04,800.00\t80,400.00\t6,67,600.00"+"\n"+"IPE 4 years (8 semesters)\t1,04,800.00\t80,400.00\t6,67,600.00"+"\n"+"ME 4 years (8 semesters)\t1,04,800.00\t80,400.00\t6,67,600.00"+"\n"+"BBA  4 years (8 semesters)\t80,360.00\t64,660.00\t5,32,980.00"+"\n"+"\n"+"* The above fees are without VAT and may be revised from time to time.";
		
		
		final String  classes = "";
		
		
		final String  lab = "Lab Facilities"+"\n\n\n"+   
				 
				 "The AUST is gradually developing its required laboratories. It has already established the following laboratories:"+"\n\n"+  
				 
				"Ten computer labs"+"\n"+  
				"Digital lab"+"\n"+
				"Three Electrical labs"+"\n"+
				"Electronics lab"+"\n"+
				"Physics lab"+"\n"+
				"Chemistry lab"+"\n"+
				"Environmental engineering lab"+"\n"+
				"Electrical machine lab"+"\n"+
				"Microwave lab"+"\n"+
				"Soil mechanics lab"+"\n"+
				"Transportation lab"+"\n"+
				"Control lab"+"\n"+
				"Communication lab"+"\n"+
				"Switch gear lab"+"\n"+
				"Project lab"+"\n"+
				"Photographic lab"+"\n"+
				"Textile testing and quality control"+"\n"+
				"lab"+"\n"+
				"Wet processing lab and"+"\n"+
				"VLSI Lab."+"\n\n"+  	

				"Under an agreement with the Ministry of Education, Government of the People’s Republic of Bangladesh, the Ahsanullah University of Science and Technology has been allowed to use the laboratories and workshops of Technical Teachers’ Training College, Tejgaon, Dhaka for conducting some of the practical classes of the students of the University."+"\n\n"+
				 
				"Some of the sessional courses of the Textile Technology program will be taught at Jute & Textile Product Development Center (BJRI), BTMC and some other private textile mills, factories and commercial laboratories.";
		
		
		final String  library = "Library Facilities"+"\n\n\n"+	
				"LIBRARY REACHED A NEW DIMENSION"+"\n\n"+
				"Since the Library started work in the permanent campus, it has got a new dimension to serve the readers. Readers are getting a huge and wide space for study. Library has provided sufficient carrels for individual study and it can now accommodate about 200 readers  in the reading room at a time . Library has also turned to Open Shelve System (OSS) that means readers now can browse books and journals directly from the shelves, can see other relevant materials at a time. Library workers are also there to help the readers."+"\n"+
				"Library has now got the facilities for the Faculties and Researchers to study in a separate corner. Library is going to establish an Internet browsing corner for research purposes."+"\n"+
				"It is a matter of great pleasure to announce that AUST is now linked with Bangladesh-INASP/PERI Consortia (BIPC) under the auspices of Bangladesh Academy of Sciences (BAS) to have access to thousands of internationally reputed online journals  and books with downloading facilities of full text articles. Library is the focal point of this service."+"\n"+
				"There was a long time demand of Automated Library Systems and to fulfill the demand a project for making software for this purpose has been undertaken in the mean time. After the completion of the work automated book search from the machine readable catalogue and mechanized book issue system will be available.";
		
		
		SQLiteDatabase db = openOrCreateDatabase( databaseName, MODE_PRIVATE, null);
		
		db.execSQL("DROP TABLE IF EXISTS "+databaseTableName);
		db.execSQL("CREATE TABLE IF NOT EXISTS "+databaseTableName+" ("+AboutAUSTTableInfo.aboutAust+" TEXT,"+AboutAUSTTableInfo.recognization+" TEXT,"+AboutAUSTTableInfo.ranking+" TEXT,"+AboutAUSTTableInfo.international+" TEXT,"+AboutAUSTTableInfo.research+" TEXT,"+AboutAUSTTableInfo.publication+" TEXT,"+AboutAUSTTableInfo.examAndGradingSystem+" TEXT,"+AboutAUSTTableInfo.tutionsAndFees+" TEXT,"+AboutAUSTTableInfo.classes+" TEXT,"+AboutAUSTTableInfo.lab+" TEXT,"+AboutAUSTTableInfo.library+" TEXT);");
		db.execSQL("INSERT INTO "+databaseTableName+" VALUES ('"+aboutAust+"','"+recognization+"','"+ranking+"','"+international+"','"+research+"','"+publication+"','"+examAndGradingSystem+"','"+tutionsAndFees+"','"+classes+"','"+lab+"','"+library+"')");
		Log.i("log:", "Insert Operation: AUSTDescription");
		
		
		
		databaseTableName = "DepartmentDescription";
		
		
		final String architecture = "Our Program:"+"\n"+
				"The Bachelor of Architecture (B.Arch.) program of the Department of Architecture involves a wide range of disciplines in the fields of arts, sciences and engineering. The diversified theoretical courses are aimed at developing an understanding of the bases of architectural design problems. The studio sessions are then available for application of these knowledge and understandings to practical design problems. Thus, design studio works constitute a very important aspect of the B. Arch. program and continues from Design Studios I & II in the first year to Design Studios IX-X in the fifth or final year."+"\n\n"+
				 
				"The Jury System:"+"\n"+
				"All significant studio projects of the students, particularly those of the higher levels including the final year terminal projects are evaluated by the "+"Jury"+" system. Under this system, a jury of external examiners comprising of the faculty members as well as at least one or two well known architects from the profession is constituted to listen to the presentation of the students, deliberate with them and pass judgment on the standard and quality of the work presented. The students are graded largely on the basis of such open jury evaluations."+"\n\n"+
				 
				"We already have:"+"\n"+
				"The Department already has established departmental computer lab, photography lab and materials lab. The computer lab is equipped with computer networking, advanced software packages and internet connection. The students use the lab quite extensively. The students also use the photography lab under the photography course run by the department.";
	
	final String bba = "The School of Business started its journey along with other departments of the University in 1995. This department was the sole department under the Faculty of Business and Social Science. The University has intention to open some other disciplines under this faculty if found demanding."+"\n\n"+

 "The School of Business is offering 4-years BBA degree, since its, very inception, which is divided into eight semesters. The syllabus and teaching method had been updated over the passage of time so that those could meet the demand of the future business executives. Internship program is included in this program so that the students can acquire practical knowledge of the real work environment. Five full-time teachers, of those two having Ph.D. degree, along with part-time teachers are constantly trying to give the best to the students. Part-time teachers are chosen on the basis of the merit of the course and the needed and required expertise. The courses selected for the BBA program are a unique assortment of varied disciplines so that they can meet the challenges of the 21st century. Computer laboratory facility is available for BBA students to make them acquainted with this modern technology."+"\n\n"+

 "Nowadays business education is not complete if it is not blended with practical exposure to the necessary theoretical part. For this purpose students are sent to different enterprises/factories for acquiring first hand knowledge where they will be working in future. Moreover, guest lectures and seminars are arranged to share the high expertise possessed by the reputed and competent resource persons."+"\n\n"+

 "In the absence of recreation facilities, education life becomes bored and monotonous; hence yearly orientation & reception for the new comers and farewell ceremonies for the outgoing students, coupled with cultural functions are arranged. Side by side students, under the leadership of some teachers, often join picnics and pleasure tours."+"\n\n"+

 "MBA Program (both regular and executive) had been launched with the existing 4-year BBA Program in February, 2002. The launching ceremony was held at Ahsania Mission Auditorium on February 1, 2002. Mr. Barkat Ullah Bulu, Honourable State Minister of Commerce, Government of the "+"Peoples"+" Republic of Bangladesh attended the ceremony as the Chief Guest along with other distinguished guests.";
	
	
	final String cse = "The department of Computer Science and Engineering, abbreviated CSE, is offering an undergraduate engineering degree program since the establishment of the university in the year 1995 with a view to offer quality higher education to numerous worthy young fellows as well as to meet the huge demand of highly qualified specialists in the field. The program follows an intensive course curriculum containing well-organized courses on basic sciences, computer science, electrical and electronic engineering, computer engineering, management and humanities. Computer science and engineering courses constitute the bulk of the program (about 70%) and are most emphasized, of course."+"\n\n"+ 
			"Usual intake of students in the department is twice in an year. Students graduated from this department are employed in different prestigious institutions and organizations home and abroad. A good number of our graduates have completed postgraduate programs including doctoral programs with brilliant performances at highly ranked universities around the world."+"\n\n"+
			"The department has a good number of young full-time faculty members with best available exposure to ever-growing horizon of computer science and engineering. Besides, a number of part-time faculties also teach in each semester from other universities, research organizations and industrial establishments for extending experience-rich education."+"\n\n"+

			"The department organizes various co-curricular and extra-curricular activities to develop important social and professional faculties in the students. Most common co-curricular activity is the programming contest, which has become regular by this time. And the most common extra-curricular activities are reception parties for welcoming the newly entered students and for biding farewell to the outgoing students."+"\n\n"+

			"The department has developed its own laboratories which include six computer labs and one digital electronics lab equipped with modern personal computers and electronic devices. There is a server center attached to the department which is equipped with various PC-server systems for providing network facilities to the labs and offices all over the university campus.";
	
	final String eee = "Undergraduate program is accredited by professional bodies such as UGC, IEB (The Institute of Engineers, Bangladesh), IAE, BUET etc. The department of  EEE (Electrical & Electronic Engineering) is nationally and internationally recognized by its contribution to different fields of Electrical & Electronic Engineering. The graduates of this department have gone on to a variety of positions in industry such as Siemens Bangladesh, Ericsson, Grameen Phone, Robi, Banglalink, Airtel, Government services, PGCB GETCO etc. Many students of EEE department successfully transferred credit to many renowned American & Australian Universities. At present some graduates of  EEE department are doing their postgraduate degrees in Canada, Germany, UK, US & Australia."+"\n\n"+"At present there are 45 full time teachers of the department together with a few part time teachers. Part time teachers are mostly the senior teachers of BUET (Bangladesh University of Engineering and Technology)"+"\n\n"+"The Electrical & Electronic Engineering program is interdisciplinary. It requires a blend of knowledge from the areas of Electrical Engineering, Control Engineering, Electronics, Computer Science, and Telecommunication Engineering. Students in Electrical Engineering are given an opportunity to learn and extend their abilities to analyze and solve complex problems and to design new uses of technology to serve "+"todays"+" society. This engineering program provides an integrated educational experience directed toward the development of the ability to apply pertinent knowledge to the identification and solution of practical problems in electrical, electronic and telecommunications engineering. This program also insures that the design experience is developed and integrated throughout the curriculum in a sequential development leading to advanced work and includes both analytical and experimental studies."+"\n\n"+"Laboratory Facilities:"+"\n\n"+"The Department has the following well equipped and state of the art Laboratories."+"\n"+"Circuit Lab-1, Circuit Lab-2, Electronics Lab, Power Electronics Lab, Project Lab, VLSI & DSP Lab, Simulation Lab, Control Lab, Microwave & Optical Communication Lab, Telecom Lab, Machine Lab, Power System, Switchgear & Protective Relays Lab, Digital & Microprocessor Lab.";
	
	final String civil = "The Department of Civil Engineering was established in 1995. The total enrolment in the 4-year B.Sc. program is over 1000."+"\n\n"+

"There are now forty five full-time faculty members including eleven with Ph.D. degrees and thirteen with M. Sc. degrees. Moreover, eight teachers are on higher study leave. In addition, there are five part-time teachers most of them are senior Professors of BUET. The others are very senior engineers and consultants with good teaching experience."+"\n\n"+

"The Department has established laboratories with sophisticated equipment on its campus."+"\n\n"+

"The main aim and objectives of this department is to offer program covering all important branches and disciplines of civil Engineering. The department covers a wide range of course curriculum and well-equipped laboratory facilities. Twenty five batches have been graduated during the last twenty five academic years.  The B.Sc. degree offered by the Department of Civil Engineering at AUST has been officially recognized by the Institution of Engineers, Bangladesh (IEB). A number of Graduates of this department are pursuing higher studies in BUET as well as in different countries of the world. Some of them are working in the reputed consulting and construction firms of the Country. Several graduates have already got Ph.D. and M. Sc. degrees from universities of different countries and are working abroad."+"\n\n"+

"The Department is actively involved in the activities of the national and international engineering professional bodies. Apart from the academic programs, the department organizes the comprehensive training on computer aided design, drawing and project management through Centre for Extension Service of the University. Moreover the department is planning to offer materials testing and consulting services by using its laboratories equipped with highly sophisticated and modern equipments and highly qualified and experienced faculty members. The Department arranges field visit, study tour, seminars, and programs on extracurricular activities.";
	
	
	final String mpe = "Department of Mechanical and Production Engineering has formally started its journey on Spring Semester-2010 at Ahsanullah University of Science and Technology. Our mission is to educate persons for professional and technical excellence, to perform research to advance the science and practice of engineering, to engage in service activities that advance the department, the university and the profession, and to instill in ourselves and students habits and attitudes that promote ethical behavior, professional responsibility and careers that advance the well-being of society. The department offers two undergraduate degree programs: Bachelor of Science in Industrial and Production Engineering (B.Sc. in IPE) and Bachelor of Science in Mechanical Engineering (B.Sc. in ME)."+"\n\n"+

"Industrial Engineering is where engineering meets business. It is the perfect career for people who like to solve practical problems in a variety of working environments and develop systems to improve quality and productivity. Mechanical engineers are trained in traditional fields such as fluid mechanics, heat transfer, machine design, and controls; but they also learn how to apply the fundamental principles of physics, chemistry and mathematics."+"\n\n"+

"We are in an enviable position of continuing growth and rejuvenation. The department continues to search for young, promising researchers to enrich its academic staff and promote its exciting research vision. Part of that process entails expanding vertically by improving the foundation of its unique laboratory facilities, designing its educational programs for tomorrows challenges, contributing to national endeavors.";
	
	final String textile = "It is a historical fact that textile industry led the industrialization of the economically strong and advanced countries of the world today, namely U.K., Germany, France, Japan and USA. As those countries have moved to more sophisticated and high-tech industrial activities, textile industry is finding its home in the industrially emerging countries of Asia, Africa and Latin America. Bangladesh has not lagged behind in the race to grab a share of the global textile and clothing industry during its migration from the developed countries. Today the textile and apparel industry is the most important industrial sector in Bangladesh."+"\n\n"+

"The large and expanding textile and apparel industry in Bangladesh has been placing an increasing demand of highly skilled manpower with technological and managerial background. There are demands for textile graduates in other areas of economic activities. With the aim to meet this demand and also to strengthen the technological base of the industry, Ahsanullah University of Science and Technology (AUST) was the first private university in Bangladesh to introduce B.Sc. in Textile Technology Course in 1998. As of today (June 2007), more than 200 students graduated from this department and they have been performing well in the different textile and apparel units in the country and as well as many commercial organizations. A few of our graduates attended the distinguished universities abroad for post-graduate education and research."+"\n\n"+

"Over the years we have established state-of-the-art textile testing, fabric manufacturing (weaving and knitting), wet processing (dyeing, printing and finishing) and garments technology laboratories. The additional laboratory facilities including those for yarn manufacturing technology will be set up after the university is shifted to its own campus towards the end of 2007. At the same time, we maintain close and collaborative relationships with the textile and apparel industries and various research institutes for executing our academic programmes and imparting practical and quality education to the students. Seminars and mill visits are organized on regular basis to update the students and the faculty members with latest technological developments."+"\n\n"+

"The department has 18 full-time faculty members and most of them possess post graduate degrees from the UK, USA, Germany, Japan and India. Besides the distinguished faculty members and experts from the University of Dhaka, BUET and reputed textile industries are teaching on part-time basis.";
	
	
	final String artsAndScience = "Under Construction!";

	int i;
	
	
	db.execSQL("DROP TABLE IF EXISTS "+databaseTableName);
	db.execSQL("CREATE TABLE IF NOT EXISTS "+databaseTableName+"("+DepartmentDetailsTableInfo.architecture+" TEXT,"+DepartmentDetailsTableInfo.cse+" TEXT,"+DepartmentDetailsTableInfo.eee+" TEXT,"+DepartmentDetailsTableInfo.mpe+" TEXT,"+DepartmentDetailsTableInfo.civil+" TEXT,"+DepartmentDetailsTableInfo.textile+" TEXT,"+DepartmentDetailsTableInfo.bba+" TEXT,"+DepartmentDetailsTableInfo.artsAndScience+" TEXT"+");");
	db.execSQL("INSERT INTO "+databaseTableName+" VALUES ('"+architecture+"','"+cse+"','"+eee+"','"+mpe+"','"+civil+"','"+textile+"','"+bba+"','"+artsAndScience+"')");
	Log.i("log:", "Insert Operation: DepartmentDescription");
	
	
	databaseTableName = "ArchitectureFaculty";

	db.execSQL("DROP TABLE IF EXISTS "+databaseTableName);
	db.execSQL("CREATE TABLE IF NOT EXISTS "+databaseTableName+" ("+FacultyMemberTableInfo.id+" INTEGER PRIMARY KEY,"+FacultyMemberTableInfo.name+" TEXT,"+FacultyMemberTableInfo.designation+" TEXT,"+FacultyMemberTableInfo.cellNumber+" TEXT,"+FacultyMemberTableInfo.email+" TEXT"+");");

	i = 0;
	db.execSQL("INSERT INTO "+databaseTableName+" VALUES ('"+i+++"','Dr. M.A. Muktadir','Professor & Head','','')");
	db.execSQL("INSERT INTO "+databaseTableName+" VALUES ('"+i+++"','Bijon B. Sarma','Professor','','')");
	db.execSQL("INSERT INTO "+databaseTableName+" VALUES ('"+i+++"','Dr. Jasmin Ara Begum','Professor','','')");
	db.execSQL("INSERT INTO "+databaseTableName+" VALUES ('"+i+++"','A.B.M. Mahbubul Malik','Associate Professor','','')");
	db.execSQL("INSERT INTO "+databaseTableName+" VALUES ('"+i+++"','Mr.Shehzad Zahir','Associate Professor','','')");
	db.execSQL("INSERT INTO "+databaseTableName+" VALUES ('"+i+++"','Mr.Dibbendu Saha','Assistant Professor','','')");
	db.execSQL("INSERT INTO "+databaseTableName+" VALUES ('"+i+++"','Mr.Rana Das','Assistant Professor','','')");
	db.execSQL("INSERT INTO "+databaseTableName+" VALUES ('"+i+++"','S.Monirul Islam','Assistant Professor','','')");
	db.execSQL("INSERT INTO "+databaseTableName+" VALUES ('"+i+++"','Ms.Deel Afsana','Assistant Professor','','')");
	db.execSQL("INSERT INTO "+databaseTableName+" VALUES ('"+i+++"','Md.Sujaul Islam Khan','Assistant Professor','','')");
	db.execSQL("INSERT INTO "+databaseTableName+" VALUES ('"+i+++"','Dr.Rumana Rashid','Assistant Professor','','')");
	db.execSQL("INSERT INTO "+databaseTableName+" VALUES ('"+i+++"','Ms.Ayasha Siddiqua','Assistant Professor','','')");
	db.execSQL("INSERT INTO "+databaseTableName+" VALUES ('"+i+++"','Ms.Urmee Choudhury','Assistant Professor','','')");
	db.execSQL("INSERT INTO "+databaseTableName+" VALUES ('"+i+++"','Mr.Masudur Rashid','Assistant Professor','','')");
	db.execSQL("INSERT INTO "+databaseTableName+" VALUES ('"+i+++"','Ms.Rumnana Afroz','Assistant Professor','','')");
	db.execSQL("INSERT INTO "+databaseTableName+" VALUES ('"+i+++"','Ms.Nujaba Binte Kabir','Assistant Professor','','')");
	db.execSQL("INSERT INTO "+databaseTableName+" VALUES ('"+i+++"','Mr.Naimul Aziz','Assistant Professor','','')");
	db.execSQL("INSERT INTO "+databaseTableName+" VALUES ('"+i+++"','Ms.Jinia Sharmeen','Assistant Professor','','')");
	db.execSQL("INSERT INTO "+databaseTableName+" VALUES ('"+i+++"','Ms.Abontika Sara Israt','Assistant Professor','','')");
	db.execSQL("INSERT INTO "+databaseTableName+" VALUES ('"+i+++"','Ms.Nusrat Wahid','Assistant Professor','','')");
	db.execSQL("INSERT INTO "+databaseTableName+" VALUES ('"+i+++"','Ms.Maher Niger','Assistant Professor','','')");
	db.execSQL("INSERT INTO "+databaseTableName+" VALUES ('"+i+++"','Ms.Tamanna Kabir','Assistant Professor','','')");
	db.execSQL("INSERT INTO "+databaseTableName+" VALUES ('"+i+++"','Ms.Razia Sultana','Assistant Professor','','')");
	db.execSQL("INSERT INTO "+databaseTableName+" VALUES ('"+i+++"','Ms.Sanjida Ahmed Sultana','Assistant Professor','','')");
	db.execSQL("INSERT INTO "+databaseTableName+" VALUES ('"+i+++"','Ms.Tanzila Samad Choudhury','Assistant Professor','','')");
	db.execSQL("INSERT INTO "+databaseTableName+" VALUES ('"+i+++"','Mr.Habib Ibrahim Rahmatullah','Assistant Professor','','')");
	db.execSQL("INSERT INTO "+databaseTableName+" VALUES ('"+i+++"','Ms.Shirajom Monira Khondke','	Assistant Professor','','')");
	db.execSQL("INSERT INTO "+databaseTableName+" VALUES ('"+i+++"','Ms.Mehnaz Tabassum','Assistant Professor','','')");
	db.execSQL("INSERT INTO "+databaseTableName+" VALUES ('"+i+++"','Mr.Zishan Fuad Chowdhury','Assistant Professor','','')");
	db.execSQL("INSERT INTO "+databaseTableName+" VALUES ('"+i+++"','Ms.Salma Begum','Lecturer','','')");
	db.execSQL("INSERT INTO "+databaseTableName+" VALUES ('"+i+++"','Mr.Nahianil Munke','Lecturer','','')");


	databaseTableName = "CSEFaculty";

	db.execSQL("DROP TABLE IF EXISTS "+databaseTableName);
	db.execSQL("CREATE TABLE IF NOT EXISTS "+databaseTableName+" ("+FacultyMemberTableInfo.id+" INTEGER PRIMARY KEY,"+FacultyMemberTableInfo.name+" TEXT,"+FacultyMemberTableInfo.designation+" TEXT,"+FacultyMemberTableInfo.cellNumber+" TEXT,"+FacultyMemberTableInfo.email+" TEXT"+");");
	i = 0;
	db.execSQL("INSERT INTO "+databaseTableName+" VALUES ('"+i+++"','Dr. S. M. Abdullah Al-Mamun','Professor','01912073524','al_mamun81 @yahoo.com')");
	db.execSQL("INSERT INTO "+databaseTableName+" VALUES ('"+i+++"','Mr.Md.Khairul Hasan','Associate Professor','01711109629','khairul271276 @aust.edu')");
	db.execSQL("INSERT INTO "+databaseTableName+" VALUES ('"+i+++"','Dr.Mohammad Shafiul Alam','Associate Professor','01715104101','shuvo23@gmail.com')");
	db.execSQL("INSERT INTO "+databaseTableName+" VALUES ('"+i+++"','Ms.Umme Zakia','Assistant Professor','01722066975','ummezakia @gmail.com')");
	db.execSQL("INSERT INTO "+databaseTableName+" VALUES ('"+i+++"','Mr.Faisal Muhammad Shah','Assistant Professor','01911090363','faisal505@hotmail.com')");
	db.execSQL("INSERT INTO "+databaseTableName+" VALUES ('"+i+++"','Ms.Nusrat Jahan Lisa','Assistant Professor','01674928298','nusrat_jahan_lisa @yahoo.com')");
	db.execSQL("INSERT INTO "+databaseTableName+" VALUES ('"+i+++"','Ms.Qamrun Nahar Eity','Assistant Professor','01727732788','eity_cse@hotmail.com')");
	db.execSQL("INSERT INTO "+databaseTableName+" VALUES ('"+i+++"','Mr.Tanvir Ahmed','Assistant Professor','01747584067','tahmed020 @hotmail.com')");
	db.execSQL("INSERT INTO "+databaseTableName+" VALUES ('"+i+++"','Mr.Md. Wasi Ul Kabir','Lecturer','01670014863','wasi_cse25 @yahoo.com')");
	db.execSQL("INSERT INTO "+databaseTableName+" VALUES ('"+i+++"','Ms.Effat Farhana','Lecturer','01858939825','eva_cse@yahoo.com')");
	db.execSQL("INSERT INTO "+databaseTableName+" VALUES ('"+i+++"','Ms.Syeda Shabnam Hasan','Lecture','01914130189','shabnam.aust @gmail.com')");
	db.execSQL("INSERT INTO "+databaseTableName+" VALUES ('"+i+++"','Mr.Emam Hossain','Lecturer','01717584978','emamhossain88 @gmail.com')");
	db.execSQL("INSERT INTO "+databaseTableName+" VALUES ('"+i+++"','Mr.S.M.Ferdous','Lecturer','01914042907','ferdous.csebuet @gmail.com')");
	db.execSQL("INSERT INTO "+databaseTableName+" VALUES ('"+i+++"','Ms.Shanjida Khatun','Lecturer','01919835477','shanjida2006 @yahoo.com')");
	db.execSQL("INSERT INTO "+databaseTableName+" VALUES ('"+i+++"','Mr.Mir Tafseer Nayeem','Lecturer','01912584949','mtnayeem @yahoo.com')");
	db.execSQL("INSERT INTO "+databaseTableName+" VALUES ('"+i+++"','Mr.Md.Hosne-Al-Walid Shaiket','Lecturer','01737060069','shaiket.walid @yahoo.com')");
	db.execSQL("INSERT INTO "+databaseTableName+" VALUES ('"+i+++"','Mr.Nazmus Sakib','Lecturer','01939900271','nazmussakib009 @gmail.com')");	
	db.execSQL("INSERT INTO "+databaseTableName+" VALUES ('"+i+++"','Mr.Wasi Uddin Ahmad','Lecturer','01673895930','wasicse90 @gmail.com')");	
	db.execSQL("INSERT INTO "+databaseTableName+" VALUES ('"+i+++"','Mr.D. M. Anisuzzaman','Lecturer','01676442389','rajon99@gmail.com')");	
	db.execSQL("INSERT INTO "+databaseTableName+" VALUES ('"+i+++"','Ms.Raqeebir Rab','Lecturer','01779001291','jishan005@gmail.com')");	
	db.execSQL("INSERT INTO "+databaseTableName+" VALUES ('"+i+++"','Mr.Tanmoy Sen','Lecturer','01814493735','sen.buet@gmail.com')");	
	db.execSQL("INSERT INTO "+databaseTableName+" VALUES ('"+i+++"','Mr.Ahasanuzzaman','Lecturer','01675570849','ahsan.du.2010 @gmail.com')");	
	db.execSQL("INSERT INTO "+databaseTableName+" VALUES ('"+i+++"','Mr.Tanveer Ahmed Belal','Lecturer','01671989204','deepu09999 @gmail.com')");	
	db.execSQL("INSERT INTO "+databaseTableName+" VALUES ('"+i+++"','Mr.K.M.A. Solaiman','Lecturer','01916752682','salvisolaiman @yahoo.com')");	
	db.execSQL("INSERT INTO "+databaseTableName+" VALUES ('"+i+++"','Mr.Sujan Sarker','Lecturer','01917004105','sujancse16 @gmail.com')");	
	db.execSQL("INSERT INTO "+databaseTableName+" VALUES ('"+i+++"','Mr.M.Arif Imtiazur Rahman','Lecturer','01914027474','arif.imtiaz216 @gmai.com')");	
	db.execSQL("INSERT INTO "+databaseTableName+" VALUES ('"+i+++"','Mr.Saikat Chakraborty','Lecturer','01737450085','saikatch107 @gmail.com')");	


	databaseTableName = "MPEFaculty";

	db.execSQL("DROP TABLE IF EXISTS "+databaseTableName);
	db.execSQL("CREATE TABLE IF NOT EXISTS "+databaseTableName+" ("+FacultyMemberTableInfo.id+" INTEGER PRIMARY KEY,"+FacultyMemberTableInfo.name+" TEXT,"+FacultyMemberTableInfo.designation+" TEXT,"+FacultyMemberTableInfo.cellNumber+" TEXT,"+FacultyMemberTableInfo.email+" TEXT"+");");
	i = 0;
	db.execSQL("INSERT INTO "+databaseTableName+" VALUES ('"+i+++"','Prof A. F. M. Anwarul Haque','Professor, Head & Dean','01713228500','head.mpe@aust.edu')");
	db.execSQL("INSERT INTO "+databaseTableName+" VALUES ('"+i+++"','Prof. Dr. M. H. Khan','Founder VC & Professor','Restricted','Restricted')");
	db.execSQL("INSERT INTO "+databaseTableName+" VALUES ('"+i+++"','Prof. Shyamal Kanti Biswas','Professor','01817746070','skbiswas.mpe @aust.edu')");
	db.execSQL("INSERT INTO "+databaseTableName+" VALUES ('"+i+++"','Prof. Dr. Dipak Kanti Das','Professor','01712848673','dipak@me.buet.ac.bd')");
	db.execSQL("INSERT INTO "+databaseTableName+" VALUES ('"+i+++"','Prof. Dr. M. A. Rashid Sarkar','Professor','01552350258','N/A')");
	db.execSQL("INSERT INTO "+databaseTableName+" VALUES ('"+i+++"','Prof. Dr. Nikhil Ranjan Dhar','Professor','01711357885','nrdhar@ipe.buet.ac.bd')");
	db.execSQL("INSERT INTO "+databaseTableName+" VALUES ('"+i+++"','Prof. Dr. Md. Zahurul Haq','Professor','01552541994','zahurul@me.buet.ac.bd')");
	db.execSQL("INSERT INTO "+databaseTableName+" VALUES ('"+i+++"','Prof. Dr. Ashiqur Rahman','Professor','01939013010','ashiq@me.buet.ac.bd')");
	db.execSQL("INSERT INTO "+databaseTableName+" VALUES ('"+i+++"','Dr. Abdullahil Azeem','Professor','01715496330','azeem@ipe.buet.ac.bd')");
	db.execSQL("INSERT INTO "+databaseTableName+" VALUES ('"+i+++"','Dr.Mamun','Associate Professor','01714386925','mdmamun@ me.buet.ac.bd')");
	db.execSQL("INSERT INTO "+databaseTableName+" VALUES ('"+i+++"','Dr. Nafis Ahmad','Associate Professor','01731252980','nafis@ipe.buet.ac.bd')");
	db.execSQL("INSERT INTO "+databaseTableName+" VALUES ('"+i+++"','Dr. Mohammad Arif Hasan Mamun','Associate Professor','029665650','arifhasan@ me.buet.ac.bd')");
	db.execSQL("INSERT INTO "+databaseTableName+" VALUES ('"+i+++"','Dr. Dewan Hasan Ahmed','Assistant Professor','N/A','dhahmed@ hotmail.com')");
	db.execSQL("INSERT INTO "+databaseTableName+" VALUES ('"+i+++"','Md.Deloyer Jahan','Lecturer','01675642752','mdjahan.mpe@ aust.edu')");
	db.execSQL("INSERT INTO "+databaseTableName+" VALUES ('"+i+++"','Md. Taibur Rahman','Lecturer','01710562063','taibur_rahman@ hotmail.com')");
	db.execSQL("INSERT INTO "+databaseTableName+" VALUES ('"+i+++"','Gazi Md. Daud Iqbal','Lecturer','01556444419','babu_buet05@ yahoo.com')");


	databaseTableName = "CivilFaculty";

	db.execSQL("DROP TABLE IF EXISTS "+databaseTableName);
	db.execSQL("CREATE TABLE IF NOT EXISTS "+databaseTableName+" ("+FacultyMemberTableInfo.id+" INTEGER PRIMARY KEY,"+FacultyMemberTableInfo.name+" TEXT,"+FacultyMemberTableInfo.designation+" TEXT,"+FacultyMemberTableInfo.cellNumber+" TEXT,"+FacultyMemberTableInfo.email+" TEXT"+");");
	i = 0;
	db.execSQL("INSERT INTO "+databaseTableName+" VALUES ('"+i+++"','Dr. Md. Anwarul Mustafa','Professor & Head','N/A','mustafa.anwarul@gmail.com')");
	db.execSQL("INSERT INTO "+databaseTableName+" VALUES ('"+i+++"','Dr. Mohd. S. A. A. Kiwan','Professor','N/A','kiwan.ce@aust.edu')");
	db.execSQL("INSERT INTO "+databaseTableName+" VALUES ('"+i+++"','Dr. Md. Abdul Halim','Professor','N/A','jpz@bdonline.com')");
	db.execSQL("INSERT INTO "+databaseTableName+" VALUES ('"+i+++"','Dr. Md. Mahmudur Rahman','Professor','N/A','mahmud402@yahoo.com')");
	db.execSQL("INSERT INTO "+databaseTableName+" VALUES ('"+i+++"','Dr. Md. Monjur Hossain','Professor','N/A','drmonjur@ce.kuet.ac.bd')");
	db.execSQL("INSERT INTO "+databaseTableName+" VALUES ('"+i+++"','Dr. Quazi Hamidul Bari','Professor','N/A','qhbari@yahoo.com')");
	db.execSQL("INSERT INTO "+databaseTableName+" VALUES ('"+i+++"','Dr. M. A. Matin','Professor','N/A','matinmabuet81@gmail.com')");
	db.execSQL("INSERT INTO "+databaseTableName+" VALUES ('"+i+++"','Dr. Sharmin Reza Chowdhury','Associate Professor','N/A','srchowy@yahoo.com')");
	db.execSQL("INSERT INTO "+databaseTableName+" VALUES ('"+i+++"','Dr. Md. Shahid Mamun','Associate Professor','N/A','smamun93@hotmail.com')");
	db.execSQL("INSERT INTO "+databaseTableName+" VALUES ('"+i+++"','Dr. Enamur Rahim Latifee','Assistant Professor','N/A','erlatifee@yahoo.com')");
	db.execSQL("INSERT INTO "+databaseTableName+" VALUES ('"+i+++"','Zobayer Alam  Shaurav','Assistant Professor','N/A','za_shaurav@yahoo.com')");
	db.execSQL("INSERT INTO "+databaseTableName+" VALUES ('"+i+++"','Rumana  Afrin','Assistant Professor','N/A','rumafrin@yahoo.com')");
	db.execSQL("INSERT INTO "+databaseTableName+" VALUES ('"+i+++"','Mashfiqul Islam','Assistant Professor','N/A','mashfiq7777@yahoo.com')");
	db.execSQL("INSERT INTO "+databaseTableName+" VALUES ('"+i+++"','Fatema-Tuz-Zahura','Assistant Professor','N/A','fatema1777@gmail.com')");
	db.execSQL("INSERT INTO "+databaseTableName+" VALUES ('"+i+++"','Dr.Tanveer Ferdous Saeed','Assistant Professor','N/A','tanveer.ce@aust.edu')");
	db.execSQL("INSERT INTO "+databaseTableName+" VALUES ('"+i+++"','Raziya Sultana Chowdhury','Assistant Professor','N/A','raziyasultana.2712@gmail.com')");
	db.execSQL("INSERT INTO "+databaseTableName+" VALUES ('"+i+++"','Zasiah Tafheem','Assistant Professor','N/A','zasiah.ce@aust.edu')");
	db.execSQL("INSERT INTO "+databaseTableName+" VALUES ('"+i+++"','Ashfia Siddique','Assistant Professor','N/A','ashfia2002@yahoo.com')");
	db.execSQL("INSERT INTO "+databaseTableName+" VALUES ('"+i+++"','Shovona Khusru','Assistant Professor','N/A','shovonakhusru@yahoo.com')");
	db.execSQL("INSERT INTO "+databaseTableName+" VALUES ('"+i+++"','Saima Ali','Assistant Professor','N/A','shoma2011@gmail.com')");
	db.execSQL("INSERT INTO "+databaseTableName+" VALUES ('"+i+++"','Md.Golam Rashed','Assistant Professor','N/A','rashed.ce@aust.edu')");
	db.execSQL("INSERT INTO "+databaseTableName+" VALUES ('"+i+++"','Sabreena Nasrin','Assistant Professor','N/A','sabreena.ce@aust.edu')");
	db.execSQL("INSERT INTO "+databaseTableName+" VALUES ('"+i+++"','Md.Toihidul Islam','Lecturer','N/A','ripon.ce@gmail.com')");
	db.execSQL("INSERT INTO "+databaseTableName+" VALUES ('"+i+++"','Md.Ashraful Alam','Lecturer','N/A','ash_ce030@yahoo.com')");
	db.execSQL("INSERT INTO "+databaseTableName+" VALUES ('"+i+++"','Shams Al-Amin','Lecturer','N/A','salam009@fiu.edu')");
	db.execSQL("INSERT INTO "+databaseTableName+" VALUES ('"+i+++"','Sayka Banu','Lecturer','N/A','sayka2021@gmail.com')");
	db.execSQL("INSERT INTO "+databaseTableName+" VALUES ('"+i+++"','Shafiqul Islam','Lecturer','N/A','shajib_ce@ymail.com')");
	db.execSQL("INSERT INTO "+databaseTableName+" VALUES ('"+i+++"','A. K. M. Abir','Lecturer','N/A','akmabir@yahoo.com')");
	db.execSQL("INSERT INTO "+databaseTableName+" VALUES ('"+i+++"','A. S. M. Fahad Hossain','Lecturer','N/A','fahad.ce@aust.edu')");
	db.execSQL("INSERT INTO "+databaseTableName+" VALUES ('"+i+++"','Md. Munirul Islam','Lecturer','N/A','	saeedce@yahoo.com')");
	db.execSQL("INSERT INTO "+databaseTableName+" VALUES ('"+i+++"','Munshi Galib Muktadir','Lecturer','N/A','galib_ratul_civil@yahoo.com')");
	db.execSQL("INSERT INTO "+databaseTableName+" VALUES ('"+i+++"','Debasish Sen','Lecturer','N/A','debasish147@yahoo.com')");
	db.execSQL("INSERT INTO "+databaseTableName+" VALUES ('"+i+++"','Md. Rashedul Kabir','Lecturer','N/A','rashedulkabir777@gmail.com')");
	db.execSQL("INSERT INTO "+databaseTableName+" VALUES ('"+i+++"','Urmi Devi','Lecturer','N/A','urmidevi_buet07@yahoo.com')");
	db.execSQL("INSERT INTO "+databaseTableName+" VALUES ('"+i+++"','Minhajul Islam Khan','Lecturer','N/A','khan_minhajul@yahoo.com')");
	db.execSQL("INSERT INTO "+databaseTableName+" VALUES ('"+i+++"','Md. Arman Chowdhury','Lecturer','N/A','arman.chowdhury.ce @gmail.com')");
	db.execSQL("INSERT INTO "+databaseTableName+" VALUES ('"+i+++"','Sadia Mohsin','Lecturer','N/A','trisha0302@gmail.com')");
	db.execSQL("INSERT INTO "+databaseTableName+" VALUES ('"+i+++"','Sayed Mukit Hossain','Lecturer','N/A','mukit1271@gmail.com')");
	db.execSQL("INSERT INTO "+databaseTableName+" VALUES ('"+i+++"','Moutoshi Saha','Lecturer','N/A','moutoshi0704@gmail.com')");
	db.execSQL("INSERT INTO "+databaseTableName+" VALUES ('"+i+++"','Wahid Hassan','Lecturer','N/A','f.hassan29@yahoo.com')");
	db.execSQL("INSERT INTO "+databaseTableName+" VALUES ('"+i+++"','Rishath Sabrin','Lecturer','N/A','rishathsabrin@gmail.com')");
	db.execSQL("INSERT INTO "+databaseTableName+" VALUES ('"+i+++"','Munshi Md. Rasel','Lecturer','N/A','munshimdrasel@gmail.com')");
	db.execSQL("INSERT INTO "+databaseTableName+" VALUES ('"+i+++"','Md. Mehedi Hasnat','Lecturer','N/A','hasnatmehedi@gmail.com')");
	db.execSQL("INSERT INTO "+databaseTableName+" VALUES ('"+i+++"','Nuzhat Azra','Lecturer','N/A','nazra.shagufta@gmail.com')");
	db.execSQL("INSERT INTO "+databaseTableName+" VALUES ('"+i+++"','Md. Asif Hossain','Lecturer','N/A','arnobbd@gmail.com')");


	databaseTableName = "TextileFaculty";

	db.execSQL("DROP TABLE IF EXISTS "+databaseTableName);
	db.execSQL("CREATE TABLE IF NOT EXISTS "+databaseTableName+" ("+FacultyMemberTableInfo.id+" INTEGER PRIMARY KEY,"+FacultyMemberTableInfo.name+" TEXT,"+FacultyMemberTableInfo.designation+" TEXT,"+FacultyMemberTableInfo.cellNumber+" TEXT,"+FacultyMemberTableInfo.email+" TEXT"+");");
	i = 0;
	db.execSQL("INSERT INTO "+databaseTableName+" VALUES ('"+i+++"','Prof.Dr.Mustafizur Rahman','Professor & Head','01830003270','headdtt@aust.edu')");
	db.execSQL("INSERT INTO "+databaseTableName+" VALUES ('"+i+++"','Dr.Ahmed Jalal Uddin','Professor','01716451225','jalaluddin2003@yahoo.com')");
	db.execSQL("INSERT INTO "+databaseTableName+" VALUES ('"+i+++"','Dr.Md.Ismail Chowdhury','Associate Professor','01817004929','chowdhuryismail111 @yahoo.com')");
	db.execSQL("INSERT INTO "+databaseTableName+" VALUES ('"+i+++"','Mr.Lal Mohan Baral','Associate Professor','01712595479','lalmohanb@yahoo.com')");
	db.execSQL("INSERT INTO "+databaseTableName+" VALUES ('"+i+++"','Dr.Md.Rafiqur Rashid','Associate Professor','01717122408','rafiqurrashid.tt@gmail.com')");
	db.execSQL("INSERT INTO "+databaseTableName+" VALUES ('"+i+++"','Mr.A.S.M. Atiquzzaman','Associate Professor','01713023073','sumatiq@yahoo.com')");
	db.execSQL("INSERT INTO "+databaseTableName+" VALUES ('"+i+++"','Dr.Engr.Mohammed Rubaiyat Chowdhury','Associate Professor','N/A','rubaiyat707@yahoo.com')");
	db.execSQL("INSERT INTO "+databaseTableName+" VALUES ('"+i+++"','Mr.Emdadul Haque','Assistant Professor','01716162836','tabliguenet@yahoo.com')");
	db.execSQL("INSERT INTO "+databaseTableName+" VALUES ('"+i+++"','Mr.Md.Ruhul Amin','Assistant Professor','01711979213','ruhulaust@yahoo.com')");
	db.execSQL("INSERT INTO "+databaseTableName+" VALUES ('"+i+++"','Mr.A.K.M.Mobarok Hossain','Assistant Professor','01552346145','mobarok_textech@ yahoo.com')");
	db.execSQL("INSERT INTO "+databaseTableName+" VALUES ('"+i+++"','Ms.Sonia Hossain','Assistant Professor','01715027493','ayan_sonia@yahoo.com')");
	db.execSQL("INSERT INTO "+databaseTableName+" VALUES ('"+i+++"','Mr.Mohammad Mahbubul Alam','Assistant Professor','01914712001','mahbubula@gmail.com')");
	db.execSQL("INSERT INTO "+databaseTableName+" VALUES ('"+i+++"','Engr.Mohammad Faizur Rahman(Rashed)','Assistant Professor','01711209871','rashedtex@gmail.com')");
	db.execSQL("INSERT INTO "+databaseTableName+" VALUES ('"+i+++"','Mr.Chowdhury Jony Moin','Assistant Professor','01711782461','mointex23@yahoo.com')");
	db.execSQL("INSERT INTO "+databaseTableName+" VALUES ('"+i+++"','Mr.Md.Koushic Uddin','Assistant Professor','01818252577','koushik.tex@gmail.com')");
	db.execSQL("INSERT INTO "+databaseTableName+" VALUES ('"+i+++"','Engr.Mohammad Gias Uddin','Assistant Professor','01557863757','giasdtt@gmail.com')");
	db.execSQL("INSERT INTO "+databaseTableName+" VALUES ('"+i+++"','Mr.Sheikh Nazmul Hoque','Assistant Professor','01714329518','rana_gandaria@yahoo.com')");
	db.execSQL("INSERT INTO "+databaseTableName+" VALUES ('"+i+++"','Mr.Md.Ershad Khan','Assistant Professor','01717408274','ekhantex@yahoo.com')");
	db.execSQL("INSERT INTO "+databaseTableName+" VALUES ('"+i+++"','Mr.A.N.M.Masudur Rahman','Assistant Professor','01553342607','masudfabric@yahoo.com')");
	db.execSQL("INSERT INTO "+databaseTableName+" VALUES ('"+i+++"','Mr.Subrata Kumar Saha','Assistant Professor','01678112194','subrata.dtt@aust.edu')");
	db.execSQL("INSERT INTO "+databaseTableName+" VALUES ('"+i+++"','Mr.Jamal Hossen','Assistant Professor','01936306605','jamalsqr@yahoo.com')");
	db.execSQL("INSERT INTO "+databaseTableName+" VALUES ('"+i+++"','Ms.Nasrin Akter','Assistant Professor','01727707119','akter.luna@yahoo.com')");
	db.execSQL("INSERT INTO "+databaseTableName+" VALUES ('"+i+++"','Ms.Asma Begum','Assistant Professor','01714110617','asmabegum@fmakers.com')");
	db.execSQL("INSERT INTO "+databaseTableName+" VALUES ('"+i+++"','Ms.Shaima Islam','Assistant Professor','01716069048','shimuu_14@yahoo.com')");
	db.execSQL("INSERT INTO "+databaseTableName+" VALUES ('"+i+++"','Mr.A.B.M.Sohailud Doulah','Assistant Professor','01749749997','sdoulah@yahoo.com')");
	db.execSQL("INSERT INTO "+databaseTableName+" VALUES ('"+i+++"','Mr.Siyam Quddus Khan','Assistant Professor','01716552237','siyam0516@hotmail.comsiyam0516@hotmail.com')");
	db.execSQL("INSERT INTO "+databaseTableName+" VALUES ('"+i+++"','Mr.Md.Imranul Islam','Assistant Professor','01816321671','imuislam07@yahoo.com')");
	db.execSQL("INSERT INTO "+databaseTableName+" VALUES ('"+i+++"','Mr.Muksit Ahamed Chowdhury','Assistant Professor','01717559009','muksit_text@yahoo.com')");
	db.execSQL("INSERT INTO "+databaseTableName+" VALUES ('"+i+++"','Ms.Nahida Akter','Assistant Professor','01911359268','nahidaela@yahoo.com')");
	db.execSQL("INSERT INTO "+databaseTableName+" VALUES ('"+i+++"','Mr.Md.Ashiqul Islam','Assistant Professor','01714173176','warpnweftintex@gmail.com')");
	db.execSQL("INSERT INTO "+databaseTableName+" VALUES ('"+i+++"','Mohammad Tajul Islam','Assistant Professor','	01914204148','islammohammadtajul @yahoo.com')");
	db.execSQL("INSERT INTO "+databaseTableName+" VALUES ('"+i+++"','Mr.Md.Rashedul Islam','Lecturer','01914224399','shourav_08@yahoo.com')");
	db.execSQL("INSERT INTO "+databaseTableName+" VALUES ('"+i+++"','Ms.Farial Islam Farha','Lecturer','01672490296','farial_fara143@yahoo.com')");
	db.execSQL("INSERT INTO "+databaseTableName+" VALUES ('"+i+++"','Mr.M.Shawkat Hossain','PT(part time)','01193010919','N/A')");


	databaseTableName = "BBAFaculty";

	db.execSQL("DROP TABLE IF EXISTS "+databaseTableName);
	db.execSQL("CREATE TABLE IF NOT EXISTS "+databaseTableName+" ("+FacultyMemberTableInfo.id+" INTEGER PRIMARY KEY,"+FacultyMemberTableInfo.name+" TEXT,"+FacultyMemberTableInfo.designation+" TEXT,"+FacultyMemberTableInfo.cellNumber+" TEXT,"+FacultyMemberTableInfo.email+" TEXT"+");");
	i = 0;
	db.execSQL("INSERT INTO "+databaseTableName+" VALUES ('"+i+++"','Dr. Md. Amanullah','Professor, Head & Dean','N/A','N/A')");
	db.execSQL("INSERT INTO "+databaseTableName+" VALUES ('"+i+++"','Dr. Dipak Kanti Dutta','Professor','01710983993','dutta.sob@aust.edu')");
	db.execSQL("INSERT INTO "+databaseTableName+" VALUES ('"+i+++"','Dr. Shyamapada Biswas','Professor','01827311482','biswas.sob@aust.edu')");
	db.execSQL("INSERT INTO "+databaseTableName+" VALUES ('"+i+++"','Mr. Salman Salem Shinwary','Assistant Professor','01711130551','shinwary.aust@gmail.com')");
	db.execSQL("INSERT INTO "+databaseTableName+" VALUES ('"+i+++"','Mr. Saleh Mohammed Mashehdul Islam','Assistant Professor','01711666469','saleh.sob@aust.edu')");
	db.execSQL("INSERT INTO "+databaseTableName+" VALUES ('"+i+++"','Mr. Md. Jahidur Rahman','Assistant Professor','01712523152','jahid2010bd@gmail.com')");
	db.execSQL("INSERT INTO "+databaseTableName+" VALUES ('"+i+++"','Ms. Parul Akhter','Assistant Professor','01817087978','paru25.1980@gmail.com')");
	db.execSQL("INSERT INTO "+databaseTableName+" VALUES ('"+i+++"','Mr. SM Shafiul Alam','Assistant Professor','01553137779','shafistore@gmail.com')");
	db.execSQL("INSERT INTO "+databaseTableName+" VALUES ('"+i+++"','Mr. Mrinal Kanti Paul','Assistant Professor','N/A','mkantipaul@yahoo.com')");
	db.execSQL("INSERT INTO "+databaseTableName+" VALUES ('"+i+++"','Ms. Naznin Sultana Chaity','Assistant Professor','01711194791','nschaity@gmail.com')");
	db.execSQL("INSERT INTO "+databaseTableName+" VALUES ('"+i+++"','Mr. Mashiur Rahman','Assistant Professor','01713430595','mashiur_1953@yahoo.com')");
	db.execSQL("INSERT INTO "+databaseTableName+" VALUES ('"+i+++"','Mr. Kazi Ahmed Farhan','Assistant Professor','N/A','kazi.ahmed.farhan@gmail.com')");
	db.execSQL("INSERT INTO "+databaseTableName+" VALUES ('"+i+++"','Mr. Md. Shak Forid','Assistant Professor','N/A','sk4431@gmail.com')");
	db.execSQL("INSERT INTO "+databaseTableName+" VALUES ('"+i+++"','Mr. Md. Mahfujur Rahman','Assistant Professor','01711707552','farsi879@gmail.com')");
	db.execSQL("INSERT INTO "+databaseTableName+" VALUES ('"+i+++"','Ms. Sarah Chowdhury','Assistant Professor','01746400000','efa.sarah@gmail.com')");
	db.execSQL("INSERT INTO "+databaseTableName+" VALUES ('"+i+++"','Ms. Sanjida Sharmin','Assistant Professor','01726740666','sanjida294@yahoo.com')");
	db.execSQL("INSERT INTO "+databaseTableName+" VALUES ('"+i+++"','Ms. Rifat Parveen Bokhari','Lecturer','01915326556','r.bokhari_75@yahoo.com')");
	db.execSQL("INSERT INTO "+databaseTableName+" VALUES ('"+i+++"','Ms. Liana Anwar','Lecturer','01717986574','liana.anwar@gmail.com')");
	db.execSQL("INSERT INTO "+databaseTableName+" VALUES ('"+i+++"','Ms. Salma Akter','Lecturer','	01674820243','shimu_du99@yahoo.com')");
	db.execSQL("INSERT INTO "+databaseTableName+" VALUES ('"+i+++"','Ms. Naznin Akhter','Lecturer','01710504444','naznin46@gmail.com')");
	db.execSQL("INSERT INTO "+databaseTableName+" VALUES ('"+i+++"','Mr. Md. Hafez','Lecturer','01911215380','mdhafez8@gmail.com')");


	databaseTableName = "ArtsAndScienceFaculty";

	db.execSQL("DROP TABLE IF EXISTS "+databaseTableName);
	db.execSQL("CREATE TABLE IF NOT EXISTS "+databaseTableName+" ("+FacultyMemberTableInfo.id+" INTEGER PRIMARY KEY,"+FacultyMemberTableInfo.name+" TEXT,"+FacultyMemberTableInfo.designation+" TEXT,"+FacultyMemberTableInfo.cellNumber+" TEXT,"+FacultyMemberTableInfo.email+" TEXT"+");");
	i = 0;
	db.execSQL("INSERT INTO "+databaseTableName+" VALUES ('"+i+++"','Dr. M. Shahabuddin','Professor & Head','01717464407','headas@aust.edu')");
	db.execSQL("INSERT INTO "+databaseTableName+" VALUES ('"+i+++"','Dr. Md. Ashraf Uddin','Professor(Math)','01715041008','auddin_math @yahoo.com')");
	db.execSQL("INSERT INTO "+databaseTableName+" VALUES ('"+i+++"','Dr. Taposh Kumar Das','Associate Professor (Math)','01966852156','taposh_math @yahoo.com')");
	db.execSQL("INSERT INTO "+databaseTableName+" VALUES ('"+i+++"','Ms. Humaira Farzana','Associate Professor (Math)','01731189068','humaira_tithy @yahoo.com')");
	db.execSQL("INSERT INTO "+databaseTableName+" VALUES ('"+i+++"','Mr. Md. Shameem Reza','Associate Professor (Math)','01920160979','msreza1 @yahoo.com')");
	db.execSQL("INSERT INTO "+databaseTableName+" VALUES ('"+i+++"','Ms. Aparna Das','Associate Professor (Math)','01711974090','aparnadas143 @yahoo.com')");
	db.execSQL("INSERT INTO "+databaseTableName+" VALUES ('"+i+++"','Ms Jannatun Nayeem','Associate Professor (Math)','01816563396','acm.math @gmail.com')");
	db.execSQL("INSERT INTO "+databaseTableName+" VALUES ('"+i+++"','Dr. Sreebash Chandra Paul','Associate Professor (Math)','01726932889','sreebash @yahoo.com')");
	db.execSQL("INSERT INTO "+databaseTableName+" VALUES ('"+i+++"','Mr. Muhammad Saiful Islam Mallik','Associate Professor (Math)','01716798078','saiful1185@ yahoo.com')");
	db.execSQL("INSERT INTO "+databaseTableName+" VALUES ('"+i+++"','Mr. Kazi Ekramul Hoque','Associate Professor (Math)','01716934453','ekram_math.as @aust.edu')");
	db.execSQL("INSERT INTO "+databaseTableName+" VALUES ('"+i+++"','Mr. Muhammad Sajjad Hossain','Associate Professor (Math)','01718210887','msh80_edu@ yahoo.com')");
	db.execSQL("INSERT INTO "+databaseTableName+" VALUES ('"+i+++"','Mr. Md. Masum Billah','Associate Professor (Math)','01715400423','mmb.edu @gmail.com')");
	db.execSQL("INSERT INTO "+databaseTableName+" VALUES ('"+i+++"','Mr. Md. Raknuzzaman','Lecturer (Math)','N/A','rrokondu@ yahoo.com')");
	db.execSQL("INSERT INTO "+databaseTableName+" VALUES ('"+i+++"','Mr. Mohammad Azizul Hoque','Lecturer (Math)','01716231429','azizulhq812@ gmail.com')");
	db.execSQL("INSERT INTO "+databaseTableName+" VALUES ('"+i+++"','Ms. Samsad Jahan','Assistant Professor (Statistics)','01716942771','samsad.jahan@ gmail.com')");
	db.execSQL("INSERT INTO "+databaseTableName+" VALUES ('"+i+++"','Ifte Khyrul Amin Abbas','Lecturer (Statistics)','N/A','parag25parag@ yahoo.com')");
	db.execSQL("INSERT INTO "+databaseTableName+" VALUES ('"+i+++"','Dr. Mohammad Hamidur Rahman Khan','Associate Professor (physics)','01712205280','hamid1272n @yahoo.com')");
	db.execSQL("INSERT INTO "+databaseTableName+" VALUES ('"+i+++"','Dr. Md. Ashrafur Rahman','Associate Professor (physics)','01818341550','mdashrafur.as @aust.edu')");
	db.execSQL("INSERT INTO "+databaseTableName+" VALUES ('"+i+++"','Mr. Md. Salim Hossain','Assistant Professor (physics)','01732168592','ssarker77 @yahoo.com')");
	db.execSQL("INSERT INTO "+databaseTableName+" VALUES ('"+i+++"','Ms. Tamanna Afroze','Assistant Professor (physics)','01819261562','tamanna_af @yahoo.com')");
	db.execSQL("INSERT INTO "+databaseTableName+" VALUES ('"+i+++"','Mr. Zaid Bin Mahbub','Assistant Professor (physics)','N/A','zaidbin@gmail.com')");
	db.execSQL("INSERT INTO "+databaseTableName+" VALUES ('"+i+++"','Mr. Md. Zaman Molla','Assistant Professor (physics)','N/A','zaman_molla @yahoo.com')");
	db.execSQL("INSERT INTO "+databaseTableName+" VALUES ('"+i+++"','Mr. Md. Shamsul Alam Khan','Assistant Professor (physics)','01911334361','zco_khn @yahoo.co.uk')");
	db.execSQL("INSERT INTO "+databaseTableName+" VALUES ('"+i+++"','Mr. Shaikh Muhammad Abdus Shamid','Lecturerr (physics)','N/A','smashamid @yahoo.com')");
	db.execSQL("INSERT INTO "+databaseTableName+" VALUES ('"+i+++"','Mr. Mohammad Abdur Rashid','Lecturerr (physics)','01721132034','abdur.rashid.as @aust.edu')");
	db.execSQL("INSERT INTO "+databaseTableName+" VALUES ('"+i+++"','Mr. Md. Kamruzzaman','Lecturerr (physics)','01723934685','m_kamruzzaman15 @yahoo.com')");
	db.execSQL("INSERT INTO "+databaseTableName+" VALUES ('"+i+++"','Malay Kumar Sarkar','Lecturerr (physics)','01918071242','malay.phy.ru @gmail.com')");
	db.execSQL("INSERT INTO "+databaseTableName+" VALUES ('"+i+++"','Ms. Sabrina Sharmin','Lecturerr (physics)','01819486154','ssr_8219 @yahoo.com')");
	db.execSQL("INSERT INTO "+databaseTableName+" VALUES ('"+i+++"','Dr. Aftab Uddin Ahmed','Visiting Professor (Chemistry)','01817609938','toeaftab@ yahoo.com')");
	db.execSQL("INSERT INTO "+databaseTableName+" VALUES ('"+i+++"','Dr. S.M. Abdul Karim','Assistant Professor (Chemistry)','01552495088','smakarim2002@ yahoo.com')");
	db.execSQL("INSERT INTO "+databaseTableName+" VALUES ('"+i+++"','Dr.Farzana Ferdoush','Assistant Professor (Chemistry)','01732807437','satuacct@ yahoo.com')");
	db.execSQL("INSERT INTO "+databaseTableName+" VALUES ('"+i+++"','Dr. Begum Nadira Ferdousi','Assistant Professor (Chemistry)','01758112590','bnferdousi@ yahoo.com')");
	db.execSQL("INSERT INTO "+databaseTableName+" VALUES ('"+i+++"','Mr. Mohammad Abdul Kader','Assistant Professor (Chemistry)','01711310850','kader1512@ yahoo.com')");
	db.execSQL("INSERT INTO "+databaseTableName+" VALUES ('"+i+++"','Dr. Samar Kumar Guha','Assistant Professor (Chemistry)','01759676856','samarkg@ yahoo.com')");
	db.execSQL("INSERT INTO "+databaseTableName+" VALUES ('"+i+++"','Mr. Md. Shakhawat Hossain','Lecturerr (Chemistry)','N/A','N/A')");
	db.execSQL("INSERT INTO "+databaseTableName+" VALUES ('"+i+++"','Ms. Shamima Nasreen','Lecturerr (Chemistry)','01912101798','sn_shamima@ yahoo.com')");
	db.execSQL("INSERT INTO "+databaseTableName+" VALUES ('"+i+++"','Mr. Mohammad Shahid Ullah','Lecturerr (Chemistry)','01678114543','shahid_chem_du @yahoo.com')");
	db.execSQL("INSERT INTO "+databaseTableName+" VALUES ('"+i+++"','Mr. Md. Aminul Islam','Lecturerr (Chemistry)','01198387152','aminul3021sh@ yahoo.com')");
	db.execSQL("INSERT INTO "+databaseTableName+" VALUES ('"+i+++"','Mr. Md. Mahbub Alam','Lecturerr (Chemistry)','01818736492','mahbub.as @aust.edu')");
	db.execSQL("INSERT INTO "+databaseTableName+" VALUES ('"+i+++"','Ms. Sabrina Sultana','Lecturerr (Chemistry)','01816604038','sabrina_acctdu @yahoo.com')");
	db.execSQL("INSERT INTO "+databaseTableName+" VALUES ('"+i+++"','Ms. Ruba Rumanna','Assistant Professor (Economics)','01755619919','rubachy@ yahoo.com')");
	db.execSQL("INSERT INTO "+databaseTableName+" VALUES ('"+i+++"','Ms. Josinta Zinia','Assistant Professor (Sociology)','01921427626','j_zinia@yahoo.com')");
	db.execSQL("INSERT INTO "+databaseTableName+" VALUES ('"+i+++"','Ms. Shamima Nasrain','Assistant Professor (Sociology)','01716779575','shamima_28@ yahoo.com')");
	db.execSQL("INSERT INTO "+databaseTableName+" VALUES ('"+i+++"','Mr. Aminul Islam','Assistant Professor (Sociology)','	01932025432','aminulislam.as@ aust.edu')");
	db.execSQL("INSERT INTO "+databaseTableName+" VALUES ('"+i+++"','Mr. Md. Iftekhar Arafath','Assistant Professor (English)','01678116191','iftekhar_02@ yahoo.com')");
	db.execSQL("INSERT INTO "+databaseTableName+" VALUES ('"+i+++"','Mr. Mohammad Rukanuddin','Assistant Professor (English)','01818034196','rukan2009 @gmail.com')");
	db.execSQL("INSERT INTO "+databaseTableName+" VALUES ('"+i+++"','Mr. Kazi Dawood Hafiz','Assistant Professor (English)','01718518231','Kazidawood @gmail.com')");
	db.execSQL("INSERT INTO "+databaseTableName+" VALUES ('"+i+++"','Ms. Rukaia Islam','Lecturer (English)','01775752054','ruku.eng13 @gmail.com')");
	
	
	databaseTableName = "EEEFaculty";

	db.execSQL("DROP TABLE IF EXISTS "+databaseTableName);
	db.execSQL("CREATE TABLE IF NOT EXISTS "+databaseTableName+" ("+FacultyMemberTableInfo.id+" INTEGER PRIMARY KEY,"+FacultyMemberTableInfo.name+" TEXT,"+FacultyMemberTableInfo.designation+" TEXT,"+FacultyMemberTableInfo.cellNumber+" TEXT,"+FacultyMemberTableInfo.email+" TEXT"+");");
	i = 0;
	db.execSQL("INSERT INTO "+databaseTableName+" VALUES ('"+i+++"','Prof. Dr. Abdur Rahim Mollah','Professor & Head','','')");
	db.execSQL("INSERT INTO "+databaseTableName+" VALUES ('"+i+++"','Prof. Dr. Abdur Rahim Mollah','Professor','','')");
	db.execSQL("INSERT INTO "+databaseTableName+" VALUES ('"+i+++"','Prof. Dr. Abu Hamed M. Abdur Rahim','Professor','','')");
	db.execSQL("INSERT INTO "+databaseTableName+" VALUES ('"+i+++"','Prof. Dr. Satyen Biswas','Professor','','')");
	db.execSQL("INSERT INTO "+databaseTableName+" VALUES ('"+i+++"','Prof. Dr. A.K.M. Ehtesanul Islam','Professor','','')");
	db.execSQL("INSERT INTO "+databaseTableName+" VALUES ('"+i+++"','M. Abul Hussain','Associate Professor','','')");
	db.execSQL("INSERT INTO "+databaseTableName+" VALUES ('"+i+++"','Golam Mostafa','Associate Professor','','')");
	db.execSQL("INSERT INTO "+databaseTableName+" VALUES ('"+i+++"','Masoodur Rahman Khan','Associate Professor','','')");
	db.execSQL("INSERT INTO "+databaseTableName+" VALUES ('"+i+++"','Mahfujur Rashid Ferdous','Associate Professor','','')");
	db.execSQL("INSERT INTO "+databaseTableName+" VALUES ('"+i+++"','Jamal Uddin Ahmed','Expert Faculty','','')");
	db.execSQL("INSERT INTO "+databaseTableName+" VALUES ('"+i+++"','Dr. Muhammad Riazul Hamid','Associate Professor','','')");
	db.execSQL("INSERT INTO "+databaseTableName+" VALUES ('"+i+++"','Dr. Tareq Aziz','Associate Professor','','')");
	db.execSQL("INSERT INTO "+databaseTableName+" VALUES ('"+i+++"','Dr. Engr A.K.M. Baki','Associate Professor','','')");
	db.execSQL("INSERT INTO "+databaseTableName+" VALUES ('"+i+++"','Ahmadullah Siddiq','Assistant Professor','','')");
	db.execSQL("INSERT INTO "+databaseTableName+" VALUES ('"+i+++"','Monjur Morshed','Assistant Professor','','')");
	db.execSQL("INSERT INTO "+databaseTableName+" VALUES ('"+i+++"','Bobby Barua','Assistant Professor','','')");
	db.execSQL("INSERT INTO "+databaseTableName+" VALUES ('"+i+++"','Ismat Zareen','Assistant Professor','','')");
	db.execSQL("INSERT INTO "+databaseTableName+" VALUES ('"+i+++"','Md. Meganur Rhaman','Assistant Professor','','')");
	db.execSQL("INSERT INTO "+databaseTableName+" VALUES ('"+i+++"','Mr. Mohammad Tawhidul Alam','Assistant Professor','','')");
	db.execSQL("INSERT INTO "+databaseTableName+" VALUES ('"+i+++"','Anupama Tasneem','Assistant Professor ','','')");
	db.execSQL("INSERT INTO "+databaseTableName+" VALUES ('"+i+++"','Md. Jakaria Rahimi','Assistant Professor ','','')");
	db.execSQL("INSERT INTO "+databaseTableName+" VALUES ('"+i+++"','Shariful Islam','Assistant Professor ','','')");
	db.execSQL("INSERT INTO "+databaseTableName+" VALUES ('"+i+++"','Omar Farrok','Assistant Professor ','','')");
	db.execSQL("INSERT INTO "+databaseTableName+" VALUES ('"+i+++"','Russel Reza Mahmud','Assistant Professor ','','')");
	db.execSQL("INSERT INTO "+databaseTableName+" VALUES ('"+i+++"','Nahyan Al Mahmud','Assistant Professor ','','')");
	db.execSQL("INSERT INTO "+databaseTableName+" VALUES ('"+i+++"','Mr. M. M. Atiqur Rahman','Assistant Professor','','')");
	db.execSQL("INSERT INTO "+databaseTableName+" VALUES ('"+i+++"','Zannatul Ferdous','Assistant Professor','','')");
	db.execSQL("INSERT INTO "+databaseTableName+" VALUES ('"+i+++"','Khandakar Mohammad Ishtiak','Assistant Professor ','','')");
	db.execSQL("INSERT INTO "+databaseTableName+" VALUES ('"+i+++"','Ahammad','Assistant Professor','','')");
	db.execSQL("INSERT INTO "+databaseTableName+" VALUES ('"+i+++"','Hasib Md. Abid Bin Farid','Assistant Professor','','')");
	db.execSQL("INSERT INTO "+databaseTableName+" VALUES ('"+i+++"','Mohammad Minhaz Akram','Assistant Professor','','')");
	db.execSQL("INSERT INTO "+databaseTableName+" VALUES ('"+i+++"','Towhid Adnan Chowdhury','Assistant Professor','','')");
	db.execSQL("INSERT INTO "+databaseTableName+" VALUES ('"+i+++"','Safayat-Al-Imam','Assistant Professor','','')");
	db.execSQL("INSERT INTO "+databaseTableName+" VALUES ('"+i+++"','Aziz-Un-Nur Ibn Saif','Lecturer','','')");
	db.execSQL("INSERT INTO "+databaseTableName+" VALUES ('"+i+++"','Khandaker Lubaba Bashar','Lecturer','','')");
	db.execSQL("INSERT INTO "+databaseTableName+" VALUES ('"+i+++"','Md. Aminur RahmanLecturer','Lecturer','','')");
	db.execSQL("INSERT INTO "+databaseTableName+" VALUES ('"+i+++"','Kazi Khurshidi Haque Dia','Lecturer','','')");
	db.execSQL("INSERT INTO "+databaseTableName+" VALUES ('"+i+++"','Shaila Arif','Lecturer','','')");
	db.execSQL("INSERT INTO "+databaseTableName+" VALUES ('"+i+++"','Md. Faysal Nayan','Lecturer','','')");
	db.execSQL("INSERT INTO "+databaseTableName+" VALUES ('"+i+++"','Md. Monirul Islam','Lecturer','','')");
	db.execSQL("INSERT INTO "+databaseTableName+" VALUES ('"+i+++"','Kazi Tauseef Mohammad','Lecturer','','')");
	db.execSQL("INSERT INTO "+databaseTableName+" VALUES ('"+i+++"','Md. Sariful Islam','Lecturer','','')");
	db.execSQL("INSERT INTO "+databaseTableName+" VALUES ('"+i+++"','Taniza Marium','Lecturer','','')");
	db.execSQL("INSERT INTO "+databaseTableName+" VALUES ('"+i+++"','Sharmin Sobhan','Lecturer','','')");
	db.execSQL("INSERT INTO "+databaseTableName+" VALUES ('"+i+++"','Israt Jahan','Lecturer','','')");
	db.execSQL("INSERT INTO "+databaseTableName+" VALUES ('"+i+++"','Md. Abu Shahab Mollah','Lecturer','','')");
	db.execSQL("INSERT INTO "+databaseTableName+" VALUES ('"+i+++"','Md. Saiful Arefin Mojumder','Lecturer','','')");
	db.execSQL("INSERT INTO "+databaseTableName+" VALUES ('"+i+++"','Tanvir Ahmad','Lecturer','','')");
	db.execSQL("INSERT INTO "+databaseTableName+" VALUES ('"+i+++"','Shuvashis Das Gupta','Lecturer','','')");
	db.execSQL("INSERT INTO "+databaseTableName+" VALUES ('"+i+++"','Sumit Narayan Saurov','Lecturer','','')");
	db.execSQL("INSERT INTO "+databaseTableName+" VALUES ('"+i+++"','Naznin Sultana','Lecturer','','')");
	db.execSQL("INSERT INTO "+databaseTableName+" VALUES ('"+i+++"','Dewan Monzurul Islam','Lecturer','','')");
	db.execSQL("INSERT INTO "+databaseTableName+" VALUES ('"+i+++"','Md. Istiaque Rahaman Lecturer','Lecturer','','')");
	
	db.close();
	}

}
