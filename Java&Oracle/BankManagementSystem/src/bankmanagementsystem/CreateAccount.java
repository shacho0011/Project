/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bankmanagementsystem;


import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
//import sun.security.util.Password;

/**
 *
 * @author Shadhin
 */
public class CreateAccount extends JFrame{
    JPanel PApplicationForm = new JPanel();
    void applicationform(){
    JFrame ApplicationForm = new JFrame("Application Form");
    ApplicationForm.setBounds(0, 0, 1000, 600);
    ApplicationForm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    JButton Submit;
    JButton Cancel;
    
    JPanel PApplicationForm = new JPanel();
    PApplicationForm.setLayout(null);
    PApplicationForm.setBounds(0, 0, 1000, 600);
    PApplicationForm.setBackground(Color.cyan);
    
    final CheckboxGroup sex = new CheckboxGroup();
    final Checkbox male = new Checkbox("Male", sex, true);
    final Checkbox female = new Checkbox("Female", sex, false);
   // JRadioButton other = new JRadioButton("Other");
    add(male);
    add(female);
    //sex.add(other);
    male.setBounds(140, 230, 150, 20);
    female.setBounds(290, 230, 150, 20);
   // other.setBounds(320, 170, 100, 20);
    //male.setSelected(true);
    //female.setSelected(false);
    //other.setSelected(false);
    PApplicationForm.add(male);
    PApplicationForm.add(female);
   // PApplicationForm.add(other);
    
    final CheckboxGroup accountcurrency = new CheckboxGroup();
    Checkbox BDT = new Checkbox("BDT", accountcurrency, true);
    Checkbox USD = new Checkbox("USD", accountcurrency, false);
    Checkbox EURO = new Checkbox("EURO", accountcurrency, false);
    add(BDT);
    add(USD);
    add(EURO);
    BDT.setBounds(650, 110, 100, 20);
    USD.setBounds(750, 110, 100, 20);
    EURO.setBounds(850, 110, 100, 20);
    //BDT.setSelected(true);
    //USD.setSelected(false);
    //EURO.setSelected(false);
    PApplicationForm.add(BDT);
    PApplicationForm.add(USD);
    PApplicationForm.add(EURO);
    
    
    final CheckboxGroup checqbookrequest = new CheckboxGroup();
    Checkbox leaf50 = new Checkbox("50 Leaf", checqbookrequest, true);
    Checkbox leaf75 = new Checkbox("75 Leaf", checqbookrequest, false);
    Checkbox leaf100 = new Checkbox("100 Leaf", checqbookrequest, false);
    
    add(leaf50);
    add(leaf75);
    add(leaf100);
    leaf50.setBounds(650, 170, 100, 20);
    leaf75.setBounds(750, 170, 100, 20);
    leaf100.setBounds(850, 170, 100, 20);
    //leaf50.setSelected(true);
    //leaf75.setSelected(false);
    //leaf100.setSelected(false);
    PApplicationForm.add(leaf50);
    PApplicationForm.add(leaf75);
    PApplicationForm.add(leaf100);
    
    final CheckboxGroup atmcardrequest = new CheckboxGroup();
    Checkbox ATMyes = new Checkbox("Yes", atmcardrequest, true);
    Checkbox ATMno = new Checkbox("No", atmcardrequest, false);
    
    add(ATMyes);
    add(ATMno);
    ATMyes.setBounds(650, 290, 150, 20);
    ATMno.setBounds(800, 290, 150, 20);
    //ATMyes.setSelected(true);
    //ATMno.setSelected(false);
    PApplicationForm.add(ATMyes);
    PApplicationForm.add(ATMno);
    
    final Choice accounttype = new Choice();
    accounttype.setBounds(650, 80, 300, 20);
    accounttype.addItem("Saving Account");
    accounttype.addItem("Current Account");
    accounttype.addItem("Business Account");
    accounttype.addItem("Jonit Account");
    accounttype.addItem("Fixed Deposit");
    PApplicationForm.add(accounttype);
    
    final Choice BDay = new Choice();
    BDay.setBounds(140, 290, 90, 20);
    BDay.addItem("01");
    BDay.addItem("02");
    BDay.addItem("03");
    BDay.addItem("04");
    BDay.addItem("05");
    BDay.addItem("06");
    BDay.addItem("07");
    BDay.addItem("08");
    BDay.addItem("09");
    BDay.addItem("10");
    BDay.addItem("11");
    BDay.addItem("12");
    BDay.addItem("13");
    BDay.addItem("14");
    BDay.addItem("15");
    BDay.addItem("16");
    BDay.addItem("17");
    BDay.addItem("18");
    BDay.addItem("19");
    BDay.addItem("20");
    BDay.addItem("21");
    BDay.addItem("22");
    BDay.addItem("23");
    BDay.addItem("24");
    BDay.addItem("25");
    BDay.addItem("26");
    BDay.addItem("27");
    BDay.addItem("28");
    BDay.addItem("29");
    BDay.addItem("30");
    BDay.addItem("31");
    
    final Choice BMonth = new Choice();
    BMonth.setBounds(240, 290, 90, 20);
    BMonth.addItem("January");
    BMonth.addItem("February");
    BMonth.addItem("March");
    BMonth.addItem("April");
    BMonth.addItem("May");
    BMonth.addItem("June");
    BMonth.addItem("July");
    BMonth.addItem("August");
    BMonth.addItem("September");
    BMonth.addItem("October");
    BMonth.addItem("November");
    BMonth.addItem("December");
    
    final Choice BYear = new Choice();
    BYear.setBounds(340, 290, 100, 20);
    BYear.addItem("1981");
    BYear.addItem("1982");
    BYear.addItem("1983");
    BYear.addItem("1984");
    BYear.addItem("1985");
    BYear.addItem("1986");
    BYear.addItem("1987");
    BYear.addItem("1988");
    BYear.addItem("1989");
    BYear.addItem("1990");
    BYear.addItem("1991");
    BYear.addItem("1992");
    BYear.addItem("1993");
    BYear.addItem("1994");
    BYear.addItem("1995");
    BYear.addItem("1996");
    BYear.addItem("1997");
    BYear.addItem("1998");
    BYear.addItem("1999");
    BYear.addItem("2000");
    BYear.addItem("2001");
    BYear.addItem("2002");
    BYear.addItem("2003");
    BYear.addItem("2004");
    BYear.addItem("2005");
    BYear.addItem("2006");
    BYear.addItem("2007");
    BYear.addItem("2008");
    BYear.addItem("2009");
    BYear.addItem("2010");
    BYear.addItem("2011");
    BYear.addItem("2012");
    BYear.addItem("2013");
    BYear.addItem("2014");
    BYear.addItem("2015");
    BYear.addItem("2016");
    BYear.addItem("2017");
    BYear.addItem("2018");
    BYear.addItem("2019");
    BYear.addItem("2020");
    BYear.addItem("2021");
    BYear.addItem("2022");
    BYear.addItem("2023");
    BYear.addItem("2024");
    BYear.addItem("2025");
    BYear.addItem("2026");
    BYear.addItem("2027");
    BYear.addItem("2028");
    BYear.addItem("2029");
    BYear.addItem("2030");
    
    PApplicationForm.add(BDay);
    PApplicationForm.add(BMonth);
    PApplicationForm.add(BYear);
    
    final Choice ODay = new Choice();
    ODay.setBounds(650, 230, 90, 20);
    ODay.addItem("01");
    ODay.addItem("02");
    ODay.addItem("03");
    ODay.addItem("04");
    ODay.addItem("05");
    ODay.addItem("06");
    ODay.addItem("07");
    ODay.addItem("08");
    ODay.addItem("09");
    ODay.addItem("10");
    ODay.addItem("11");
    ODay.addItem("12");
    ODay.addItem("13");
    ODay.addItem("14");
    ODay.addItem("15");
    ODay.addItem("16");
    ODay.addItem("17");
    ODay.addItem("18");
    ODay.addItem("19");
    ODay.addItem("20");
    ODay.addItem("21");
    ODay.addItem("22");
    ODay.addItem("23");
    ODay.addItem("24");
    ODay.addItem("25");
    ODay.addItem("26");
    ODay.addItem("27");
    ODay.addItem("28");
    ODay.addItem("29");
    ODay.addItem("30");
    ODay.addItem("31");
    
    final Choice OMonth = new Choice();
    OMonth.setBounds(750, 230, 90, 20);
    OMonth.addItem("January");
    OMonth.addItem("February");
    OMonth.addItem("March");
    OMonth.addItem("April");
    OMonth.addItem("May");
    OMonth.addItem("June");
    OMonth.addItem("July");
    OMonth.addItem("August");
    OMonth.addItem("September");
    OMonth.addItem("October");
    OMonth.addItem("November");
    OMonth.addItem("December");
    
    final Choice OYear = new Choice();
    OYear.setBounds(850, 230, 100, 20);
    OYear.addItem("1981");
    OYear.addItem("1982");
    OYear.addItem("1983");
    OYear.addItem("1984");
    OYear.addItem("1985");
    OYear.addItem("1986");
    OYear.addItem("1987");
    OYear.addItem("1988");
    OYear.addItem("1989");
    OYear.addItem("1990");
    OYear.addItem("1991");
    OYear.addItem("1992");
    OYear.addItem("1993");
    OYear.addItem("1994");
    OYear.addItem("1995");
    OYear.addItem("1996");
    OYear.addItem("1997");
    OYear.addItem("1998");
    OYear.addItem("1999");
    OYear.addItem("2000");
    OYear.addItem("2001");
    OYear.addItem("2002");
    OYear.addItem("2003");
    OYear.addItem("2004");
    OYear.addItem("2005");
    OYear.addItem("2006");
    OYear.addItem("2007");
    OYear.addItem("2008");
    OYear.addItem("2009");
    OYear.addItem("2010");
    OYear.addItem("2011");
    OYear.addItem("2012");
    OYear.addItem("2013");
    OYear.addItem("2014");
    OYear.addItem("2015");
    OYear.addItem("2016");
    OYear.addItem("2017");
    OYear.addItem("2018");
    OYear.addItem("2019");
    OYear.addItem("2020");
    OYear.addItem("2021");
    OYear.addItem("2022");
    OYear.addItem("2023");
    OYear.addItem("2024");
    OYear.addItem("2025");
    OYear.addItem("2026");
    OYear.addItem("2027");
    OYear.addItem("2028");
    OYear.addItem("2029");
    OYear.addItem("2030");
    
    PApplicationForm.add(ODay);
    PApplicationForm.add(OMonth);
    PApplicationForm.add(OYear);
    
    final Choice EDay = new Choice();
    EDay.setBounds(650, 260, 90, 20);
    EDay.addItem("01");
    EDay.addItem("02");
    EDay.addItem("03");
    EDay.addItem("04");
    EDay.addItem("05");
    EDay.addItem("06");
    EDay.addItem("07");
    EDay.addItem("08");
    EDay.addItem("09");
    EDay.addItem("10");
    EDay.addItem("11");
    EDay.addItem("12");
    EDay.addItem("13");
    EDay.addItem("14");
    EDay.addItem("15");
    EDay.addItem("16");
    EDay.addItem("17");
    EDay.addItem("18");
    EDay.addItem("19");
    EDay.addItem("20");
    EDay.addItem("21");
    EDay.addItem("22");
    EDay.addItem("23");
    EDay.addItem("24");
    EDay.addItem("25");
    EDay.addItem("26");
    EDay.addItem("27");
    EDay.addItem("28");
    EDay.addItem("29");
    EDay.addItem("30");
    EDay.addItem("31");
    
    final Choice EMonth = new Choice();
    EMonth.setBounds(750, 260, 90, 20);
    EMonth.addItem("January");
    EMonth.addItem("February");
    EMonth.addItem("March");
    EMonth.addItem("April");
    EMonth.addItem("May");
    EMonth.addItem("June");
    EMonth.addItem("July");
    EMonth.addItem("August");
    EMonth.addItem("September");
    EMonth.addItem("October");
    EMonth.addItem("November");
    EMonth.addItem("December");
    
    final Choice EYear = new Choice();
    EYear.setBounds(850, 260, 100, 20);
    EYear.addItem("1981");
    EYear.addItem("1982");
    EYear.addItem("1983");
    EYear.addItem("1984");
    EYear.addItem("1985");
    EYear.addItem("1986");
    EYear.addItem("1987");
    EYear.addItem("1988");
    EYear.addItem("1989");
    EYear.addItem("1990");
    EYear.addItem("1991");
    EYear.addItem("1992");
    EYear.addItem("1993");
    EYear.addItem("1994");
    EYear.addItem("1995");
    EYear.addItem("1996");
    EYear.addItem("1997");
    EYear.addItem("1998");
    EYear.addItem("1999");
    EYear.addItem("2000");
    EYear.addItem("2001");
    EYear.addItem("2002");
    EYear.addItem("2003");
    EYear.addItem("2004");
    EYear.addItem("2005");
    EYear.addItem("2006");
    EYear.addItem("2007");
    EYear.addItem("2008");
    EYear.addItem("2009");
    EYear.addItem("2010");
    EYear.addItem("2011");
    EYear.addItem("2012");
    EYear.addItem("2013");
    EYear.addItem("2014");
    EYear.addItem("2015");
    EYear.addItem("2016");
    EYear.addItem("2017");
    EYear.addItem("2018");
    EYear.addItem("2019");
    EYear.addItem("2020");
    EYear.addItem("2021");
    EYear.addItem("2022");
    EYear.addItem("2023");
    EYear.addItem("2024");
    EYear.addItem("2025");
    EYear.addItem("2026");
    EYear.addItem("2027");
    EYear.addItem("2028");
    EYear.addItem("2029");
    EYear.addItem("2030");
    
    PApplicationForm.add(EDay);
    PApplicationForm.add(EMonth);
    PApplicationForm.add(EYear);

    JLabel CreateAccount;
    JLabel Name;
    JLabel FathersName;
    JLabel MothersName;
    JLabel PresentAddress;
    JLabel PermanentAddress;
    JLabel Phone;
    JLabel Email;
    JLabel Sex;
    JLabel Nationality;
    JLabel BirthDate;
    JLabel Profession;
    JLabel Age;
    
    JLabel AccountNo;
    JLabel AccountType;
    JLabel AccountCurrency;
    JLabel DepositMode;
    JLabel ChecqBookRequest;
    JLabel OpeningBalance;
    JLabel OpeningDate;
    JLabel ExpireDate;
    JLabel ATMCardRequest;
    JLabel ReferenceAccountNo;
    
    final JTextField TPresentAddress = new JTextField();
    final JTextField TPermanentAddress = new JTextField();
    final JTextField TPhone = new JTextField();
    final JTextField TEmail = new JTextField();
    //JTextField TSex = new JTextField();
    final JTextField TNationality = new JTextField();
    //JTextField TBirthDate = new JTextField();
 
    
    final JTextField TAge = new JTextField();
    final JTextField TProfession = new JTextField();
    final JTextField TAccountNo = new JTextField();
    //JTextField TAccountType = new JTextField();
    //JTextField TAccountCurrency = new JTextField();
    final JTextField TDepositMode = new JTextField();
    //JTextField TChecqBookRequest = new JTextField();
    final JTextField TOpeningBalance = new JTextField();
    //final JTextField TOpeningDate = new JTextField();
    //final JTextField TExpireDate = new JTextField();
    //JTextField TATMCardRequest = new JTextField();
    final JTextField TReferenceAccountNo = new JTextField();

    CreateAccount = new JLabel();
    CreateAccount.setText("Application Form");
    CreateAccount.setBounds(450, 5, 300, 40);
    
    Name = new JLabel();
    Name.setText("Name:");
    Name.setBounds(10, 50, 120, 20);
    final JTextField TName = new JTextField();
    TName.setBounds(140,50,300,20);
    
    FathersName = new JLabel();
    FathersName.setText("Father's Name");
    FathersName.setBounds(10, 80, 120, 20);
    final JTextField TFathersName = new JTextField();
    TFathersName.setBounds(140,80,300,20);
    
    MothersName = new JLabel();
    MothersName.setText("Mother's Name:");
    MothersName.setBounds(10, 110, 120, 20);
    final JTextField TMothersName = new JTextField();
    TMothersName.setBounds(140,110,300,20);
    
    PresentAddress = new JLabel("Present Address:");
    PresentAddress.setBounds(10, 140, 120, 20);
    TPresentAddress.setBounds(140, 140, 300, 20);
    
    PermanentAddress = new JLabel("Permanent Address:");
    PermanentAddress.setBounds(10, 170, 120, 20);
    TPermanentAddress.setBounds(140, 170, 300, 20);
    
    Phone = new JLabel("Phone:");
    Phone.setBounds(10, 200, 120, 20);
    TPhone.setBounds(140, 200, 300, 20);
    
    Email = new JLabel("Email:");
    Email.setBounds(10, 380, 120, 20);
    TEmail.setBounds(140, 380, 300, 20);
    
    Sex = new JLabel("Sex:");
    Sex.setBounds(10, 230, 120, 20);
    //TSex.setBounds(120, 170, 300, 20);
    
    Nationality = new JLabel("Nationality:");
    Nationality.setBounds(10, 260, 120, 20);
    TNationality.setBounds(140, 260, 300, 20);
    
    BirthDate = new JLabel("Date of Birth:");
    BirthDate.setBounds(10, 290, 120, 20);
    //TBirthDate.setBounds(120, 230, 300, 20);
    
    Age = new JLabel("Age:");
    Age.setBounds(10, 320, 120, 20);
    TAge.setBounds(140, 320, 300, 20);
    
    Profession = new JLabel("Profession:");
    Profession.setBounds(10, 350, 120, 20);
    TProfession.setBounds(140, 350, 300, 20);
    
    AccountNo = new JLabel("Account No:");
    AccountNo.setBounds(500, 50, 140, 20);
    TAccountNo.setBounds(650, 50, 300, 20);
    AccountType = new JLabel("Account Type:");
    AccountType.setBounds(500, 80, 140, 20);
    //TAccountType.setBounds(650, 80, 300, 20);
    AccountCurrency = new JLabel("Account Currency:");
    AccountCurrency.setBounds(500, 110, 140, 20);
    //TAccountCurrency.setBounds(650, 110, 300, 20);
    DepositMode = new JLabel("Deposit Mode:");
    DepositMode.setBounds(500, 140, 140, 20);
    TDepositMode.setBounds(650, 140, 300, 20);
    ChecqBookRequest = new JLabel("Checq Book Request:");
    ChecqBookRequest.setBounds(500, 170, 140, 20);
    //TChecqBookRequest.setBounds(650, 170, 300, 20);
    OpeningBalance = new JLabel("Opening Balance:");
    OpeningBalance.setBounds(500, 200, 140, 20);
    TOpeningBalance.setBounds(650, 200, 300, 20);
    OpeningDate = new JLabel("Opening Date:");
    OpeningDate.setBounds(500, 230, 140, 20);
    //TOpeningDate.setBounds(650, 230, 300, 20);
    ExpireDate = new JLabel("Expire Date:");
    ExpireDate.setBounds(500, 260, 140, 20);
    //TExpireDate.setBounds(650, 260, 300, 20);
    ATMCardRequest = new JLabel("ATM Card Request:");
    ATMCardRequest.setBounds(500, 290, 140, 20);
    //TATMCardRequest.setBounds(650, 290, 300, 20);
    ReferenceAccountNo = new JLabel("Reference Account No.:");
    ReferenceAccountNo.setBounds(500, 320, 140, 20);
    TReferenceAccountNo.setBounds(650, 320, 300, 20);
    
    Submit = new JButton("Submit");
    Submit.setBounds(650, 500, 100, 40);
    Cancel = new JButton("Cancel");
    Cancel.setBounds(800, 500, 100, 40);
    
    
    
    Submit.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                final String accountno = TAccountNo.getText();
                final String name = TName.getText();
                final String father = TFathersName.getText();
                final String mother = TMothersName.getText();
                final String presentadd = TPresentAddress.getText();
                final String permanentadd = TPermanentAddress.getText();
                final String gender = sex.getSelectedCheckbox().getLabel();
                final String birthdate = BDay.getSelectedItem()+" "+BMonth.getSelectedItem()+" "+BYear.getSelectedItem(); 
                final String age = TAge.getText();
                final String nationality = TNationality.getText(); 
                final String profession = TProfession.getText(); 
                final String email = TEmail.getText();
                final String phone = TPhone.getText(); 
                final String accounttyp = accounttype.getSelectedItem(); 
                final String accountcur = accountcurrency.getSelectedCheckbox().getLabel();  
                final String depositemode = TDepositMode.getText(); 
                final String checqbookreq = checqbookrequest.getSelectedCheckbox().getLabel();; 
                final String openingbalance = TOpeningBalance.getText(); 
                final String openingdate = ODay.getSelectedItem()+" "+OMonth.getSelectedItem()+" "+OYear.getSelectedItem(); 
                final String expiredate = EDay.getSelectedItem()+" "+EMonth.getSelectedItem()+" "+EYear.getSelectedItem();
                final String atmcardreq = atmcardrequest.getSelectedCheckbox().getLabel();; 
                final String referenceaccountno = TReferenceAccountNo.getText();
                DataBase data = new DataBase();
                data.Entry(accountno, name, father, mother, presentadd, permanentadd, gender, birthdate, age, nationality,  profession, email, phone, accounttyp, accountcur, depositemode, checqbookreq, openingbalance,  openingdate, expiredate, atmcardreq, referenceaccountno);
            }
        });
      
    PApplicationForm.add(TName);
    PApplicationForm.add(TFathersName);
    PApplicationForm.add(TMothersName);
    PApplicationForm.add(TPresentAddress);
    PApplicationForm.add(TPermanentAddress);
    PApplicationForm.add(TPhone);
    PApplicationForm.add(TEmail);
    //PApplicationForm.add(TSex);
    PApplicationForm.add(TNationality);
    //PApplicationForm.add(TBirthDate);
    PApplicationForm.add(TAge);
    PApplicationForm.add(TProfession);
    
    PApplicationForm.add(TAccountNo);
    //PApplicationForm.add(TAccountCurrency);
    //PApplicationForm.add(TAccountType);
    PApplicationForm.add(TDepositMode);
    //PApplicationForm.add(TChecqBookRequest);
    PApplicationForm.add(TOpeningBalance);
    //PApplicationForm.add(TOpeningDate);
    //PApplicationForm.add(TExpireDate);
    //PApplicationForm.add(TATMCardRequest);
    
    PApplicationForm.add(TReferenceAccountNo);
    PApplicationForm.add(CreateAccount);
    PApplicationForm.add(Name);
    PApplicationForm.add(FathersName);
    PApplicationForm.add(MothersName);
    PApplicationForm.add(PresentAddress);
    PApplicationForm.add(PermanentAddress);
    PApplicationForm.add(Phone);
    PApplicationForm.add(Email);
    PApplicationForm.add(Sex);
    PApplicationForm.add(Nationality);
    PApplicationForm.add(BirthDate);
    PApplicationForm.add(Age);
    PApplicationForm.add(Profession);
    
    PApplicationForm.add(AccountNo);
    PApplicationForm.add(AccountType);
    PApplicationForm.add(AccountCurrency);
    PApplicationForm.add(DepositMode);
    PApplicationForm.add(ChecqBookRequest);
    PApplicationForm.add(OpeningBalance);
    PApplicationForm.add(OpeningDate);
    PApplicationForm.add(ExpireDate);
    PApplicationForm.add(ATMCardRequest);
    PApplicationForm.add(ReferenceAccountNo);
    
    PApplicationForm.add(Submit);
    PApplicationForm.add(Cancel);
    
    ApplicationForm.add(PApplicationForm);   
    ApplicationForm.show();
    }
    public JComponent getGUI() {
        return PApplicationForm;
    }
}
