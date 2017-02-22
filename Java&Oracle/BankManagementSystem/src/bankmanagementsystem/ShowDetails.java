/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bankmanagementsystem;

import javax.swing.*;

/**
 *
 * @author Shadhin
 */
public class ShowDetails extends JFrame{
    void Details(String accountno, String name, String fathersname, String mothersname, String presentaddress, String permanentaddress, String sex, String birthdate, String age,String nationality,  String profession, String email, String phonenumber, String accounttype, String accountcurrency, String depositemode,  String checqbookrequest, String openingbalance, String openingdate, String expiredate, String atmcardrequest, String referenceaccountnumber){
    JFrame Details = new JFrame("Details Information");
    Details.setBounds(0, 0, 1000, 600);
    Details.setDefaultCloseOperation(EXIT_ON_CLOSE);
    JPanel PDetails = new JPanel();
    PDetails.setBounds(0, 0, 1000, 600);
    PDetails.setLayout(null);
    
    JLabel Name = new JLabel("Name : " + name);
    Name.setBounds(10, 50, 300, 20);
    
    JLabel FathersName = new JLabel("Father's Name : " + fathersname);
    FathersName.setBounds(10, 80, 300, 20);
    
    JLabel MothersName = new JLabel("Mother's Name : " + mothersname);
    MothersName.setBounds(10, 110, 300, 20);
    
    JLabel PresentAddress = new JLabel("Present Address : "+ presentaddress);
    PresentAddress.setBounds(10, 140, 300, 20);
    
    JLabel PermanentAddress = new JLabel("Permnent Address : " + permanentaddress);
    PermanentAddress.setBounds(10, 170, 300, 20);
    
    JLabel Sex = new JLabel("Sex : " + sex);
    Sex.setBounds(10, 200, 300, 20);
    
    JLabel BirthDate = new JLabel("Date of Birth : " + birthdate);
    BirthDate.setBounds(10, 230, 300, 20);
    
    JLabel Age = new JLabel("Age : " + age);
    Age.setBounds(10, 260, 300, 20);
    
    JLabel Nationality = new JLabel("Nationality : " + nationality);
    Nationality.setBounds(10, 290, 300, 20);
    
    JLabel Profession = new JLabel("Profession : " + profession);
    Profession.setBounds(10, 320, 300, 20);
    
    JLabel Phone  = new JLabel("Contact No. : " + phonenumber);
    Phone.setBounds(10, 350, 300, 20);
    
    JLabel Email = new JLabel("E-mail : " + email);
    Email.setBounds(10, 380, 300, 20);
    
    JLabel AccountNo = new JLabel("Account No. : " + accountno);
    AccountNo.setBounds(500, 50, 300, 20);
    
    JLabel AccountType = new JLabel("Account Type : " + accounttype);
    AccountType.setBounds(500, 80, 300, 20);
    
    JLabel AccountCurrency = new JLabel("Account Currency : " + accountcurrency);
    AccountCurrency.setBounds(500, 110, 300, 20);
    
    JLabel DepositeMode = new JLabel("Deposite Mode : " + depositemode);
    DepositeMode.setBounds(500, 140, 300, 20);
    
    JLabel ChecqBookRequest = new JLabel("Checq Book Request : " + checqbookrequest);
    ChecqBookRequest.setBounds(500, 170, 300, 20);
    
    JLabel OpeningBalance = new JLabel("Opening Balance : " + openingbalance);
    OpeningBalance.setBounds(500, 200, 300, 20);
    
    JLabel OpeningDate = new JLabel("Opening date : " + openingdate);
    OpeningDate.setBounds(500, 230, 300, 20);
    
    JLabel ExpireDate = new JLabel("Expire Date : " + expiredate);
    ExpireDate.setBounds(500, 260, 300, 20);
    
    JLabel ATMCardRequest = new JLabel("ATM Card Request : " + atmcardrequest);
    ATMCardRequest.setBounds(500, 290, 300, 20);
    
    JLabel ReferenceAccountNo = new JLabel("Reference Account No. : " + referenceaccountnumber);
    ReferenceAccountNo.setBounds(500, 320, 300, 20);
    
    JButton Entry = new JButton("Entry");
    Entry.setBounds(650, 500, 100, 40);
    
    JButton Cancel = new JButton("Cancel");
    Cancel.setBounds(800, 500, 100, 40);
    
    PDetails.add(Name);
    PDetails.add(FathersName);
    PDetails.add(MothersName);
    PDetails.add(PresentAddress);
    PDetails.add(PermanentAddress);
    PDetails.add(Phone);
    PDetails.add(Email);
    PDetails.add(Sex);
    PDetails.add(Nationality);
    PDetails.add(BirthDate);
    PDetails.add(Age);
    PDetails.add(Profession);
    PDetails.add(AccountNo);
    PDetails.add(AccountType);
    PDetails.add(AccountCurrency);
    PDetails.add(DepositeMode);
    PDetails.add(ChecqBookRequest);
    PDetails.add(OpeningBalance);
    PDetails.add(OpeningDate);
    PDetails.add(ExpireDate);
    PDetails.add(ATMCardRequest);
    PDetails.add(ReferenceAccountNo);
    
    PDetails.add(Entry);
    PDetails.add(Cancel);
    
    Details.add(PDetails);   
    Details.show();
    
    }
}
