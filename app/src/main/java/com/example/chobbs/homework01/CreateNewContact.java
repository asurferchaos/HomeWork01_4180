/*
HomeWork 01
Group 5: Dalton Carter and Christopher Hobbs
 */
package com.example.chobbs.homework01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
public class CreateNewContact extends AppCompatActivity {

    static String CONTACT_KEY = "CONTACT";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_new_contact);
        setTitle("Create New Contact");


        ImageView profileImage = findViewById(R.id.imageButtonProfileCamera);
        final EditText firstName = findViewById(R.id.editTextFirstName);
        final EditText lastName = findViewById(R.id.editTextLastName);
        final EditText company = findViewById(R.id.editTextCompany);
        final EditText phone = findViewById(R.id.editTextPhoneNumber);
        final EditText email = findViewById(R.id.editTextEmail);
        final EditText address = findViewById(R.id.editTextAddress);
        final EditText birthday = findViewById(R.id.editTextBirthday);
        final EditText nickName = findViewById(R.id.editTextNickName);
        final EditText fbUrl = findViewById(R.id.editTextFBURL);
        final EditText twtrUrl = findViewById(R.id.editTextTwitterURL);
        final EditText skype = findViewById(R.id.editTextSkype);
        final EditText ytChan = findViewById(R.id.editTextYTChannel);

        findViewById(R.id.buttonSaveContact).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                final String firstNameString = firstName.getText().toString();
                final String lastNameString = lastName.getText().toString();
                final String companyString = company.getText().toString();
                final String phoneString = phone.getText().toString();
                final String emailString = email.getText().toString();
                final String addressString = address.getText().toString();
                final String birthdayString = birthday.getText().toString();
                final String nickNameString = nickName.getText().toString();
                final String fbURLString = fbUrl.getText().toString();
                final String twtrURLString = twtrUrl.getText().toString();
                final String skypeString = skype.getText().toString();
                final String ytChanString = ytChan.getText().toString();


                boolean flag = false;
                char[] phoneNumberArray = phoneString.toCharArray();
                for (char aPhoneNumberArray : phoneNumberArray) {
                    if ((aPhoneNumberArray != ('1') && (aPhoneNumberArray != ('2') && (aPhoneNumberArray != ('3') &&
                            (aPhoneNumberArray != ('4') && (aPhoneNumberArray != ('5') && (aPhoneNumberArray != ('6') &&
                                    (aPhoneNumberArray != ('7') && (aPhoneNumberArray != ('8') && (aPhoneNumberArray != ('9') &&
                                            (aPhoneNumberArray != ('0') && (aPhoneNumberArray != ('+'))))))))))))) {
                        flag = true;
                        Log.d("demo", "Phone Digit Flagged");
                    }
                }

                if (firstNameString.length() <= 1) {
                    Toast.makeText(CreateNewContact.this, "First Name is Required",
                            Toast.LENGTH_LONG).show();
                    Log.d("demo", "Invalid First Name");
                } else if (lastNameString.length() <= 1) {
                    Toast.makeText(CreateNewContact.this, "Last Name is Required",
                            Toast.LENGTH_LONG).show();
                    Log.d("demo", "Invalid Last Name");
                } else if (phoneString.length() != 10) {
                    Toast.makeText(CreateNewContact.this, "Phone Number needs an area code and seven digit number",
                            Toast.LENGTH_LONG).show();
                    Log.d("demo", "Invalid Phone Number length");
                } else if (flag == true) {
                    Toast.makeText(CreateNewContact.this, "Phone number doesn't contain the correct digits or +",
                            Toast.LENGTH_LONG).show();
                    Log.d("demo", "Invalid Phone number");
                } else {
                    findViewById(R.id.buttonSaveContact).setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                                Intent intent = new Intent();
                                Log.d("demo","Contact Info sent to MainActivity....hopefully");
                                intent.putExtra(MainActivity.CONTACT_KEY, new Contact(firstNameString, lastNameString, companyString, phoneString,
                                        emailString, addressString, birthdayString, nickNameString, fbURLString,twtrURLString,skypeString, ytChanString));
                                setResult(RESULT_OK, intent);
                            Log.d("demo", "Name: " + firstNameString + " " + lastNameString);
                            Log.d("demo", "Phone Number: " + phoneString);
                            finish();
                        }
                    });
                }
            }
        });
    }
}
