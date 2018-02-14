# Mobile_App_Dev_4180_HomeWork01
Basic Instructions:
1. In every file submitted you MUST place the following comments:
a. Assignment #.
b. File Name.
c. Full name of all students in your group.
2. Each group should submit only one assignment on behalf of all the other group
members.
3. Your assignment will be graded for functional requirements and efficiency of your
submitted solution. You will loose points if your code is not efficient, does
unnecessary processing or blocks the UI thread.
4. Export your Android project and create a zip file which includes all the project folder
and any required libraries.
5. Submission details:
a. Compress the contents of your project folder. The file name is very important and
should follow the following format: HW01_Groups#.zip
b. Only one group member is required to submit on behalf of the whole group.
c. You should submit the assignment through Canvas: Submit the zip file.
6. The required Android Virtual Device (AVD) should have minimum SDK version set
to 20 and target SDK at 25.
7. Failure to follow the above instructions will result in point deductions.
We will be developing a Contacts app in this homework, having multiple activities. We
will be using ScrollViews, Camera App to take photo, DatePicker to pick the date, and
Implicit intents to open the clickable URLs from the TextViews in this app.
Main Activity (10 Points)
The Main activity contains 5 buttons:
1. Create New: Takes you to Create New Contact activity.
2. Edit Contact: Enables you to edit contacts.
3. Delete Contact: Enables you to delete contacts.
4. Display Contact: Enables you to display saved contacts.
5. Finish: Quits the app.
Create New Contact (15 Points)
Follow the instructions:
1. Clicking on the Create New button should take you to the Create New Contact
Activity.
2. This activity contains a form to create a new contact. The form should be scrollable.
3. Figure 1 (b) and ( c) is showing the scrollable form.
4. First, it contains an ImageButton to take the contact photo using Camera app.
Clicking on the Image button should take you to the Camera to take a photo and set
it as the contact picture.
5. In case of no picture taken, use the default image provided with the resources.
6. Next, the form should contain 13 places to take inputs.
1. First Name (EditText).
2. Last Name (EditText).
3. Company (EditText).
4. Phone (EditText): Input validation needed, only numbers and ‘+’ are allowed.
5. Email (EditText): Input validation needed.
6. URL (EditText).
7. Address (EditText).
8. Birthday (EditText): integrated with Date Picker. Input validation needed, cannot
have a date before January 01, 1850.
9. Nickname (EditText).
10. Facebook Profile URL (EditText).
11. Twitter Profile URL (EditText).
12. Skype (EditText).
13. YouTube Channel (EditText).
14. First Name, Last Name, and Phone are mandatory, and use Toasts to remind
users in case of no inputs there.
7. Finally, a Save button to save the contact.
Edit Contact (20 Points)
Follow the instructions:
1. Clicking on the Edit Contact button in the main activity will take you to a Contact List
activity (Figure 1, d).
2. Contact List activity contains a dynamically generated list for created contacts. Each
contact contains the profile photo, First and Last name, and the Phone number.
3. Clicking on any of the contact in the list should take you a Detailed Edit activity of
the contact. You need to replicate Create New Contact activity to accommodate all
the data inside the Detailed Edit activity and make them editable.
Delete Contact (20 Points)
Follow the instructions:
1. Clicking on Delete Contact button from the Main activity should take you to the
Contact List again.
2. Now, in this phase, clicking on any contact should open a new alert dialog to ask
you “Do you really want to delete this?”. With two options “Yes”, and “No”.
3. Clicking on Yes should remove the contact from the Contact List, and delete it.
Display Contact (30 Points)
Follow the instructions:
1. Clicking on the Display Contact button from the main activity should take you to the
Display Contact activity.
2. This again a list of contacts.
3. Clicking on any contact from the list should take you to detailed contact activity. You
need to design this activity using your own sense.
4. The URL contents in the detailed contact activity (URL, FB profile URL, Twitter
profile URL, Skype, and YouTube Channel URL) should be made clickable.
Clicking on the URLs should use an implicit intent to open them using browsers.
Clicking on Finish button should close the application (5 Points).
